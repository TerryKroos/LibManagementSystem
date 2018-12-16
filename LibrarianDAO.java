package DAOs;

import Classes.Book;
import Classes.Student;


import java.util.Map;

public class LibrarianDAO {

    private Map<Integer,Book> books;

    private static LibrarianDAO librarianDAO;
    private ManagerDao managerDao = ManagerDao.getManagerDao();
    private Student student;
    private Book book;

    private LibrarianDAO() {
        student = new Student();
        book = new Book();
        books = managerDao.getBooks();
        book.setStudent(student);
        book.setBorrowed(true);
        books.put(book.getId(),book);



    }

   public static LibrarianDAO getLibrarianDao() {
        if (librarianDAO == null) {
            librarianDAO = new LibrarianDAO();
        }
        return librarianDAO;
    }




    public Book lendBook(int id, Student student) {
        if (getBooks().containsKey(id)) {
            if (getBooks().get(id).isBorrowed() == false) {

                getBooks().get(id).setBorrowed(true);
                getBooks().get(id).setStudent(student);
            }

        }

        return getBooks().get(id);

    }



    public Book receiveBook(int id){
    if(getBooks().get(id).isBorrowed() == true){
        getBooks().get(id).setBorrowed(false);
    }
     return getBooks().get(id);
    }

    public Boolean checkBorrowed(int id){
        return books.get(id).isBorrowed();
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }

}


