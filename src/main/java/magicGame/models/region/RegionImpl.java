package magicGame.models.region;

import magicGame.models.magicians.Magician;

import java.util.Collection;

public class RegionImpl implements Region {


    @Override
    public String start(Collection<Magician> magicians) {
        //the first shooting magicians group is always the wizard
        // we must check for the bullets before shoot;
        // if all magicians in one group have 0 point heath other is winner .

        for (Magician currentTeamMagicians : magicians) {
            if (currentTeamMagicians.getClass().toString().equals("Wizard") && currentTeamMagicians.getMagic().getBulletsCount()>0) {
                currentTeamMagicians.getMagic().fire();
                if(!currentTeamMagicians.isAlive()){
                    return "Wizards win!";
                }
            }
        }
        return "Black widows win!";
    }
}
