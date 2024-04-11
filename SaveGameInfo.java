package com.java.jdbc.RandomGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class SaveGameInfo {
	
	public static void saveData(int id,String name,String sgn,String uen,int score,Timestamp time)
			throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/game", "root", "Jagesh@2501");
		
		PreparedStatement ps = con.prepareStatement("insert into game (Id,Name,SysGenNum,UserEntrNo,Score,StartedTimeDate) values(?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, sgn);
		ps.setString(4, uen);
		ps.setInt(5, score);
		ps.setTimestamp(6, time);
		
		ps.execute();
		
		System.out.println("Your Score Is "+score);
	}

}
