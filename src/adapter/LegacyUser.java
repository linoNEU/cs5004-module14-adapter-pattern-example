package adapter;

/**
 * Represents a legacy user that needs to be adapted to work with the new system.
 */
public class LegacyUser implements LegacyUserInterface {
  private final String name;
  private final String phoneNumber;

  /**
   * Constructor for the LegacyUser class.
   *
   * @param name        the user's name
   * @param phoneNumber the user's phone number
   */
  public LegacyUser(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  @Override public String getName() {
    return this.name;
  }

  @Override public String getPhoneNumber() {
    return this.phoneNumber;
  }

}
