package com.stephaneallary.eclipse.ide.test;

import processing.core.*;
import processing.video.*;
//Mettre les library video dans dans le fichier lib ˆ coter du jar ou dans l'app

public class TestProcessingVideo extends PApplet {

	private Capture cam;
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		PApplet.main( new String[] {"com.stephaneallary.eclipse.ide.test.TestProcessingVideo"});
	}
	
	public void setup() {
		System.out.println("PATH : " + System.getProperty("jna.library.path"));
		this.size(640,480,P2D);
		this.cam = new Capture(this,640,480);
	    this.cam.start();
		System.out.println("PATH : " + System.getProperty("jna.library.path"));

	}
	
	public void draw() {
		if (this.cam.available()) {
		    this.cam.read();
		  }
		this.image(this.cam, 0, 0);
	}
	

}
