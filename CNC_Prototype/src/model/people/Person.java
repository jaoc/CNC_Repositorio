/**
 * 
 */
package model.people;

import java.util.List;

import main.Context;

/**
 * @author netcomp
 *
 */
public abstract class Person extends Context{

	private Long id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private boolean male;
	private List<DetailPerson> details;
	
	
	
	
}
