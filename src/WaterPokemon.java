public class WaterPokemon extends Pokemon {
    private final String type = "Water";
    private String strongAgainst = "Fire";
    private String weakAgainst = "Grass";

    // Constructor

    public WaterPokemon(String name, String sound) {
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

    public void hydroCanon() {
        System.out.println(this.getName() + " uses Hydro Canon!");
    }

    public void hydroPump() {
        System.out.println(this.getName() + " uses HydroPump!");
    }

    @Override
    public void attack() {
        System.out.println("Does water attack!");
    }
}
