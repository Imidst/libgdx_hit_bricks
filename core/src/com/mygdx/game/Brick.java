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

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
