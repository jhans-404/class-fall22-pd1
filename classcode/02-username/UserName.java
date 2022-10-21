import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    /*
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
    */

    System.out.print("How long should the password be? ");
    int len = s.nextInt();
    System.out.println(generatePassword(len));

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
    for(int i = 0; i < length; i++) {
      // pull a random number from range (65-90 CAPS) (48-57 #s) (97-122 lower)

      int min, max;

      if(i % 3 == 0) {
        // uppercase letter range
        min = 65;
        max = 90;
      } // end if statement
      else if(i % 3 == 1) {
        // lowercase letter range
        min = 97;
        max = 122;
      } // end else if statement
      else {
        // number range
        min = 48;
        max = 57;
      } // end else statement

      // once we have the range, choose random integer
      int rand = (int)(Math.random() * (max - min + 1) + min);

      // convert int to char (c =(char)i;)
      char c = (char)rand;

      // update password to add-on the random character
      password += c; // equivalent to password = password + c

      // don't need this test statement anymore
      // System.out.println(rand + " " + c);
    } // end for loop

    return password;
  } // end generatePassword method

} // end class
