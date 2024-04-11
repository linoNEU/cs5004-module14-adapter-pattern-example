package adapter;

/**
 * Represents the current user interface that collects user information.
 */
public interface UserInterface {

  /**
   * Get the user's first name.
   *
   * @return the user's first name
   */
  String getFirstName();

  /**
   * Get the user's last name.
   *
   * @return the user's last name
   */
  String getLastName();

  /**
   * Get the user's phone number.
   *
   * @return the user's phone number
   */
  String getPhoneNumber();

  /**
   * Get the user's phone type.
   *
   * @return the user's phone type
   */
  PhoneType getPhoneType();
}
