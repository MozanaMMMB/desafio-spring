package DesafioSpringBoot.Desafio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import DesafioSpringBoot.Desafio.Entities.Client;

public interface ClientRepository extends JpaRepository <Client, Long>{
    
}
