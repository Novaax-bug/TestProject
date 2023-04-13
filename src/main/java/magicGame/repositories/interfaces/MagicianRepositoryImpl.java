package magicGame.repositories.interfaces;

import magicGame.models.magicians.Magician;


import java.util.Collection;

import static magicGame.common.ExceptionMessages.INVALID_MAGICIAN_REPOSITORY;

public class MagicianRepositoryImpl implements MagicianRepository {

    private Collection<Magician> data;

    public MagicianRepositoryImpl(Collection<Magician> data) {
        this.data = data;
    }


    @Override
    public Collection getData() {
        return null;
    }

    @Override
    public void addMagician(Magician name) {
        if(name==null){
            throw new NullPointerException(INVALID_MAGICIAN_REPOSITORY);
        }
        this.data.add(name);
    }

    @Override
    public boolean removeMagician(Magician name) {
        for (Magician currentMagician:this.data) {
            if(currentMagician.equals(name)){
                this.data.remove(name);
                return true;
            }
        }
        return false;
    }

    @Override
    public Magician findByUsername(String name) {
        for (Magician currentMagician:this.data) {
            if(currentMagician.getUsername().equals(name)){
                return currentMagician;
            }
        }
        return null;
    }
}
