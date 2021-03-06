package com.hwi.ex.command;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hwi.ex.dao.BDao;

public class BWriteCommand implements BCommand {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response){
		
		try {
			request.setCharacterEncoding("utf-8");
			System.out.println(request.getCharacterEncoding());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		BDao dao = new BDao();
		dao.write(bName,bTitle,bContent);
	}
}
