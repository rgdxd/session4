package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.Diseases;
import com.mycompany.bolnicya.entity.Medcard;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(MedcardDiseases.class)
public class MedcardDiseases_ { 

    public static volatile SingularAttribute<MedcardDiseases, Medcard> medcardId;
    public static volatile SingularAttribute<MedcardDiseases, Diseases> diseasesId;
    public static volatile SingularAttribute<MedcardDiseases, Integer> id;

}