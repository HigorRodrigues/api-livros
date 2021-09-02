package com.higor.socialbooks.socialbooks.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.higor.socialbooks.socialbooks.domain.Livro;
import com.higor.socialbooks.socialbooks.repository.LivrosRepository;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroResource {
 
    @Autowired
    private LivrosRepository livrosRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Livro> listar(){        
        return livrosRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void salvar(@RequestBody Livro livro){
        livrosRepository.save(livro);
    }
}