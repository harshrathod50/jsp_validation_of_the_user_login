package dev.rathod.harsh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {

    public Dashboard() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession s = request.getSession(false);
		if (s != null) {
			out.print("<h1>Welcome!, harshrathod50!</h1>");
			out.print("<br>");
			out.print("<a href=\"Logout\">Logout</a>");
		} else {
			out.print("<h1>You are not logged in!</h1>");
			out.print("<br>");
			out.print("<a href=\"login.html\">Login</a>");
		}
	}
}
