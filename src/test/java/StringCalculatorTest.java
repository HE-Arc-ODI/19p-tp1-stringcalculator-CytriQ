import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {

  private StringCalculator sc;

  @Before
  public void setup(){
  }

  /**
   * Insert empty string
   */
  @Test
  public void insertEmptyString() {
    // Arrange
    int expected = 0;
    StringCalculator sc = new StringCalculator();
    // Act
    int actual = sc.Add("");
    // Assert
    assertThat(actual, is(expected));
  }

}