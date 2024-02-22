package com.mycompany.bolnicya.entity;

import com.mycompany.bolnicya.entity.Admin;
import com.mycompany.bolnicya.entity.Doctor;
import com.mycompany.bolnicya.entity.Registar;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-13T14:23:16", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> patronymic;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> phoneNumber;
    public static volatile CollectionAttribute<User, Admin> adminCollection;
    public static volatile SingularAttribute<User, String> surname;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Date> dateOfBirth;
    public static volatile CollectionAttribute<User, Doctor> doctorCollection;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> login;
    public static volatile CollectionAttribute<User, Registar> registarCollection;

}