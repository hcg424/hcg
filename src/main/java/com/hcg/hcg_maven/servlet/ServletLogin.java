package com.hcg.hcg_maven.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcg.hcg_maven.servlet.*;

@WebServlet(urlPatterns="/backstage/login")
public class ServletLogin extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
//			AdminDao adminDao=new AdminDao();
//		if(adminDao.login(username, password)){
//		response.sendRedirect(basePath+"backstage/main.html");
// }else{
//	 response.sendRedirect(basePath+"backstage/login.jsp");
//	}

}
}
