package cn.zptc.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.zptc.bean.User;
import cn.zptc.example.Example;

public class DBUtilsExample {
    public List findAll() throws SQLException{
		QueryRunner runner = new QueryRunner(Example.getDataSource());
		String sql = "select * from user";
		List<User> list = (List<User>) runner.query(sql, new BeanListHandler(User.class));
		return list;
	}
    
    public User find(int id) throws SQLException{
		QueryRunner runner = new QueryRunner(Example.getDataSource());
		String sql = "select * from user where id = ?" ;
		User user = null;
		Integer iid = 2;
		try {
			user = (User) runner.query(sql, new BeanHandler(User.class) , iid);
			System.out.println(user);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("没有这个");
		}finally {
			return user;
		}
	}
    
    public boolean delete(int id) throws SQLException{
		QueryRunner runner = new QueryRunner(Example.getDataSource());
		String sql = "delete from user where id = ?";
		int num = runner.update(sql,id);
		if (num>0) 			
		    return true;
		return false;
	}
}
