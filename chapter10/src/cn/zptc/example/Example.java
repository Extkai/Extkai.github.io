package cn.zptc.example;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import cn.zptc.bean.User;
import cn.zptc.dao.DBUtilsExample;

public class Example {

	public static DataSource ds = null;
	
	static {
		ComboPooledDataSource cpds = new ComboPooledDataSource("zptc");
		ds = cpds;
	}
	
	public static DataSource getDataSource() {
		return ds;
	}
	
	public static void main(String[] args) throws SQLException{
//		System.out.println(ds.getConnection());
		DBUtilsExample dbe = new DBUtilsExample();
		
		int id = 1;
		
		User user = dbe.find(id);
		if (user != null) {
			dbe.delete(id);
		}else {
			System.out.println("没有这个");
		}
		
//		List<User> list = dbe.findAll();
//		for (User user : list) {
//			System.out.println(user);
//		}
	}
}
