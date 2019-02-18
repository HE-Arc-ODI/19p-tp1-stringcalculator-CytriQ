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

  /**
   * Insert 1 as string
   */
  @Test
  public void insert1AsString() {
    // Arrange
    int expected = 1;
    StringCalculator sc = new StringCalculator();
    // Act
    int actual = sc.Add("1");
    // Assert
    assertThat(actual, is(expected));
  }

  /**
   * Insert 1 and 2 as string
   */
  @Test
  public void insert1and2AsString() {
    // Arrange
    int expected = 3;
    StringCalculator sc = new StringCalculator();
    // Act
    int actual = sc.Add("1,2");
    // Assert
    assertThat(actual, is(expected));
  }

  /**
   * Insert more than 3 char
   */
  @Test
  public void insertMoreThan3Char() {
    // Arrange
    int expected = 0;
    StringCalculator sc = new StringCalculator();
    // Act
    int actual = sc.Add("1,2,3,4");
    // Assert
    assertThat(actual, is(expected));
  }
}