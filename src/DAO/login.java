package DAO;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.lang.String;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public login() {
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("MySQL Connect Example.");
		Connection conn = null;
		String driver = "com.mysql.jdbc.Driver";

		String username = "";
		String userpass = "";
		String email = "";
		String strQuery = "";
		String strQuery1="";
		Statement st = null;
		ResultSet rs = null;
		HttpSession session = request.getSession();
		
				try 
				{
					Class.forName(driver).newInstance();
					conn = DriverManager.getConnection("jdbc:mysql://localhost/web_hdd", "root", "phan");
					if (request.getParameter("username") != null && request.getParameter("username") != ""
							&& request.getParameter("password") != null && request.getParameter("password") != ""
							&& request.getParameter("email") != null && request.getParameter("email") != "")
					{
						username = request.getParameter("username").toString();
						userpass = request.getParameter("password").toString();
						email = request.getParameter("email").toString();
						if(request.getParameter("optradio") != null) 
						{
							if(request.getParameter("optradio").equals("radio1")) 
							{
								strQuery = "select * from web_hdd.dv where" + " mssv='" + username
										+ "'and password='" + userpass + "' and email='" + email + "'    ";
								System.out.println(strQuery);
								st = conn.createStatement();
								rs = st.executeQuery(strQuery);
								int count = 0;
								while (rs.next())
								{
									session.getAttribute("username");
									count++;
								}
								if (count > 0) 
								{
									response.sendRedirect("DV_Home.jsp");
								} 
								else
								{
									response.sendRedirect("Form_Login.jsp");
								}
							}
							else
							{
								if(request.getParameter("optradio").equals("radio2")) 
								{
									strQuery1 = "select * from web_hdd.cbdk where" + " mssv='" + username
											+ "'and password='" + userpass + "' and email='" + email + "'    ";
									System.out.println(strQuery1);
									st = conn.createStatement();
									rs = st.executeQuery(strQuery1);
									int count = 0;
									while (rs.next())
									{
										session.getAttribute("username");
										count++;
									}
									if (count > 0) 
									{
										response.sendRedirect("CBDK_Home.jsp");
									} 
									else
									{
										response.sendRedirect("Form_Login.jsp");
									}
								}
								else 
								{
									if(request.getParameter("optradio").equals("radio3")) 
									{
										strQuery1 = "select * from web_hdd.cbdt where" + " mssv='" + username
												+ "'and password='" + userpass + "' and email='" + email + "'    ";
										System.out.println(strQuery1);
										st = conn.createStatement();
										rs = st.executeQuery(strQuery1);
										int count = 0;
										while (rs.next())
										{
											session.getAttribute("username");
											count++;
										}
										if (count > 0) 
										{
											response.sendRedirect("CBT_Home.jsp");
										} 
										else
										{
											response.sendRedirect("Form_Login.jsp");
										}
									}
									else
									{
										response.sendRedirect("Form_Login.jsp");
									}
							    }
							}	
						}
						
					}
			       else 
				   {
					response.sendRedirect("Form_Login.jsp");
				   }
				
					System.out.println("Connected to the database");
					conn.close();
					System.out.println("Disconnected from database");
				}
					catch (Exception e) 
				{
					e.printStackTrace();
				}
			
	}}	
		
		
