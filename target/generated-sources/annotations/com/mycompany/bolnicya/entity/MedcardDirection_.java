package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.Direction;
import com.mycompany.bolnicya.entity.Medcard;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(MedcardDirection.class)
public class MedcardDirection_ { 

    public static volatile SingularAttribute<MedcardDirection, Medcard> medcardId;
    public static volatile SingularAttribute<MedcardDirection, Direction> directionId;
    public static volatile SingularAttribute<MedcardDirection, Integer> id;

}