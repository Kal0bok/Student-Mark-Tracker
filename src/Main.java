import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        //Student marks array
        int[][] studentMarks = new int[3][4];
t 
        //Function to go throw rows and columns
        for(int i = 0; i < studentMarks.length; i++) {
            for (int j = 0; j < studentMarks[i].length; j++) {
                //Function "Random" to fill marks for students
                studentMarks[i][j] = random.nextInt(10) + 1;
            }
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
}