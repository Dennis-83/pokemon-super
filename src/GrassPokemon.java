public class GrassPokemon extends Pokemon{

    public GrassPokemon(String name, String sound) {
        super(name, sound);
    }

    public void leafStorm() {
        System.out.println("Does Leaf Storm!");
    }

    @Override
    public void attack() {
        System.out.println("Does grass attack!");
    }
}
