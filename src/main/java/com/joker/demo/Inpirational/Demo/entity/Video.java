package com.joker.demo.Inpirational.Demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "video")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_id")
    private int video_id;

    @Column(name = "video_url")
    private String video_url;

    @Column(name = "title")
    private String title;

    @Column(name = "video_description")
    private String video_description;

    @Column(name = "thumb_nail")
    private String thumb_nail;

    public int getId() {
        return video_id;
    }

    public void setId(int id) {
        this.video_id = id;
    }

    public int getVideo_id() {
        return video_id;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideo_description() {
        return video_description;
    }

    public void setVideo_description(String video_description) {
        this.video_description = video_description;
    }

    public String getThumb_nail() {
        return thumb_nail;
    }

    public void setThumb_nail(String thumb_nail) {
        this.thumb_nail = thumb_nail;
    }

    // Here is our default constructor
    public Video(){

    }

    // Here is our parameterised constructor for holding the data
    public Video(int id,String video_url,  String title, String video_description, String thumb_nail) {
        this.video_id = id;
        this.video_url = video_url;
        this.title = title;
        this.video_description = video_description;
        this.thumb_nail = thumb_nail;
    }
}
