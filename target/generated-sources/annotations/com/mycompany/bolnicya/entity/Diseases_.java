package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.MedcardDiseases;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Diseases.class)
public class Diseases_ { 

    public static volatile SingularAttribute<Diseases, String> diseases;
    public static volatile SingularAttribute<Diseases, Integer> id;
    public static volatile CollectionAttribute<Diseases, MedcardDiseases> medcardDiseasesCollection;

}