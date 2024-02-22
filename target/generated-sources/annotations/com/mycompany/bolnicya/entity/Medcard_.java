package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.MedcardDirection;
import com.mycompany.bolnicya.entity.MedcardDiseases;
import com.mycompany.bolnicya.entity.Patient;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Medcard.class)
public class Medcard_ { 

    public static volatile SingularAttribute<Medcard, Integer> number;
    public static volatile CollectionAttribute<Medcard, MedcardDirection> medcardDirectionCollection;
    public static volatile CollectionAttribute<Medcard, Patient> patientCollection;
    public static volatile SingularAttribute<Medcard, Integer> id;
    public static volatile CollectionAttribute<Medcard, MedcardDiseases> medcardDiseasesCollection;
    public static volatile SingularAttribute<Medcard, Date> dateOfCreation;

}