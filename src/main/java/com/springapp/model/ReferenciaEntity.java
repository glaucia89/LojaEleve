package com.springapp.model;

import javax.persistence.*;

/**
 * Created by glaucia on 27/07/14.
 */
@Entity
@Table(name = "referencia", schema = "", catalog = "Eleve")
public class ReferenciaEntity {
    private int id;
    private String referencia;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "referencia", nullable = true, insertable = true, updatable = true, length = 45, precision = 0)
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReferenciaEntity that = (ReferenciaEntity) o;

        if (id != that.id) return false;
        if (referencia != null ? !referencia.equals(that.referencia) : that.referencia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (referencia != null ? referencia.hashCode() : 0);
        return result;
    }
}
