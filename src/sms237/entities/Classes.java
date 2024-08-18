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
@Table(name = "classes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classes.findAll", query = "SELECT c FROM Classes c")
    , @NamedQuery(name = "Classes.findByClassName", query = "SELECT c FROM Classes c WHERE c.className = :className")
    , @NamedQuery(name = "Classes.findBySection", query = "SELECT c FROM Classes c WHERE c.section = :section")
    , @NamedQuery(name = "Classes.findByClassId", query = "SELECT c FROM Classes c WHERE c.classId = :classId")
    , @NamedQuery(name = "Classes.findByGroupe", query = "SELECT c FROM Classes c WHERE c.groupe = :groupe")
    , @NamedQuery(name = "Classes.findByClassId1", query = "SELECT c FROM Classes c WHERE c.classId1 = :classId1")})
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "className")
    private String className;
    @Basic(optional = false)
    @Column(name = "section")
    private String section;
    @Basic(optional = false)
    @Column(name = "classId")
    private String classId;
    @Basic(optional = false)
    @Column(name = "groupe")
    private String groupe;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "class_id")
    private Integer classId1;
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id")
    @ManyToOne
    private Teachers teacherId;
    @JoinColumn(name = "class_room_id", referencedColumnName = "classroom_id")
    @ManyToOne
    private Classroom classRoomId;
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    @ManyToOne
    private Subjects subjectId;
    @JoinColumn(name = "term_id", referencedColumnName = "term_id")
    @ManyToOne
    private SetTerm termId;
    @OneToMany(mappedBy = "classId")
    private Collection<ClassStudents> classStudentsCollection;

    public Classes() {
    }

    public Classes(Integer classId1) {
        this.classId1 = classId1;
    }

    public Classes(Integer classId1, String className, String section, String classId, String groupe) {
        this.classId1 = classId1;
        this.className = className;
        this.section = section;
        this.classId = classId;
        this.groupe = groupe;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public Integer getClassId1() {
        return classId1;
    }

    public void setClassId1(Integer classId1) {
        this.classId1 = classId1;
    }

    public Teachers getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Teachers teacherId) {
        this.teacherId = teacherId;
    }

    public Classroom getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(Classroom classRoomId) {
        this.classRoomId = classRoomId;
    }

    public Subjects getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subjects subjectId) {
        this.subjectId = subjectId;
    }

    public SetTerm getTermId() {
        return termId;
    }

    public void setTermId(SetTerm termId) {
        this.termId = termId;
    }

    @XmlTransient
    public Collection<ClassStudents> getClassStudentsCollection() {
        return classStudentsCollection;
    }

    public void setClassStudentsCollection(Collection<ClassStudents> classStudentsCollection) {
        this.classStudentsCollection = classStudentsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (classId1 != null ? classId1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classes)) {
            return false;
        }
        Classes other = (Classes) object;
        if ((this.classId1 == null && other.classId1 != null) || (this.classId1 != null && !this.classId1.equals(other.classId1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.Classes[ classId1=" + classId1 + " ]";
    }
    
}
