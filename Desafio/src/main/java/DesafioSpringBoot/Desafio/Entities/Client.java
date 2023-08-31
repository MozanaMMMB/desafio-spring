package DesafioSpringBoot.Desafio.Entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor // construtores
@AllArgsConstructor // construtores
@Builder // padrão de projeto
@Table(name = "Client")

public class Client {

    @Id // identica que o atributo que vem logo abaixo é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática sequencial das entidades no BD. Vai
                                                        // criando os IDs na tabela do BD
    @Column(nullable = false, updatable = false, unique = true) // ID não pode ser nulo, atualozável, e tem que ser
                                                                // único
    private Long id; // ID nao pode ser nulo, atualizavel e tem que ser

    @Column(name = "name", nullable = false) // Indica qye os atributos a baixo não pode m ser vazios
    private String nome;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "dependents", nullable = false)
    private int dependents;

    @Column(name = "Marital_status", nullable = false)
    private String maritalStatus; // Baseado na classe "enum" criada para restrinbgir as opções

    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt = LocalDateTime.now(); // Assim que criar o atributo no BD, ele vai criar
                                                          // atutomaticamente o local e data

    @Column(name = "update_at", nullable = true)
    private Data updateAt;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true) // Quando
                                                                                                             // for
                                                                                                             // apagar
                                                                                                             // um apaga
                                                                                                             // tudo em
                                                                                                             // cascata
    private List<House> houses;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Vehicle> vehicles;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Insurance> insurance;

}
