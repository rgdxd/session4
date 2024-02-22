package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.ChetnieDni;
import com.mycompany.bolnicya.entity.NeChetnieDni;
import com.mycompany.bolnicya.entity.PerviiDen;
import com.mycompany.bolnicya.entity.PosledniiDen;
import com.mycompany.bolnicya.entity.SchedulePattern;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pattern.class)
public class Pattern_ { 

    public static volatile CollectionAttribute<Pattern, PosledniiDen> posledniiDenCollection;
    public static volatile CollectionAttribute<Pattern, PerviiDen> perviiDenCollection;
    public static volatile CollectionAttribute<Pattern, NeChetnieDni> neChetnieDniCollection;
    public static volatile SingularAttribute<Pattern, Integer> id;
    public static volatile SingularAttribute<Pattern, String> title;
    public static volatile CollectionAttribute<Pattern, SchedulePattern> schedulePatternCollection;
    public static volatile CollectionAttribute<Pattern, ChetnieDni> chetnieDniCollection;

}