package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.Event;
import com.mycompany.bolnicya.entity.MedcardDirection;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Direction.class)
public class Direction_ { 

    public static volatile SingularAttribute<Direction, Event> eventId;
    public static volatile CollectionAttribute<Direction, MedcardDirection> medcardDirectionCollection;
    public static volatile SingularAttribute<Direction, Integer> id;

}