import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
        int k = 2;

        System.out.println(outputElementsMiddleValue(arr, k));
    }

    private static LinkedList<Float> outputElementsMiddleValue(ArrayList<Integer> arr, int k) {

        LinkedList<Float> newArrayList = new LinkedList<>();

         while(k <= 0) {
            System.out.println("\u001B[31m" + "Divide by zero or less than zero please change the value of the 'k' variable:");
            k = in.nextInt();
            System.out.println("\u001B[0m");
        }

        for(int i = 0; i < arr.size() - (k - 1); i++) {
            float middleValueSum = 0;
            float middleValue = 0;

            for(int j = 0; j < k; j++) {
                middleValueSum += arr.get(i);
                middleValue = middleValueSum / k;
                i++;
            }

            newArrayList.add(middleValue);

        }

        return newArrayList;
    }
}
