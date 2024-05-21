package Senai1.Aula.services;

import Senai1.Aula.entidades.Produto;
import Senai1.Aula.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() throws Exception {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarProdutoPorId(Integer id) throws Exception {
        return produtoRepository.findById(id);
    }

    public String salvarProduto(Produto produto) throws Exception{
        produtoRepository.save(produto);
        return "Produto salvo com sucesso";
    }
}
