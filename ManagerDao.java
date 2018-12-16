package DAOs;

import Classes.Book;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ManagerDao {
   private static Map<Integer, Book> books;
   private static ManagerDao managerDao;

    private ManagerDao(){
      setBooks(new ConcurrentHashMap<>());

    }

    public static ManagerDao getManagerDao(){
        if(managerDao == null){
            managerDao = new ManagerDao();
        }
        return managerDao;
    }

    public static Map<Integer, Book> getBooks() {
        return books;
    }

    public static void setBooks(Map<Integer, Book> books) {
        ManagerDao.books = books;
    }

    public Book addBook(Book book){
        getBooks().put(book.getId(), book);
        return book;
    }

    public void removeBook(int id){
        if(getBooks().containsKey(id)){
            getBooks().remove(id);
        }
    }

    public Book getBook(int id){
        return books.get(id);
    }



}
