package com.example_tentnando.produto.repository;

import com.example_tentnando.produto.entities.Opcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositoryOpcao extends JpaRepository<Opcao, UUID> {
}
