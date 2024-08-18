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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "student_charge")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentCharge.findAll", query = "SELECT s FROM StudentCharge s")
    , @NamedQuery(name = "StudentCharge.findById", query = "SELECT s FROM StudentCharge s WHERE s.id = :id")
    , @NamedQuery(name = "StudentCharge.findByAmount", query = "SELECT s FROM StudentCharge s WHERE s.amount = :amount")
    , @NamedQuery(name = "StudentCharge.findByChargeName", query = "SELECT s FROM StudentCharge s WHERE s.chargeName = :chargeName")})
public class StudentCharge implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "charge_name")
    private String chargeName;
    @JoinColumn(name = "id_student", referencedColumnName = "student_id")
    @ManyToOne
    private Students idStudent;
    @JoinColumn(name = "charge_type_id", referencedColumnName = "id")
    @ManyToOne
    private ChargeType chargeTypeId;
    @JoinColumn(name = "id_increment", referencedColumnName = "id")
    @ManyToOne
    private Increment idIncrement;
    @OneToMany(mappedBy = "idChargeType")
    private Collection<Payment> paymentCollection;

    public StudentCharge() {
    }

    public StudentCharge(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    public Students getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Students idStudent) {
        this.idStudent = idStudent;
    }

    public ChargeType getChargeTypeId() {
        return chargeTypeId;
    }

    public void setChargeTypeId(ChargeType chargeTypeId) {
        this.chargeTypeId = chargeTypeId;
    }

    public Increment getIdIncrement() {
        return idIncrement;
    }

    public void setIdIncrement(Increment idIncrement) {
        this.idIncrement = idIncrement;
    }

    @XmlTransient
    public Collection<Payment> getPaymentCollection() {
        return paymentCollection;
    }

    public void setPaymentCollection(Collection<Payment> paymentCollection) {
        this.paymentCollection = paymentCollection;
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
        if (!(object instanceof StudentCharge)) {
            return false;
        }
        StudentCharge other = (StudentCharge) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.StudentCharge[ id=" + id + " ]";
    }
    
}
