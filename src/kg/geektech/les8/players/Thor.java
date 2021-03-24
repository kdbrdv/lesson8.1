package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUNNED);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boss.setStunned(RPG_Game.random.nextBoolean());
        if(boss.isStunned()){
            System.out.println("Thor stunned Boss!");
        }
    }
}






        /*if (!thorStunned) {
            Random random = new Random();
            thorStunned = random.nextBoolean();
            if (thorStunned)
                System.out.println("Thor stunned ");
            return;

         */

// public static boolean thorStunned = false;
//Добавить еще игрока, Thor, удар по боссу имеет шанс оглушить босса на 1 раунд, вследствие
//        чего босс пропускает 1 раунд и не наносит урон героям.
