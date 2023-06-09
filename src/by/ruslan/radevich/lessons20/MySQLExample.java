package by.ruslan.radevich.lessons20;

import javax.xml.transform.Result;
import java.sql.*;

public class MySQLExample {
    public static void main(String[] args)  {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root")){
            connection.setAutoCommit(false);//не добовляем в базу данных
//            connection.prepareStatement("\n"+
//                    "insert into DEVELOPER(NAME, WORK_POSITION, AGE) values ('Anton','PM','35'),('Nick','BA','30');")
//                    .execute();//просто выполняем
//            ResultSet rs = connection.prepareStatement("select * from DEVELOPER")
//                    .executeQuery();
           PreparedStatement ps = connection.prepareStatement("select * from DEVELOPER where ID =?");
                    ps.setInt(1,1);
                    ResultSet rs = ps.executeQuery();//так надо по правильному
            connection.commit();// это мы принимаем изменения в БД
            connection.rollback();//откатываем/
            while (rs.next()){
                System.out.println(rs.getInt("ID")+ " " + rs.getString("NAME")+" "
                        + rs.getInt("AGE"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
