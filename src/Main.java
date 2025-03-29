public class Main {
    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", "pika pika");
        pikachu.makeSound();
        pikachu.electroBall();
        pikachu.attack();
        pikachu.voltTackle();

        pikachu.setFood("Cheeseburger");
        pikachu.eat();


        FirePokemon charmander = new FirePokemon("Charmander", "Char char");
        charmander.makeSound();

        WaterPokemon squirtle = new WaterPokemon("Squirtle", "Squirt");
        squirtle.makeSound();

        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", "Bulba");
        bulbasaur.makeSound();




    }
}
