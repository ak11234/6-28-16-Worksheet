import java.util.Scanner;

/**
 * Created by Adam on 6/28/2016.
 */
public class Print {
    public static double getint(String description){
        Scanner scan = new Scanner(System.in);
        double num;

        System.out.print(description);
        num = scan.nextDouble();
        return num;
    }
    public static void printone(){
        Scanner scan = new Scanner(System.in);
        double num;

        System.out.print("Enter a number: ");

        num = scan.nextDouble();

        System.out.println("You entered: " + num);
    }
    public static void printtwo(){
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println("Enter a number: ");
        num1 = scan.nextDouble();
        System.out.println("Enter another number: ");
        num2 = scan.nextDouble();
        System.out.println("You entered: " + num1 + " and " +num2);
    }
    public static void printsumtwo(){
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println("Enter a number: ");
        num1 = scan.nextDouble();
        System.out.println("Enter another number: ");
        num2 = scan.nextDouble();
        double sum = num1+num2;
        System.out.println("Your sum is " + sum);
    }
    public static void printaveragetwo() {
        double num1, num2;
        num1 = getint("First number: ");
        num2 = getint("Second number: ");
        double dec1, dec2;
        double average = ((num1 + num2) / 2.0);
        System.out.println(average);
    }
    public static void printsumthree(){
        double num1, num2, num3;
        num1=getint("First number: ");
        num2=getint("Second number: ");
        num3=getint("Third number: ");
        System.out.println(num1+num2+num3);
    }
    public static void printthreeaverage(){
        double num1,num2,num3;
        num1=getint("First number: ");
        num2=getint("Second number: ");
        num3=getint("Third number: ");
        double average = ((num1 + num2 + num3) / 3.0);
        System.out.println(average);
    }
    public static void findsmallestoftwo(){
        double num1, num2;
        num1=getint("First number: ");
        num2=getint("Second number: ");
        if (num1<num2) {
            System.out.println(num1 + " is smaller");
        } else if (num1>num2) {
            System.out.println(num2 + " is smaller");
        } else {
            System.out.println("They are equal");
        }
    }
}
