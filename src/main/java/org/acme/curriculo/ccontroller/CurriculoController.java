package org.acme.curriculo.ccontroller;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Uni;
import org.acme.curriculo.Hobbies;
import org.acme.curriculo.User;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/curriculos")
@ApplicationScoped
public class CurriculoController {

    @GET
    public Uni<List<User>> findAll() {
        return User.listAll();
    }

    @GET
    @Path("/{id}")
    public Uni<User> getSingle(Long id) {
        return User.findById(id);
    }

    @POST
    public Uni<Response> create(User user) {
        return Panache.<User>withTransaction(user::persist)
                .onItem().transform(inserted -> Response.created(URI.create("/curriculos/" + inserted.id)).build());
    }

    @DELETE
    public void deleteById(int id){
        User.deleteById(id);
    }

}
