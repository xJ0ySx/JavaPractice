package com.company.project.lesson07.lesson07;

import com.company.project.lesson07.lesson07.Author;

public class Lesson07 {

    public static void main(String[] args){
        Author author02 = new Author(2,"Joys");
        Author author01 = new Author(1);

        System.out.println(author01.id);

        author01.name = "Tom";
        author01.id = 1;
        author01.test = true;

        System.out.println(author01.name);
        System.out.println(author01.test);
        System.out.println(author02.name);
    }
}
