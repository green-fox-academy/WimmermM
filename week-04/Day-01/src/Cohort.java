import java.util.ArrayList;
import java.util.List;

public class Cohort {

    String name;
    List students;
    List mentors;


    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList();
        this.mentors = new ArrayList();
    }


    public void addStudents(Student student){

        students.add(student);

    }

    public void addMentors(Mentor mentor){
        mentors.add(mentor);
    }



    public void info(){

        System.out.println("The " + name + " cohort has " + students.size() + students + "  and " + mentors.size() + mentors + " . ");
    }









}
