package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * @author wenlong
 * @create 2021/8/31 9:17
 */
public class Board extends Block {
    private int defaultMoveSpeed;
    private int moveSpeed;

    public Board(int x,int y,int width,int height,int defaultMoveSpeed){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.defaultMoveSpeed = defaultMoveSpeed;
    }

    public void update(){
        if(Gdx.input.getX()>x+width/2+2 && x<Gdx.graphics.getWidth()-width){
            moveSpeed = defaultMoveSpeed;
        }else if(Gdx.input.getX()<x+width/2-2 && x>0){
            moveSpeed = -defaultMoveSpeed;
        }else{
            moveSpeed = 0;
        }
        move();
    }

    public void draw(ShapeRenderer shape){
        shape.rect(x,y,width,height);
    }

    public void upDraw(ShapeRenderer shape){
        update();
        draw(shape);
    }

    public void move(){
        x += moveSpeed;
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

    public int getDefaultMoveSpeed() {
        return defaultMoveSpeed;
    }

    public void setDefaultMoveSpeed(int defaultMoveSpeed) {
        this.defaultMoveSpeed = defaultMoveSpeed;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
}
