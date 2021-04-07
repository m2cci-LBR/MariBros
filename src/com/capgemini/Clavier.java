package com.capgemini;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // flèche droite 
			//Annule le décalage de 1 crée par le déplacement de fond (PanJeu)
			if (Main.scene.getxPos() ==-1) {
				Main.scene.setxPos(0);         // Réinitialisation de setxPos
				Main.scene.setxFond1(-50);     // Réinitialisation de 
				Main.scene.setxFond2(1750);
			}
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(true);
			Main.scene.setDx(1);
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // flèche gauche
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(false);
			Main.scene.setDx(-1); // déplacement du fond vers la droite lors de l'appui sur la touche "flèche gauche" 
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.mario.setMarche(false);
		Main.scene.setDx(0); // Remise à 0 de la variable dx de l'objet scene lors du relachement des touches
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
