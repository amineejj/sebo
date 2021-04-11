package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Article;

public class ArticleDao {
	
	private ConnectionDB cnx;

	public ArticleDao(ConnectionDB cnx) {
		this.cnx = cnx;
	}
	
	public List<Article> getArticlesByGenre(String genre){
		
		List<Article> articles = new ArrayList<Article>();
		String query = "SELECT a.*, c.Cat " + 
				"FROM articles AS a " + 
				"INNER JOIN categories AS c ON c.RefCat = a.Categorie " +
				"WHERE c.Cat = '"+ genre +"';";
		
        try {
			ResultSet rs =  cnx.getSt().executeQuery(query);
			Article article = new Article();
            while(rs.next()) {
            	
            	article.setReference(rs.getInt("CodeArticle"));
            	article.setCategorie(rs.getString("Cat"));
            	article.setAuteur(rs.getString("Auteur"));
            	article.setEditeur(rs.getString("Editeur"));
            	article.setAnnee(rs.getString("Annee"));
            	article.setPrix(rs.getString("Prix"));
            	article.setQteStock(rs.getString("Stock"));
            	article.setTitre(rs.getString("Titre"));
            	article.setPhoto(rs.getString("Photo"));
            	
            	articles.add(article);
            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return articles;
	}

	public Article getArticleById(int id) {
		
		Article article = new Article();
		String query = "SELECT a.*, c.Cat " + 
				"FROM articles AS a " + 
				"INNER JOIN categories AS c ON c.RefCat = a.Categorie " +
				"WHERE a.CodeArticle = "+ id +";";
		
        try {
			ResultSet rs =  cnx.getSt().executeQuery(query);
            while(rs.next()) {
            	
            	article.setReference(rs.getInt("CodeArticle"));
            	article.setCategorie(rs.getString("Cat"));
            	article.setAuteur(rs.getString("Auteur"));
            	article.setEditeur(rs.getString("Editeur"));
            	article.setAnnee(rs.getString("Annee"));
            	article.setPrix(rs.getString("Prix"));
            	article.setQteStock(rs.getString("Stock"));
            	article.setTitre(rs.getString("Titre"));
            	article.setPhoto(rs.getString("Photo"));
            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return article;
	}
}
