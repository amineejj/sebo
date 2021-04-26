package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "commandes")
@Data
public class Commande implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numCommande;
	private int codeClient;
	private Date dateCommande;
}
