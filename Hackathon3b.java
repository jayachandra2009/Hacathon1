import java.util.Scanner;
class Hackathon3b 
{
        public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        double wasteCollected;

        System.out.print("Enter waste collected : ");
        wasteCollected = sc.nextDouble();

        if (wasteCollected >= 100)
             {
            System.out.println("Collection target achieved");
        } else {
            System.out.println("More waste collection required");
        }
    }
}