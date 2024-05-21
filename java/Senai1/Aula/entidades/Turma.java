package Senai1.Aula.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Turma implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nome_turma", nullable = false)
    private String nomeTurma;

    @Column(name = "status_turma")
    private Boolean statusTurma;
}
