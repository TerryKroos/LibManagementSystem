package Classes;

import java.util.Random;

public class Manager {
    private String name;
    private int id;

    public Manager(){
        Random random = new Random();
        this.setId(random.nextInt() & Integer.MAX_VALUE);
    }

    public Manager(String name){
        Random random = new Random();
        id = random.nextInt() & Integer.MAX_VALUE;
        this.name = name;

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
