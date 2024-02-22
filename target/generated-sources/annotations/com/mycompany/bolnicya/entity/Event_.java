package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.Direction;
import com.mycompany.bolnicya.entity.Doctor;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile CollectionAttribute<Event, Direction> directionCollection;
    public static volatile SingularAttribute<Event, Doctor> doctorId;
    public static volatile SingularAttribute<Event, Integer> id;
    public static volatile SingularAttribute<Event, String> title;

}