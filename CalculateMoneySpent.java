import java.util.Scanner;

public class CalculateMoneySpent{
    public static void main (String[] args){
        String Name;
        int Money;
        double Average;
        int total;
        int totalDay = 7;
        Scanner input = new Scanner(System.in);

         System.out.println("Hello there! Let me calculate ur spent money in the club > y < ");

          System.out.println("Tell me ur name, boss ");
          Name = input.next();


          System.out.println("How much money did u spend at the club on Monday, " + Name + "? ");
          Money = input.nextInt();
          total = Money;
          System.out.println("How much money did u spend at the club on Tuesday, " + Name + "? ");
          Money = input.nextInt();
          total = Money;
          System.out.println("How much money did u spend at the club on Wednesday, " + Name + "? ");
          Money = input.nextInt();
          total = Money;
          System.out.println("How much money did u spend at the club on Thursday, " + Name + "? ");
          Money = input.nextInt();
          total = Money;
          System.out.println("How much money did u spend at the club on Friday, " + Name + "? ");
          Money = input.nextInt();
          total = Money;
          System.out.println("How much money did u spend at the club on Saturday, " + Name + "? ");
          Money = input.nextInt();
          total = Money;
          System.out.println("How much money did u spend at the club on Sunday, " + Name + "? ");
          Money = input.nextInt();
          total = Money;

          total = total + Money;
          Average = (double) total/totalDay;


          System.out.println("This is the calculation results :");
          System.out.println("okay " + Name + " ur total expenditure at the club this week is $" + total);
          System.out.println("with an average daily expenditure of $" + Average);

          System.out.println("thank u for comingg!! ^^");

    }
}
