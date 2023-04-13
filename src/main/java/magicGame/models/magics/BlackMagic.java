package magicGame.models.magics;

public class BlackMagic extends MagicImpl {
    public static final int decreasedIMagicBullet = 10;

    public BlackMagic(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        return super.getBulletsCount() - decreasedIMagicBullet;
    }
}
