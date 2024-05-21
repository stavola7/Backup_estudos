package Senai1.Aula.controllers;

import Senai1.Aula.entidades.Turma;
import Senai1.Aula.services.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("turma")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @PostMapping("/salvarTurma")
    public String salvarTurma(@RequestBody Turma turma) throws Exception {
        try{
            return turmaService.salvarTurma(turma);
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
