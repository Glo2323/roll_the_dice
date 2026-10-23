package com.pluralsight;

public class RollTheDiceApp {


    public static void main(String[] args) {

        //*Creating the dice
        Dice dice = new Dice();

        //*Creating a  int variables fo roll1 and roll2 and counters for number 2,4,6,7
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;


        //*For loop to loop 100 times
        for (int i = 0; i <= 100; i++){
            int roll1 = dice.roll(1,6);
            int roll2 = dice.roll(1,6);

            int sum = roll1 + roll2;

            System.out.println("Roll: " + roll1 + " - " + roll2 + " Sum: " + sum  + "\n");

            if (sum == 2 ){
                count2++;

            }

            if (sum == 4 ){
                count4++;

            }

            if (sum == 6 ){
                count6++;

            }


            if (sum == 7 ){
                count7++;

            }

        }
        //?Printing out the result
        System.out.printf("The sum of the rolls hit 2 %d times\n\n", count2);
        System.out.printf("The sum of the rolls hit 4 %d times\n\n", count4);
        System.out.printf("The sum of the rolls hit 6 %d times\n\n", count6);
        System.out.printf("The sum of the rolls hit 7 %d times\n\n", count7);
    }
}
