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
@Table(name = "poslednii_den")
@NamedQueries({
    @NamedQuery(name = "PosledniiDen.findAll", query = "SELECT p FROM PosledniiDen p"),
    @NamedQuery(name = "PosledniiDen.findById", query = "SELECT p FROM PosledniiDen p WHERE p.id = :id")})
public class PosledniiDen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "pattern_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pattern patternId;

    public PosledniiDen() {
    }

    public PosledniiDen(Integer id) {
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
        if (!(object instanceof PosledniiDen)) {
            return false;
        }
        PosledniiDen other = (PosledniiDen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bolnicya.entity.PosledniiDen[ id=" + id + " ]";
    }
    
}
