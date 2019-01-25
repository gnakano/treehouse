public class Example {
  
   public static void main(String[] args) {
      // Your amazing code goes here...
      double myNum = 21 % 2;
      System.out.print("Auburn" + " over Bama\n");
      System.out.println(84 + " - " + 64);
      System.out.println("We are making a new Pez dispenser");
      System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser.%n",
                         PezDispenser.MAX_PEZ);
      PezDispenser dispenser = new PezDispenser("Yoda");
      System.out.printf("The dispenser is %s %n",
                           dispenser.getCharacterName()
                        );
      if(dispenser.isEmpty()) {
         System.out.println("The dispenser is empty.");
      }
      System.out.println("Filling the dispenser with delicious PEZ...");
      dispenser.fill();
      if (!dispenser.isEmpty()) {
         System.out.println("The dispenser is full");
      }
      while (dispenser.dispense()) {
         System.out.println("Chomp!");
      }
      if (dispenser.isEmpty()) {
         System.out.println("Ate all the PEZ");
      }
      dispenser.fill(4);
      dispenser.fill(2);
      while (dispenser.dispense()) {
         System.out.println("Chomp!!");
       
      }
      try {
         dispenser.fill(400);
         System.out.println("This will never happen");
      } catch (IllegalArgumentException iae) {
         System.out.println("Whoa There!");
         System.out.printf("The error was %s %n",
                             iae.getMessage());
      }
     
      
   }

}