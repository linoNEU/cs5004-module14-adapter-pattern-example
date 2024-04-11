import static org.junit.Assert.assertEquals;

import adapter.LegacyUser;
import adapter.PhoneType;
import adapter.UserAdapter;
import adapter.UserInterface;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the UserAdapter class.
 */
public class UserAdapterTest {

  private UserInterface user;

  /**
   * Sets up the test fixture.
   */
  @Before public void setUp() {
    user = new UserAdapter(new LegacyUser("Mickey Mouse", "123-456-7890"));
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
    assertEquals(PhoneType.UNKNOWN, user.getPhoneType());
  }

}