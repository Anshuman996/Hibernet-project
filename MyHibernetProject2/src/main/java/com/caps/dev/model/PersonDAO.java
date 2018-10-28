package com.caps.dev.model;

import com.caps.dev.beans.Person;

public interface PersonDAO {
	public void create(Person person);
	public void update();
	public void delete();
	public void search(int perId);

}