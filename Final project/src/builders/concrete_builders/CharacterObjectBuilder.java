package builders.concrete_builders;

import abstract_factory.CharacterFactory;
import base_objects.abstractions.GameCharacter;
import builders.CharacterBuilder;

public class CharacterObjectBuilder extends CharacterBuilder {
    private GameCharacter character;

    public CharacterObjectBuilder(CharacterFactory factory) {
        super(factory);
        reset();
    }

    @Override
    public CharacterObjectBuilder reset() {
        this.character = factory.createCharacter("None");
        return this;
    }

    @Override
    public CharacterObjectBuilder setCharacterName(String name) {
        character.setName(name);
        return this;
    }

    @Override
    public CharacterObjectBuilder createWeapon() {
        character.equipWeapon(factory.createWeapon());
        return this;
    }

    @Override
    public CharacterObjectBuilder createArmor() {
        character.equipArmor(factory.createArmor());
        return this;
    }

    @Override
    public GameCharacter getResult() {
        GameCharacter result = character;
        reset();
        return result;
    }
}
