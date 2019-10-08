package org.academiadecodigo.stringrays.frontbattle.Movables;

import org.academiadecodigo.stringrays.frontbattle.Position;

public class Bullet implements Movables {

    private Position position;
    private int bulletDamage;
    private boolean isFired;

    public Bullet(Position position) {
        this.position = position;
        bulletDamage = 10;
    }

    @Override
    public void move(Direction direction) {

        //TODO: IMPLEMENT BULLET MOVEMENT

    }

    public Position getPosition() {
        return position;
    }

    public boolean isFired() {
        return isFired;
    }

    public void setFired(boolean fired) {
        if(!fired) {
            position.hide();
        }
        if (fired) {
            //TODO: PLAYER NEEDS TO SET POSITION TO WHERE HE IS SHOOTING
            position.show();
        }
        isFired = fired;
    }

    public int getBulletDamage() {
        return bulletDamage;
    }
}