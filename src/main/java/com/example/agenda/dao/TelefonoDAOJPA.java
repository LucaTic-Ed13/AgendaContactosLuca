package com.example.agenda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.agenda.model.*;

@RepositoryRestResource
@CrossOrigin(origins = "http:localhost:4200")

public interface TelefonoDAOJPA extends JpaRepository <Telefono, Integer> {

}
