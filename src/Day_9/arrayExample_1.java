package Day_9;

public class arrayExample_1 {
    public static void main(String[] args) {
        int [] numbers;         //Declaring the array but not taking space
        numbers = new int [10]; //Initialize array

        int[] numbers2 = {1,2,3,4,5};   //declare and initialise

        numbers2[0] = 20;
        int firstNumber = numbers2[0];  //Array index starts 0

        System.out.println(firstNumber);
    }
}
