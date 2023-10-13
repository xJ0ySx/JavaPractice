package com.company.project.lesson07.lesson07;

public class Author {

    // свойстваю поля, атрибуты
    //целые числа 0
    // числа с плавующей точкой 0.0
    //булевый тип false
    // ссылочные типы - null
    public long id;
    public String name;
    public boolean test;

    public Author(){

    }

    //конструкторы должны отличаться
public Author(long authorId){
    id = authorId;
    }

public Author(long authorId, String name){
    this(authorId);
    this.name = name;

    }

    // методы
    public void printInfo(){
        System.out.println("Автор: id=" + id + ", name= " + name);
    }

    public String getInfo(){
       return "Автор: id=" + id + ", name= " + name;

    }

    public void getInfo(String prefix){
        if (prefix == null) return;
        System.out.println(prefix + "Автор: id=" + id + ", name= " + name);
    }

}
