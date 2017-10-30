/**
 * Created by k1764425 on 30/10/17.
 */
import java.util.Scanner;
public class Game {
    private Creature creature;
    private boolean userQuits = false;
    Scanner input = new Scanner(System.in);
    public void run(){
        startTutorial();
        while(!userQuits){
            interact();
            System.out.println(this.creature.status());
        }
        System.out.println("Time to put the creature to sleep");
    }

    private void startTutorial() {
        System.out.println("Hi there! Welcome to javagochi \nWhat is the name of your creature?");
        String name = input.nextLine();
        this.creature = new Creature(name);
        System.out.println("Congratulations, you can now meet " + this.creature.getName() + "!");
    }
   private void interact()
   {
     System.out.println("What would you like to do");
     System.out.println("1. Play");
     System.out.println("2. Sleep");
     System.out.println("3. Eat");
     System.out.println("4. Quit");
    int choice = input.nextInt();
       switch (choice){
           case 1:
               this.creature.play();
               break;
           case 2:
               this.creature.sleep();
               break;
           case 3:
               this.creature.eat();
               break;
           case 4:
               userQuits = true;
               break;
           default:
               System.out.println("You have to pick a number between 1 and 4");
               break;
       }
   }
}
