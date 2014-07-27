package com.springapp;

import javax.persistence.*;

/**
 * Created by glaucia on 27/07/14.
 */
@Entity
@Table(name = "cor", schema = "", catalog = "Eleve")
public class CorEntity {
    private int id;
    private String cor;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cor", nullable = true, insertable = true, updatable = true, length = 45, precision = 0)
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CorEntity corEntity = (CorEntity) o;

        if (id != corEntity.id) return false;
        if (cor != null ? !cor.equals(corEntity.cor) : corEntity.cor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cor != null ? cor.hashCode() : 0);
        return result;
    }
}
