package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wenlong
 */
public class Game extends ApplicationAdapter {
	ShapeRenderer shape;
	Ball ball;
	Board board;
	List<Brick> bricks;

	@Override
	public void create () {
		shape = new ShapeRenderer();
		ball = new Ball(100,100,5,5,3);
		board = new Board(20,20,80,10,5);
		bricks = new ArrayList<>();
		for (int i = 0; i < 36; i++) {
			Brick brick = new Brick(10+100*(i%6),Gdx.graphics.getHeight()-30*((i/6)+1));
			brick.setId(i);
			bricks.add(brick);
		}
	}

	@Override
	public void render () {

		ScreenUtils.clear(0, 0, 0, 0);
		shape.begin(ShapeRenderer.ShapeType.Filled);

		ball.upDraw(shape);
		board.upDraw(shape);
		for (Brick brick : bricks) {
			if(brick.getDeathWith()){
				continue;
			}
			brick.upDraw(shape);
			ball.collidesWith(brick);
		}
		ball.collidesWith(board);

		shape.end();
	}
	
	@Override
	public void dispose () {
		shape.dispose();
	}
}
