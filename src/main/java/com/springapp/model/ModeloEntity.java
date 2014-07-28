package com.springapp.model;

import javax.persistence.*;

/**
 * Created by glaucia on 27/07/14.
 */
@Entity
@Table(name = "modelo", schema = "", catalog = "Eleve")
public class ModeloEntity {
    private int id;
    private String modelo;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "modelo", nullable = true, insertable = true, updatable = true, length = 45, precision = 0)
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModeloEntity that = (ModeloEntity) o;

        if (id != that.id) return false;
        if (modelo != null ? !modelo.equals(that.modelo) : that.modelo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        return result;
    }
}
