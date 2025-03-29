public class WaterPokemon extends Pokemon{


    public WaterPokemon(String name, String sound) {
        super(name, sound);
    }

    public void hydroCanon() {
        System.out.println("Does Hydro Canon!");
    }

    @Override
    public void attack() {
        System.out.println("Does water attack!");
    }
}
