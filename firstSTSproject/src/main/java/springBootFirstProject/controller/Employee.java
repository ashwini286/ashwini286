package springBootFirstProject.controller;

public class Employee {
private int id;
private String Name;
private String Depatment;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String depatment) {
	super();
	this.id = id;
	Name = name;
	Depatment = depatment;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDepatment() {
	return Depatment;
}
public void setDepatment(String depatment) {
	Depatment = depatment;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + ", Depatment=" + Depatment + "]";
}





}
