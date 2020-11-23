package com.lti.demo;

public class Person {
String name;
int id;
double percentage;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", percentage=" + percentage + "]";
}
public Person(String name, int id, double percentage) {
	super();
	this.name = name;
	this.id = id;
	this.percentage = percentage;
}
public Person() {
	super();
}

}
