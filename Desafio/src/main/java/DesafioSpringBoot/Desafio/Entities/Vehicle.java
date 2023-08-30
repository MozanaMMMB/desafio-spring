package DesafioSpringBoot.Desafio.Entities;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@RequestMapping

public class Vehicle {

    private String brand;
    private String model;
    private int year;
    
    
}
