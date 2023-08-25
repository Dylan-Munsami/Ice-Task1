/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean birdEntered = false;
        boolean reptileEntered = false;
        Scanner scanner = new Scanner(System.in);

        while (!(birdEntered && reptileEntered)) {
            System.out.print("Enter 'bird' or 'reptile' to input information (or type 'exit' to quit): ");
            String animalType = scanner.nextLine().toLowerCase();

            if (animalType.equals("bird")) {
                Bird bird = new Bird(0, "", 0);
                bird.input();
                bird.output();
                birdEntered = true;
            } else if (animalType.equals("reptile")) {
                Reptile reptile = new Reptile(0, "", 0.0);
                reptile.input();
                reptile.output();
                reptileEntered = true;
            } else if (animalType.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'bird', 'reptile', or 'exit'.");
            }
        }
        
        scanner.close();
    }
}






