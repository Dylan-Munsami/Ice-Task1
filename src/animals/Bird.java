/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;
import java.util.Scanner;

class Bird extends Animals {
    private int colour;
    private String featherColorName;

    public Bird(int IDtag, String species, int colour) {
        super(IDtag, species);
        this.colour = colour;
        this.featherColorName = mapColorToName(colour);
    }

    private String mapColorToName(int colour) {
        switch (colour) {
            case 1:
                return "grey";
            case 2:
                return "white";
            case 3:
                return "black";
            default:
                return "unknown";
        }
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the feather colour (1=grey, 2=white, 3=black): ");
        colour = scanner.nextInt();
        featherColorName = mapColorToName(colour);
    }

    @Override
    public void output() {
        System.out.println("Details of the bird:");
        System.out.println("ID: " + IDtag);
        System.out.println("Species: " + species);
        System.out.println("Feather Colour: " + featherColorName);
    }
}