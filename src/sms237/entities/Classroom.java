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
@Table(name = "classroom")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classroom.findAll", query = "SELECT c FROM Classroom c")
    , @NamedQuery(name = "Classroom.findByClassroomId", query = "SELECT c FROM Classroom c WHERE c.classroomId = :classroomId")
    , @NamedQuery(name = "Classroom.findByCapacity", query = "SELECT c FROM Classroom c WHERE c.capacity = :capacity")
    , @NamedQuery(name = "Classroom.findByRoomType", query = "SELECT c FROM Classroom c WHERE c.roomType = :roomType")
    , @NamedQuery(name = "Classroom.findByDescription", query = "SELECT c FROM Classroom c WHERE c.description = :description")
    , @NamedQuery(name = "Classroom.findByCreatedAt", query = "SELECT c FROM Classroom c WHERE c.createdAt = :createdAt")
    , @NamedQuery(name = "Classroom.findByUpdatedAt", query = "SELECT c FROM Classroom c WHERE c.updatedAt = :updatedAt")})
public class Classroom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "classroom_id")
    private Integer classroomId;
    @Column(name = "capacity")
    private Integer capacity;
    @Column(name = "room_type")
    private String roomType;
    @Column(name = "description")
    private String description;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(mappedBy = "classRoomId")
    private Collection<Classes> classesCollection;

    public Classroom() {
    }
    public Classroom(String st) {
        this.roomType = st;
    }

    public Classroom(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (classroomId != null ? classroomId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classroom)) {
            return false;
        }
        Classroom other = (Classroom) object;
        if ((this.classroomId == null && other.classroomId != null) || (this.classroomId != null && !this.classroomId.equals(other.classroomId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.Classroom[ classroomId=" + classroomId + " ]";
    }
    
}
