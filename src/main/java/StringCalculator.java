import java.util.ArrayList;
import java.util.List;

public class StringCalculator {


  public StringCalculator() {
  }

  public int Add(String numbers){
    int returnNumber = 0;
    boolean cancel = false;
    char delimiter = ',';


    if(!(numbers.matches("^([0-9]|\\/\\/.\\n[0-9])((.|\\n)[0-9])*")))
    {
      cancel = true;
    }else
    {
      if(numbers.contains("//")){
        delimiter = numbers.charAt(2);
        numbers = numbers.substring(4);
      }
    }

    if(cancel == false)
    {
      numbers = numbers.replace("\n",Character.toString(delimiter));

      String[] Lchar = numbers.split(Character.toString(delimiter));
      for(int i = 0; i<Lchar.length;i++){
        returnNumber=returnNumber+Integer.parseInt(Lchar[i]);
      }
    }
    return returnNumber;
  }

}
