package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.Reception;
import com.mycompany.bolnicya.entity.Schedule;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ScheduleReception.class)
public class ScheduleReception_ { 

    public static volatile SingularAttribute<ScheduleReception, Integer> id;
    public static volatile SingularAttribute<ScheduleReception, Reception> receptionId;
    public static volatile SingularAttribute<ScheduleReception, Schedule> scheduleId;

}