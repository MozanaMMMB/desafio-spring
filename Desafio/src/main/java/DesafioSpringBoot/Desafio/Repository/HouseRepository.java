package DesafioSpringBoot.Desafio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import DesafioSpringBoot.Desafio.Entities.House;

public interface HouseRepository extends JpaRepository <House, Long>{
    
}