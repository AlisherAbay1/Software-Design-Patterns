package builders;

public class CharacterDirector {

    public void constructFull(CharacterBuilder builder) {
        builder.reset().createWeapon().createArmor();
    }

    public void constructFull(CharacterBuilder builder, String name) {
        builder.reset().setCharacterName(name).createWeapon().createArmor();
    }

    public void constructUnarmed(CharacterBuilder builder) {
        builder.reset().createArmor();
    }

    public void constructUnarmed(CharacterBuilder builder, String name) {
        builder.reset().setCharacterName(name).createArmor();
    }

    public void constructNoArmor(CharacterBuilder builder) {
        builder.reset().createWeapon();
    }

    public void constructNoArmor(CharacterBuilder builder, String name) {
        builder.reset().setCharacterName(name).createWeapon();
    }

    public void constructNaked(CharacterBuilder builder) {
        builder.reset();
    }

    public void constructNaked(CharacterBuilder builder, String name) {
        builder.reset().setCharacterName(name);
    }
}