package proye.uno.controlles;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import proyeuno.model.autoresmodel;

import java.io.IOException;

/**
 * Servlet implementation class autoresControles
 */
public class autoresControles extends HttpServlet {
	private static final long serialVersionUID = 1L;
    autoresmodel  modelo = new autoresmodel();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public autoresControles() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
    	if(request.getParameter("op")==null) {
    		//listar();
    		return;
    	}
    	String operacion = request.getParameter("op");
    	switch(operacion) {
    	case "listar":
    		//listar
    		break;
    	case "nuevo":
    		//nuevo
    		break;
    	
    	}
    }
    
    private void listar(HttpServletRequest request, HttpServletResponse response) {
    	request.setAttribute("listaAutores",modelo.listarAutores());
    	request.getRequestDispatcher("/autores/ListaAutores.jsp");
    }
    
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
