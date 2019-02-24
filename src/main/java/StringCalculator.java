import java.util.ArrayList;
import java.util.List;

public class StringCalculator {


  public StringCalculator() {
  }

  public int Add(String numbers){
    int returnNumber = 0;
    boolean cancel = false;
    numbers = numbers.replace("\n",",");
    if(!(numbers.matches("^[0-9]((,)[0-9])*")))
    {
      cancel = true;
    }

    if(cancel == false)
    {
      String[] Lchar = numbers.split(",");
      for(int i = 0; i<Lchar.length;i++){
        returnNumber=returnNumber+Integer.parseInt(Lchar[i]);
      }
    }
    return returnNumber;
  }

}
