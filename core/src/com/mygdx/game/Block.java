package com.mygdx.game;

/**
 * @author wenlong
 * @create 2021/8/31 13:36
 */
public class Block {
    public int x;
    public int y;
    public int width;
    public int height;
    public boolean deathWith;

    public boolean getDeathWith(){
        return deathWith;
    }

    public void setDeathWith(boolean deathWith){
        this.deathWith = deathWith;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
