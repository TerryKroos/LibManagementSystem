package Classes;

import java.util.Random;

public class Admin {
    private String name;
    private int id;

     public Admin(){
         Random random = new Random();
         this.setId(random.nextInt() & Integer.MAX_VALUE);
     }
     public Admin(String name){
         Random random = new Random();
         this.setName(name);
         this.setId(random.nextInt() & Integer.MAX_VALUE);
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
