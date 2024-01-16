package game;

public class Player {

    String name;
    int speed, healthPoin,damage,armor; //variabel global

    void run() {
        System.out.println(name + " is running...");
        System.out.println("speed: " + speed);
    }
     void defence() {
        System.out.println(name + " is defending...");
        System.out.println("armor: " + armor);
     }
      void attack(String a) {
        System.out.println(name + " is attack"+a);
        System.out.println("damage: " + damage);
     }
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }

    
    }
