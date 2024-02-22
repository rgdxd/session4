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
@Table(name = "schedule")
@NamedQueries({
    @NamedQuery(name = "Schedule.findAll", query = "SELECT s FROM Schedule s"),
    @NamedQuery(name = "Schedule.findById", query = "SELECT s FROM Schedule s WHERE s.id = :id"),
    @NamedQuery(name = "Schedule.findByMounth", query = "SELECT s FROM Schedule s WHERE s.mounth = :mounth"),
    @NamedQuery(name = "Schedule.findByYear", query = "SELECT s FROM Schedule s WHERE s.year = :year"),
    @NamedQuery(name = "Schedule.findByTime", query = "SELECT s FROM Schedule s WHERE s.time = :time")})
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "mounth")
    private String mounth;
    @Column(name = "year")
    private Integer year;
    @Column(name = "time")
    private String time;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "scheduleId")
    private Collection<SchedulePattern> schedulePatternCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "scheduleId")
    private Collection<ScheduleReception> scheduleReceptionCollection;

    public Schedule() {
    }

    public Schedule(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMounth() {
        return mounth;
    }

    public void setMounth(String mounth) {
        this.mounth = mounth;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Collection<SchedulePattern> getSchedulePatternCollection() {
        return schedulePatternCollection;
    }

    public void setSchedulePatternCollection(Collection<SchedulePattern> schedulePatternCollection) {
        this.schedulePatternCollection = schedulePatternCollection;
    }

    public Collection<ScheduleReception> getScheduleReceptionCollection() {
        return scheduleReceptionCollection;
    }

    public void setScheduleReceptionCollection(Collection<ScheduleReception> scheduleReceptionCollection) {
        this.scheduleReceptionCollection = scheduleReceptionCollection;
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
        if (!(object instanceof Schedule)) {
            return false;
        }
        Schedule other = (Schedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bolnicya.entity.Schedule[ id=" + id + " ]";
    }
    
}
