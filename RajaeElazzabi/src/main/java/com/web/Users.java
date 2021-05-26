package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.User;
import com.util.etudiantManager;

/**
 * Servlet implementation class Users
 */
@WebServlet("/Users")
public class Users extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	etudiantManager um;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Users() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		um=new etudiantManager();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		HttpSession ses = request.getSession();
		
		
		List<User> us=um.allUsers();
		out.print("<table width=80% bgcolor='gold' border='2'>");
		out.print("<thead><th>ID</th><th>Login</th><th>Password</th></thead>");
		for (User u : us) {
			out.print("<tbody>");
			out.print("<tr>");
			out.print("<td>"+u.getId()+"</td>");
			out.print("<td>"+u.getLogin()+"</td>");
			out.print("<td>"+u.getPass()+"</td>"); 
			out.print("</tr>");
			out.print("</tbody>");
		}
		out.print("</table>");
	}

}
