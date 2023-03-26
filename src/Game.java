/**
 * Created by Stanislav Ivanov
 */

import java.util.Scanner;

public class Game {
    private Creature creature;
    private boolean carryOn = true;
    private Scanner input = new Scanner(System.in);

    public void run() {
        startTutorial();
        while (carryOn) {
            interact();
            System.out.println(this.creature.getStatus());
        }
        System.out.println("Time to put the creature to sleep");
    }

    private void startTutorial() {
        System.out.println("Hi there! Welcome to javagochi \nWhat is the name of your creature?");
        String name = input.nextLine();
        this.creature = new Creature(name);
        System.out.println("Congratulations, you can now meet " + this.creature.getName() + "!");
    }

    private void interact() {
        System.out.println("What would you like to do");
        System.out.println("1. Play");
        System.out.println("2. Sleep");
        System.out.println("3. Eat");
        System.out.println("4. Talk to a friend");
        System.out.println("5. Quit");
        int choice = input.nextInt();
        input.nextLine(); // Consume '\n'
        switch (choice) {
            case 1:
                this.creature.play();
                break;
            case 2:
                this.creature.sleep();
                break;
            case 3:
                this.creature.eat();
                break;
            case 4: // Talk to a friend
                talkToAFriend();
                break;
            case 5: // Quit
                carryOn = false;
                break;
            default:
                System.out.println("You have to pick a number between 1 and 5");
                break;
        }
    }

    private void talkToAFriend() {
        if (this.creature.getFriend() == null) { // Does our creature have a friend?
            System.out.println("What is your friend's name?"); // Print question.
            String friendsName = input.nextLine(); // Get friend's name.
            Creature friend = new Creature(friendsName); // Create a new friend.
            this.creature.setFriend(friend); // Set our friend to friend we just met.
            friend.setFriend(this.creature); // Tell our new friend that we are their friend.
        }
        String myName = this.creature.getName();
        String friendsName = this.creature.getFriend().getName();
        System.out.printf("%s: Hey %s, how are you doing?\n", myName, friendsName);
        System.out.printf("%s: I am doing great, thank you %s\n", friendsName, myName);
        System.out.printf("%s: Great to hear!\n", myName);
    }
}
