package adapter;

/**
 * Represents a user adapter that adapts the legacy user to work with the new system.
 */
public class UserAdapter implements UserInterface {
  private final LegacyUserInterface legacyUser;

  /**
   * Constructor for the UserAdapter class.
   *
   * @param legacyUser the legacy user to be adapted
   */
  public UserAdapter(LegacyUserInterface legacyUser) {
    this.legacyUser = legacyUser;
  }

  @Override
  public String getFirstName() {
    return legacyUser.getName().split(" ")[0];
  }

  @Override
  public String getLastName() {
    return legacyUser.getName().split(" ")[1];
  }

  @Override
  public String getPhoneNumber() {
    return legacyUser.getPhoneNumber();
  }

  @Override
  public PhoneType getPhoneType() {
    return PhoneType.UNKNOWN;
  }
}

