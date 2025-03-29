public class ElectricPokemon extends Pokemon{

    public ElectricPokemon(String name, String sound) {
        super(name, sound);
    }

    public void electroBall() {
        System.out.println("Does Electro Ball!");
    }

    @Override
    public void attack() {
        System.out.println("Does electric attack!");
    }
}
