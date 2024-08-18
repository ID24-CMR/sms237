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
@Table(name = "exam_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExamType.findAll", query = "SELECT e FROM ExamType e")
    , @NamedQuery(name = "ExamType.findByExamTypeId", query = "SELECT e FROM ExamType e WHERE e.examTypeId = :examTypeId")
    , @NamedQuery(name = "ExamType.findByName", query = "SELECT e FROM ExamType e WHERE e.name = :name")
    , @NamedQuery(name = "ExamType.findByDescription", query = "SELECT e FROM ExamType e WHERE e.description = :description")})
public class ExamType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "exam_type_id")
    private Integer examTypeId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "examTypeId")
    private Collection<Exam> examCollection;

    public ExamType() {
    }

    public ExamType(Integer examTypeId) {
        this.examTypeId = examTypeId;
    }

    public ExamType(int id, String name, String desc) {
        this.description = desc;
        this.name = name;
        this.examTypeId = id;
    }

    public Integer getExamTypeId() {
        return examTypeId;
    }

    public void setExamTypeId(Integer examTypeId) {
        this.examTypeId = examTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<Exam> getExamCollection() {
        return examCollection;
    }

    public void setExamCollection(Collection<Exam> examCollection) {
        this.examCollection = examCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (examTypeId != null ? examTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamType)) {
            return false;
        }
        ExamType other = (ExamType) object;
        if ((this.examTypeId == null && other.examTypeId != null) || (this.examTypeId != null && !this.examTypeId.equals(other.examTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.ExamType[ examTypeId=" + examTypeId + " ]";
    }
    
}
