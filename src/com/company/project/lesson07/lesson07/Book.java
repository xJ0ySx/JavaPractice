package com.company.project.lesson07.lesson07;

public class Book {
    private String name;
    private boolean isPublished;
     // private Author author;
      private Author[] authors; //


    public Book(String name, int numberOfAuthors) {
        setName(name);
    }

    public void setName(String name){ //setter
        // if (name == null) return;
        if (name == null){
            throw new IllegalArgumentException("name not null");
        }
        this.name = name;
    }
     public String getName(){ //getter
        return name;
     }

     public void addAuthor(Author author){
        //
     }

}
