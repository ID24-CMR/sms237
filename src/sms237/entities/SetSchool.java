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
@Table(name = "set_school")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SetSchool.findAll", query = "SELECT s FROM SetSchool s")
    , @NamedQuery(name = "SetSchool.findBySetSchoolId", query = "SELECT s FROM SetSchool s WHERE s.setSchoolId = :setSchoolId")
    , @NamedQuery(name = "SetSchool.findBySchoolTitle", query = "SELECT s FROM SetSchool s WHERE s.schoolTitle = :schoolTitle")
    , @NamedQuery(name = "SetSchool.findByIsActive", query = "SELECT s FROM SetSchool s WHERE s.isActive = :isActive")
    , @NamedQuery(name = "SetSchool.findByCreatedAt", query = "SELECT s FROM SetSchool s WHERE s.createdAt = :createdAt")
    , @NamedQuery(name = "SetSchool.findByUpdatedAt", query = "SELECT s FROM SetSchool s WHERE s.updatedAt = :updatedAt")})
public class SetSchool implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "set_school_id")
    private Integer setSchoolId;
    @Column(name = "school_title")
    private String schoolTitle;
    @Column(name = "is_active")
    private Integer isActive;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(mappedBy = "schoolId")
    private Collection<Subjects> subjectsCollection;

    public SetSchool() {
    }

    public SetSchool(Integer setSchoolId, String school_title) {
        this.setSchoolId = setSchoolId;
        this.schoolTitle = school_title;
    }

    public Integer getSetSchoolId() {
        return setSchoolId;
    }

    public void setSetSchoolId(Integer setSchoolId) {
        this.setSchoolId = setSchoolId;
    }

    public String getSchoolTitle() {
        return schoolTitle;
    }

    public void setSchoolTitle(String schoolTitle) {
        this.schoolTitle = schoolTitle;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
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
    public Collection<Subjects> getSubjectsCollection() {
        return subjectsCollection;
    }

    public void setSubjectsCollection(Collection<Subjects> subjectsCollection) {
        this.subjectsCollection = subjectsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (setSchoolId != null ? setSchoolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SetSchool)) {
            return false;
        }
        SetSchool other = (SetSchool) object;
        if ((this.setSchoolId == null && other.setSchoolId != null) || (this.setSchoolId != null && !this.setSchoolId.equals(other.setSchoolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.SetSchool[ setSchoolId=" + setSchoolId + " ]";
    }
    
}
