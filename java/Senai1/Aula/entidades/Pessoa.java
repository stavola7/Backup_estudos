package Senai1.Aula.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Pessoa implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nome_pessoa", nullable = false)
    private String nomePessoa;

    @Column(name = "salario", nullable = false)
    private Double salario;

}
