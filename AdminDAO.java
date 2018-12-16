package DAOs;


import Classes.Admin;
import Classes.Librarian;
import Classes.Manager;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AdminDAO {

 private Map<Integer, Librarian> librarians;
 private Map<Integer,Manager> managers;
 private Map<Integer,Admin> admins;
 private  Admin admin;
 private static AdminDAO uncanny;


private AdminDAO(){
    librarians = new ConcurrentHashMap<>();
    managers = new ConcurrentHashMap<>();
    setAdmins(new ConcurrentHashMap<>());
    admin = new Admin();
    getAdmins().put(admin.getId(),admin);
    Librarian librarian = new Librarian("John", 1);
    librarians.put(librarian.getId(),librarian);
    Manager manager = new Manager("Oliver Queen");
    managers.put(manager.getId(),manager);

}
 public static AdminDAO getAdminDao(){
    if(uncanny == null){
        uncanny = new AdminDAO();
    }

    return uncanny;
}

public Librarian createLibrarian(Librarian librarian){
 librarians.put(librarian.getId(),librarian);
 return librarian;
}

public void deleteLibrarian(int id){
    librarians.remove(id);
}
public Librarian updateLibrarian(int id, Librarian librarian){
    if (librarians.containsKey(id)){
        librarians.replace(id, librarian);

    }
    return librarian;
}
public Librarian getLibrarian(int id) {
    return librarians.get(id);

}
public List<Librarian> getLibrarians(){
    return new ArrayList<>(librarians.values());
}

public Manager createManager(Manager manager){
    managers.put(manager.getId(),manager);
    return manager;
}
public void deleteManager(int id){
    managers.remove(id);
}

    public List<Manager> getManagers() {
        return new ArrayList<>(managers.values());
    }

    public Manager getManager(int id){
    return managers.get(id);
    }

    public Map<Integer, Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(Map<Integer, Admin> admins) {
        this.admins = admins;
    }
}