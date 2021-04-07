package com.capgemini;

import javax.swing.JFrame;

public class Main {

	public static Scene scene;
	
	public static void main(String[] args) {
		// Creation de la fenetre de l'application
		JFrame fenetre=new JFrame("Jeu style Mario");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1800, 1500);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);

		//Instanciation de l objet scene
		scene=new Scene();
		//On associe la scene à la fenetre de l application
		fenetre.setContentPane(scene);
		fenetre.setVisible(true);
		
	}

}
