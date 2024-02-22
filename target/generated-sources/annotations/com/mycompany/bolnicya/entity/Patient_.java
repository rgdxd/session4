package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.Extract;
import com.mycompany.bolnicya.entity.Medcard;
import com.mycompany.bolnicya.entity.Reception;
import com.mycompany.bolnicya.entity.Reference;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Patient.class)
public class Patient_ { 

    public static volatile SingularAttribute<Patient, String> address;
    public static volatile SingularAttribute<Patient, Integer> passSer;
    public static volatile CollectionAttribute<Patient, Reference> referenceCollection;
    public static volatile SingularAttribute<Patient, Date> dateOfBirth;
    public static volatile CollectionAttribute<Patient, Extract> extractCollection;
    public static volatile SingularAttribute<Patient, String> patronymic;
    public static volatile SingularAttribute<Patient, Medcard> medcardId;
    public static volatile SingularAttribute<Patient, String> phoneNumber;
    public static volatile CollectionAttribute<Patient, Reception> receptionCollection;
    public static volatile SingularAttribute<Patient, String> surname;
    public static volatile SingularAttribute<Patient, String> name;
    public static volatile SingularAttribute<Patient, String> contactNumber;
    public static volatile SingularAttribute<Patient, Integer> id;
    public static volatile SingularAttribute<Patient, Integer> passNum;

}