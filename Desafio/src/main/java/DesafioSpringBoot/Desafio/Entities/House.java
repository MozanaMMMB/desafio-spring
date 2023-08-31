package DesafioSpringBoot.Desafio.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor // construtores
@AllArgsConstructor // construtores
@Builder // padrão de projeto

public class House {

    @Id        //identica que o atributo que vem logo abaixo é a chave primária
    @GeneratedValue (strategy = GenerationType.IDENTITY)  // Geração automática sequencial das entidades no BD. Vai criando os IDs na tabela do BD
    @Column (nullable = false, updatable = false, unique = true) //ID não pode ser nulo, atualozável, e tem que ser único
    private Long id; //ID nao pode ser nulo, atualizavel e tem que ser

    @Column(name = "ownership_status",nullable = false)
    private String ownershipStatus;
    @Column(name = "location", nullable = false)
    private String location;
    @Column(name = "zipcode", nullable = false)
    private String zipcode;

    @ManyToOne //Cardinalidade relação entre as classes
    @JoinColumn(name = "client_id")
    @JsonBackReference //Força a parada da busca 
    private Client client;
}
