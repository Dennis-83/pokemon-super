public abstract class Pokemon {
    private final String name;
    private int level;
    private int hp;
    private int xp;
    private final String sound;
    private String food;


    // Constructor

    public Pokemon(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    // Getters and Setters (no setters for name,sound)

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    // Methods

    public abstract void attack();

    public void eat() {
        System.out.println(name + " eats "+ food);
    }

    public void makeSound() {
        System.out.println(name + " shouts: " + sound + "!");
    }
}
