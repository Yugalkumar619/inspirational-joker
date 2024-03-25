package com.joker.demo.Inpirational.Demo.rest;

import com.joker.demo.Inpirational.Demo.dao.ImageDAO;
import com.joker.demo.Inpirational.Demo.entity.Image;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ImagesRestController {

    private ImageDAO imageDAO;

    // quick and dirt: inject image dao (use constructor injection)

    public ImagesRestController(ImageDAO theImageDAO){
        imageDAO = theImageDAO;
    }

    private ArrayList<Image> theImages;

    // define @PostConstruct to load the student data ... only once!

    @PostConstruct
    public void loadData(){

        theImages = new ArrayList<>();

        theImages.add(new Image("Yugal",1));
        theImages.add(new Image("Kushagra",2));
        theImages.add(new Image("Kuna",3));
    }

    // define endpoint for images

    @GetMapping("/images")
    public ArrayList<Image> getImages(){

        return imageDAO.findAll();
    }

    // define endpoint or "/images/{id}" - return image at index

    @GetMapping("/images/{id}")
    public Image getImage(@PathVariable int id){

        // just index into the list ... keep it simple for now

        // check the studentId again list size

        if ((id >= theImages.size()) || (id<0)){
            throw new ImageNotFoundException("Image id not found -" + id);
        }

        return theImages.get(id);
    }

    // Add an exception handler using @ExceptionHandler


}
