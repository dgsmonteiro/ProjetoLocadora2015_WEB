package controller;

import model.*;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import to.LocalidadesTO;

/**
 * Servlet implementation class ControleCadastro
 */
@WebServlet({ "/Inicio.do", "/inicio.do" })
public class ControleEstado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleEstado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		executa(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		executa(request, response);
	}
	
	protected void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				
		Estado est = new Estado();
		LocalidadesTO loc = new LocalidadesTO();
		List<Estado> lista = new ArrayList<Estado>();
		
		try {
			lista = est.consultar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		loc.setListaEstados(lista);
		
		
		request.getSession().setAttribute("localidades", loc);
		request.getRequestDispatcher("selecao.jsp").forward(request, response);
		
		//RequestDispatcher view = request.getRequestDispatcher("selecao.jsp");
		//view.forward(request, response);
		
		
		
	}

}
