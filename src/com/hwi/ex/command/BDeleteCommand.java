package com.hwi.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hwi.ex.dao.BDao;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bid = request.getParameter("id");
		
		BDao dao = new BDao();
		dao.delete(bid);

	}

}
