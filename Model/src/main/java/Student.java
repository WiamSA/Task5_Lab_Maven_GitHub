import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    long ID;
    List<Double> grades=new ArrayList<Double>();

    Student(){

        name="Mohamed";
        ID=231;
        grades.add(80.5);
        grades.add(60.0);
        grades.add(78.5);
        grades.add(85.0);
        grades.add(75.0);

    }

    public Student(String name, long ID, List<Double> grades) {

        this.name = name;
        this.ID = ID;
        this.grades = grades;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

}
