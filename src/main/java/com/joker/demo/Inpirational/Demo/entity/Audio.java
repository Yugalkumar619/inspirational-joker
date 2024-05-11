package com.joker.demo.Inpirational.Demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "audio")
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "audio_id")
    private int audio_id;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "audio")
    private String audio;

    @Column(name = "audio_description")
    private String audio_description;

    public int getAudio_id() {
        return audio_id;
    }

    public void setAudio_id(int audio_id) {
        this.audio_id = audio_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getAudio_description() {
        return audio_description;
    }

    public void setAudio_description(String audio_description) {
        this.audio_description = audio_description;
    }

    // Here is our default constructor
    public Audio(){

    }

    // Here is our parameterised constructor for holding the data
    public Audio(int audio_id, String audio, String audio_description, String image_url) {
        this.audio_id = audio_id;
        this.audio = audio;
        this.audio_description = audio_description;
        this.image_url = image_url;
    }
}
