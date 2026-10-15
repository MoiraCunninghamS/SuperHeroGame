public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
public Superhero(){
  name = "unkown";
  costume = "unkown";
  weapon = "unkown";
  life = true;
  weaponStrength = 0;
}
public Superhero(String n, String c, String w){
  name = n;
  costume = c;
  weapon = w;
  life = true;
  weaponStrength = 0;
}
  // TODO #2: Add missing methods.
  public void loseLife(){
    life = false;
  }

  
  // TODO #3: Including a toString() method (see topic 1.15 Strings in the CSAwesome2 textbook) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "name: " + name + System.lineSeparator() + "costume: " + costume + System.lineSeparator() + "life: " + life + System.lineSeparator() + "weapon strength: " + weaponStrength;
    return superHeroDetails;
  }
}
