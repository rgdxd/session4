package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.DoctorReception;
import com.mycompany.bolnicya.entity.Event;
import com.mycompany.bolnicya.entity.Specialization;
import com.mycompany.bolnicya.entity.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Doctor.class)
public class Doctor_ { 

    public static volatile CollectionAttribute<Doctor, Event> eventCollection;
    public static volatile SingularAttribute<Doctor, Specialization> specializationId;
    public static volatile SingularAttribute<Doctor, Integer> id;
    public static volatile SingularAttribute<Doctor, User> userId;
    public static volatile CollectionAttribute<Doctor, DoctorReception> doctorReceptionCollection;

}