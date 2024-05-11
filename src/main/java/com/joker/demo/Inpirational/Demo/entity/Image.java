package com.joker.demo.Inpirational.Demo.entity;

import jakarta.persistence.*;

// Here is the entity annotation to for defining it as data class which connects it with database
// Table annotation is used for defining the name of the table in the database which we want to connect
@Entity
@Table(name = "images")
public class Image {

    // Here is the column annotation to annotate that it is a column in the table of the database
    // also name is defined as per the database
    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "title")
    private String title;

    // Here is the id annotation to identify it as primary key unique for every entry
    // GeneratedValue is used to add the new id when data is entered
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    // Here is our default constructor
    public Image(){

    }

    // Here is our parameterised constructor for holding the data
    public Image(String image, int idNo, String title) {
        this.imageUrl = image;
        this.id = idNo;
        this.title = title;
    }

    // Here is our getter and setter methods
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // define toString


    @Override
    public String toString() {
        return "Image{" +
                "imageUrl='" + imageUrl + '\'' +
                ", id=" + id +
                '}';
    }
}
