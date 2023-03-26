/**
 * Created by Stanislav Ivanov
 */
public class Creature {
 private int energy, fullness, happiness;
 private String name;

 private Creature friend;

 public Creature(String name){
     energy = 15;
     fullness = 15;
     happiness = 15;

     this.name = name;

   }
 public String getName(){
   return this.name;
 }
    public void play(){
        happiness += 8;
        energy -= 6;
        fullness -= 4;
        if(happiness > 15){
            happiness = 15;
        }
      System.out.println("Yaay, that was really interesting");
    }
    public void sleep(){
        if(energy > 11)
            System.out.println(this.name + " is not that tired");
        else {
            System.out.println(this.name + "had a fantastic nap");
            energy += 8;
            fullness -= 5;
            happiness -= 5;
        }
        if(energy > 15){
            energy = 15;
        }

    }
    public void eat(){
        if(fullness > 11)
         System.out.println(name + " is already full");
        else {
            System.out.println("Yummy, that was so tasty");
            fullness += 8;
            energy -= 4;
            happiness -= 6;
        }
        if(fullness>15){
            fullness = 15;
        }
    }
    public String getStatus(){
     String status = "";
        if(happiness <1 || energy < 1 || fullness < 1 ){
            System.out.println("You killed " + this.name + " you are a horrible parent");
            System.exit(0);
        }
        if(happiness <= 6){
          status += this.getName() + ": I am so sad, please play with me\n";
        }
        if(energy <= 6){
          status += this.getName() + ": I am so tired, please put me to sleep\n";
        }
        if(fullness<= 6){
            status += this.getName() + ": I am so hungry, please feed me";
        }

        return status;
    }

    public Creature getFriend() {
        return friend;
    }

    public void setFriend(Creature friend) {
        this.friend = friend;
    }
}
