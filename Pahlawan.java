
package game;

public class Pahlawan {
    String name;
    int speed, healthPoin,damage,armor; 
    void run() {
        System.out.println(name + " is running...");
        System.out.println("speed: " + speed);
    }
     void defence() {
        System.out.println(name + " is defending...");
        System.out.println("armor: " + armor);
     }
      void attack() {
        System.out.println(name + " is attack");
        System.out.println("damage: " + damage);
     }
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }

    

}
