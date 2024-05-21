package Senai1.Aula.controllers;

import Senai1.Aula.entidades.Pessoa;
import Senai1.Aula.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/buscarPessoa")
    public Optional<Pessoa> buscarPorId(@PathVariable Integer id) throws Exception{
        return pessoaService.buscarPorId(id);
    }

    @GetMapping("/buscarPessoa")
    public List<Pessoa> buscarTodos() throws Exception{
        try{
            return pessoaService.listarPessoa();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("salvarPessoa")
    public String salvarPessoa(@RequestBody Pessoa pessoa) throws Exception{
        try {
            return pessoaService.salvarPessoa(pessoa);
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
