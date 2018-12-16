package Classes;

import java.util.Random;

public class Book {
  private String name;
  private String author;
  private int id;
  private boolean borrowed;
  private Student student;

  public Book(){
      Random random = new Random();
      this.setId(random.nextInt() & Integer.MAX_VALUE);
    }

  public Book(String name,String author){
      Random random = new Random();
      this.setName(name);
      this.setAuthor(author);
      this.setId(random.nextInt() & Integer.MAX_VALUE);


  }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
    public void setStudent(Student student){
      this.student = student;
    }

    public Student getStudent(){
      return student;
    }
}
