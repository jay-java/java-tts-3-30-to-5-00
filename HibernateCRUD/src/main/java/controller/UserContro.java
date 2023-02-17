package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserContro")
public class UserContro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserContro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("showdata")) {
			int id = Integer.parseInt(request.getParameter("uid"));
			User u = new UserDao().getUserById(id);
			request.setAttribute("u", u);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			User u = new User();
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setDob(request.getParameter("date"));
//			try {
////				u.setDob(formatter1.parse(d));
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//			try {
//				Date dob = (Date)new SimpleDateFormat("dd/MM/yyyy").parse(d);
//				System.out.println(dob);
//				u.setDob(dob);
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			new UserDao().insertUser(u);
			response.sendRedirect("login.jsp");
		}
		else if(action.equalsIgnoreCase("login")) {
			User u = new User();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			User u1 = new UserDao().doLogin(u);
			if(u1!=null) {
				HttpSession session = request.getSession(true);
				session.setAttribute("id", u1.getId());
				response.sendRedirect("UserContro?action=showdata&uid="+u1.getId());
			}
			else {
				HttpSession session = request.getSession();
				session.setAttribute("msg", "invalid email ");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
	}

}
