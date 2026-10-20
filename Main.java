public class Main {

  public static void main(String[] args) {
    /*
     * TODO: Make changes to the Superhero class (provided in a separate file) so
     * that the following code compiles and so that each superhero's details is printed out
     * nicely
     */
    Superhero spiderman1 = new Superhero("Spiderman", "Red suit", "Super Web");
    System.out.println(spiderman1);
    Superhero batman1 = new Superhero("Batman", "Batsuit", "Super Strength, 8");
    System.out.println(batman1);

    //Superheros Fight
    Superhero.superHeroFight(batman1, spiderman1);
    System.out.println("");

    //task 3
    Superhero batman = new Superhero("Batman", "Batsuit","Batarang");
    Superhero spiderman = new Superhero("Spiderman", "Redsuit","Superweb");
    Superhero greenGoblin = new Superhero("green goblin");
    System.out.println(batman);
    System.out.println("");
    System.out.println(spiderman);
    System.out.println("Spiderman has a bad day.");
    System.out.println("The Green Goblin shows up...");
    System.out.println(greenGoblin);
    System.out.println("Spiderman dies");
    spiderman.loseLife();
    System.out.println(spiderman);
    int attack = batman.specialAttack(4);
    System.out.println(batman.getName() + " uses his special attack and deals " + attack + " damage.");
    System.out.println(greenGoblin.getName() + " uses his special attack and deals " + greenGoblin.getWeaponStrength() + " damage.");
    batman.setWeaponStrength(attack);
    Superhero.superHeroFight(batman, greenGoblin);


    
  }

}
