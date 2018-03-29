/**
 * Naam: Pieter-Andries van der Berg
 * Leerlijn: Inleiding programmeren
 * Datum: 29/09/2018
 * Applicatie: BMI-Calculator
 *
 */


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;


public class BMI_Calculator {



    //Main method met het menu die het programma naar de juiste methode stuurt.
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Double> myArray = new ArrayList<Double>(); //nieuwe arrayList genaamd myArray


        //Hier is een menu gemaakt met een keuze mogelijkheid voor Metric / Imperial / of om de applicatie af te sluiten
        int choice;
        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Welcome to this BMI Calculator underneath we have a couple of choices.");
            System.out.println("");
            System.out.println("1. Calculate BMI in Metric");
            System.out.println("2. Calculate BMI in Imperial");
            System.out.println("3.Exit");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Choice:");
            choice = userInput.nextInt(); // de input van de user wordt in variabele choice gestopt
            switch (choice) {
                case 1:
                    //Method om naar Metric te gaan wanneer user 1 intoetst
                    MetricCalculator(myArray);
                    break;
                case 2:
                    //Method om naar Imperial te gaan wanneer user 2 intoetst
                    ImperialCalculator(myArray);
                    break;
                case 3:
                    //User toetst 3 in de applicatie stopt!
                    System.out.println("Have a nice day! exiting!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3); // zolang er geen 3 wordt ingetoetst blijft de 'DO' doorgaan.



    }


    //Method imperial calculator
    public static void ImperialCalculator(ArrayList<Double> myArray) {
        Scanner userInput = new Scanner(System.in);
        double heightin;
        double weightlb;
        double bmiimperial;

        //IMPERIAL
        //Het programma gaat hier verder wanneer er gekozen word voor "Imperial"

        System.out.println("Good choice to choose the imperial system! \n");

        //User input wordt opgeslagen in variabele heightin
        System.out.println("Enter your height in inches (in): \n");
        heightin = userInput.nextDouble();

        //heightin toevoegen aan myArray list
        myArray.add(heightin);

        //User input wordt opgeslagen in variabele weightlb
        System.out.println("Enter your weight in pounds (lb): \n");
        weightlb = userInput.nextDouble();

        //weightkg toevoegen aan myArray list
        myArray.add(weightlb);

        //Som om BMI te berekenen in imperial
        bmiimperial = (weightlb / powermath(heightin, 2)) * 703;

        //bmimetric toevoegen aan myArray list
        myArray.add(rounding(bmiimperial));

        for (int i = 0; i < (myArray.size() / 3); i++) {
            System.out.print("User:\n");
            System.out.println("Height\tWeight\tBMI");

            for (double number : myArray) {
                String append = "\t";
                System.out.print(number + append);

            }
        }
        //Laat user zijn BMI category zien
        System.out.println(bmicategory(bmiimperial));



    }

    //Method metric calculator
    public static void MetricCalculator(ArrayList<Double> myArray) {
        Scanner userInput = new Scanner(System.in);
        double heightmt;
        double weightkg;
        double bmimetric;


        //METRIC
        //Het programma gaat hier verder wanneer er gekozen wordt voor "Metric"
        System.out.println("Good choice to choose the metric system!\n");

        //User input wordt opgeslagen in variable heigtmt
        System.out.print("Enter your height in Meters \n(notation: M,CM)\n");
        heightmt = userInput.nextDouble();

        //heightmt toevoegen aan myArray list
        myArray.add(heightmt);

        //User input wordt opgeslagen in variabele weightkg
        System.out.println("Enter your weight in Kilograms \n(notation: KG,G) \n");
        weightkg = userInput.nextDouble();

        //weightkg toevoegen aan myArray list
        myArray.add(weightkg);

        //Som om BMI uit te rekenen in Metric
        bmimetric = (weightkg / heightmt) / heightmt;

        //bmimetric toevoegen aan myArray list
        myArray.add(rounding(bmimetric));

        for (int i = 0; i < (myArray.size() / 3); i++) {
            System.out.print("User:\n");
            System.out.println("Height\tWeight\tBMI");

            for (double number : myArray) {
                String append = "\t";
                System.out.print(number + append);

            }
        }
        //Laat user zijn BMI category zien
        System.out.println(bmicategory(bmimetric));



    }



    //Methode dat een variabele double neemt en deze converteert naar twee decimalen
    private static double rounding(double value) {

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();


    }



    //Een method om de imperial bmi te kunnen berekenen want we hebben machtsverheffen nodig waar ik mijn eigen method voor wou gebruiken
    private static double powermath(double x, int y) {

        double result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;

        }

        return result;
    }



    //Een method met de bmi categorieën
    private static String bmicategory(double bmivalue) {

        String[] arraybmicat = {"Underweight try to eat some more bulk", "\nHealthy Weight congrats keep it up!", "Overweight! try to hit the gym!", "You have obese! get in touch with a personal trainer or doctor", "error something is wrong"};// een String array met de BMI categorieën

        if (bmivalue < 18.5) {
            return (arraybmicat[0]);
        } else if (bmivalue > 18.5 && bmivalue < 25) {
            return arraybmicat[1];

        } else if (bmivalue > 25 && bmivalue < 30) {
            return arraybmicat[2];
        } else if (bmivalue > 30) {
            return arraybmicat[3];
        } else {
            return arraybmicat[4];

        }
    }
}

