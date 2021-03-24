package kg.geektech.les8.players;

public class Witcher extends Hero {
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.RESURRECTION);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getHealth() == 0) {
                heroes[i].setHealth(this.getHealth());
                System.out.println("Witcher resurrected " +
                        heroes[i].getClass().getSimpleName()
                        + " by " + this.getHealth());
                this.setHealth(0);
                break;
            }
        }
    }
}
//  Добавить еще игрока Witcher, не наносит урон боссу, но получает урон от босса.
//  Имеет 1 шанс оживить первого погибшего героя, отдав ему свою жизнь, при этом погибает сам.