/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animals;

import java.util.Scanner;

class Animals {
    protected int IDtag;
    protected String species;

    public Animals(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        IDtag = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter the species: ");
        species = scanner.nextLine();
    }

    public void output() {
        System.out.println("ID: " + IDtag + "\nSpecies: " + species);
    }
}

