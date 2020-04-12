public class GradeStatus {

    public static void main(String[] args) {

        Student student = new Student();

        double gradesSum = 0;

        for (int i = 0; i < student.getGrades().size(); i++){

            gradesSum = gradesSum + student.getGrades().get(i);

        }

        double gradesAverage = gradesSum / student.getGrades().size();

        System.out.println("Grade Average = "+ gradesAverage);

        String gradeStatus;

        if(gradesAverage>=90){
            gradeStatus="Excellent";
        }else if(gradesAverage>=80){
            gradeStatus="Very Good";
        }else if(gradesAverage>=70){
            gradeStatus="Good";
        }else if(gradesAverage>=50){
            gradeStatus="Pass";
        }else{
            gradeStatus="Failed";
        }

        ViewGrade.viewGrade(gradeStatus);

    }

}
