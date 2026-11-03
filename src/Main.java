import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        //Student marks array
        int[][] studentMarks = new int[3][4];

        //Function to go throw rows and columns
        for(int i = 0; i < studentMarks.length; i++){
            for(int j = 0; j < studentMarks[i].length; j++){
                //Frunction "Random" to fill marks for students
                studentMarks[i][j] = random.nextInt(10) + 1;
            }
        }

    }
}