/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolnicya.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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

/**
 *
 * @author 207380
 */
@Entity
@Table(name = "medcard")
@NamedQueries({
    @NamedQuery(name = "Medcard.findAll", query = "SELECT m FROM Medcard m"),
    @NamedQuery(name = "Medcard.findById", query = "SELECT m FROM Medcard m WHERE m.id = :id"),
    @NamedQuery(name = "Medcard.findByNumber", query = "SELECT m FROM Medcard m WHERE m.number = :number"),
    @NamedQuery(name = "Medcard.findByDateOfCreation", query = "SELECT m FROM Medcard m WHERE m.dateOfCreation = :dateOfCreation")})
public class Medcard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "number")
    private Integer number;
    @Column(name = "date_of_creation")
    @Temporal(TemporalType.DATE)
    private Date dateOfCreation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medcardId")
    private Collection<MedcardDirection> medcardDirectionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medcardId")
    private Collection<MedcardDiseases> medcardDiseasesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medcardId")
    private Collection<Patient> patientCollection;

    public Medcard() {
    }

    public Medcard(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Collection<MedcardDirection> getMedcardDirectionCollection() {
        return medcardDirectionCollection;
    }

    public void setMedcardDirectionCollection(Collection<MedcardDirection> medcardDirectionCollection) {
        this.medcardDirectionCollection = medcardDirectionCollection;
    }

    public Collection<MedcardDiseases> getMedcardDiseasesCollection() {
        return medcardDiseasesCollection;
    }

    public void setMedcardDiseasesCollection(Collection<MedcardDiseases> medcardDiseasesCollection) {
        this.medcardDiseasesCollection = medcardDiseasesCollection;
    }

    public Collection<Patient> getPatientCollection() {
        return patientCollection;
    }

    public void setPatientCollection(Collection<Patient> patientCollection) {
        this.patientCollection = patientCollection;
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
        if (!(object instanceof Medcard)) {
            return false;
        }
        Medcard other = (Medcard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bolnicya.entity.Medcard[ id=" + id + " ]";
    }
    
}
