package com.mycompany.test2k19.data.domain;

import com.mycompany.test2k19.data.enums.Authority;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, LocalDateTime> registrationTime;
	public static volatile SingularAttribute<User, String> firstName;
	public static volatile SingularAttribute<User, String> lastName;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, Address> address;
	public static volatile SingularAttribute<User, Boolean> isValidated;
	public static volatile SingularAttribute<User, Boolean> isDeleted;
	public static volatile SingularAttribute<User, String> nickName;
	public static volatile SingularAttribute<User, Authority> authority;
	public static volatile SingularAttribute<User, Integer> id;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> validateToken;

}

