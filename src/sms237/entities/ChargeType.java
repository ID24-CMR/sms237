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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "charge_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChargeType.findAll", query = "SELECT c FROM ChargeType c")
    , @NamedQuery(name = "ChargeType.findById", query = "SELECT c FROM ChargeType c WHERE c.id = :id")
    , @NamedQuery(name = "ChargeType.findByCharge", query = "SELECT c FROM ChargeType c WHERE c.charge = :charge")})
public class ChargeType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "charge")
    private String charge;
    @OneToMany(mappedBy = "chargeTypeId")
    private Collection<StudentCharge> studentChargeCollection;

    public ChargeType() {
    }

    public ChargeType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
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
        if (!(object instanceof ChargeType)) {
            return false;
        }
        ChargeType other = (ChargeType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.ChargeType[ id=" + id + " ]";
    }
    
}
