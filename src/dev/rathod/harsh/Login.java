package dev.rathod.harsh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

    public Login() {
        super();
    }

	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		HttpSession s = request.getSession();
		String uName = request.getParameter("uName");
		String pWord = request.getParameter("pWord");
		if (uName.equals("harshrathod50")
			&& pWord.equals("abracadabra")) {
			response.sendRedirect("Dashboard");
		} else {
			PrintWriter out = response.getWriter();
			out.print("<h1>Wrong!</h1");
		}
	}
}
