package builders.concrete_builders;

import abstract_factory.CharacterFactory;
import base_objects.abstractions.Armor;
import base_objects.abstractions.GameCharacter;
import base_objects.abstractions.Weapon;
import builders.CharacterBuilder;

public class CharacterJsonBuilder extends CharacterBuilder {
    private GameCharacter character;
    private Weapon weapon;
    private Armor armor;

    public CharacterJsonBuilder(CharacterFactory factory) {
        super(factory);
        reset();
    }

    @Override
    public CharacterJsonBuilder reset() {
        this.character = factory.createCharacter("None");
        this.weapon = null;
        this.armor = null;
        return this;
    }

    @Override
    public CharacterJsonBuilder setCharacterName(String name) {
        character.setName(name);
        return this;
    }

    @Override
    public CharacterJsonBuilder createWeapon() {
        this.weapon = factory.createWeapon();
        return this;
    }

    @Override
    public CharacterJsonBuilder createArmor() {
        this.armor = factory.createArmor();
        return this;
    }

    @Override
    public String getResult() {
        String result = "{\n"
                + "  \"name\": \"" + character.getName() + "\",\n"
                + "  \"role\": \"" + character.getRole() + "\",\n"
                + "  \"health\": " + character.getHealth() + ",\n"
                + "  \"weapon\": " + weaponJson() + ",\n"
                + "  \"armor\": " + armorJson() + "\n"
                + "}";
        reset();
        return result;
    }

    private String weaponJson() {
        if (weapon == null) {
            return "null";
        }
        return "{ \"type\": \"" + weapon.getClass().getSimpleName()
                + "\", \"damage\": " + weapon.getDamage() + " }";
    }

    private String armorJson() {
        if (armor == null) {
            return "null";
        }
        return "{ \"type\": \"" + armor.getClass().getSimpleName()
                + "\", \"protection\": " + armor.getProtection() + " }";
    }
}