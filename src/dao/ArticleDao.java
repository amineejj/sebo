package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Article;
import model.Categorie;

public class ArticleDao {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public ArticleDao() {
		emf = Persistence.createEntityManagerFactory("sebo_00");
		em = emf.createEntityManager();
	}
	
	public List<Article> getArticlesByGenre(String genre){
	      Query query = em.createQuery("SELECT c FROM Categories c WHERE c.Cat = :genre");
	      query.setParameter("genre", genre);
	      Categorie categorie = (Categorie) query.getResultList().get(0);
	      return categorie.getArticles() ;
	}

	public Article getArticleById(int id) {
		
		Article article = em.find(Article.class, id);
        if (article == null) {
            throw new EntityNotFoundException("Can't find Artticle for ID "
                + id);
        }
        return article;
	}
}
