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
@Table(name = "subjects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subjects.findAll", query = "SELECT s FROM Subjects s")
    , @NamedQuery(name = "Subjects.findById", query = "SELECT s FROM Subjects s WHERE s.id = :id")
    , @NamedQuery(name = "Subjects.findBySbname", query = "SELECT s FROM Subjects s WHERE s.sbname = :sbname")
    , @NamedQuery(name = "Subjects.findByAbname", query = "SELECT s FROM Subjects s WHERE s.abname = :abname")})
public class Subjects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "sbname")
    private String sbname;
    @Column(name = "abname")
    private String abname;
    @OneToMany(mappedBy = "subjectId")
    private Collection<Classes> classesCollection;
    @JoinColumn(name = "school_id", referencedColumnName = "set_school_id")
    @ManyToOne
    private SetSchool schoolId;
    @OneToMany(mappedBy = "courseId")
    private Collection<ExamResult> examResultCollection;

    public Subjects() {
    }
    public Subjects(String st) {
        this.sbname = st;
    }

    public Subjects(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSbname() {
        return sbname;
    }

    public void setSbname(String sbname) {
        this.sbname = sbname;
    }

    public String getAbname() {
        return abname;
    }

    public void setAbname(String abname) {
        this.abname = abname;
    }

    @XmlTransient
    public Collection<Classes> getClassesCollection() {
        return classesCollection;
    }

    public void setClassesCollection(Collection<Classes> classesCollection) {
        this.classesCollection = classesCollection;
    }

    public SetSchool getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(SetSchool schoolId) {
        this.schoolId = schoolId;
    }

    @XmlTransient
    public Collection<ExamResult> getExamResultCollection() {
        return examResultCollection;
    }

    public void setExamResultCollection(Collection<ExamResult> examResultCollection) {
        this.examResultCollection = examResultCollection;
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
        if (!(object instanceof Subjects)) {
            return false;
        }
        Subjects other = (Subjects) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.Subjects[ id=" + id + " ]";
    }
    
}
