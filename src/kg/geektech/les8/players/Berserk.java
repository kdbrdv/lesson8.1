package kg.geektech.les8.players;

public class Berserk extends Hero {
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0 && boss.isStunned()){
            System.out.println("Berserk block and return damage " +
                    boss.getDamage()/2 );
            boss.setHealth(boss.getHealth() - boss.getDamage()/2);
        }
    }
}
//Berserk должен получать от босса урон, и потом наносить ему свой урон+ часть урона полученного от босса