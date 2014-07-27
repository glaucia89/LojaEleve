package com.springapp;

import javax.persistence.*;

/**
 * Created by glaucia on 27/07/14.
 */
@Entity
@Table(name = "logs", schema = "", catalog = "Eleve")
public class LogsEntity {
    private int idLog;
    private Integer precofinal;
    private CorEntity corByCor;
    private DescontoEntity descontoByDesconto;
    private EntradaEntity entradaByEntrada;

    @Id
    @Column(name = "idLog", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getIdLog() {
        return idLog;
    }

    public void setIdLog(int idLog) {
        this.idLog = idLog;
    }

    @Basic
    @Column(name = "precofinal", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPrecofinal() {
        return precofinal;
    }

    public void setPrecofinal(Integer precofinal) {
        this.precofinal = precofinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogsEntity that = (LogsEntity) o;

        if (idLog != that.idLog) return false;
        if (precofinal != null ? !precofinal.equals(that.precofinal) : that.precofinal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLog;
        result = 31 * result + (precofinal != null ? precofinal.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "cor", referencedColumnName = "id")
    public CorEntity getCorByCor() {
        return corByCor;
    }

    public void setCorByCor(CorEntity corByCor) {
        this.corByCor = corByCor;
    }

    @ManyToOne
    @JoinColumn(name = "desconto", referencedColumnName = "id")
    public DescontoEntity getDescontoByDesconto() {
        return descontoByDesconto;
    }

    public void setDescontoByDesconto(DescontoEntity descontoByDesconto) {
        this.descontoByDesconto = descontoByDesconto;
    }

    @ManyToOne
    @JoinColumn(name = "entrada", referencedColumnName = "id")
    public EntradaEntity getEntradaByEntrada() {
        return entradaByEntrada;
    }

    public void setEntradaByEntrada(EntradaEntity entradaByEntrada) {
        this.entradaByEntrada = entradaByEntrada;
    }
}
