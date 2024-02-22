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
@Table(name = "schedule_reception")
@NamedQueries({
    @NamedQuery(name = "ScheduleReception.findAll", query = "SELECT s FROM ScheduleReception s"),
    @NamedQuery(name = "ScheduleReception.findById", query = "SELECT s FROM ScheduleReception s WHERE s.id = :id")})
public class ScheduleReception implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "reception_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Reception receptionId;
    @JoinColumn(name = "schedule_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Schedule scheduleId;

    public ScheduleReception() {
    }

    public ScheduleReception(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Reception getReceptionId() {
        return receptionId;
    }

    public void setReceptionId(Reception receptionId) {
        this.receptionId = receptionId;
    }

    public Schedule getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Schedule scheduleId) {
        this.scheduleId = scheduleId;
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
        if (!(object instanceof ScheduleReception)) {
            return false;
        }
        ScheduleReception other = (ScheduleReception) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bolnicya.entity.ScheduleReception[ id=" + id + " ]";
    }
    
}
