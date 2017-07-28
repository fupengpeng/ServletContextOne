package com.jiudianlianxian.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Title: ServletTwo
 * Description: servletContext的属性获取删除
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: ServletContextOne
 * @author fupengpeng
 * @date 2017年7月27日 下午2:46:25
 *
 */
@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		//获取ServletContext对象的引用
		//1.通过this直接调用getServletContext方法获取--方式01
		ServletContext servletContext = this.getServletContext();
		//1.通过this直接调用getServletContext方法获取--方式02
		ServletContext ServletContex02 = this.getServletConfig().getServletContext();
		
		//2.获取ServletContext的内容
		String username = (String) servletContext.getAttribute("username");
		
		out.println("未删除----username=="+username);
		
		servletContext.removeAttribute("username");
		
		out.println("删除后----username=="+username);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
