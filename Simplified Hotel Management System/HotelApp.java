import java.util.Scanner;
public class HotelApp {

    public static void main(String[] args) {

        FrontDesk frontDesk = new FrontDesk();
        Scanner input =  new Scanner(System.in);

        while(true){
            System.out.println("\n==SERVICE CONTROL PANEL==");
            System.out.println("[1] Request Cart");
            System.out.println("[2] Request Housekeeping");
            System.out.println("[3] Request Valet");
            System.out.println("[0] Exit");
            System.out.println("\nEnter Service: ");
            Integer choice = input.nextInt();

            if(choice==0){
                System.out.println("Exiting Hotel App...");
                input.close();
                break;
            }
            switch(choice){
                case 1:
                    System.out.print("Enter number of carts: ");
                    int numberOfCarts = input.nextInt();
                    frontDesk.requestCart(numberOfCarts);
                    break;
                case 2:
                    System.out.print("Enter room number: ");
                    int roomNumber = input.nextInt();
                    frontDesk.cleanRoom(roomNumber);
                    break;
                case 3:
                    System.out.print("Enter vehicle plate number: ");
                    String plateNumber = input.next();
                    frontDesk.pickUpVehicle(plateNumber);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}