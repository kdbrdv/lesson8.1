package kg.geektech.les8.players;

public class Boss extends GameEntity{

    private boolean isStunned;

    public boolean isStunned() {
        return isStunned;
    }

    public void setStunned(boolean stunned) {
        isStunned = stunned;
    }

    public Boss(int health, int damage) {
        super(health, damage);
    }
}
