package org.acme.curriculo.ccontroller;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Uni;
import org.acme.curriculo.*;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/curriculos")
@ApplicationScoped
public class CurriculoController {

    @GET
    public Uni<List<User>> findAll() {
        return Curriculo.listAll();
    }

    @GET
    @Path("/{id}")
    public Uni<User> getSingle(Long id) {
        return Curriculo.findById(id);
    }

    @POST
    public Uni<Response> create(User user) {
        return Panache.<User>withTransaction(user::persist)
                .onItem().transform(inserted -> Response.created(URI.create("/curriculos/" + inserted.id)).build());
    }

    @POST
    @Path("/{id}/academic-education")
    @Transactional
    public Response addAcademicEducation(@PathParam("id") int id, AcademicEducation academicEducation) {
        User user = (User) User.findById(id);
        academicEducation.persist();
        user.setAcademicEducations(academicEducation);

        return Response.ok(user.getAcademicEducations()).build();
    }

    @POST
    @Path("/{id}/professional-experience")
    @Transactional
    public Response addProfessionalExperience(@PathParam("id") int id, ProfessionalExperience professionalExperience) {
        User user = (User) User.findById(id);
        professionalExperience.persist();
        user.setProfessionalExperiences(professionalExperience);
        return Response.ok(user.getProfessionalExperiences()).build();
    }

    @POST
    @Path("/{id}/languages")
    @Transactional
    public Response addLanguages(@PathParam("id") int id, Languages languages) {
        User user = (User) User.findById(id);
        languages.persist();
        user.setLanguages(languages);
        return Response.ok(user.getLanguages()).build();
    }

    @POST
    @Path("/{id}/extracurriculars")
    @Transactional
    public Response addextracurriculars(@PathParam("id") int id, Extracurriculars extracurriculars) {
        User user = (User) User.findById(id);
        extracurriculars.persist();
        user.setExtracurriculars(extracurriculars);
        return Response.ok(user.getExtracurriculars()).build();
    }

    @POST
    @Path("/{id}/frameworks")
    @Transactional
    public Response addFrameworks(@PathParam("id") int id, Frameworks frameworks) {
        User user = (User) User.findById(id);
        frameworks.persist();
        user.setFrameworks(frameworks);
        return Response.ok(user.getFrameworks()).build();
    }

    @POST
    @Path("/{id}/hobbies")
    @Transactional
    public Response addHobbies(@PathParam("id") int id, Hobbies hobbies) {
        User user = (User) User.findById(id);
        hobbies.persist();
        user.setHobbies(hobbies);
        return Response.ok(user.getHobbies()).build();
    }

    @POST
    @Path("/{id}/methodologies")
    @Transactional
    public Response addMethodologies(@PathParam("id") int id, Methodologies methodologies) {
        User user = (User) User.findById(id);
        methodologies.persist();
        user.setMethodologies(methodologies);
        return Response.ok(user.getMethodologies()).build();
    }

    @POST
    @Transactional
    @Path("/{id}/create-curriculo")
    public Response createCurriculo(@PathParam("id") int id) {
        User user = (User) User.findById(id);
        Curriculo curriculo = new Curriculo(user);
        curriculo.persist();
        return Response.ok(curriculo).build();
    }

    @DELETE
    public void deleteById(int id){
        Curriculo.deleteById(id);
    }

}
