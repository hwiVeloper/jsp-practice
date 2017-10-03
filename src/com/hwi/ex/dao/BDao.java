package com.hwi.ex.dao;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.hwi.ex.dto.BDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BDao {
	
	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public BDao(){
		try{
			Context init = new InitialContext();
			Context env = (Context)init.lookup("java:comp/env");
			DataSource ds = (DataSource)env.lookup("jdbc/mysql");
			connection = ds.getConnection();
			System.out.println("db connection success!!");
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<BDto> list(){
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		//Connection connection = null;
		
		try{
			
			String query = "select * from board";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();
		
			while(rs.next()){
				int bId = rs.getInt("bId");
				String bTitle = rs.getString("bTitle");
				String bName = rs.getString("bName");
				String bContent = rs.getString("bContent");
				Timestamp bDate = rs.getTimestamp("bDate");
				BDto dto = new BDto(bId,bName,bTitle,bContent,bDate);
				dtos.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(connection != null) connection.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return dtos;
	}
}

	