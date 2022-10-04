package com.example_tentnando.produto.dto;

import java.util.UUID;

public class OpcaoDto {
    private UUID id;
    private String descricao;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
