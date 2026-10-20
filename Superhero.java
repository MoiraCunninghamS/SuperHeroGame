public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life;
  private int weaponStrength;

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
public Superhero(){
  name = "no name";
  costume = "t shirt";
  weapon = "fist";
  life = true;
  weaponStrength = 0;
}
public Superhero(String n, String c, String w){
  name = n;
  costume = c;
  weapon = w;
  life = true;
  weaponStrength = (int) (Math.random() * 10);
}
public Superhero(String n){
  name = n;
  costume = "unkown";
  weapon = "unkown";
  life = true;
  weaponStrength = (int) (Math.random() * 10);
}
public Superhero(String n, String c, String w, int s){
  name = n;
  costume = c;
  weapon = w;
  life = true;
  weaponStrength = s;
}

  // TODO #2: Add missing methods.
  //get methods
  public String getName(){
    return name;
  }
  public int getWeaponStrength(){
    return weaponStrength;
  }
  //other methods
  public void loseLife(){
    life = false;
  }

  public static void superHeroFight(Superhero super1, Superhero super2){
    if(super1.weaponStrength > super2.weaponStrength){
      System.out.println("The winner is " + super1.name);
      super2.loseLife();
    }else if(super1.weaponStrength < super2.weaponStrength){
      System.out.println("The winner is " + super2.name);
      super1.loseLife();
    }else{
      System.out.println("It is a tie");
    }
  }
  public int specialAttack(int a){
    return weaponStrength + (int)(Math.random() * a) + 1;
  }

  public void setWeaponStrength(int b){
    weaponStrength = b;
  }
  public void setWeaponStrength(){
    weaponStrength = (int)(Math.random() * 10) + 1;
  }

  // TODO #3: Including a toString() method (see topic 1.15 Strings in the CSAwesome2 textbook) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "name: " + name + System.lineSeparator() + "costume: " + costume + System.lineSeparator() + "life: " + life + System.lineSeparator() + "weapon strength: " + weaponStrength;
    return superHeroDetails;
  }
}
