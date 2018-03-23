package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private int del;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDel() {
	return del;
}
public void setDel(int del) {
	this.del = del;
}
@Override
public String toString() {
	return "City [id=" + id + ", name=" + name + ", del=" + del + "]";
}
public City(int id, String name, int del) {
	super();
	this.id = id;
	this.name = name;
	this.del = del;
}
public City() {
	super();
}
	
}
