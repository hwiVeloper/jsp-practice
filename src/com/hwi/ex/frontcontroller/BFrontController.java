package com.hwi.ex.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hwi.ex.command.BCommand;
import com.hwi.ex.command.BContentCommand;
import com.hwi.ex.command.BDeleteCommand;
import com.hwi.ex.command.BListCommand;
import com.hwi.ex.command.BModifyCommand;
import com.hwi.ex.command.BWriteCommand;

/**
 * Servlet implementation class BFrontContrller
 */
@WebServlet("*.do")
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		actionDo(request,response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		System.out.println("actionDo");
		
		String viewPage = null;
		BCommand command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		System.out.println("" + com);
		
		if(com.equals("/writeView.do")){
			viewPage = "writeView.jsp";
		}else if(com.equals("/write.do")) { // logic
			command = new BWriteCommand();
			command.execute(request,response);
			response.sendRedirect("list.do");
			
			return;
		}else if(com.equals("/list.do")){
			command  = new BListCommand();
			command.execute(request,response);
			viewPage = "list.jsp";
		} else if (com.equals("/index.do")) {
			System.out.println("======== index start");
			command  = new BListCommand();
			command.execute(request, response);
			viewPage = "index.jsp";
		}else if(com.equals("/contentView.do")){
			command = new BContentCommand();
			command.execute(request, response);
			viewPage = "contentView.jsp";
		}else if(com.equals("/modify.do")){
			command = new BModifyCommand();
			command.execute(request, response);
			viewPage = "list.do";
		}else if(com.equals("/delete.do")){
			command = new BDeleteCommand();
			command.execute(request, response);
			viewPage = "list.do";
		} else {
			viewPage = "index.do";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
