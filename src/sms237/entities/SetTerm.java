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
@Table(name = "set_term")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SetTerm.findAll", query = "SELECT s FROM SetTerm s")
    , @NamedQuery(name = "SetTerm.findByTermId", query = "SELECT s FROM SetTerm s WHERE s.termId = :termId")
    , @NamedQuery(name = "SetTerm.findBySchoolId", query = "SELECT s FROM SetTerm s WHERE s.schoolId = :schoolId")
    , @NamedQuery(name = "SetTerm.findByTermTitle", query = "SELECT s FROM SetTerm s WHERE s.termTitle = :termTitle")
    , @NamedQuery(name = "SetTerm.findByStarDate", query = "SELECT s FROM SetTerm s WHERE s.starDate = :starDate")
    , @NamedQuery(name = "SetTerm.findByEndDate", query = "SELECT s FROM SetTerm s WHERE s.endDate = :endDate")})
public class SetTerm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "term_id")
    private Integer termId;
    @Column(name = "school_id")
    private Integer schoolId;
    @Column(name = "term_title")
    private String termTitle;
    @Column(name = "star_date")
    @Temporal(TemporalType.DATE)
    private Date starDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @OneToMany(mappedBy = "termId")
    private Collection<Classes> classesCollection;

    public SetTerm() {
    }
    
     public SetTerm(String title) {
         this.termTitle = title;
    }

    public SetTerm(Integer termId) {
        this.termId = termId;
    }

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getTermTitle() {
        return termTitle;
    }

    public void setTermTitle(String termTitle) {
        this.termTitle = termTitle;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @XmlTransient
    public Collection<Classes> getClassesCollection() {
        return classesCollection;
    }

    public void setClassesCollection(Collection<Classes> classesCollection) {
        this.classesCollection = classesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (termId != null ? termId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SetTerm)) {
            return false;
        }
        SetTerm other = (SetTerm) object;
        if ((this.termId == null && other.termId != null) || (this.termId != null && !this.termId.equals(other.termId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.SetTerm[ termId=" + termId + " ]";
    }
    
}
