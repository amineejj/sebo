package model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Client {

	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String password;
}
