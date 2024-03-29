class PezDispenser {
   public static final int MAX_PEZ = 12;  // constant - max amount of pez that can be in a dispenser
   final private String characterName;
   private int pezCount;
   
   public PezDispenser(String characterName) {
      this.characterName = characterName;
      pezCount = 0;
   }
   
   public void fill() {
      fill(MAX_PEZ);
   }
   
   public void fill(int pezAmount) {
      int newAmount = pezCount + pezAmount;
      if (newAmount > MAX_PEZ) {
         throw new IllegalArgumentException("Too Many Pez!!!");
      }
      pezCount = newAmount;
      
   }
   
   // checks to see if Pez dispenser has pez. if true then decrement pezCount.
   public boolean dispense() {   
      boolean wasDispensed = false;
      if (!isEmpty()) {
         pezCount --;
         wasDispensed = true;
      }
      return wasDispensed;
   }
   
   public boolean isEmpty() {
      return pezCount == 0;
   }
   
   public String getCharacterName() {
      return characterName;
   }
   
   
  
}