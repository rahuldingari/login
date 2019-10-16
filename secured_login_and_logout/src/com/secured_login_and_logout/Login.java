package com.secured_login_and_logout;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.secured_login_and_logoutDao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userid = request.getParameter("userid");
		String userpass = request.getParameter("userpass");
		LoginDao dao = new LoginDao();
		if (dao.validate(userid, userpass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", userid);
			response.sendRedirect("welcome.jsp");

		} else {
			PrintWriter out = response.getWriter();
			out.print("invalid username and password");
			response.sendRedirect("Login.java");
		}

	}

}
