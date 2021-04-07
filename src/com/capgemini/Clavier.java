package com.capgemini;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // fl�che droite 
			//Annule le d�calage de 1 cr�e par le d�placement de fond (PanJeu)
			if (Main.scene.getxPos() ==-1) {
				Main.scene.setxPos(0);         // R�initialisation de setxPos
				Main.scene.setxFond1(-50);     // R�initialisation de 
				Main.scene.setxFond2(1750);
			}
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(true);
			Main.scene.setDx(1);
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // fl�che gauche
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(false);
			Main.scene.setDx(-1); // d�placement du fond vers la droite lors de l'appui sur la touche "fl�che gauche" 
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.mario.setMarche(false);
		Main.scene.setDx(0); // Remise � 0 de la variable dx de l'objet scene lors du relachement des touches
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
