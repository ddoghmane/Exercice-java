/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class Methodetestperimetre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {}
	public class Rectangle {

		  /* champs privés d'un rectangle. Ils sont accessibles
		     seulement dans le corps de la classe Rectangle
		  */
		  private double longueur, largeur ;

		  /* constructeur : c'est une méthode spéciale dont le nom est
		     le nom de la classe.
		     Ici on construit un rectangle à partir de deux paramètres
		     lo qui représente la longueur et la représentant la largeur
		     du rectangle à construire
		  */ 
		     
		  public Rectangle ( double lo , double la ) {
		      longueur = lo ;
		      largeur  = la ; 
		  }

		  // méthode qui calcule et RETOURNE le périmètre d'un rectangle
		  public double perimetre() {
		    return 2 * ( longueur + largeur );
		  }

		  // méthode qui calcule et RETOURNE la surface d'un rectangle
		  public double surface() {
		    return  longueur * largeur ;
		  }
		  
		  
		   public  void  afficher ( String nom ) {
		       System.out.println("Informations du rectangle " + nom + " : ") ;
			   System.out.println("  - longueur  : " + longueur) ;
			   System.out.println("  - largeur   : " + largeur) ;
			   System.out.println("  - perimetre : " + perimetre()) ;
			   System.out.println("  - surface   : " + surface());
		    }


		}
		// TODO Auto-generated method stub

	}


