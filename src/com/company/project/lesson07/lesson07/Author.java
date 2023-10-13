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
public Author(long authorId){
    id = authorId;
}

public Author(long auhotId, String name){
    id = auhotId;
    this.name = name;

}

}
