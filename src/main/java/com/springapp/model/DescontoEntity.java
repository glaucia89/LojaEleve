package com.springapp.model;

import javax.persistence.*;

/**
 * Created by glaucia on 27/07/14.
 */
@Entity
@Table(name = "desconto", schema = "", catalog = "Eleve")
public class DescontoEntity {
    private int id;
    private String desconto;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "desconto", nullable = true, insertable = true, updatable = true, length = 45, precision = 0)
    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DescontoEntity that = (DescontoEntity) o;

        if (id != that.id) return false;
        if (desconto != null ? !desconto.equals(that.desconto) : that.desconto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (desconto != null ? desconto.hashCode() : 0);
        return result;
    }
}
