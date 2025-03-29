public class FirePokemon extends Pokemon {
    private final String type = "Fire";
    private String strongAgainst = "Grass";
    private String weakAgainst = "Water";

    // Constructor

    public FirePokemon(String name, String sound) {
        super(name, sound);
    }

    // Getters and Setters

    public String getType() {
        return type;
    }

    public String getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(String strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public String getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(String weakAgainst) {
        this.weakAgainst = weakAgainst;
    }

    // Methods

    public void fireLash() {
        System.out.println(getName() + " uses FireLash!");
    }

    public void flameThrower() {
        System.out.println(getName() + " uses Flamethrower!");
    }


    @Override
    public void attack() {
        System.out.println("Does Fire attack!");
    }
}
