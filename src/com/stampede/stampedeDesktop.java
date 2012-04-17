package com.stampede;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class stampedeDesktop {
	
   public static void main (String[] argv) {
     new LwjglApplication(new stampede(), "Game", 480, 320, false);               
   }
   
}
