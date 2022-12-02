import java.util.Scanner;
import java.util.Arrays;

class Javapedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("*******************Javapedia********************");
    System.out.println("How many historical figures will you register ?");
    int nbfigures = scan.nextInt(); scan.nextLine();
    String[][] database = new String[nbfigures][3];
    for (int i = 0; i < database.length; i++) {

      System.out.println("Figure " + (i+1));
      for(int j = 0; j < database[i].length; j++) {
        switch(j) {
          case 0: System.out.print("\t- Name: "); break;
          case 1: System.out.print("\t- Date of birth: "); break;
          case 2: System.out.print("\t- Occupation: "); break;
        }
        database[i][j] = scan.nextLine();
      }

    }
    System.out.println("These are the values you stored");
    print2DArray(database);

    System.out.println("\nWho do you want information on ?");
    String choice = scan.nextLine();
    System.out.println("\n");
    for(int i = 0; i < database.length; i++) {
      if(database[i][0].equals(choice)) {
        System.out.println("\tName: " + database[i][0]);
        System.out.println("\tDate of birth: " + database[i][1]);
        System.out.println("\tOccupation: " + database[i][2]);
      }
    }

    scan.close();
  }

  public static void print2DArray(String[][] array) {
    for(int i = 0; i < array.length; i++) {
      System.out.println("\t");
      for(int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.print("\n");
    }
  }
}