package com.capgemini.objets;

import java.awt.Image;

import javax.swing.ImageIcon;

public class TuyauRouge extends Objet {

	// *** Variables ***//
	private Image imgTuyeauRouge;
	private ImageIcon icoTuyeauRouge;

	public TuyauRouge(int x, int y) {
		super(x, y, 43, 65);
		this.icoTuyeauRouge = new ImageIcon(getClass().getResource("/images/tuyeauRouge.png"));
		this.imgTuyeauRouge = this.icoTuyeauRouge.getImage();
	}

	public Image getImgTuyeauRouge() {
		return imgTuyeauRouge;
	}
	
	

}
