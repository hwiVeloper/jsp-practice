package com.hwi.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hwi.ex.dao.BDao;

public class BModifyCommand implements BCommand{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response){
		String bid = request.getParameter("bid");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		BDao dao = new BDao();
		dao.modify(bid,bName,bTitle,bContent);
	}
}