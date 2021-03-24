package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0){
            int coefficient = RPG_Game.random.nextInt(5) + 1; //2,3,4
            for (int i = 0; i < heroes.length; i++) {
                boss.setHealth(boss.getHealth() - coefficient);
                //heroes[i].setDamage(heroes[i].getDamage() + coefficient); у героев урон увеличивается каждый раунд
            }
            System.out.println("Magic boost +" + coefficient);
        }
    }
}
//Magic должен увеличивать атаку каждого героя после каждого раунда на n-ное количество