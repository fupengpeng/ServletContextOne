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
 * Title: ServletOne
 * Description: ServletContext设置属性
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: ServletContextOne
 * @author fupengpeng
 * @date 2017年7月27日 下午2:28:20
 *
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
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
		
		//2.给ServletContext设置属性
		servletContext.setAttribute("username", "fupengpeng");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
