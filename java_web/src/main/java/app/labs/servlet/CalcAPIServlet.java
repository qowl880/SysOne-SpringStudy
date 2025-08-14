package app.labs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/CalcAPIServlet")
public class CalcAPIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CalcAPIServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Optional.ofNullable(request.getParameter("num1"))
				.map(Integer::parseInt).orElse(0);
		
		int num2 = Optional.ofNullable(request.getParameter("num2"))
				.map(Integer::parseInt).orElse(0);
		
		String op = Optional.ofNullable(request.getParameter("operator")).orElse("+");
		
		CalcService calc = new CalcService(num1, num2, op);
		int result = calc.getResult();
		
		response.setContentType("application/json; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("{\"result\":" + result + "}");
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
