/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolnicya.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "chetnie_dni")
@NamedQueries({
    @NamedQuery(name = "ChetnieDni.findAll", query = "SELECT c FROM ChetnieDni c"),
    @NamedQuery(name = "ChetnieDni.findById", query = "SELECT c FROM ChetnieDni c WHERE c.id = :id")})
public class ChetnieDni implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "pattern_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pattern patternId;

    public ChetnieDni() {
    }

    public ChetnieDni(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pattern getPatternId() {
        return patternId;
    }

    public void setPatternId(Pattern patternId) {
        this.patternId = patternId;
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
        if (!(object instanceof ChetnieDni)) {
            return false;
        }
        ChetnieDni other = (ChetnieDni) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bolnicya.entity.ChetnieDni[ id=" + id + " ]";
    }
    
}
