package model;

public class Article {

	private int reference;
	private String categorie;
	private String auteur;
	private String titre;
	private String editeur;
	private String prix;
	private String annee;
	private String qteStock;
	private String photo;

	public Article() {
		
	}

	public Article(int reference,
			String categorie,
			String auteur,
			String titre,
			String editeur,
			String prix,
			String annee,
			String qteStock,
			String photo) {

		this.reference = reference;
		this.auteur = auteur;
		this.titre = titre;
		this.editeur = editeur;
		this.prix = prix;
		this.annee = annee;
		this.qteStock = qteStock;
		this.photo = photo;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getQteStock() {
		return qteStock;
	}

	public void setQteStock(String qteStock) {
		this.qteStock = qteStock;
	}
	
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Article [reference=" + reference + ", categorie=" + categorie + ", auteur=" + auteur + ", titre="
				+ titre + ", editeur=" + editeur + ", prix=" + prix + ", annee=" + annee + ", qteStock="
				+ qteStock + ", photo=" + photo + "]";
	}
	
}
