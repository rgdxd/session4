package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.SchedulePattern;
import com.mycompany.bolnicya.entity.ScheduleReception;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Schedule.class)
public class Schedule_ { 

    public static volatile SingularAttribute<Schedule, Integer> year;
    public static volatile CollectionAttribute<Schedule, ScheduleReception> scheduleReceptionCollection;
    public static volatile SingularAttribute<Schedule, Integer> id;
    public static volatile SingularAttribute<Schedule, String> time;
    public static volatile SingularAttribute<Schedule, String> mounth;
    public static volatile CollectionAttribute<Schedule, SchedulePattern> schedulePatternCollection;

}