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
@Table(name = "student_guardian")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentGuardian.findAll", query = "SELECT s FROM StudentGuardian s")
    , @NamedQuery(name = "StudentGuardian.findByStudentGuardianId", query = "SELECT s FROM StudentGuardian s WHERE s.studentGuardianId = :studentGuardianId")
    , @NamedQuery(name = "StudentGuardian.findByRelatioship", query = "SELECT s FROM StudentGuardian s WHERE s.relatioship = :relatioship")})
public class StudentGuardian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "student_guardian_id")
    private Integer studentGuardianId;
    @Column(name = "relatioship")
    private String relatioship;
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    @ManyToOne
    private Students studentId;
    @JoinColumn(name = "guardian_id", referencedColumnName = "guardian_id")
    @ManyToOne
    private Guardian guardianId;

    public StudentGuardian() {
    }

    public StudentGuardian(Integer studentGuardianId) {
        this.studentGuardianId = studentGuardianId;
    }

    public Integer getStudentGuardianId() {
        return studentGuardianId;
    }

    public void setStudentGuardianId(Integer studentGuardianId) {
        this.studentGuardianId = studentGuardianId;
    }

    public String getRelatioship() {
        return relatioship;
    }

    public void setRelatioship(String relatioship) {
        this.relatioship = relatioship;
    }

    public Students getStudentId() {
        return studentId;
    }

    public void setStudentId(Students studentId) {
        this.studentId = studentId;
    }

    public Guardian getGuardianId() {
        return guardianId;
    }

    public void setGuardianId(Guardian guardianId) {
        this.guardianId = guardianId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentGuardianId != null ? studentGuardianId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentGuardian)) {
            return false;
        }
        StudentGuardian other = (StudentGuardian) object;
        if ((this.studentGuardianId == null && other.studentGuardianId != null) || (this.studentGuardianId != null && !this.studentGuardianId.equals(other.studentGuardianId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.StudentGuardian[ studentGuardianId=" + studentGuardianId + " ]";
    }
    
}
