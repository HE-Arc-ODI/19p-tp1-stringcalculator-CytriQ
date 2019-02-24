import java.util.ArrayList;
import java.util.List;

public class StringCalculator {


  public StringCalculator() {
  }

  public int Add(String numbers){
    int returnNumber = 0;
    int cptNumbers = 0;
    for (int i = 0, len = numbers.length(); i < len; i++) {
      if (Character.isDigit(numbers.charAt(i))) {
        cptNumbers++;
      }
    }
    if(cptNumbers > 0)
    {
      String[] Lchar = numbers.split(",");
      for(int i = 0; i<Lchar.length;i++){
        returnNumber=returnNumber+Integer.parseInt(Lchar[i]);
      }
    }
    return returnNumber;
  }

}
