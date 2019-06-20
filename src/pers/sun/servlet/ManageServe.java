package pers.sun.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import per.sun.modal.Platform;
import per.sun.dao.PlatformQuery;
import per.sun.dao.PlatformQueryImp;

@WebServlet("/ManageServe")
public class ManageServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ManageServe() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		Platform platform=new Platform();
		List<Platform>list=new ArrayList<Platform>();
		PlatformQuery platQuery=new PlatformQueryImp();
		
		String type=request.getParameter("ty");
		String choose=request.getParameter("choose");
		
		String pname=request.getParameter("pname");
		String pyname=request.getParameter("pyname");
		
		String pnameMo=request.getParameter("pnameMo");
		if(type!=null&&choose!=null) {
			if(choose.equals("all")) {
				list=platQuery.search();
			}else {
				list=platQuery.search(type,choose);
			}
		}else if(pname!=null||pyname!=null) {
			if(pyname!=null||!"".equals(pyname)) {
				platform.setPname(pname);
				platform.setPyname(pyname);
				list=platQuery.search(platform);
			}else {
				platform=platQuery.load(pname);
				list.add(platform);
			}
		}else if(pnameMo!=null) {
			list=platQuery.search(pnameMo);
		}
		request.getSession().setAttribute("list",list);
		response.sendRedirect("./manager/query.jsp");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
