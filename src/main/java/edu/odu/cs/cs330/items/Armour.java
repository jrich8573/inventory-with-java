package edu.odu.cs.cs330.items;

import java.util.Scanner;

/**
 * This class represents one piece of armour--as found in most video games.
 * This includes boots and helmets.
 *
 * Armour may not be stacked. All Constructors must initialize Item::stackable
 * to false.
 */
public class Armour extends Item {

    protected int durability;   ///< decreases each time the armour is used
    protected int defense;      ///< damage that is blocked
    protected String material;     ///< material out of which the armour is composed
    protected String modifier;     ///< one of protection, feather_falling, or unbreaking
    protected int modiferLevel; ///< modifier level in the range 1 to 3
    protected String element;      ///< associated element--e.g., ice, fire, and lightning.

    /**
     * Default to a armour with an empty name.
     */
    public Armour() {
        // Make the necessary call to super(...)
        super("Armour", false);
        this.durability = 0;
        this.defense = 0;
        this.material = "";
        this.modifier = "";
        this.modiferLevel = 1;
        this.element  = "";
    }

    /**
     * This is the Copy Constructor.
     */
    public Armour(Armour src) {
        // Make the necessary call to super(...)
        super(src.name, false);
        this.durability = src.durability;
        this.defense = src.defense;
        this.material = src.material;
        this.modifier = src.modifier;
        this.modiferLevel = src.modiferLevel;
        this.element = src.element;
    }

    /**
     * Retrieve armour durability.
     */
    public int getDurability() {
        
        return this.durability;
    }

    /**
     * Set armour durability.
     */
    public void setDurability(int durability) {

        this.durability = durability;
    }

    /**
     * Retrieve armour defense.
     */
    public int getDefense() {

        return this.defense;
    }

    /**
     * Set armour defense.
     */
    public void setDefense(int defense) {

        this.defense = defense;
    }

    /**
     * Retrieve armour Material.
     */
    public String getMaterial() {

        return this.material;
    }

    /**
     * Set armour Material.
     */
    public void setMaterial(String m) {

        this.material = m;
    }

    /**
     * Retrieve armour Modifier.
     */
    public String getModifier() {

        return this.modifier;
    }

    /**
     * Set armour Modifier.
     */
    public void setModifier(String m) {

        this.modifier = m;
    }

    /**
     * Retrieve armour Modifier Level.
     */
    public int getModifierLevel() {

        return this.modiferLevel;
    }

    /**
     * Set armour Modifier Level.
     */
    public void setModifierLevel(int level) {

        this.modiferLevel = level;
    }
    /**
     * Retrieve armour Element.
     */
    public String getElement() {

        return this.element;
    }

    /**
     * Set armour Element.
     */
    public void setElement(String e) {

        this.element = e;
    }

    /**
     * Read Armour attributes.
     */
    @Override
    public void read(Scanner s) {

        super.name = s.next();
        this.material = s.next(); 
        this.durability = s.nextInt(); 
        this.defense = s.nextInt();    
        this.modifier = s.next(); 
        this.modiferLevel = s.nextInt();
        this.element = s.next();  

        // Read in the remaining values
    }

    /**
     * Clone--i.e., copy--this Armour.
     */
    @Override
    public Item clone() {

        return new Armour(this);
    }

    /**
     * *Print* one Armour.
     */
    @Override
    public String toString() {
        
        String armourStr = "  Nme: " + this.name + "\n"
                         + "  Dur: " + this.durability + "\n"
                         + "  Def: " + this.defense + "\n"
                         + "  Mtl: " + this.material + "\n"
                         + "  Mdr: " + this.modifier + " (Lvl " +this.modiferLevel + ")\n"
                         + "  Emt: " + this.element + "\n";
        return armourStr;
    }
}




