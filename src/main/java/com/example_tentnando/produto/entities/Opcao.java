package com.example_tentnando.produto.entities;


import javax.persistence.*;
import java.io.Serial;
import java.util.UUID;

@Entity
@Table(name = "tb_opcao")
public class Opcao {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String descricao;

    public Opcao(UUID id) {
    }

    public Opcao(String descricao) {
        this.descricao = descricao;
    }

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

    @Override
    public String toString() {
        return "Opcao{" +
                "descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Opcao)) return false;

        Opcao opcao = (Opcao) o;

        if (getId() != null ? !getId().equals(opcao.getId()) : opcao.getId() != null) return false;
        return getDescricao() != null ? getDescricao().equals(opcao.getDescricao()) : opcao.getDescricao() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getDescricao() != null ? getDescricao().hashCode() : 0);
        return result;
    }
}
