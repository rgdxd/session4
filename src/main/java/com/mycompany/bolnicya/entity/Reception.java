/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolnicya.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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

/**
 *
 * @author 207380
 */
@Entity
@Table(name = "reception")
@NamedQueries({
    @NamedQuery(name = "Reception.findAll", query = "SELECT r FROM Reception r"),
    @NamedQuery(name = "Reception.findById", query = "SELECT r FROM Reception r WHERE r.id = :id"),
    @NamedQuery(name = "Reception.findByReceptioncol", query = "SELECT r FROM Reception r WHERE r.receptioncol = :receptioncol")})
public class Reception implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "receptioncol")
    private String receptioncol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receptionId")
    private Collection<ScheduleReception> scheduleReceptionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receptionId")
    private Collection<DoctorReception> doctorReceptionCollection;
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Patient patientId;

    public Reception() {
    }

    public Reception(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReceptioncol() {
        return receptioncol;
    }

    public void setReceptioncol(String receptioncol) {
        this.receptioncol = receptioncol;
    }

    public Collection<ScheduleReception> getScheduleReceptionCollection() {
        return scheduleReceptionCollection;
    }

    public void setScheduleReceptionCollection(Collection<ScheduleReception> scheduleReceptionCollection) {
        this.scheduleReceptionCollection = scheduleReceptionCollection;
    }

    public Collection<DoctorReception> getDoctorReceptionCollection() {
        return doctorReceptionCollection;
    }

    public void setDoctorReceptionCollection(Collection<DoctorReception> doctorReceptionCollection) {
        this.doctorReceptionCollection = doctorReceptionCollection;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
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
        if (!(object instanceof Reception)) {
            return false;
        }
        Reception other = (Reception) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bolnicya.entity.Reception[ id=" + id + " ]";
    }
    
}
