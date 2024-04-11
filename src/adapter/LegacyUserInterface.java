package adapter;

/**
 * Represents a legacy user interface that needs to be adapted to work with the new system. The
 * interface collects information about the user but the code is not compatible with the new
 * system.
 */
public interface LegacyUserInterface {

  /**
   * Get the user's name.
   *
   * @return the user's name
   */
  String getName();

  /**
   * Get the user's phone number.
   */
  String getPhoneNumber();
}
