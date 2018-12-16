package Classes;

import java.util.Random;

public class Student {
    private String name;
    private int id;

    public Student(){
        Random random = new Random();
        this.setId(random.nextInt() & Integer.MAX_VALUE);
    }

    public Student(String name){
        Random random = new Random();
        this.id = random.nextInt() & Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
