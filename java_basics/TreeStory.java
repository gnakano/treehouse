import java.io.Console;
 
public class TreeStory {
   
   public static void main(String[] args) {
      Console console = System.console();
      /*  Some terms:
          noun - Person, place or thing
          verb - An action
          adjective - A description used to modify or describe a noun
          Enter your amazing code here!
      */
      String name = console.readLine("Enter Name: ");
      String adjective = console.readLine("Enter a word to describe a noun: ");
      console.printf("%s is very %s", name, adjective);
   }
   
}