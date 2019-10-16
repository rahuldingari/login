package com.secured_login_and_logout;

import java.io.IOException;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession session =req.getSession();
		session.removeAttribute("userid");
		session.invalidate();
		res.sendRedirect("login.jsp");
		System.out.println("hoh");
	}

}
