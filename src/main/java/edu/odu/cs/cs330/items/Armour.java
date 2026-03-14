package edu.odu.cs.cs330.items;

import java.util.Scanner;

/**
 * This class represents one piece of armour--as found in most video games.
 * This includes boots and helmets.
 *
 * Armour may not be stacked.
 */
@SuppressWarnings({
    "PMD.BeanMembersShouldSerialize",
    "PMD.CloneMethodReturnTypeMustMatchClassName",
    "PMD.CloneThrowsCloneNotSupportedException",
    "PMD.LawOfDemeter",
    "PMD.OnlyOneReturn",
    "PMD.ProperCloneImplementation",
    "PMD.MethodArgumentCouldBeFinal",
    "PMD.LocalVariableCouldBeFinal"
})
public class Armour extends Equippable {
    /**
     * The amount of damage that can be negated.
     */
    protected int defense;

    /**
     * Default to a armour with an empty name, zero durability, zero defense,
     * blank material, no modifier a zero modifier level, and a blank element.
     */
    public Armour()
    {
        super();

        this.defense = 0;
    }

    /**
     * Duplicate a piece of armour.
     *
     * @param src armour to duplicate
     */
    public Armour(Armour src)
    {
        super();
        this.setName(src.getName());
        this.setMaterial(src.getMaterial());
        this.setDurability(src.getDurability());
        this.setModifier(src.getModifier());
        this.setModifierLevel(src.getModifierLevel());
        this.setDefense(src.getDefense());
    }

    /**
     * Retrieve armour defense.
     *
     * @return total defense provided
     */
    public int getDefense()
    {
        return this.defense;
    }

    /**
     * Update defense.
     *
     * @param def replacement defense
     */
    public void setDefense(int def)
    {
        this.defense = def;
    }

    @Override
    public boolean isStackable()
    {
        return false;
    }

    /**
     * Read Armour attributes.
     */
    @Override
    public void read(Scanner snr)
    {
        super.name    = snr.next();
        
        this.material = snr.next();
        this.durability = snr.nextInt();
        this.defense = snr.nextInt();
        this.modifier = snr.next();
        this.modifierLevel = snr.nextInt();
        this.element = snr.next();

    }

    /**
     * Clone--i.e., copy--this Armour.
     */
    @Override
    public Item clone()
    {
        Armour cpy = new Armour(this);

        return cpy;
    }

    /**
     * Check for logical equivalence--based on name, material, modifier, and
     * element.
     *
     * @param rhs object for which a comparison is desired
     */
    @Override
    public boolean equals(Object rhs)
    {
        if (!(rhs instanceof Armour)) {
            return false;
        }

        Armour rhsItem = (Armour) rhs;

        // Complete this function.
        // Remove the placeholder return
        return false;
    }

    /**
     * Generate a hash code by adding the name, material, modifier, and element
     * hash codes.
     */
    @Override
    public int hashCode()
    {
        // Complete this function.
        // Remove the placeholder return
        return -1;
    }

    /**
     * *Print* one Armour.
     */
    @Override
    public String toString()
    {

        // Complete this function... treat the return as a hint.
        return String.join(
            System.lineSeparator(),
            String.format("  Nme: %s", super.getName()),
            ""
        );
    }
}




