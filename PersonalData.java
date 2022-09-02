/*
* We have a dataset containing the height and gender (M, F) of N people.
* Write a program that calculates and writes the highest and lowest height in the group,
* the average height of women, and the number of men.
* */

import java.util.Locale;
import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numberPeople;
        int numberMen = 0;
        int numberWomen = 0;
        double averageWomenHeight;
        double totalHeightWomen = 0.0;

        System.out.print("How many people will be entered? ");
        numberPeople = scanner.nextInt();

// getting personal data
        double[] peopleHeight = new double[numberPeople];
        char[] peopleGender = new char[numberPeople];
        for (int i = 0; i < numberPeople; i++) {
            System.out.printf("%dª person height: ", i+1);
            peopleHeight[i] = scanner.nextDouble();

            System.out.printf("%dª person gender: ", i+1);
            peopleGender[i] = scanner.next().charAt(0);

// count number of men
            if (peopleGender[i] == 'M'){
                numberMen++;
            }
// adding to the height of women
            else {
                totalHeightWomen += peopleHeight[i];
                numberWomen++;
            }
        }
        double lowestHeight = peopleHeight[0];
        double highestHeight = peopleHeight[0];

        for (int i = 0; i < numberPeople; i++) {
// highest height
            if (highestHeight < peopleHeight[i]) {
                highestHeight = peopleHeight[i];
            }
// lowest height
            if (lowestHeight > peopleHeight[i]) {
                lowestHeight = peopleHeight[i];
            }
        }

// calculate the average height of women
        averageWomenHeight = totalHeightWomen/numberWomen;

        System.out.printf("Lowest Height: %.2f%n", lowestHeight);
        System.out.printf("Highest Height: %.2f%n", highestHeight);
        System.out.printf("Average height of women: %.2f%n", averageWomenHeight);
        System.out.printf("Number of men: %d%n", numberMen);
    }
}
