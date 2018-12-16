package Services;
import Classes.Librarian;
import Classes.Manager;
import DAOs.AdminDAO;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/Admin")
public class AdminService {
   private AdminDAO adminDAO = AdminDAO.getAdminDao();

    @POST
    @Path("/librarians")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Librarian createLibrarian(Librarian librarian){
       return adminDAO.createLibrarian(librarian);

    }

    @GET
    @Path("/librarians")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Librarian> getLibrarians(){
        return adminDAO.getLibrarians();
    }

    @GET
    @Path("/librarians/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Librarian getLibrarian(@PathParam("id") int id){
      return adminDAO.getLibrarian(id);
    }

    @DELETE
    @Path("/librarians/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteLibrarian(@PathParam("id") int id){
        adminDAO.deleteLibrarian(id);
    }

    @PUT
    @Path("/librarians/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Librarian updateLibrarian(@PathParam("id") int id, Librarian librarian){
        return adminDAO.updateLibrarian(id, librarian);
    }

    @POST
    @Path("/managers")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Manager createManager(Manager manager){
        return adminDAO.createManager(manager);

    }


 @DELETE
 @Path("/managers/{id}")
 @Produces(MediaType.APPLICATION_JSON)
 @Consumes(MediaType.APPLICATION_JSON)
 public void deleteManager(@PathParam("id") int id){
   adminDAO.deleteManager(id);

 }


 @GET
 @Path("/managers")
 @Produces(MediaType.APPLICATION_JSON)
 public List<Manager> getManagers (){
  return adminDAO.getManagers();

 }
 @GET
 @Path("/managers/{id}")
 @Produces(MediaType.APPLICATION_JSON)
 @Consumes(MediaType.APPLICATION_JSON)
 public Manager getManager (@PathParam("id") int id){
  return adminDAO.getManager(id);

 }






}
