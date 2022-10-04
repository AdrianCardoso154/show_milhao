package com.example_tentnando.produto.entities;

import javax.persistence.*;
import java.io.Serial;
import java.util.UUID;

@Entity
@Table(name = "tb_questao")
public class Questao {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String descricao;

    @Column
    private int nivel;

    @Column
    private int correta;

    public Questao(UUID id) {

    }
    public Questao() {
    super();
    }
    public Questao(String descricao, int nivel, int correta) {
        this.descricao = descricao;
        this.nivel = nivel;
        this.correta = correta;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCorreta() {
        return correta;
    }

    public void setCorreta(int correta) {
        this.correta = correta;
    }

    @Override
    public String toString() {
        return "Questao{" +
                "descricao='" + descricao + '\'' +
                ", nivel=" + nivel +
                ", correta=" + correta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Questao)) return false;

        Questao questao = (Questao) o;

        if (getNivel() != questao.getNivel()) return false;
        if (getCorreta() != questao.getCorreta()) return false;
        if (getId() != null ? !getId().equals(questao.getId()) : questao.getId() != null) return false;
        return getDescricao() != null ? getDescricao().equals(questao.getDescricao()) : questao.getDescricao() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getDescricao() != null ? getDescricao().hashCode() : 0);
        result = 31 * result + getNivel();
        result = 31 * result + getCorreta();
        return result;
    }
}
