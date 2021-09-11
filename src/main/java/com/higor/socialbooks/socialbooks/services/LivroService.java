
package com.higor.socialbooks.socialbooks.services;

import com.higor.socialbooks.socialbooks.domain.Livro;
import com.higor.socialbooks.socialbooks.repository.LivrosRepository;
import com.higor.socialbooks.socialbooks.services.exceptions.LivroNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    
    @Autowired
    private LivrosRepository livrosRepository;

    public List<Livro> listar(){
        return this.livrosRepository.findAll();
    }

    public Livro findById(Long id){
        Livro livro = livrosRepository.findById(id).get();
        if( livro == null ){
            throw new LivroNotFoundException("O livro não pode ser encontrado!");
        }
        return livro;
    }

    public Livro salvar(Livro livro){
        livro.setId(null);
        return livrosRepository.save(livro);
    }

    public void atualizar(Livro livro){       
        this.verificarExistência(livro);
        livrosRepository.save(livro);
       
    }

    public void deletar(Long id){
        try{
            livrosRepository.deleteById(id);
        } catch( EmptyResultDataAccessException e){
            throw new LivroNotFoundException("Livro não pode ser encontrado");
        }
    }

    private void verificarExistência(Livro livro){
        findById(livro.getId());
    }
}