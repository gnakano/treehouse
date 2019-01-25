import java.io.Console;
public class Introductions {

   public static void main(String[] args) {
   
      Console console = System.console();
   // Using Treehouse to output
      String firstName = "Genji";
      System.out.printf("Hello my name is %s\n", firstName);
      console.printf("This is being printed using the conole. My name is still %s\n", firstName);
      System.out.printf("%s is learning Java through Treehouse\n", firstName);
   }
}