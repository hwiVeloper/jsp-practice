package com.hwi.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hwi.ex.dao.BDao;
import com.hwi.ex.dto.BDto;

public class BContentCommand implements BCommand{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response){
		
		String id = request.getParameter("id");
		int bid = Integer.parseInt(id);
		BDao dao = new BDao();
		BDto dto = dao.contentView(bid);
		
		request.setAttribute("detail", dto);
	}
}