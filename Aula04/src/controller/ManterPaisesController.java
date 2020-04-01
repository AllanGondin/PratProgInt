package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Paises;
import service.PaisesService;

/**
 * Servlet implementation class ManterClienteController
 */
@WebServlet("/ManterPaises.do")
public class ManterPaisesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pNome = request.getParameter("nome");
		String pPopulacao = request.getParameter("populacao");
		String pArea = request.getParameter("area");
		String acao = request.getParameter("acao");

		// instanciar o javabean
		Paises paises = new Paises();
		paises.setNome(pNome);
		paises.setPopulacao(Long.parseLong(pPopulacao));
		paises.setArea(Double.parseDouble(pArea));
		
		// instanciar o service
		PaisesService cs = new PaisesService();
		RequestDispatcher dispatcher = null;
		
		
		switch(acao) {
		case "Incluir":
			cs.criar(paises);
			paises = cs.carregar(paises.getId());
			
			//mantem o parametrô para o JSP
			request.setAttribute("paises", paises);
			dispatcher = request.getRequestDispatcher("Paises.jsp");
			break;
			
		case "Listar":
			ArrayList<Paises> paises2 = cs.listarTodos();
			request.setAttribute("paises", paises2);
			dispatcher = request.getRequestDispatcher("ListarPaises.jsp");
		}
	//despachar para o JSP correto
		dispatcher.forward(request, response);
	}
}

