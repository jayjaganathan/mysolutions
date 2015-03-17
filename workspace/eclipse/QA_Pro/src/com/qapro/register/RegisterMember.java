package com.qapro.register;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterMembe
 */
@WebServlet("/RegisterMember")
public class RegisterMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterMember() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter ("name");
		String surname = request.getParameter("surname");
		System.out.println(name + " " + surname );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(req.getSession().getId());
		
		HttpSession session = req.getSession();
		
		Integer i = (Integer)session.getAttribute("call_count");
		if(i == null ) i = 1;
		session.setAttribute("call_count", ++i);
		
		System.out.println("call count" + (Integer)session.getAttribute("call_count"));
		RequestDispatcher rd = req.getServletContext().getRequestDispatcher("/registerCompleted.jsp");
		rd.forward(req, response);
	}

}
