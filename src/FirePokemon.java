public class FirePokemon extends Pokemon {


    public FirePokemon(String name, String sound) {
        super(name, sound);
    }

    public void fireLash() {
        System.out.println("Does Firelash attack!");
    }

    @Override
    public void attack() {
        System.out.println("Does Fire attack!");
    }
}
