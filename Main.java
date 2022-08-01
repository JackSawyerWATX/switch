import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("\nWelcome to our Diner! Please select an entree:\n" 
                       + "1) steak\n" 
                       + "2) wings\n" 
                       + "3) lobster\n"
                       + "and any other number for nothing!");
    int num = sc.nextInt();

    switch (num) {
      case 1:
        System.out.println("Here is your steak!");
        break;
      case 2:
        System.out.println("Here is your wings!");
        break;
      case 3:
        System.out.println("Here is your lobster!");
        break;
      default:
        System.out.println("You want nothing?!");
        break;
    }

    System.out.println("\nPlease select a drink:\n" 
                       + "1) iced tea\n" 
                       + "2) soda\n" 
                       + "3) beer\n"
                       + "and any other number for nothing!");

    int num2 = sc.nextInt();
    
    switch (num2) {
      case 1:
        System.out.println("Here is your iced tea!");
        break;
      case 2:
        System.out.println("Here is your soda!");
        break;
      case 3:
        System.out.println("Here is your beer!");
        break;
      default:
        System.out.println("You want nothing?!");
        break;
    }

    System.out.println();

    sc.close();

  }
}
