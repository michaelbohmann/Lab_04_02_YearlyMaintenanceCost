import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double winterCost = 0.0;
        double springCost = 0.0;
        double summerCost = 0.0;
        double fallCost = 0.0;
        double totalCost = 0.0;

        System.out.print("What was the maintenance cost for winter?");
        winterCost = console.nextDouble();
        System.out.print("What was the maintenance cost for spring?");
        springCost = console.nextDouble();
        System.out.print("What was the maintenance cost for summer?");
        summerCost = console.nextDouble();
        System.out.print("What was the maintenance cost for fall?");
        fallCost = console.nextDouble();

        totalCost = winterCost + springCost + summerCost + fallCost;

        System.out.println("Your total of the winter maintenance: $" + winterCost + ",spring maintenance: $" + springCost + ",summer maintenance: $" + summerCost + ", and fall maintenance: $" + fallCost + "makes the yearly total maintenance: $" + totalCost);




    }
}