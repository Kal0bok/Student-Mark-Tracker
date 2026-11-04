import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        //Student marks array
        int[][] studentMarks = new int[3][4];

        //Function to go throw rows and columns
        for(int i = 0; i < studentMarks.length; i++) {
            for (int j = 0; j < studentMarks[i].length; j++) {
                //Function "Random" to fill marks for students
                studentMarks[i][j] = random.nextInt(10) + 1;
            }
        }
        for(int i = 0; i < studentMarks.length;i++){
            //Function for computing average grade
            double average = computeMarks(studentMarks[i]);
            //Function for grades classify
            String gradeCategory = classifyGrade(average);

            System.out.println("Student " + (i + 1) + " average " + average + " | Class: " + gradeCategory);
        }
    }

    public static double computeMarks(int[] studentMarks){
        int sum = 0;

        //Function go throw array and summ all marks
        for(int mark : studentMarks){
            sum += mark;
        }
        return (double) sum / studentMarks.length;
    }

    public static String classifyGrade(double average){
        if(average >= 8.5){
            return "Excellent";
        }else if(average >= 5.0){
            return "Good";
        }else if(average >= 5.0){
            return "Average";
        }else{
            return "Terrible";
        }
    }

}