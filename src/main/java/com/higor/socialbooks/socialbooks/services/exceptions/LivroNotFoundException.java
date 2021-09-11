package com.higor.socialbooks.socialbooks.services.exceptions;

public class LivroNotFoundException extends RuntimeException {
    
    public LivroNotFoundException(String mensagem){
        super(mensagem);
    }

    public LivroNotFoundException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
