import static org.junit.Assert.assertEquals;

import adapter.PhoneType;
import adapter.User;
import adapter.UserInterface;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the User class.
 */
public class UserTest {

  private UserInterface user;

  /**
   * Sets up the test fixture.
   */
  @Before public void setUp() {
    user = new User("Mickey", "Mouse", "123-456-7890", PhoneType.MOBILE);
  }

  /**
   * Test the getFirstName method.
   */
  @Test public void testGetFirstName() {
    assertEquals("Mickey", user.getFirstName());
  }

  /**
   * Test the getLastName method.
   */
  @Test public void testGetLastName() {
    assertEquals("Mouse", user.getLastName());
  }

  /**
   * Test the getPhoneNumber method.
   */
  @Test public void testGetPhoneNumber() {
    assertEquals("123-456-7890", user.getPhoneNumber());
  }

  /**
   * Test the getPhoneType method.
   */
  @Test public void testGetPhoneType() {
    assertEquals(PhoneType.MOBILE, user.getPhoneType());
  }
}