import java.util.ArrayList;
import java.util.List;

public class StringCalculator {


  public StringCalculator() {
  }

  public int Add(String numbers){
    int returnNumber = 0;
    boolean cancel = false;
    String delimiter = ",";


    if((!(numbers.matches("^([0-9]+|\\/\\/\\[.*\\]\\n[0-9]+)((.*|\\n)[0-9]+)*"))) || numbers == null)
    {
      cancel = true;
    }else
    {
      if(numbers.contains("//")){
        delimiter = numbers.substring(numbers.indexOf("[")+1,numbers.indexOf("]"));
        numbers = numbers.substring(numbers.indexOf("\n")+1);
        numbers=numbers.replace(delimiter,",");
        delimiter=",";
      }
    }
    System.out.println(delimiter);
    if(cancel == false)
    {
      numbers = numbers.replace("\n",delimiter);

      String[] Lchar = numbers.split(delimiter);
      for(int i = 0; i<Lchar.length;i++){
        if(Integer.parseInt(Lchar[i])<0)
        {
          throw new RuntimeException(Lchar[i]+" is negative.");
        }
        if(Integer.parseInt(Lchar[i])<1000)
        {
          returnNumber = returnNumber + Integer.parseInt(Lchar[i]);
        }
      }
    }
    return returnNumber;
  }

}
