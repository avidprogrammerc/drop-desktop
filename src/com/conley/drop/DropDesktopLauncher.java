package com.conley.drop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.conley.drop.Drop;

public class DropDesktopLauncher {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Drop";
		cfg.useGL20 = false;
		cfg.width = 800;
		cfg.height = 480;

		new LwjglApplication(new Drop(), cfg);
	}
}