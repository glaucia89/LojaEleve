package com.springapp;

import javax.persistence.*;

/**
 * Created by glaucia on 27/07/14.
 */
@Entity
@Table(name = "preco", schema = "", catalog = "Eleve")
public class PrecoEntity {
    private int id;
    private String preco;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "preco", nullable = true, insertable = true, updatable = true, length = 45, precision = 0)
    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrecoEntity that = (PrecoEntity) o;

        if (id != that.id) return false;
        if (preco != null ? !preco.equals(that.preco) : that.preco != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (preco != null ? preco.hashCode() : 0);
        return result;
    }
}
