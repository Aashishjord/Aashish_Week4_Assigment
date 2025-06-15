class GameCharacter {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String attack() {
        return name + " attacks!";
    }
}
class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return getName() + " strikes with a sword for melee damage!";
    }
}

class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }
    @Override
    public String attack() {
        if (arrowCount > 0) {
            arrowCount--;
            return getName() + " shoots an arrow! Arrows left: " + arrowCount;
        } else {
            return getName() + " has no arrows left!";
        }
    }
}
class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String attack() {
        if (mana >= 10) {
            mana -= 10;
            return getName() + " casts a fireball! Mana left: " + mana;
        } else {
            return getName() + " doesn't have enough mana to cast a spell!";
        }
    }
}
public class GameCharacters {
    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[] {
            new Warrior("Thor"),
            new Archer("Legolas", 3),
            new Mage("Michale", 20)
        };
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i].attack());
        }

        System.out.println("-----------Next round-----------"); //To make it more syllish
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i].attack());
        }
    }
}
