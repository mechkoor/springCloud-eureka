package micro.client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Client {

@Id
@GeneratedValue
private Long id;

private String nom;
private Float age;


public Client() {
	super();
	// TODO Auto-generated constructor stub
}
public Client(Long id, String nom, Float age) {
	super();
	this.id = id;
	this.nom = nom;
	this.age = age;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Float getAge() {
	return age;
}
public void setAge(Float age) {
	this.age = age;
}




}
