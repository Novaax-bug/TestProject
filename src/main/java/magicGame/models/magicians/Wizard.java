package magicGame.models.magicians;

import magicGame.models.magics.Magic;

public class Wizard extends MagicianImpl{
    public Wizard(String username, int health, int protection, Magic magic) {
        super(username, health, protection, magic);
    }
    @Override
    public void takeDamage(int points) {
        super.setProtection(super.getProtection() - points);
        if (super.getProtection() == 0) {
            super.setHealth(super.getHealth() - points);
        }
    }
}
