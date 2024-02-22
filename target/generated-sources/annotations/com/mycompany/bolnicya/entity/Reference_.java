package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.Patient;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Reference.class)
public class Reference_ { 

    public static volatile SingularAttribute<Reference, Date> date;
    public static volatile SingularAttribute<Reference, Patient> patientId;
    public static volatile SingularAttribute<Reference, Integer> id;

}