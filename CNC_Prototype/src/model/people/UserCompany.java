package model.people;

import java.util.List;

import model.Form;
import model.Segment;
import util.RolEnum;

public class UserCompany extends Person {

	private RolEnum role;
	private List<Segment> segments;
	private List<Form> forms;
}
