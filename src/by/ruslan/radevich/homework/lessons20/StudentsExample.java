package by.ruslan.radevich.homework.lessons20;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsExample {
    public static void main(String[] args) {
        try
            (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/home_work", "root", "root")) {
            PreparedStatement ps = connection.prepareStatement("select * from STUDENTS where ID =?");
            List<Students>students = new ArrayList<>();
            ps.setInt(1,1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                students.add((Students) rs);
                System.out.println(students);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
