import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("What is your favorite number? ");
    String favNum = s.nextLine();

    // test output
    System.out.println("Hello " + getInitial(firstName) + "." + getInitial(lastName) + ".");
    System.out.println(favNum);

    generatePassword(8);
    
    s.close();
  } // end main method

  /*
   * Name: getInitial
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method

  public static String generatePassword(int length) {
    String password = "";

    // need a loop of len "length"

    // pull a random number from range (65-90 CAPS) (48-57 #s) (97-122 lower)
    int min = 65;
    int max = 90;

    int rand = (int)(Math.random() * (max - min + 1) + min);

    // convert int to char (c =(char)i;)
    char c = (char)rand;

    System.out.println(rand + " " + c);

    // append char to the String password (password = password + c)
    return password;
  }







} // end class
