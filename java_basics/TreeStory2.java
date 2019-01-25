import java.io.Console;
 
public class TreeStory2 {
   
   public static void main(String[] args) {
      Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
      String ageAsString = console.readLine("What is your age? ");
      int age = Integer.parseInt(ageAsString);
      if (age < 13) {
         console.printf("Sorry you must be at least 13 to use this program \n");
         System.exit(0);
      };
      String name = console.readLine("Enter Name: ");
      String adjective = console.readLine("Enter an adjective: ");
      String noun;
      boolean isInvalidword;
      do {
         noun = console.readLine("Enter a noun: ");
         isInvalidword = (noun.equalsIgnoreCase("dork") || 
                           noun.equalsIgnoreCase("jerk") ||
                           noun.equalsIgnoreCase("nerd"));
         if (isInvalidword) {
            console.printf("Sorry that language is not allowed. Try Again. \n\n");
         }
      } while(noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));
      String adverb = console.readLine("Enter an adjective: ");
      String verb = console.readLine("Enter a verb ending in -ing: ");
      console.printf("%s is very %s\n", name, adjective);
   }
   
}