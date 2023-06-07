package by.ruslan.radevich.homework.lessons20;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsExample {
    public static void main(String[] args) {
        try
            (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/home_work", "root", "root")) {
            PreparedStatement ps = connection.prepareStatement("select * from STUDENTS where ID =?");
            List<Student>student = new ArrayList<>();
            ps.setInt(1,1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Student st = new Student(rs.getString("name"), rs.getInt("age"),rs.getInt("id"));
                student.add(st);
                System.out.println(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
