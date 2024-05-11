package com.joker.demo.Inpirational.Demo.dao;

import com.joker.demo.Inpirational.Demo.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "joker-images")
public interface ImageRepository extends JpaRepository<Image,Integer> {

    // that's it ... no need to write any code
}
