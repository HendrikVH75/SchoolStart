import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double baguetteLaenge;
        double baguetteRadius;
        double baguetteMenge;
        double baguetteGrundflaeche;
        double baguetteVolumen;
        double backZuwachs;
        double teigMenge;

        System.out.println("Länge des Baguette: ");
        baguetteLaenge = scan.nextDouble();

        System.out.println("Radius des Baguette: ");
        baguetteRadius = scan.nextDouble();

        System.out.println("Menge der Baguettes: ");
        baguetteMenge = scan.nextDouble();

        // Grundfläche = Pi * Radius(Quadrat)!
        baguetteGrundflaeche = Math.PI * Math.pow( baguetteRadius, 2);
        System.out.println("Grundfläche des Baguette: " + Math.ceil(baguetteGrundflaeche));

        baguetteVolumen = baguetteGrundflaeche * baguetteLaenge;
        System.out.println("Volumen des Baguette: " + Math.ceil(baguetteVolumen));

        teigMenge = baguetteVolumen * baguetteMenge;
        System.out.println("Teigmenge: " + Math.ceil(teigMenge));

        backZuwachs = ((teigMenge * 35) / 100);
        System.out.println("Backzuwachs des Baguette: " + Math.ceil(backZuwachs));

        teigMenge = teigMenge - backZuwachs;
        System.out.println("Tatsächliche Teigmenge: " + Math.ceil(teigMenge));

    }

}
