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
    int expected = 45;
    StringCalculator sc = new StringCalculator();
    // Act
    int actual = sc.Add("1,2,3,4,5,6,7,8,9");
    // Assert
    assertThat(actual, is(expected));
  }

  /**
   * Insert new lines with number
   */
  @Test
  public void insertNewLinesWithNumbers() {
    // Arrange
    int expected = 10;
    StringCalculator sc = new StringCalculator();
    // Act
    int actual = sc.Add("1,2\n3,4");
    // Assert
    assertThat(actual, is(expected));
  }

  /**
   * Insert new lines with number error
   */
  @Test
  public void insertNewLinesWithNumbersError() {
    // Arrange
    int expected = 0;
    StringCalculator sc = new StringCalculator();
    // Act
    int actual = sc.Add("1,2,3,4,5,6,7,8,9\n");
    // Assert
    assertThat(actual, is(expected));
  }

  /**
   * Insert with change of default delimiter
   */
  @Test
  public void insertWithChangeOfDefaultDelimiter() {
    // Arrange
    int expected = 3;
    StringCalculator sc = new StringCalculator();
    // Act
    int actual = sc.Add("//;\n1;2");
    // Assert
    assertThat(actual, is(expected));
  }

  /**
   * Insert with change of default delimiter with error
   */
  @Test
  public void insertWithChangeOfDefaultDelimiterError() {
    // Arrange
    int expected = 0;
    StringCalculator sc = new StringCalculator();
    // Act
    int actual = sc.Add("//;\n\n1;2");
    // Assert
    assertThat(actual, is(expected));
  }

  /**
   * Insert with negative number

  @Test
  public void insertWithNegativeNumber() throws RuntimeException{
    // Arrange
    int expected = 0;
    StringCalculator sc = new StringCalculator();
    // Act
    int actual = sc.Add("1,2,-4,3");
    // Assert
    assertThat(actual, is(expected));
  }

  unable to test exception message*/


}
