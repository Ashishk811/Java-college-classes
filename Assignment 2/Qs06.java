import java.util.Scanner;
class Qs06{
    public static double houseCostsAfter5yrs (double initial, double fuel, double tax){
        return initial+ (fuel*5)+ (initial*tax*5);
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int count=1;
        while(true){
            System.out.println("Calculating the cost of House No: "+count);
            count++;

        //Taking inputs for to find out the house costs for each house
            System.out.print("Initial Cost: ");
            double initialCost= s1.nextDouble();
            System.out.print("Fuel Cost: ");
            double fuelCost=s1.nextDouble();
            System.out.print("Tax Rate: ");
            double taxRate=s1.nextDouble();
        //Print the total cost after 5 yrs
            System.out.println("Total Cost of the House: "+ houseCostsAfter5yrs(initialCost, fuelCost, taxRate)); 
            
            System.out.println("Do you want to see the another house cost ('y' or 'n'): ");
            char ch= s1.next().charAt(0);
            if (ch=='n' || ch=='N') break;
        }
        s1.close();
    }
}