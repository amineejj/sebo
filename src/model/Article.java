package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reference;
	
    @ManyToOne(fetch = FetchType.EAGER, optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "refCat")
	private Categorie categorie;
	private String auteur;
	private String titre;
	private String editeur;
	private String prix;
	private String annee;
	private String qteStock;
	private String photo;
}
