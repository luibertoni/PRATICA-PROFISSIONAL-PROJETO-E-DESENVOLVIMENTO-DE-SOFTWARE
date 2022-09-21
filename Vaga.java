/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author debian
 */
@Entity
@Table(name = "vaga")
@NamedQueries({
    @NamedQuery(name = "Vaga_1.findAll", query = "SELECT v FROM Vaga_1 v"),
    @NamedQuery(name = "Vaga_1.findById", query = "SELECT v FROM Vaga_1 v WHERE v.id = :id"),
    @NamedQuery(name = "Vaga_1.findByAndar", query = "SELECT v FROM Vaga_1 v WHERE v.andar = :andar"),
    @NamedQuery(name = "Vaga_1.findByRua", query = "SELECT v FROM Vaga_1 v WHERE v.rua = :rua"),
    @NamedQuery(name = "Vaga_1.findByNumero", query = "SELECT v FROM Vaga_1 v WHERE v.numero = :numero"),
    @NamedQuery(name = "Vaga_1.findByTipo", query = "SELECT v FROM Vaga_1 v WHERE v.tipo = :tipo"),
    @NamedQuery(name = "Vaga_1.findByEstado", query = "SELECT v FROM Vaga_1 v WHERE v.estado = :estado")})
public class Vaga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "andar")
    private Short andar;
    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "estado")
    private Boolean estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVaga")
    private Collection<Registro> registroCollection;

    public Vaga() {
    }

    public Vaga(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getAndar() {
        return andar;
    }

    public void setAndar(Short andar) {
        this.andar = andar;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Collection<Registro> getRegistroCollection() {
        return registroCollection;
    }

    public void setRegistroCollection(Collection<Registro> registroCollection) {
        this.registroCollection = registroCollection;
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
        if (!(object instanceof Vaga)) {
            return false;
        }
        Vaga other = (Vaga) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.Vaga_1[ id=" + id + " ]";
    }
    
}
