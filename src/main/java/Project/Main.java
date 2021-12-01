package Project;

import Project.models.Student;
import Project.services.Students_Data_Services;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException{
        Students_Data_Services services = new Students_Data_Services();

        List<Student> students = services.read("./resources/student-input.txt");

        for (int i = 0; i < students.size(); ++i) {
            System.out.println(students.get(i));
        }
    }
}
