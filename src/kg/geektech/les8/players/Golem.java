package kg.geektech.les8.players;

public class Golem extends Hero {
    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.BLOCK_ATTACK);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0) {
                this.setHealth(this.getHealth() - ( boss.getDamage() / 5));
                heroes[i].setHealth(heroes[i].getHealth() + (boss.getDamage() / 5));
            }
        }
    }
}

/*
Добавить еще игрока, Golem, который имеет увеличенную жизнь но слабый удар.
Может принимать на себя 1/5 часть урона исходящего от босса по другим игрокам.
 */