package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.Patient;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Extract.class)
public class Extract_ { 

    public static volatile SingularAttribute<Extract, Date> date;
    public static volatile SingularAttribute<Extract, Patient> patientId;
    public static volatile SingularAttribute<Extract, Integer> id;

}