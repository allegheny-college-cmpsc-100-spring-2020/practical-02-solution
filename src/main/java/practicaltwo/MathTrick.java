package practicaltwo;

/** Implements the "friendship" trick to practice operators.
 *
 * @author Solution Repository
 */
public class MathTrick {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Set up cards
	int cardA = 8;
	int cardB = 7;
	int workingTotal;
	int magicNumber = 10 - cardA;
	// Do the trick
	workingTotal = cardB * 2;
	workingTotal += 2;
	workingTotal *= 5;
	workingTotal -= magicNumber;
	// Print message
	System.out.println("Your \"friendship number\" is: \t" + workingTotal);
	System.out.println("Your original cards were: \t" + cardB + cardA);
  }
}