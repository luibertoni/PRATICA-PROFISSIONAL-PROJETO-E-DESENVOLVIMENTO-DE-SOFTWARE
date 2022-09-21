/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author debian
 */
@Entity
@Table(name = "registro")
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r"),
    @NamedQuery(name = "Registro.findById", query = "SELECT r FROM Registro r WHERE r.id = :id"),
    @NamedQuery(name = "Registro.findByDiaEntrada", query = "SELECT r FROM Registro r WHERE r.diaEntrada = :diaEntrada"),
    @NamedQuery(name = "Registro.findByHoraEntrada", query = "SELECT r FROM Registro r WHERE r.horaEntrada = :horaEntrada"),
    @NamedQuery(name = "Registro.findByDiaSaida", query = "SELECT r FROM Registro r WHERE r.diaSaida = :diaSaida"),
    @NamedQuery(name = "Registro.findByHoraSaida", query = "SELECT r FROM Registro r WHERE r.horaSaida = :horaSaida"),
    @NamedQuery(name = "Registro.findByValorUso", query = "SELECT r FROM Registro r WHERE r.valorUso = :valorUso"),
    @NamedQuery(name = "Registro.findByHoraAdicional", query = "SELECT r FROM Registro r WHERE r.horaAdicional = :horaAdicional"),
    @NamedQuery(name = "Registro.findByTotal", query = "SELECT r FROM Registro r WHERE r.total = :total")})
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "dia_entrada")
    @Temporal(TemporalType.DATE)
    private Date diaEntrada;
    @Basic(optional = false)
    @Column(name = "hora_entrada")
    @Temporal(TemporalType.TIME)
    private Date horaEntrada;
    @Column(name = "dia_saida")
    @Temporal(TemporalType.DATE)
    private Date diaSaida;
    @Column(name = "hora_saida")
    @Temporal(TemporalType.TIME)
    private Date horaSaida;
    @Column(name = "valor_uso")
    private BigInteger valorUso;
    @Column(name = "hora_adicional")
    private BigInteger horaAdicional;
    @Column(name = "total")
    private BigInteger total;
    @JoinColumn(name = "placa", referencedColumnName = "placa")
    @ManyToOne(optional = false)
    private Carros placa;
    @JoinColumn(name = "id_vaga", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Vaga idVaga;

    public Registro() {
    }

    public Registro(Integer id) {
        this.id = id;
    }

    public Registro(Integer id, Date diaEntrada, Date horaEntrada) {
        this.id = id;
        this.diaEntrada = diaEntrada;
        this.horaEntrada = horaEntrada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDiaEntrada() {
        return diaEntrada;
    }

    public void setDiaEntrada(Date diaEntrada) {
        this.diaEntrada = diaEntrada;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getDiaSaida() {
        return diaSaida;
    }

    public void setDiaSaida(Date diaSaida) {
        this.diaSaida = diaSaida;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public BigInteger getValorUso() {
        return valorUso;
    }

    public void setValorUso(BigInteger valorUso) {
        this.valorUso = valorUso;
    }

    public BigInteger getHoraAdicional() {
        return horaAdicional;
    }

    public void setHoraAdicional(BigInteger horaAdicional) {
        this.horaAdicional = horaAdicional;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public Carros getPlaca() {
        return placa;
    }

    public void setPlaca(Carros placa) {
        this.placa = placa;
    }

    public Vaga getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(Vaga idVaga) {
        this.idVaga = idVaga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.Registro[ id=" + id + " ]";
    }
    
}
