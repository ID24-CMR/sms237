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
@Table(name = "exam_result")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExamResult.findAll", query = "SELECT e FROM ExamResult e")
    , @NamedQuery(name = "ExamResult.findByResultId", query = "SELECT e FROM ExamResult e WHERE e.resultId = :resultId")
    , @NamedQuery(name = "ExamResult.findByMarks", query = "SELECT e FROM ExamResult e WHERE e.marks = :marks")})
public class ExamResult implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "result_id")
    private Integer resultId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "marks")
    private Double marks;
    @JoinColumn(name = "student_ids", referencedColumnName = "student_id")
    @ManyToOne
    private Students studentIds;
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    @ManyToOne
    private Subjects courseId;
    @JoinColumn(name = "exam_id", referencedColumnName = "exam_id")
    @ManyToOne
    private Exam examId;

    public ExamResult() {
    }

    public ExamResult(Integer resultId) {
        this.resultId = resultId;
    }

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public Students getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(Students studentIds) {
        this.studentIds = studentIds;
    }

    public Subjects getCourseId() {
        return courseId;
    }

    public void setCourseId(Subjects courseId) {
        this.courseId = courseId;
    }

    public Exam getExamId() {
        return examId;
    }

    public void setExamId(Exam examId) {
        this.examId = examId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resultId != null ? resultId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamResult)) {
            return false;
        }
        ExamResult other = (ExamResult) object;
        if ((this.resultId == null && other.resultId != null) || (this.resultId != null && !this.resultId.equals(other.resultId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sms237.entities.ExamResult[ resultId=" + resultId + " ]";
    }
    
}
