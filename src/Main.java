import java.util.Random;

public class Main {

    private static final int NUMBER_OF_STUDENTS = 3;
    private static final int STUDENT_MARKS_COUNT = 4;

    public static void main(String[] args) {
        Random random = new Random();

        // Student marks array
        int[][] studentMarks = new int[NUMBER_OF_STUDENTS][STUDENT_MARKS_COUNT];

        // Function to go throw rows and columns
        for(int i = 0; i < studentMarks.length; i++) {
            for (int j = 0; j < studentMarks[i].length; j++) {
                // Function "Random" to fill marks for students
                studentMarks[i][j] = random.nextInt(10) + 1;
            }
        }

        // Extracted printing logic into a separate method
        printGrades(studentMarks);
    }

    // New method to print grades and categories
    public static void printGrades(int[][] studentMarks) {
        for(int i = 0; i < studentMarks.length; i++){
            double average = computeMarks(studentMarks[i]);
            String gradeCategory = classifyGrade(average);

            System.out.println("Student " + (i + 1) + " average " + average + " | Class: " + gradeCategory);
        }
    }

    public static double computeMarks(int[] studentMarks){
        int sum = 0;

        // Function go throw array and summ all marks
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
