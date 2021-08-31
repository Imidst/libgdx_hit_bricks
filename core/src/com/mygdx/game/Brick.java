package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * @author wenlong
 * @create 2021/8/31 11:06
 */
public class Brick extends Block {
    private int id;

    public Brick(int x,int y){
        this.x = x;
        this.y = y;

        width = 80;
        height = 20;
        deathWith = false;
    }

    public void update(){}

    public void draw(ShapeRenderer shape){
        shape.rect(x,y,width,height);
    }

    public void upDraw(ShapeRenderer shape){
        update();
        draw(shape);
    }

    @Override
    public boolean getDeathWith(){
        return deathWith;
    }

    @Override
    public void setDeathWith(boolean deathWith){
        this.deathWith = deathWith;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }
}
