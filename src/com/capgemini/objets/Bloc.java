package com.capgemini.objets;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bloc extends Objet{
	
	// *** Variables ***//
		private Image imgBloc;
		private ImageIcon icoBloc;

		public Bloc(int x, int y) {
			super(x, y, 43, 65);
			this.icoBloc = new ImageIcon(getClass().getResource("/images/mario.png"));
			this.imgBloc = this.icoBloc.getImage();
		}

		public Image getImgBloc() {
			return imgBloc;
		}

}
