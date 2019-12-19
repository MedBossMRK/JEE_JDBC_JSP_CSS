package com.PPP.PPP;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.PPP.Beans.GestionSQL;

/**
 * Servlet implementation class Error404
 */
@WebServlet("/Error404")
public class Error404 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Login lg;
	private GestionSQL gs;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Error404() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		lg=new Login();
		gs=new GestionSQL();
		boolean clientisconnected=lg.getclientisconnected();
		request.setAttribute("clientisconnected", clientisconnected);
		this.getServletContext().getRequestDispatcher("/jsp_projet/404.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		lg=new Login();
		gs=new GestionSQL();
		boolean clientisconnected=lg.getclientisconnected();
		request.setAttribute("clientisconnected", clientisconnected);
	}

}
