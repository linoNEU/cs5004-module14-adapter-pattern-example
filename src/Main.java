import adapter.LegacyUser;
import adapter.LegacyUserInterface;
import adapter.UserAdapter;
import adapter.UserInterface;

/**
 * Main class for the project. We illustrate the use of the Adapter pattern.
 * There is a legacy user interface that needs to be adapted to work with the new
 * system.
 */
public class Main {

  /**
   * Main entry point for the application.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a legacy user
    LegacyUserInterface legacyUser = new LegacyUser("Peter Pan", "123-456-7890");
    // Create a user adapter
    UserInterface userAdapter = new UserAdapter(legacyUser);
    // Display the user information
    System.out.println("First Name: " + userAdapter.getFirstName());
    System.out.println("Last Name: " + userAdapter.getLastName());
    System.out.println("Phone Number: " + userAdapter.getPhoneNumber());
    System.out.println("Phone Type: " + userAdapter.getPhoneType());
  }
}
