package adapter;

/**
 * Represents the current user interface that collects user information.
 */
public class User implements UserInterface {

  private final String firstName;
  private final String lastName;
  private final String phoneNumber;
  private final PhoneType phoneType;

  /**
   * Constructor for the User class.
   *
   * @param firstName   the user's first name
   * @param lastName    the user's last name
   * @param phoneNumber the user's phone number
   * @param phoneType   the user's phone type
   */
  public User(String firstName, String lastName, String phoneNumber, PhoneType phoneType) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.phoneType = phoneType;
  }

  @Override public String getFirstName() {
    return this.firstName;
  }

  @Override public String getLastName() {
    return this.lastName;
  }

  @Override public String getPhoneNumber() {
    return this.phoneNumber;
  }

  @Override public PhoneType getPhoneType() {
    return this.phoneType;
  }
}
