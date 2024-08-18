/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms237.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author idrice24
 */
@Entity
@Table(name = "increment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Increment.findAll", query = "SELECT i FROM Increment i")
    , @NamedQuery(name = "Increment.findById", query = "SELECT i FROM Increment i WHERE i.id = :id")
    , @NamedQuery(name = "Increment.findByIncrementAmount", query = "SELECT i FROM Increment i WHERE i.incrementAmount = :incrementAmount")})
public class Increment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "increment_amount")
    private Integer incrementAmount;
    @OneToMany(mappedBy = "idIncrement")
    private Collection<StudentCharge> studentChargeCollection;

    public Increment() {
    }

    public Increment(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIncrementAmount() {
        return incrementAmount;
    }

    public void setIncrementAmount(Integer incrementAmount) {
        this.incrementAmount = incrementAmount;
    }

    @XmlTransient
    public Collection<StudentCharge> getStudentChargeCollection() {
        return studentChargeCollection;
    }

    public void setStudentChargeCollection(Collection<StudentCharge> studentChargeCollection) {
        this.studentChargeCollection = studentChargeCollection;
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
        if (!(object instanceof Increment)) {
            return false;
        }
        Increment other = (Increment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.Increment[ id=" + id + " ]";
    }
    
}
