package pers.sun.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import per.sun.dao.UserDao;
import per.sun.modal.User;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8;");
		
		String username=request.getParameter("username");
		String userpass=request.getParameter("userpass");
		User user=new User();
		UserDao userDao=new UserDao();
		user=userDao.load(username);
		if(user.getUserpass().equals(userpass)) {
		
			HttpSession session=request.getSession();
			session.setAttribute("username", user.getUsername());
			
			if(user.getUsertype().equals("user")) {
				response.sendRedirect("./page/basicInformationAdd.jsp");
			}else {
				response.sendRedirect("./manager/query.jsp");
			}
		}
		else {
			PrintWriter out=response.getWriter();
			out.append("账号密码不匹配");
			out.println("<br>");
			out.println("<a href=\"../page/login.jsp\">>>go back</a>");
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
