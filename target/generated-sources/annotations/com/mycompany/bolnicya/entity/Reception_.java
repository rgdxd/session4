package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.DoctorReception;
import com.mycompany.bolnicya.entity.Patient;
import com.mycompany.bolnicya.entity.ScheduleReception;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Reception.class)
public class Reception_ { 

    public static volatile SingularAttribute<Reception, Patient> patientId;
    public static volatile CollectionAttribute<Reception, ScheduleReception> scheduleReceptionCollection;
    public static volatile SingularAttribute<Reception, Integer> id;
    public static volatile CollectionAttribute<Reception, DoctorReception> doctorReceptionCollection;
    public static volatile SingularAttribute<Reception, String> receptioncol;

}