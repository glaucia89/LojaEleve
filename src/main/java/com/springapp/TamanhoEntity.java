package com.springapp;

import javax.persistence.*;

/**
 * Created by glaucia on 27/07/14.
 */
@Entity
@Table(name = "tamanho", schema = "", catalog = "Eleve")
public class TamanhoEntity {
    private int id;
    private String tamanho;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tamanho", nullable = true, insertable = true, updatable = true, length = 45, precision = 0)
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TamanhoEntity that = (TamanhoEntity) o;

        if (id != that.id) return false;
        if (tamanho != null ? !tamanho.equals(that.tamanho) : that.tamanho != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tamanho != null ? tamanho.hashCode() : 0);
        return result;
    }
}
