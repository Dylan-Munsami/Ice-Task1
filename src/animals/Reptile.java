/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;

import java.util.Scanner;

class Reptile extends Animals {
    private double bloodTemp;

    public Reptile(int IDtag, String species, double bloodTemp) {
        super(IDtag, species);
        this.bloodTemp = bloodTemp;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bloodTemp = scanner.nextDouble();
    }

    @Override
    public void output() {
        System.out.println("Reptile Details:");
        System.out.println("ID: " + IDtag);
        System.out.println("Species: " + species);
        System.out.println("Blood Temperature: " + bloodTemp);
    }
}