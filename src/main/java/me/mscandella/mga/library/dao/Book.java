package me.mscandella.mga.library.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String rating;
    private String loanStatus;
    private String imagePath;

    protected Book() {
    }

    public Book(String name, String description, String rating, String loanStatus, String imagePath) {
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.loanStatus = loanStatus;
        this.imagePath = imagePath;
    }

}