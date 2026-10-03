import java.util.Scanner;

public class WasteCollection{

    double calculateTotalWaste(double point1Waste, double point2Waste){
            double total_waste_collected = point1Waste+ point2Waste;
            return total_waste_collected;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle no: ");
        int vehicle_no = sc.nextInt();
        System.out.print("waste collected: ");
        double waste_collected = sc.nextDouble();
        System.out.print("No of collection points: ");
        int collection_points = sc.nextInt();
        System.out.print("Vehicle status: ");
        char vehicle_status = sc.next().charAt(0);


        System.out.println();
        System.out.println("Vehicle no: "+vehicle_no);
        System.out.println("Amount of waste collected in Kgs: "+waste_collected);
        System.out.println("No of Collection points: "+collection_points);
        System.out.println("Vehicle Status: "+vehicle_status);

        if(waste_collected>=100.0)
            System.out.println("Collection Target Achieved");
        else  System.out.println("More Waste Collection Required");

        WasteCollection w = new WasteCollection();
        System.out.println();


        System.out.print("amount of waste collected from point 1 : ");
        double p1waste = sc.nextDouble();
        System.out.print("amount of waste collected from point 2 : ");
        double p2waste = sc.nextDouble();

        double totalwastecollected = w.calculateTotalWaste(p1waste,p2waste);
        System.out.println("Total waste collected from two collection points: "+totalwastecollected);



    }
}