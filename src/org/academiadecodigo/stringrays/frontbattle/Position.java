package org.academiadecodigo.stringrays.frontbattle;

public class Position {

    private int col;
    private int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void moveUp() {
        int oldCol = getCol();
        int oldRow = getRow();


    }

    public void moveDown() {

    }

    public void moveLeft() {

    }

    public void moveRight() {

    }
}
