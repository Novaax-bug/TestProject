package magicGame.repositories.interfaces;

import magicGame.models.magics.Magic;

import java.util.Collection;

import static magicGame.common.ExceptionMessages.INVALID_MAGIC_REPOSITORY;

public class MagicRepositoryImpl implements MagicRepository {

    private Collection<Magic> data;

    public MagicRepositoryImpl(Collection<Magic> data) {
        this.data = data;
    }

    @Override
    public Collection getData() {
        return null;
    }

    @Override
    public void addMagic(Magic magic) {
        if (magic == null) {
            throw new NullPointerException(INVALID_MAGIC_REPOSITORY);
        }
        this.data.add(magic);
    }

    @Override
    public boolean removeMagic(Magic magic) {
        for (Magic currentMagic : this.data) {
            if (currentMagic.equals(magic)) {
                this.data.remove(magic);
                return true;
            }
        }
        return false;
    }

    @Override
    public Magic findByName(String name) {
        for (Magic currentMagic : this.data) {
            if (currentMagic.getName().equals(name)) {
                return currentMagic;
            }
        }
        return null;
    }
}
