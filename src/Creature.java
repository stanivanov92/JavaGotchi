/**
 * Created by k1764425 on 30/10/17.
 */
public class Creature {
 int energy, fullness, happiness;
 String name;
 public Creature(String name){
     energy = 15;
     fullness = 15;
     happiness = 15;

     this.name = name;

   }
 public String getName(){
   return name;
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
            System.out.println(name + " is not that tired");
        else {
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
            fullness += 8;
            energy -= 4;
            happiness -= 6;
        }
        if(fullness>15){
            fullness = 15;
        }
    }
    public String status(){
     String status = null;
        if(happiness <1 || energy < 1 || fullness < 1 ){
            System.out.println("You killed " + this.name + " you are a horrible parent");
            System.exit(0);
        }
        if(happiness <= 6){
          status += "\n" + this.getName() + ": I am so sad, please play with me";
        }
        if(energy <= 6){
          status += "\n" + this.getName() + ": I am so tired, please put me to sleep";
        }
        if(fullness<= 6){
            status +=  "\n" + this.getName() + ": I am so tired, please put me to sleep";
        }

        return status;
    }
}
