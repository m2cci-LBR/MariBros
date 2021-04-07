package com.capgemini.personnage;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Mario extends Personnage {

	// *** Variables ***//

	private Image imgMario;
	private ImageIcon icoMario;

	public Mario(int x, int y) {
		super(x, y, 30, 50);

		this.icoMario = new ImageIcon(getClass().getResource("/images/mario.png"));
		this.imgMario = this.icoMario.getImage();
	}
	
	//*** Getters ***//
	public Image getImgMario() {return imgMario;}
	
	//*** Setters ***//
	
	//*** Methodes ***//

}
