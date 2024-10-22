import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
//         System.out.println("bello");
//         Scanner scan= new Scanner(System.in);
//         // int a= scan.nextInt():
//         // float f= scan.nextFloat();
//         // String s= scan.next();
//         // String str= scan.nextLine();
//         int obj1, obj2, myvar;
//         obj1 = myvar = 20;
//         obj2 = myvar = 30;

//         System.out.println("obj1: " + obj1 + ", myvar: " + myvar);
//         System.out.println("obj2: " + obj2 + ", myvar: " + myvar);

//         scan.close();
//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////grades
//         Scanner scan = new Scanner(System.in);
//         int a= scan.nextInt();

//         if(a > 85){
//             System.out.println("Student got A grade");
//         }
//         else if(a <= 85 && a>75){
//             System.out.print("Student got B");
//         }
//         else if(a <= 75 && a>60){
//             System.out.print("Student got C");
//         }
//         else{
//             System.out.print("Student got D");
//         }

//     }
// }


////////////////////////////////////////////////////////////////months and season
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the month number (1-12): ");
//         int month = scanner.nextInt();

//         if (month == 12 || month == 1 || month == 2) {
//             System.out.println("It's Winter season.");
//         }
//         else if (month >= 3 && month <= 5) {
//             System.out.println("It's Spring season.");
//         }
//         else if (month >= 6 && month <= 8) {
//             System.out.println("It's Summer season.");
//         }
//         else if (month >= 9 && month <= 11) {
//             System.out.println("It's Autumn (Fall) season.");
//         }
//         else {
//             System.out.println("Invalid month number! Please enter a number between 1 and 12.");
//         }
//     }
// }

///////////////////////////////////////////////////////////////////////////////////////////////////// traingle is it?
// Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the first angle of the triangle: ");
//         int angle1 = scanner.nextInt();

//         System.out.println("Enter the second angle of the triangle: ");
//         int angle2 = scanner.nextInt();

//         System.out.println("Enter the third angle of the triangle: ");
//         int angle3 = scanner.nextInt();

//         if (angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3) == 180) {
//             System.out.println("The triangle is valid.");
//         } else {
//             System.out.println("The triangle is not valid.");
//         }

//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////customer and restaurent

//         Scanner scanner = new Scanner(System.in);

//         // Menu items with prices
//         String[] menu = {"Burger", "Pizza", "Pasta", "Salad", "Soda", "Ice Cream"};
//         int[] prices = {5, 30, 20, 10, 5, 12};

//         int totalBill = 0;

//         // Display the menu
//         System.out.println("bhelcome to our restaurant boiii! ee le menu");
//         for (int i = 0; i < menu.length; i++) {
//             System.out.println((i + 1) + ". " + menu[i] + " $" + prices[i]);
//         }
//         System.out.println("number batao ji konsa chahiye 1-6. Enter 0 if you don't want to order. Type 'done' when you finish.");

//         while (true) {
//             System.out.print("ha batao kya khana hai (1-6 or 0 to finish): ");
            
//             // Taking input from the customer
//             int choice = scanner.nextInt();

//             if (choice == 0) {
//                 // Exit the ordering process
//                 break;
//             } else if (choice >= 1 && choice <= 6) {
//                 // Add the price of the chosen item to the total bill
//                 totalBill += prices[choice - 1];
//                 System.out.println("apka order hai: " + menu[choice - 1]);
//             } else {
//                 // Invalid input handling
//                 System.out.println("smegal hai kya . jo number dikh rahe usme se select karo ji 1 and 6 me se.");
//             }
//         }

//         // Print the total bill
//         if (totalBill == 0) {
//             System.out.println("kya ki khana ni tha, tho aae kyu be!");
//         } else {
//             System.out.println("Thank you for your order! ye le bill is $" + totalBill);
//         }

//         scanner.close();
//     }
// }
