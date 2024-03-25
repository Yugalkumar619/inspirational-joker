package com.joker.demo.Inpirational.Demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "images")
public class Image {

    @Column(name = "image_url")
    private String imageUrl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public Image(){

    }

    public Image(String image, int idNo) {
        this.imageUrl = image;
        this.id = idNo;
    }

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

    // define toString


    @Override
    public String toString() {
        return "Image{" +
                "imageUrl='" + imageUrl + '\'' +
                ", id=" + id +
                '}';
    }
}
