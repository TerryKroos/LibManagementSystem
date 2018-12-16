package Services;

import Classes.Book;
import Classes.Student;
import DAOs.LibrarianDAO;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/librarian")
public class LibrarianService {
    LibrarianDAO librarianDAO = LibrarianDAO.getLibrarianDao();

    @POST
    @Path("/books/lend/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Book lendBook(@PathParam("id") int id, Student student){
        return librarianDAO.lendBook(id,student);
    }

    @POST
    @Path("/books/receive/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Book receiveBook(@PathParam("id") int id, Student student){
        return librarianDAO.receiveBook(id);
    }

    @GET
    @Path("/books/checkBorrowed/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Boolean checkBorrowed(@PathParam("id") int id){
        return librarianDAO.checkBorrowed(id);
    }

}
