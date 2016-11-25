package co.edu.uniandes.entity;

import java.util.ArrayList;

public class Validacion {
    private String name;
	private ArrayList<String> values;
	public  Validacion(){
		values  = new ArrayList<String>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getValues() {
		return values;
	}
	public void setValues(ArrayList<String> values) {
		this.values = values;
	}
	
}
