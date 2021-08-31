package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * @author wenlong
 * @create 2021/8/31 8:40
 */
public class Ball {
    private int x;
    private int y;
    private int size;
    private int xSpeed;
    private int ySpeed;

    public Ball(int x,int y,int size,int xSpeed,int ySpeed){
        this.x = x;
        this.y = y;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void update(){
        x += xSpeed;
        y += ySpeed;

        if(x < 0+size || x > Gdx.graphics.getWidth()-size){
            xSpeed = -xSpeed;
        }
        if(y > Gdx.graphics.getHeight()-size){
            ySpeed = -ySpeed;
        }
        if(y < 0+size){
            //游戏结束
        }
    }

    public void draw(ShapeRenderer shape){
        shape.circle(x,y,size);
    }

    public void upDraw(ShapeRenderer shape){
        update();
        draw(shape);
    }

    public void collidesWith(Block block){
        if(x<block.getX()+block.getWidth()+size && x>block.getX()-size && y<block.getY()+block.getHeight()+size && y>block.getY()-size){
            block.setDeathWith(true);
            int distanceL = Math.abs(x-block.getX());
            int distanceR = Math.abs(x-(block.getX()+block.getWidth()));
            int distanceU = Math.abs(y-(block.getY()+block.getHeight()));
            int distanceD = Math.abs(y-block.getY());
            int[] numbers = {distanceL,distanceR,distanceU,distanceD};
            for(int i = 1;i<numbers.length;i++){
                if(numbers[i]>numbers[i-1]){
                    numbers[i] = numbers[i-1];
                }
            }
            int[] numbers2 = {distanceL,distanceR,distanceU,distanceD};
            int index = 0;
            for (int i = 0;i<numbers2.length;i++){
                if(numbers[3] == numbers2[i]) {
                    index = i;
                    break;
                }
            }
            switch(index){
                case 0:
                    xSpeed =  -Math.abs(xSpeed);
                    break;
                case 1:
                    xSpeed =  Math.abs(xSpeed);
                    break;
                case 2:
                    ySpeed = Math.abs(ySpeed);
                    break;
                case 3:
                    ySpeed = -Math.abs(ySpeed);
                    break;
                default:
                    break;
            }
        }
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}
