package cn.itcast.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;

public class Assignment {

    List<Emp> list=null;
    Emp_list emp_list=null;
    void show() throws SQLException, ClassNotFoundException {
        list = emp_list.findAll();
        Iterator it = list.listIterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
        public static void main(String[] args) throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3305/test","root","root");
            Statement statement=connection.createStatement();
            String sql="DROP TABLE IF EXISTS student;\n";
            statement.executeUpdate(sql);

             sql="CREATE TABLE student(\n" +
                    "SNO VARCHAR(20),\n" +
                    "NAME VARCHAR(10),\n" +
                    "Age INTEGER,\n" +
                    "college VARCHAR(30)\n" +
                    ");";
            statement.executeUpdate(sql);
            // sql="ALTER TABLE student CONVERT TO CHARACTER SET gbk COLLATE gbk_chinese_ci;\n";
            // statement.execute(sql);



            //任务1
            System.out.println("\n任务1:\n");
            sql="INSERT INTO student VALUES('s001','老大',20,'计算机学院'),('s002','老二',19,'计算机学院'),('s003','老三',18,'计算机学院'),('s004','老四',17,'计算机学院');";
            statement.executeUpdate(sql);
            Assignment as=new Assignment();
            as.emp_list=new Emp_list("test","SELECT *FROM student;");
            as.show();


             //任务2
            System.out.println("\n任务2:\n");
            as.emp_list=new Emp_list("test","SELECT *FROM student;");
            as.show();


            //任务3
            System.out.println("\n任务3:\n");
            sql="DELETE FROM student WHERE sno='s001';";
            statement.executeUpdate(sql);
            as.emp_list=new Emp_list("test","SELECT *FROM student;");
            as.show();
            sql="INSERT INTO student VALUES('s001','老大',20,'计算机学院');";
            statement.executeUpdate(sql);


            //任务4
            System.out.println("\n任务4:\n");
            as.emp_list=new Emp_list("test","SELECT *FROM student where sno='s003';");
            as.show();


            //任务5
            System.out.println("\n任务5:\n");
            sql="UPDATE student set NAME='老大',Age=20,college='通信学院' WHERE sno='s001';";
            statement.executeUpdate(sql);
            as.emp_list=new Emp_list("test","SELECT *FROM student;");
            as.show();


            statement.close();
            connection.close();
    }
}
