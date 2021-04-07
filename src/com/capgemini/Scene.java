package com.capgemini;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.capgemini.objets.Bloc;
import com.capgemini.objets.TuyauRouge;
import com.capgemini.personnage.Mario;

//**** La classe scene est la classe la plus importante de l'application ****//
//**** Elle est accessible par toutes les autres classes , contient le "moteur" de l'application ****//
//**** Elle gère la partie graphique ****//
@SuppressWarnings("serial")
public class Scene extends JPanel {

	private ImageIcon icoFond;
	private Image imgFond1;
	private Image imgFond2;

	private ImageIcon icoChateau1;
	private Image imgChateau1;

	private ImageIcon icoDepart;
	private Image imgDepart;

	private int xFond1;
	private int xFond2;
	private int dx;
	private int xPos; // Position absolue dans le jeu

	public Mario mario;
	public TuyauRouge tuyauRouge1;
	public Bloc bloc;

	// Constructeur
	public Scene() {
		super();

		this.xFond1 = -100;
		this.xFond2 = 1700;
		this.dx = 0;
		this.xPos = -1;
		icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
		this.imgFond1 = icoFond.getImage();
		this.imgFond2 = icoFond.getImage();

		this.icoChateau1 = new ImageIcon(getClass().getResource("/images/chateau.png"));
		this.imgChateau1 = this.icoChateau1.getImage();
		this.icoDepart = new ImageIcon(getClass().getResource("/images/depart.png"));
		this.imgDepart = this.icoDepart.getImage();

		mario = new Mario(800, 820);
		tuyauRouge1=new TuyauRouge(600, 230);
		bloc=new Bloc(400, 100);
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();

	}

	// *** GETTERS ***//
	public int getDx() {
		return dx;
	}

	public int getxPos() {
		return xPos;
	}

	// *** SETTERS ***//
	public void setDx(int dx) {
		this.dx = dx;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public void setxFond1(int xFond1) {
		this.xFond1 = xFond1;
	}

	public void setxFond2(int xFond2) {
		this.xFond2 = xFond2;
	}

	// *** Methodes ***//

	public void deplacementFond() {

		if (this.xPos >= 0) {
			this.xPos = this.xPos + this.dx;
			this.xFond1 = this.xFond1 - this.dx;
			this.xFond2 = this.xFond2 - this.dx;
		}

		if (this.xFond1 == -1800) {
			this.xFond1 = 1800;
		} else if (this.xFond2 == -1800) {
			this.xFond2 = 1800;
		} else if (this.xFond1 == 1800) {
			this.xFond1 = -1800;
		} else if (this.xFond2 == 1800) {
			this.xFond2 = -1800;
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics g2 = (Graphics2D) g;

		this.deplacementFond();
		g2.drawImage(this.imgFond1, this.xFond1, 0, null); // Dessin de l'image de Fond
		g2.drawImage(this.imgFond2, this.xFond2, 0, null);
		g2.drawImage(this.mario.marche("mario", 25), 800, 820, null);
		g2.drawImage(imgChateau1, 600 - this.xPos, 800, null); // Chateau du début
		g2.drawImage(imgDepart, 900 - this.xPos, 900, null); // Panneau du départ
		g2.drawImage(this.tuyauRouge1.getImgTuyeauRouge(),this.tuyauRouge1.getX()- this.xPos, this.tuyauRouge1.getY(), null);
		g2.drawImage(this.bloc.getImgBloc(),this.bloc.getX()- this.xPos, this.bloc.getY(), null);
	}

}
