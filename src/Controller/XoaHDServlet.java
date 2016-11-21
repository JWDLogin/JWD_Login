package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.HoatDongDAOImp;
import Model.HoatDong;

@WebServlet("/XoaHDServlet")
public class XoaHDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		try {
			String mahoatdong = request.getParameter("mahoatdong");//lấy id
			HoatDongDAOImp hd = new HoatDongDAOImp() {
				
				@Override
				public ArrayList<HoatDong> getList(ArrayList<HoatDong> ac, String mahoatdong) {
					// TODO Auto-generated method stub
					return null;
				}
			};
			hd.deleteHoatDong(mahoatdong);//xóa giá trị ở id đã lấy
			response.sendRedirect("CBT_Home.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}