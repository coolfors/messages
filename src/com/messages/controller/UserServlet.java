package com.messages.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.messages.entity.User;
import com.messages.server.UserService;
import com.messages.serverImpl.UserServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet({ "/UserServlet", "/us.action" })

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 创建UserService对象
	private UserService us = new UserServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 处理请求编码:切记，处理请求第一件事情就是设置请求编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");// 相应编码
		// String v=request.getParameter("表单中的文本名，select名字等等/参数名"); 接收请求参数的值
		String op = request.getParameter("op");
		response.setContentType("application/json");


		if (op.equals("add")) {
			addUser(request, response);
		}
	}


	private void addUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		String sockState = request.getParameter("sockState");
		String userType = request.getParameter("userType");
		String userDate = request.getParameter("userDate");
		userPwd = MD5Util.getEncodeByMd5(userPwd);
		User u = new User(userId, Integer.valueOf(sockState), userDate, userName, userPwd, Integer.valueOf(userType));
		boolean flag = us.addUser(u);
		PrintWriter out = response.getWriter();
		out.print(flag);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
