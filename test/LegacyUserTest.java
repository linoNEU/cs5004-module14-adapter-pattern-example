import static org.junit.Assert.assertEquals;

import adapter.LegacyUser;
import adapter.LegacyUserInterface;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the LegacyUser class.
 */
public class LegacyUserTest {

  private LegacyUserInterface user;

  /**
   * Sets up the test fixture.
   */
  @Before public void setUp() {
    user = new LegacyUser("Mickey Mouse", "123-456-7890");
  }

  /**
   * Test the getName method.
   */
  @Test public void testGetName() {
    assertEquals("Mickey Mouse", user.getName());
  }

  /**
   * Test the getPhoneNumber method.
   */
  @Test public void testGetPhoneNumber() {
    assertEquals("123-456-7890", user.getPhoneNumber());
  }
}