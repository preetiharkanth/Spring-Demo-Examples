package com.example;

import java.io.Serializable;

@Entity 

public class PersonEntity implements Serializable{
	private static final long serialVersionUID = -1801714432822866390L;

	 

	  @Id

	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	 
	  @Column(name="first_name", nullable = false)
	  private String firstName;


	  @Column(name="last_name", nullable = false)
	  private String lastName;
	 
	  private int age;

	 

	  private String place;

	 

	  protected PersonEntity(){

	 

	  }

}
