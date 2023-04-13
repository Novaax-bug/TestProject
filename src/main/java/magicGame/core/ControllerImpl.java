package magicGame.core;

import magicGame.models.magicians.Magician;
import magicGame.models.magicians.MagicianImpl;
import magicGame.models.magicians.Wizard;
import magicGame.models.magics.BlackMagic;
import magicGame.models.magics.Magic;

import magicGame.models.magics.MagicImpl;
import magicGame.models.magics.RedMagic;
import magicGame.models.region.Region;
import magicGame.repositories.interfaces.MagicRepositoryImpl;
import magicGame.repositories.interfaces.MagicianRepositoryImpl;


import static magicGame.common.ExceptionMessages.INVALID_MAGICIAN_TYPE;
import static magicGame.common.ExceptionMessages.INVALID_MAGIC_TYPE;
import static magicGame.common.OutputMessages.SUCCESSFULLY_ADDED_MAGIC;

public class ControllerImpl implements Controller {

    private MagicRepositoryImpl magics;
    private MagicianRepositoryImpl magicians;
    private Region region;


    @Override
    public String addMagic(String type, String name, int bulletsCount) {
        Magic newMagic;
        if (type.equals("RedMagic")) {
            newMagic = new RedMagic(name, bulletsCount);
            this.magics.addMagic(newMagic);
            return String.format(SUCCESSFULLY_ADDED_MAGIC, name);
        }
        if (type.equals("BlackMagic")) {
            newMagic = new BlackMagic(name, bulletsCount);
            this.magics.addMagic(newMagic);
            return String.format(SUCCESSFULLY_ADDED_MAGIC, name);

        }

        throw new IllegalArgumentException(INVALID_MAGIC_TYPE);

    }

    @Override
    public String addMagician(String type, String username, int health, int protection, String magicName) {

        if (!type.equals("Wizard") && !type.equals("BlackWidow")) {
            throw new IllegalArgumentException(INVALID_MAGICIAN_TYPE);
        }

        Magician newMagician;
        Magic newMagic;
        if (type.equals("Wizard")) {
//            newMagician = new Wizard(username, health, protection, newMagician.getMagic());
//            this.magicians.addMagician(newMagician);
        } else if (type.equals("BlackWidow")) {

        } else {
            throw new IllegalArgumentException(INVALID_MAGICIAN_TYPE);
        }
        return null;
    }

    @Override
    public String startGame() {
        return null;
    }

    @Override
    public String report() {
        return null;
    }
}
