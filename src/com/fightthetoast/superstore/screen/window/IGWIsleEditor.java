package com.fightthetoast.superstore.screen.window;

import com.fightthetoast.superstore.screen.ScreenInGame;

public class IGWIsleEditor extends IngameWindow{

	public IGWIsleEditor(ScreenInGame sig) {
		super(sig);
	}

	@Override
	public void render() {
		drawWhiteBackground();
		drawGUIBox();
	}

}
