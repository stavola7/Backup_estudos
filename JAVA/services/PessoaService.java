package Senai1.Aula.services;

import Senai1.Aula.entidades.Pessoa;
import Senai1.Aula.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarPessoa() throws Exception{
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> buscarPorId(Integer id) throws Exception{
        return pessoaRepository.findById(id);
    }

    public String salvarPessoa(Pessoa pessoa) throws Exception{
        pessoaRepository.save(pessoa);
        return "Pessoa salvo com sucesso!";
    }
}
