package com.jiudianlianxian.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Title: ServletContextThree
 * Description: ͨ��ServletContext��ȡ�ļ�����ȡ�ļ�ȫ·��
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: ServletContextOne
 * @author fupengpeng
 * @date 2017��7��28�� ����10:37:12
 *
 */
@WebServlet("/ServletContextThree")
public class ServletContextThree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextThree() {
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
		
		//��ȡ���ļ�
		InputStream inputStream = this.getServletContext().getResourceAsStream("dbinfo.properties");
		
		//����һ�������ļ�  properties
		Properties properties = new Properties();
		properties.load(inputStream);
		out.println("username = " + properties.getProperty("username"));
		
		//��ȡһ���ļ���ȫ·��
		String path = this.getServletContext().getRealPath("/image/mao.png");
		out.println("path = " + path);
		
		//����ļ���src����
		
		InputStream inputStreamClass = ServletContextThree.class.getClassLoader().getResourceAsStream("dbinfo.properties");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
