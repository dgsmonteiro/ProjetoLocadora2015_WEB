package controller;

import model.*;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import to.LocalidadesTO;

/**
 * Servlet implementation class ControleCadastro
 */
@WebServlet({ "/Selecao.do", "/selecao.do" })

public class ControleSelecao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleSelecao() {
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
					
		String estado = request.getParameter("estado");
		List<Cidade> lista = null;
		Cidade cid = new Cidade();
		LocalidadesTO localidades = new LocalidadesTO();
		try {
			lista = cid.consultar(estado);
		} catch (ListaException e) {
			e.printStackTrace();
		}
		localidades.setListaCidades(lista);
		
		request.getSession().setAttribute("localidades", localidades);
		request.getRequestDispatcher("lista_cidades.jsp").forward(request, response);
		

	}

}
