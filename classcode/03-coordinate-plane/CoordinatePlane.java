import java.util.Scanner;

public class CoordinatePlane {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String point1, point2;

    System.out.print("Please enter a point in the form (x, y): ");
    // write a statement to store the input
    point1 = s.nextLine();

    // check if the user input the point correctly
    // if yes, continue code
    // if no, get the input again
    System.out.println(checkInput(point1));

    System.out.print("Please enter a second point: ");
    // write a statement to store the input

    // check if the user input the point correctly
    // if yes, continue code
    // if no, get the input again


    // test your methods below:


  } // end main method

  /*
   * N: checkInput
   * P: determine whether or not the input followed correct format
   * I: String user typed in
   * R: true/false
   */
  public static boolean checkInput(String p) {
    boolean status = true;

    // not strong enough, is it first?
    if (p.indexOf("(") == -1) {
      status = false;
    }
    // not strong enough, is it last?
    if (p.indexOf(")") == -1) {
      status = false;
    }
    // comma, then space right after
    if (p.indexOf(", ") == -1) {
      status = false;
    }

    return status;
  } // end checkInput method

  /*
   * N: getX
   * P: get the x-coordinate of the point
   * I: coordinate in the form (x, y) (String)
   * R: x-coordinate (int)
   */
  public static int getX(String point) {
    // determine where the comma is located
    int commaPos = point.indexOf(",");

    // grab substring from after parentesis up to comma
    String x = point.substring(1, commaPos);

    // return value back to main so it can be used later in the program
    return Integer.parseInt(x);
  } // end getX method

  /*
   * N: getY
   * P: get the y-coordinate of the point
   * I: coordinate in the form (x, y) (String)
   * R: y-coordinate (int)
   */


  /*
   * N: quadrant
   * P: determine which quadrant the point lies in
   * I:
   * R:
   */


  /*
   * N: euclideanDistance
   * P: calculate the distance between two points
        sqrt((x2 - x1)^2 + (y2 - y1)^2)
   * I:
   * R:
   */


  /*
   * N: taxicabDistance
   * P: calculate the distance between two points
        abs(x2 - x1) + abs(y2 - y1)
   * I:
   * R:
   */


} // end class
