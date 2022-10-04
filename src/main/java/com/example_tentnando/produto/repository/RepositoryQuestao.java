package com.example_tentnando.produto.repository;

import com.example_tentnando.produto.entities.Questao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositoryQuestao extends JpaRepository<Questao, UUID> {
}
