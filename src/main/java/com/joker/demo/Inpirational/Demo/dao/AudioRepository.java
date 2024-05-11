package com.joker.demo.Inpirational.Demo.dao;

import com.joker.demo.Inpirational.Demo.entity.Audio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "joker-audios")
public interface AudioRepository extends JpaRepository<Audio,Integer> {
}
