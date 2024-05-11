package com.joker.demo.Inpirational.Demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "quote")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quote_id")
    private int quote_id;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "quote")
    private String quote;

    @Column(name = "quote_description")
    private String quote_description;

    public int getQuote_id() {
        return quote_id;
    }

    public void setQuote_id(int quote_id) {
        this.quote_id = quote_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getQuote_description() {
        return quote_description;
    }

    public void setQuote_description(String quote_description) {
        this.quote_description = quote_description;
    }

    // Here is our default constructor
    public Quote(){

    }

    // Here is our parameterised constructor for holding the data
    public Quote(int quote_id, String quote, String quote_description, String image_url) {
        this.quote_id = quote_id;
        this.quote = quote;
        this.quote_description = quote_description;
        this.image_url = image_url;
    }
}
