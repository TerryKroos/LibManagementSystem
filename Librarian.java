package Classes;

import java.util.Random;

public class Librarian {
    private String name;
    private int age;
    private int id;

    public Librarian() {
        Random random = new Random();
        this.setId(random.nextInt() & Integer.MAX_VALUE);
    }

    public Librarian(String name, int age){
        Random random = new Random();
        this.setId(random.nextInt() & Integer.MAX_VALUE);
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}