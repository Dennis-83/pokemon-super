public class GrassPokemon extends Pokemon{
    private final String type = "Grass";
    private String strongAgainst = "Water";
    private String weakAgainst = "Fire";

    // Constructor

    public GrassPokemon(String name, String sound) {
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

    public void leafBlade() {
        System.out.println(this.getName() + " uses LeafBlade!");
    }

    public void leafStorm() {
        System.out.println(this.getName() +  "uses Leaf Storm!");
    }

    @Override
    public void attack() {
        System.out.println("Does grass attack!");
    }
}
