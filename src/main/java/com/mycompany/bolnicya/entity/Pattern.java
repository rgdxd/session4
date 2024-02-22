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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 207380
 */
@Entity
@Table(name = "pattern")
@NamedQueries({
    @NamedQuery(name = "Pattern.findAll", query = "SELECT p FROM Pattern p"),
    @NamedQuery(name = "Pattern.findById", query = "SELECT p FROM Pattern p WHERE p.id = :id"),
    @NamedQuery(name = "Pattern.findByTitle", query = "SELECT p FROM Pattern p WHERE p.title = :title")})
public class Pattern implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patternId")
    private Collection<PerviiDen> perviiDenCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patternId")
    private Collection<PosledniiDen> posledniiDenCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patternId")
    private Collection<SchedulePattern> schedulePatternCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patternId")
    private Collection<ChetnieDni> chetnieDniCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patternId")
    private Collection<NeChetnieDni> neChetnieDniCollection;

    public Pattern() {
    }

    public Pattern(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<PerviiDen> getPerviiDenCollection() {
        return perviiDenCollection;
    }

    public void setPerviiDenCollection(Collection<PerviiDen> perviiDenCollection) {
        this.perviiDenCollection = perviiDenCollection;
    }

    public Collection<PosledniiDen> getPosledniiDenCollection() {
        return posledniiDenCollection;
    }

    public void setPosledniiDenCollection(Collection<PosledniiDen> posledniiDenCollection) {
        this.posledniiDenCollection = posledniiDenCollection;
    }

    public Collection<SchedulePattern> getSchedulePatternCollection() {
        return schedulePatternCollection;
    }

    public void setSchedulePatternCollection(Collection<SchedulePattern> schedulePatternCollection) {
        this.schedulePatternCollection = schedulePatternCollection;
    }

    public Collection<ChetnieDni> getChetnieDniCollection() {
        return chetnieDniCollection;
    }

    public void setChetnieDniCollection(Collection<ChetnieDni> chetnieDniCollection) {
        this.chetnieDniCollection = chetnieDniCollection;
    }

    public Collection<NeChetnieDni> getNeChetnieDniCollection() {
        return neChetnieDniCollection;
    }

    public void setNeChetnieDniCollection(Collection<NeChetnieDni> neChetnieDniCollection) {
        this.neChetnieDniCollection = neChetnieDniCollection;
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
        if (!(object instanceof Pattern)) {
            return false;
        }
        Pattern other = (Pattern) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bolnicya.entity.Pattern[ id=" + id + " ]";
    }
    
}
