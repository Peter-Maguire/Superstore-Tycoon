package com.fightthetoast.superstore.screen;

import org.isjaki.util.vec2f;

import com.fightthetoast.superstore.Game;

public class ScreenMainSplash extends Screen{

	
	
	public ScreenMainSplash(Game game) {
		super(game);
	}

	@Override
	public void onScreenCreate(Screen previousScreen) {

		
	}

	@Override
	public void render() {
		game.splash.render(new vec2f(0, 0));
	}
	
	

	@Override
	public void onScreenDestroy(Screen newScreen) {

		
	}

}
