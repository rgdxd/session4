/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolnicya.entity;

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

/**
 *
 * @author 207380
 */
@Entity
@Table(name = "medcard_diseases")
@NamedQueries({
    @NamedQuery(name = "MedcardDiseases.findAll", query = "SELECT m FROM MedcardDiseases m"),
    @NamedQuery(name = "MedcardDiseases.findById", query = "SELECT m FROM MedcardDiseases m WHERE m.id = :id")})
public class MedcardDiseases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "diseases_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Diseases diseasesId;
    @JoinColumn(name = "medcard_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Medcard medcardId;

    public MedcardDiseases() {
    }

    public MedcardDiseases(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Diseases getDiseasesId() {
        return diseasesId;
    }

    public void setDiseasesId(Diseases diseasesId) {
        this.diseasesId = diseasesId;
    }

    public Medcard getMedcardId() {
        return medcardId;
    }

    public void setMedcardId(Medcard medcardId) {
        this.medcardId = medcardId;
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
        if (!(object instanceof MedcardDiseases)) {
            return false;
        }
        MedcardDiseases other = (MedcardDiseases) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bolnicya.entity.MedcardDiseases[ id=" + id + " ]";
    }
    
}
