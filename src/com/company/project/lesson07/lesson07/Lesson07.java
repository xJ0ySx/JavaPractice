package com.company.project.lesson07.lesson07;

import com.company.project.lesson07.lesson07.Author;

public class Lesson07 {

    public static void main(String[] args){
        Author author02 = new Author(2,"Joys");
        Author author03 = new Author();
        Author author01 = new Author(1);

        System.out.println(author01.id);

        author01.name = "Tom";
        author01.test = true;

        System.out.println(author01.name);
        System.out.println(author01.test);
        System.out.println(author02.name);

        author02.getInfo();
        author02.getInfo("проверка ");
        System.out.println(author02.getInfo());

        Book book01 = new Book("Java", 2);
        book01.setName("Java 21");
        book01.addAuthor(author01);
        book01.addAuthor(author02);
        book01.addAuthor(author03);
    }
}
