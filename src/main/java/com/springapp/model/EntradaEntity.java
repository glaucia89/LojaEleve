package com.springapp.model;

import javax.persistence.*;

/**
 * Created by glaucia on 27/07/14.
 */
@Entity
@Table(name = "entrada", schema = "", catalog = "Eleve")
public class EntradaEntity {
    private int id;
    private String entrada;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "entrada", nullable = true, insertable = true, updatable = true, length = 45, precision = 0)
    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntradaEntity that = (EntradaEntity) o;

        if (id != that.id) return false;
        if (entrada != null ? !entrada.equals(that.entrada) : that.entrada != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (entrada != null ? entrada.hashCode() : 0);
        return result;
    }
}
