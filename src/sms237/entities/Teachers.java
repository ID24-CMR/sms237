/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms237.entities;

import java.io.Serializable;
import java.util.Collection;
import java.sql.Date;
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
@Table(name = "teachers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teachers.findAll", query = "SELECT t FROM Teachers t")
    , @NamedQuery(name = "Teachers.findByTeacherId", query = "SELECT t FROM Teachers t WHERE t.teacherId = :teacherId")
    , @NamedQuery(name = "Teachers.findByTeacherCode", query = "SELECT t FROM Teachers t WHERE t.teacherCode = :teacherCode")
    , @NamedQuery(name = "Teachers.findByTeacherFulName", query = "SELECT t FROM Teachers t WHERE t.teacherFulName = :teacherFulName")
    , @NamedQuery(name = "Teachers.findByGender", query = "SELECT t FROM Teachers t WHERE t.gender = :gender")
    , @NamedQuery(name = "Teachers.findByDob", query = "SELECT t FROM Teachers t WHERE t.dob = :dob")
    , @NamedQuery(name = "Teachers.findByEmail", query = "SELECT t FROM Teachers t WHERE t.email = :email")
    , @NamedQuery(name = "Teachers.findByPhone", query = "SELECT t FROM Teachers t WHERE t.phone = :phone")
    , @NamedQuery(name = "Teachers.findByIsActive", query = "SELECT t FROM Teachers t WHERE t.isActive = :isActive")
    , @NamedQuery(name = "Teachers.findByJoinDate", query = "SELECT t FROM Teachers t WHERE t.joinDate = :joinDate")
    , @NamedQuery(name = "Teachers.findByWorkingDays", query = "SELECT t FROM Teachers t WHERE t.workingDays = :workingDays")
    , @NamedQuery(name = "Teachers.findByCreatedAt", query = "SELECT t FROM Teachers t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "Teachers.findByUpdatedAt", query = "SELECT t FROM Teachers t WHERE t.updatedAt = :updatedAt")})
public class Teachers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "teacher_id")
    private Integer teacherId;
    @Column(name = "teacher_code")
    private String teacherCode;
    @Column(name = "teacher_ful_name")
    private String teacherFulName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "dob")
    private String dob;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "is_active")
    private Integer isActive;
    @Column(name = "join_date")
    @Temporal(TemporalType.DATE)
    private Date joinDate;
    @Column(name = "working_days")
    private Integer workingDays;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(mappedBy = "teacherId")
    private Collection<Classes> classesCollection;

    public Teachers() {
    }
    public Teachers(String st) {
        this.teacherFulName = st;
    }

    public Teachers(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getTeacherFulName() {
        return teacherFulName;
    }

    public void setTeacherFulName(String teacherFulName) {
        this.teacherFulName = teacherFulName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Integer getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(Integer workingDays) {
        this.workingDays = workingDays;
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
    public Collection<Classes> getClassesCollection() {
        return classesCollection;
    }

    public void setClassesCollection(Collection<Classes> classesCollection) {
        this.classesCollection = classesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teacherId != null ? teacherId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teachers)) {
            return false;
        }
        Teachers other = (Teachers) object;
        if ((this.teacherId == null && other.teacherId != null) || (this.teacherId != null && !this.teacherId.equals(other.teacherId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.Teachers[ teacherId=" + teacherId + " ]";
    }
    
}
