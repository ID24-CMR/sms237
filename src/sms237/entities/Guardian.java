/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms237.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author idrice24
 */
@Entity
@Table(name = "guardian")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guardian.findAll", query = "SELECT g FROM Guardian g")
    , @NamedQuery(name = "Guardian.findByGuardianId", query = "SELECT g FROM Guardian g WHERE g.guardianId = :guardianId")
    , @NamedQuery(name = "Guardian.findByGuardianCode", query = "SELECT g FROM Guardian g WHERE g.guardianCode = :guardianCode")
    , @NamedQuery(name = "Guardian.findByGuardianFullName", query = "SELECT g FROM Guardian g WHERE g.guardianFullName = :guardianFullName")
    , @NamedQuery(name = "Guardian.findByEmail", query = "SELECT g FROM Guardian g WHERE g.email = :email")
    , @NamedQuery(name = "Guardian.findByPhone", query = "SELECT g FROM Guardian g WHERE g.phone = :phone")
    , @NamedQuery(name = "Guardian.findByCreatedAt", query = "SELECT g FROM Guardian g WHERE g.createdAt = :createdAt")
    , @NamedQuery(name = "Guardian.findByUpdatedAt", query = "SELECT g FROM Guardian g WHERE g.updatedAt = :updatedAt")})
public class Guardian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "guardian_id")
    private Integer guardianId;
    @Column(name = "guardian_code")
    private String guardianCode;
    @Column(name = "guardian_full_name")
    private String guardianFullName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(mappedBy = "guardianId")
    private Collection<StudentGuardian> studentGuardianCollection;

    public Guardian() {
    }

    public Guardian(Integer guardianId) {
        this.guardianId = guardianId;
    }

    public Integer getGuardianId() {
        return guardianId;
    }

    public void setGuardianId(Integer guardianId) {
        this.guardianId = guardianId;
    }

    public String getGuardianCode() {
        return guardianCode;
    }

    public void setGuardianCode(String guardianCode) {
        this.guardianCode = guardianCode;
    }

    public String getGuardianFullName() {
        return guardianFullName;
    }

    public void setGuardianFullName(String guardianFullName) {
        this.guardianFullName = guardianFullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @XmlTransient
    public Collection<StudentGuardian> getStudentGuardianCollection() {
        return studentGuardianCollection;
    }

    public void setStudentGuardianCollection(Collection<StudentGuardian> studentGuardianCollection) {
        this.studentGuardianCollection = studentGuardianCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guardianId != null ? guardianId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guardian)) {
            return false;
        }
        Guardian other = (Guardian) object;
        if ((this.guardianId == null && other.guardianId != null) || (this.guardianId != null && !this.guardianId.equals(other.guardianId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.Guardian[ guardianId=" + guardianId + " ]";
    }
    
}
