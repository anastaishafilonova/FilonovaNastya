public class Main {
    public static void main(String [] args) {
        Camel camel = new Camel(Food.GRASS , Ability.WALK);
        camel.whatItEat();
        Tiger tiger = new Tiger(Food.BEEF, Ability.WALK);
        Dolphin dolphin = new Dolphin(Food.FISH, Ability.SWIM);
        Eagle eagle = new Eagle(Food.BEEF, Ability.FLY);
        Horse horse = new Horse(Food.GRASS, Ability.WALK);
        horse.printAbility();
    }
}



