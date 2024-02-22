package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.Doctor;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Specialization.class)
public class Specialization_ { 

    public static volatile CollectionAttribute<Specialization, Doctor> doctorCollection;
    public static volatile SingularAttribute<Specialization, Integer> id;
    public static volatile SingularAttribute<Specialization, String> title;

}