package com.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class etudiantManager {

	
	public int addUser(String login, String pass) 
	{
			DBinteraction.connect();
			String sql="insert into student(login,pass) values('"+login+"','"+pass+"')";
			int nb=DBinteraction.Maj(sql);
			DBinteraction.disconnect();
			
			return nb;
	}
	
	public int addLivre(String nameBook, String author, int idCategory)
	{
		DBinteraction.connect();
		String sql="insert into book(nameBook,author,idCategory) values('"+nameBook+"','"+author+"','"+idCategory+"')";
		int nb=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
		
		return nb;
	}
	
	public int addCategorie(String nameCategorie)
	{
		DBinteraction.connect();
		String sql="insert into category(nameCategorie) values('"+nameCategorie+"')";
		int nb=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
		
		return nb;
	}
	
	public List<Livre> allLivres()
	{
		java.util.List<Livre> li=new ArrayList<Livre>();
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from Book");
		try {
			while(rs.next())
			{
				Livre l=new Livre();
				l.setIdBook(rs.getInt(1));
				l.setNameBook(rs.getString(2));
				l.setAuthor(rs.getString(3));
				l.setIdCategory(rs.getInt(4));
				//ajouter u dans la liste 
				li.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
	
	public List<categorie> allcategories()
	{
		java.util.List<categorie> ca=new ArrayList<categorie>();
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from category");
		try {
			while(rs.next())
			{
				categorie c=new categorie();
				c.setIdCategory(rs.getInt(1));
				c.setNameCategorie(rs.getString(2));
						
				ca.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ca;
	}
	
	
	public int addUser(User u) 
	{
		
			DBinteraction.connect();
			String sql="insert into student(login,pass) values('"+u.getLogin()+"','"+u.getPass()+"')";
			int nb=DBinteraction.Maj(sql);
			DBinteraction.disconnect();
			
			return nb;
			
	}
	
	
	
	public int deleteUser(int id) 
	{
		
		DBinteraction.connect();
		int nb = DBinteraction.Maj("delete from student where id="+id);
		DBinteraction.disconnect();
		return nb;
	}
	
	public User findUserById(int id)
	{
		User u=null;
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from student where id="+id);
		try {
			if(rs.next())
			{
				u=new User();
				u.setId(rs.getInt(1));
				u.setLogin(rs.getString(2));
				u.setPass(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public int updateUser(int id, User ut)
	{
		DBinteraction.connect();
		String sql="update student set log='"+ut.getLogin()+"', pass='"+ut.getPass()+"'  where id="+id;
		int nb=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
		return nb;
	}
	
	public List<User> allUsers()
	{
		java.util.List<User> us=new ArrayList<User>();
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from student");
		try {
			while(rs.next())
			{
				User u=new User();
				u.setId(rs.getInt(1));
				u.setLogin(rs.getString(2));
				u.setPass(rs.getString(3));
				//ajouter u dans la liste 
				us.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	}
	
	public User authentification(String login, String pass)
	{
		User u=null;
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from student where login='"+login+"' and pass='"+pass+"'");
		try {
			if(rs.next())
			{
				u=new User();
				u.setId(rs.getInt(1));
				u.setLogin(rs.getString(2));
				u.setPass(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
}
