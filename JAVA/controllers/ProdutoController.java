package Senai1.Aula.controllers;

import Senai1.Aula.entidades.Produto;
import Senai1.Aula.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/buscarProduto")
    public Optional<Produto> buscarProdutoPorId(@PathVariable Integer id) throws Exception{
        return produtoService.buscarProdutoPorId(id);
    }

    public List<Produto> listarProdutos() throws Exception {
        try{
            return produtoService.listarProdutos();
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }

    public String salvarProduto(@RequestBody Produto produto) throws Exception {
        try{
            return produtoService.salvarProduto(produto);
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
