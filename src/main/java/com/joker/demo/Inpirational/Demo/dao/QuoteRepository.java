package com.joker.demo.Inpirational.Demo.dao;

import com.joker.demo.Inpirational.Demo.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "joker-quotes")
public interface QuoteRepository extends JpaRepository<Quote,Integer> {
}
