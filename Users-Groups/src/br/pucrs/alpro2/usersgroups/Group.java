package br.pucrs.alpro2.usersgroups;

import java.util.ArrayList;

public class Group {
	
	private String name;
	private int idGroup;

	
	public Group(String name, int idGroup) {
		super();
		this.name = name;
		this.idGroup = idGroup;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdGroup() {
		return idGroup;
	}
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}
	
}
