package kg.geektech.les8.players;

public class Bane extends Hero {
    public Bane(int health, int damage) {
        super(health, damage, SuperAbility.CURSE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (Hero hero :
                heroes) {
            boss.setHealth(boss.getHealth() - (hero.getDamage() / 2));
            System.out.println("Bane Cursed " + hero.getDamage() / 2);
        }
    }
}
//Герой называется Bane.Его способность будет заключаться в том , что он дает буст
// всем героям.Герои нанесут обычный свой урон, а после применения способности Bane герои могут
// нанести дополнительный урон который в 2 раза меньше основого урона.
//И его способность будет действовать каждый раунд
