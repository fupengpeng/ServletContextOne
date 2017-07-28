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
 * Description: servletContext�����Ի�ȡɾ��
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: ServletContextOne
 * @author fupengpeng
 * @date 2017��7��27�� ����2:46:25
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
		
		//��ȡServletContext���������
		//1.ͨ��thisֱ�ӵ���getServletContext������ȡ--��ʽ01
		ServletContext servletContext = this.getServletContext();
		//1.ͨ��thisֱ�ӵ���getServletContext������ȡ--��ʽ02
		ServletContext ServletContex02 = this.getServletConfig().getServletContext();
		
		//2.��ȡServletContext������
		String username = (String) servletContext.getAttribute("username");
		
		out.println("δɾ��----username=="+username);
		
		servletContext.removeAttribute("username");
		
		out.println("ɾ����----username=="+username);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
