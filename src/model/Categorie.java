package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "categories")
@Data
public class Categorie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int refCat;
	private String cat;
	@OneToMany
	private List<Article> articles;
}
