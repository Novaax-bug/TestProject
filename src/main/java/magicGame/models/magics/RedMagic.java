package magicGame.models.magics;

public class RedMagic extends MagicImpl{
    public static final int decreasedMagicBullet = 1;
    public RedMagic(String name, int bulletsCount) {
        super(name, bulletsCount);
    }
    @Override
    public int fire(){
      return super.getBulletsCount()- decreasedMagicBullet;
    }
}
