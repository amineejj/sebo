package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ArticleDao;
import dao.ConnectionDB;
import model.Article;

@WebServlet(urlPatterns = {"/accueil.aspx",
							"/inscrire.aspx",
							"/identifier.aspx",
							"/catalogue.aspx",
							"/detail.aspx"})
public class SeboServlet extends HttpServlet{
	
	private ConnectionDB cnx;
	private ArticleDao articleDao;
	
	@Override
	public void init() throws ServletException {
		
		String pilote = "com.mysql.cj.jdbc.Driver";
		String db = "jdbc:mysql://localhost:3306/store";
		
		cnx = new ConnectionDB(pilote, db);
		articleDao = new ArticleDao(cnx);
		//hello = new HelloDaoImpl(cx);
	}

	/*============ Get Methode =============*/
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// gerer les requets
		String jspMap = "accueil1.jsp";
		String path = req.getRequestURI();
		
		/*if(path.equals("/sebo/accueil.aspx" && ))
			jspMap = "accueil1.jsp";*/
		if (path.equals("/sebo/identifier.aspx")) 
			jspMap = "identifier.jsp";
		if (path.equals("/sebo/inscrire.aspx")) 
			jspMap = "inscrire.jsp";
		if (path.equals("/sebo/catalogue.aspx")) {
			jspMap = "catalogue.jsp";
			List<Article> articles = articleDao.getArticlesByGenre("Jaaz");
			req.setAttribute("articles", articles);
		}
		if (path.equals("/sebo/detail.aspx")) {
			jspMap = "details.jsp";
			int id = Integer.parseInt(req.getParameter("num"));
			Article article = articleDao.getArticleById(id);
			req.setAttribute("article", article);
			
		}
		RequestDispatcher view = req.getRequestDispatcher(jspMap);
		view.forward(req, resp);
		
	}
	
	/*============ Post Methode ============*/
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		doGet(req, resp);
	}
	
	@Override
	public void destroy() {
		cnx.close();
	}
}
