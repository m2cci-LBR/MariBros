package com.capgemini.objets;

public class Objet {

	// *** Variables ***//
	private int largeur, hauteur; // dimension de l'objet
	private int x, y; // position de l'objet

	public Objet(int largeur, int hauteur, int x, int y) {
		super();
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.x = x;
		this.y = y;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
