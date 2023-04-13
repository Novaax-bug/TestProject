package magicGame.models.magicians;

import magicGame.models.magics.Magic;

import static magicGame.common.ExceptionMessages.*;

public abstract class MagicianImpl implements Magician {
    private String username;
    private int health;
    private int protection;
    private boolean isAlive;
    private Magic magic;

    public MagicianImpl(String username, int health, int protection, Magic magic) {
        this.username = username;
        this.health = health;
        this.protection = protection;
        this.magic = magic;
    }

    public void setUsername(String userName) {
        if (userName == null || userName.trim().isEmpty()) {
            throw new NullPointerException(INVALID_MAGICIAN_NAME);
        }
        this.username = userName;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    public void setHealth(int userHealth) {
        if (userHealth < 0) {
            throw new IllegalArgumentException(INVALID_MAGICIAN_HEALTH);
        }
        this.health = userHealth;
    }

    public int getHealth() {
        return this.health;
    }

    public void setProtection(int userProtection) {
        if (userProtection < 0) {
            throw new IllegalArgumentException(INVALID_MAGICIAN_PROTECTION);
        }
        this.protection = userProtection;
    }

    public int getProtection() {
        return this.protection;
    }

    @Override
    public boolean isAlive() {
        if (getHealth() > 0) {
            return true;
        }
        return false;
    }

    public Magic magic() {
        if (this.magic == null) {
            throw new NullPointerException(INVALID_MAGIC_NAME);
        }
        return this.magic;
    }

    public Magic getMagic() {
        return this.magic;
    }
    @Override
    public void takeDamage(int points){

    }
}
