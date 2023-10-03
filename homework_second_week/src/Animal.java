public class Animal {
    protected Food food;
    protected Ability ability;

    public Animal(Food food, Ability ability) {
        this.food = food;
        this.ability = ability;
    }

    void whatItEat(){
        System.out.println(this + " eats " + this.food);
    }
    void printAbility() {
        System.out.println(this + " " + this.ability);
    }
}
