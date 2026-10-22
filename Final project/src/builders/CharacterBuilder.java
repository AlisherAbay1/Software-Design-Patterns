package builders;

import abstract_factory.factories.CharacterFactory;

public abstract class CharacterBuilder {
    protected final CharacterFactory factory;

    protected CharacterBuilder(CharacterFactory factory) {
        this.factory = factory;
    }

    public abstract CharacterBuilder reset();
    public abstract CharacterBuilder setCharacterName(String name);
    public abstract CharacterBuilder createWeapon();
    public abstract CharacterBuilder createArmor();
    public abstract Object getResult();
}