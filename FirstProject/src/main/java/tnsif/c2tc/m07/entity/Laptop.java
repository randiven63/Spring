package tnsif.c2tc.m07.entity;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int lid;
	private String Lname;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public void show()
	{
		System.out.println("In Laptop class");
	}
}
