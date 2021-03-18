package cn.itcast.domain;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Emp_list {
    String dbname;
    String todo;
    String duankou;
    public Emp_list(String dbname,String todo,String duankou)
    {
    this.dbname=dbname;
    this.todo=todo;
    this.duankou=duankou;
    }

    public Emp_list(String dbname, String todo) {
        this.dbname = dbname;
        this.todo = todo;
        duankou="3305";
    }

    public List<Emp> findAll() throws ClassNotFoundException, SQLException {
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:"+duankou+"/"+dbname,"root","root");
        Statement statement=conn.createStatement();
        ResultSet resultSet=statement.executeQuery(todo);
        List<Emp> ans=new ArrayList<>();
        while(resultSet.next()) {
            String SNO= resultSet.getString("SNO");
            String Name= resultSet.getString("Name");
            Integer Age= resultSet.getInt("Age");
            String College= resultSet.getString("College");
            ans.add(new Emp(SNO,Name,Age,College));
        }
        return ans;
    }
}
