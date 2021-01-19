package com.ty.test;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class ConfigUtil {

	public static final String TCZS_COMPANYID ="290286"; //澶╂壙姝ｅ紡鍗曚綅ID
	public static final String BTSZS_COMPANYID ="283680"; //鐧藉瀵烘寮忓崟浣岻D
	public static final String ERPURL ="http://192.168.60.201:8088/npserver/wechat";//姝ｅ紡鍦板潃
//	public static final String COMPANYID ="284878"; //涔嬪墠鐨勬寮忓崟浣岻D
//	public static final String ERPURL ="http://222.128.47.103:8081/npserver/wechat";//娴嬭瘯鍦板潃	
	public static Properties loadProperties(String filepath) throws Exception{
		Properties pro = new Properties();
		pro.load(new FileReader(new File(filepath)));
		return pro;
	}
	
	public static Connection getAthErpConn() throws Exception {

		//姝ｅ紡鐨�
		String driverName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@218.247.151.2:1521:orcl";
		String user = "bjjxtczs";
		String password = "bjjxtczs";

		//娴嬭瘯鐨�
		/*String driverName = "oracle.jdbc.driver.OracleDriver";
     	String url = "jdbc:oracle:thin:@47.104.194.125:1521:orcl";
		String user = "tczs";
		String password = "tczs";*/
		
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url, user, password);
		con.setAutoCommit(false);
		return con;
	}
	
	public static Connection getMySqlConnection() throws Exception {
		//姝ｅ紡鐨�
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://218.247.151.2:44306/btswx?zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=UTF-8&useSSL=false";
		String user = "root";
		String password = "Bjjxosgc!@#$1234";

		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url, user, password);
		con.setAutoCommit(false);
		return con;
	}
}
