/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms237.entities;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author idrice24
 */
@Entity
@Table(name = "class_students")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClassStudents.findAll", query = "SELECT c FROM ClassStudents c")
    , @NamedQuery(name = "ClassStudents.findByClassStudentsId", query = "SELECT c FROM ClassStudents c WHERE c.classStudentsId = :classStudentsId")})
public class ClassStudents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "class_students_id")
    private Integer classStudentsId;
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    @ManyToOne
    private Students studentId;
    @JoinColumn(name = "class_id", referencedColumnName = "class_id")
    @ManyToOne
    private Classes classId;

    public ClassStudents() {
    }

    public ClassStudents(Integer classStudentsId) {
        this.classStudentsId = classStudentsId;
    }

    public Integer getClassStudentsId() {
        return classStudentsId;
    }

    public void setClassStudentsId(Integer classStudentsId) {
        this.classStudentsId = classStudentsId;
    }

    public Students getStudentId() {
        return studentId;
    }

    public void setStudentId(Students studentId) {
        this.studentId = studentId;
    }

    public Classes getClassId() {
        return classId;
    }

    public void setClassId(Classes classId) {
        this.classId = classId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (classStudentsId != null ? classStudentsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClassStudents)) {
            return false;
        }
        ClassStudents other = (ClassStudents) object;
        if ((this.classStudentsId == null && other.classStudentsId != null) || (this.classStudentsId != null && !this.classStudentsId.equals(other.classStudentsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.ClassStudents[ classStudentsId=" + classStudentsId + " ]";
    }
    
}
