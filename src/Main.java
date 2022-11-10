import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();

        //task1
        int numberAmount = 1;
        System.out.print("Enter array length: " );
        numberAmount = Integer.parseInt(reader.readLine());
        double[] task1 = new double[numberAmount];
        for(int i = 0; i < numberAmount; i++){
            System.out.print("Enter array["+i+"] = ");
            double enteredValue = Double.parseDouble(reader.readLine());
            task1[i] = enteredValue;
        }
        double min = task1[0];
        double max = task1[0];
        for (double value: task1) {
            if(value < min) min = value;
            if(value > max) max = value;
        }
        System.out.println(Arrays.toString(task1));
        System.out.println("min = "+min+"\nmax = "+max);

        //task2
        System.out.println("Введіть число масивів:");
        String inputNumberex2 = reader.readLine();
        int n = Integer.parseInt(inputNumberex2);
        int[][] matrix = new int[n][2];
        int amount = 0;
        for (int i=0; i<matrix.length; i++)

            for (int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(400)-200;
            }
        for (int i=0; i<matrix.length; i++){
            if(matrix[i][0] > 0 && matrix[i][1] > 0){
                amount++;
            }
            System.out.println(matrix[i][0] + " " + matrix[i][1]);
        }
        System.out.println("amount: "+ amount);
    }
}