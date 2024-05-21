package Senai1.Aula.services;

import Senai1.Aula.entidades.Turma;
import Senai1.Aula.repositories.TurmaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {

    private TurmaRepository turmaRepository;

    public String salvarTurma(Turma turma) throws Exception{
        turmaRepository.save(turma);
        return "Turma salva com sucesso!";
    }
}
