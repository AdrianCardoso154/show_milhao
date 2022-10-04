package com.example_tentnando.produto.service;


import com.example_tentnando.produto.entities.Opcao;
import com.example_tentnando.produto.repository.RepositoryOpcao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ServiceOpcao {

    //I.D I.C
    final RepositoryOpcao repositoryOpcao;
    public ServiceOpcao(RepositoryOpcao repository){
        this.repositoryOpcao = repository;
    }
    //Salva a opção;
    @Transactional
    public Opcao saveOpcao(Opcao opcao){
        return repositoryOpcao.save(opcao);
    }

    //Procurar opção
    public List<Opcao> findall(){
        return repositoryOpcao.findAll();
    }

    //Procurar opção por id

    public Optional<Opcao> findbyid(UUID id){
        return repositoryOpcao.findById(id);
    }

    //Deleta opção

    public void delete(Opcao opcao) {
        repositoryOpcao.delete(opcao);
    }

}
