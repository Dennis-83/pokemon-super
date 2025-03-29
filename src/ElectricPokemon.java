public class ElectricPokemon extends Pokemon{
    private final String type = "Electric";
    private String strongAgainst = "Water";
    private String weakAgainst = "Grass";

    // Constructor

    public ElectricPokemon(String name, String sound) {
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

    public void voltTackle() {
        System.out.println(getName() + " uses VoltTackle!");
    }

    public void electroBall() {
        System.out.println(getName() + " uses Electro Ball!");
    }

    @Override
    public void attack() {
        System.out.println("Does electric attack!");
    }
}
