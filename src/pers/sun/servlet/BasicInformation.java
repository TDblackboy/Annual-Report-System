package pers.sun.servlet;

import java.io.IOException;
import java.sql.Date;
//import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import per.sun.dao.PlatformDao;
import per.sun.modal.Platform;

@WebServlet("/BasicInformation")
public class BasicInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BasicInformation() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//�ӵ�½servlet�л�ȡsession�д��ֵuserid
		//����jsp->servlet
		request.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		String username=(String) session.getAttribute("username");

		//��userid��ȡpid
		PlatformDao platDao=new PlatformDao();
		int pid=platDao.seek(username);

		//��pid�ҵ�platform
		Platform plat=new Platform();
		plat=platDao.load(pid);//�ҵ�����ı����һ��

		//����jsp�д�����ֵtype
		int type=Integer.parseInt(request.getParameter("type"));
		//�����
		if(type==1) {
			//��ȡ��ѡ���ֵ
			String []pjibie=request.getParameterValues("pjibie");
			String ppjj=null;
			for(String pj:pjibie) {
				ppjj=pj+"-"+ppjj;
			}
			plat.setPjibie(ppjj);
			
			String sheng=request.getParameter("sheng");
			String shi=request.getParameter("shi");
			String xian=request.getParameter("xian");
			String pxianshi=sheng+shi+xian;
			plat.setPxianshi(pxianshi);
			
			String h1=request.getParameter("hp");
			String h2=request.getParameter("hc");
			String h3=request.getParameter("ha");
			String phangye=h1+h2+h3;
			plat.setPhangye(phangye);
			
			String x1=request.getParameter("xp");
			String x2=request.getParameter("xc");
			String x3=request.getParameter("xa");
			String pxueke=x1+x2+x3;
			plat.setPxueke(pxueke);
			
			platDao.update(plat, type);
			
			//jsp-servlet-jsp��ת
			//request.getRequestDispatcher("./page/basicInformationTwo.jsp").forward(request, response);
			response.sendRedirect("./page/basicInformationTwo.jsp");

		}else if(type==2) {
			//��װ
			String yname=request.getParameter("yname");
			String yzuzhidaima=request.getParameter("yjigou");
			String yren=request.getParameter("yren");
			String ydianhua=request.getParameter("ydianhua");
			String ytype=request.getParameter("ytype");
			plat.setYname(yname);
			plat.setYfaren(yren);
			plat.setYdianhua(ydianhua);
			plat.setYzuzhidaima(yzuzhidaima);
			plat.setYtype(ytype);
			//װ�ص����ݿ�
			platDao.update(plat, type);
			//�ض���-�ͻ��˵�����
			//request.getResuestDispacher().forword(request,response);
			//request.getRequestDispatcher("./page/basicInformationThrid.jsp").forward(request, response);
			response.sendRedirect("./page/basicInformationThrid.jsp");
		}else if(type==3) {
			plat.setPyname(request.getParameter("pyname"));
			plat.setPysex(request.getParameter("pysex"));
			//����ת��
			//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			//String dates=sdf.format(request.getParameter("pybrith"));
			String datee=request.getParameter("pybrith");
			Date date=new Date(0);
			date=Date.valueOf(datee);
			plat.setPybrith(date);
			//
			plat.setPyzhicheng(request.getParameter("pyzhicheng"));
			plat.setPyxueli(request.getParameter("pyxueli"));
			plat.setPyxuewei(request.getParameter("pyxuewei"));
			plat.setPyzhuanye(request.getParameter("pyzhuanye"));
			plat.setPydianhua(request.getParameter("pydianhua"));
			plat.setPyshouji(request.getParameter("pyshouji"));
			plat.setPyemail(request.getParameter("pyemail"));
			
			platDao.update(plat, type);
			//request.getRequestDispatcher("./page/basicInformationFour.jsp").forward(request, response);
			response.sendRedirect("./page/basicInformationFour.jsp");

		}else {
			plat.setPwangzhanming(request.getParameter("pwangzhanming"));
			plat.setPwangzhi(request.getParameter("pwangzhi"));
			plat.setPtongxundizhi(request.getParameter("ptongxundizhi"));
			plat.setPyoubian(request.getParameter("pyoubian"));
			
			platDao.update(plat, type);
			//request.getRequestDispatcher("./page/end.jsp").forward(request, response);
			response.sendRedirect("./page/end.jsp");

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
