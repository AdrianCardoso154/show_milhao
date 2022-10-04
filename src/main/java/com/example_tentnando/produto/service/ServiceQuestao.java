package com.example_tentnando.produto.service;

import com.example_tentnando.produto.entities.Questao;
import com.example_tentnando.produto.repository.RepositoryQuestao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ServiceQuestao {
    //I.D I.C
    final RepositoryQuestao repositoryQuestao;
        public ServiceQuestao(RepositoryQuestao repository){
            this.repositoryQuestao = repository;
        }
        //Salva a questão;
        @Transactional
        public Questao saveQuestao(Questao questao){
            return repositoryQuestao.save(questao);
        }

        //Procurar questão
        public List<Questao> findall(){
            return repositoryQuestao.findAll();
        }

        //Procurar questão por id

        public Optional<Questao> findbyid(UUID id){
            return repositoryQuestao.findById(id);
        }

        //Deleta questão

        public void delete(Questao questao) {
           repositoryQuestao.delete(questao);
        }


}
