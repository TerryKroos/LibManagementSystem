package Services;

import Classes.Book;
import Classes.Manager;
import DAOs.ManagerDao;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/Manager")
public class ManagerService {
    ManagerDao managerDao = ManagerDao.getManagerDao();

    @POST
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON )
    public Book addBook(Book book){
        return managerDao.addBook(book);
    }

    @DELETE
    @Path("/books/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteBook(@PathParam("id") int id){ managerDao.removeBook(id);
    }

    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ArrayList<Book> getBooks(){
        return new ArrayList<>(ManagerDao.getBooks().values()) ;
    }

    @GET
    @Path("/books/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Book getBook(@PathParam("id") int id){
        return managerDao.getBook(id);
    }



}
