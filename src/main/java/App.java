import models.Parcel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        ArrayList<Parcel> allParcels = new ArrayList<Parcel>();

        while(programRunning){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Matt Squared Shipping.");
            try{
                System.out.println("Please select a shipping method: standard or priority");
                String userSpeed = bufferedReader.readLine();
                if(userSpeed.equals("standard") || userSpeed.equals("priority")){
                    System.out.println("Please enter package length in inches");
                    int userLength = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please enter package width in inches");
                    int userWidth = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please enter package height in inches");
                    int userHeight = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Please enter package weight in ounces");
                    int userWeight = Integer.parseInt(bufferedReader.readLine());
                    Parcel userParcel = new Parcel(userLength, userWidth, userHeight, userWeight);
                    userParcel.costToShip(userSpeed);
                    allParcels.add(userParcel);


                    System.out.println("That package costs $" + userParcel.cost + " to ship.");


//                    System.out.println("Your total cost is  $" +  + " for shipping.");

                } else  {
                    System.out.println("Sorry, that's not a valid choice. Please try again.");
                }

            } catch (IOException e){
                e.printStackTrace();

            }
        }
    }
}
