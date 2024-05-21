package Senai1.Aula.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Produto implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nome_produto", nullable = false)
    private String nomeProduto;

    @Column(name = "compra", nullable = false)
    private Double precoCompra;

    @Column(name = "preco", nullable = false)
    private Double precoVenda;

    @Column(name = "venda", nullable = false)
    private Double venda;

    @Column (name = "statusProduto", nullable = false)
    private Boolean status;
}
