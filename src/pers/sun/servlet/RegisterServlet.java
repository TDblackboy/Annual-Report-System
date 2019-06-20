package pers.sun.servlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import per.sun.dao.PlatformDao;
import per.sun.dao.UserDao;
import per.sun.modal.Platform;
import per.sun.modal.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public RegisterServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();

		String ptype=request.getParameter("pleibie");
		String pname=request.getParameter("pname");
		String pyituodanwei=request.getParameter("pyituodanwei");
		String pguikoubumen=request.getParameter("pguikoubumen");
		
		String tname=request.getParameter("tname");
		String tbumen=request.getParameter("tbumen");
		String tdianhua=request.getParameter("tdianhua");
		String tshouji=request.getParameter("tshouji");
		String temail=request.getParameter("temail");
			//ʱ���ʽת��-java.sql.Date
			//java.util.Date��java.sql.Date�ĸ���
			//SimpleDateFormat����java.text.SimpleDateFormat,
		String ttime=request.getParameter("time");//��ʽΪyy//mm//dd
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//��ʽΪyy-m-dd
		//String tttime=sdf.format(ttime);
		Date time=new Date(0);
		time = Date.valueOf(ttime);
		//��½��Ϣ
		String username=request.getParameter("username");
		String userpass=request.getParameter("userpass");
		String userpass2=request.getParameter("userpass2");
		//��װ
			//platform
		Platform plat=new Platform();
		PlatformDao platDao=new PlatformDao();
		plat.setUsername(username);
		plat.setPtype(ptype);
		plat.setPname(pname);
		plat.setPyituodanwei(pyituodanwei);
		plat.setPguikoubumen(pguikoubumen);
		plat.setTname(tname);
		plat.setTbumen(tbumen);
		plat.setTdianhua(tdianhua);
		plat.setTshouji(tshouji);
		plat.setTemail(temail);
		plat.setTime(time);
		
		User user=new User();
		UserDao userDao=new UserDao(); 
		if(userpass.equals(userpass2)) {	
			user.setUsername(username);
			user.setUserpass(userpass);
			userDao.add(user);
			platDao.add(plat, 1);
			out.println("<h1>注册成功</h1><br>");
			out.println("<h1><a href=\"../page/login.jsp\">>>go back</a></h1>");
		}else {
			out.append("<h1>注册失败</h1>").append("<br>");
			out.println("<h1><a href=\"../page/login.jsp\">>>go back</a></h1>");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
