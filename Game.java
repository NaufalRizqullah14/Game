package game;

public class Game {

    public static void main(String[] args) {
        Player hero = new Player();
        Player enemy = new Player();

        hero.name = "Ocobot";
        hero.damage = 60;
        hero.healthPoin = 100;

        enemy.name = "duren";
        enemy.speed = 20;
        enemy.damage = 10;
        enemy.armor = 5;
        enemy.healthPoin = 90;

        hero.run();
        hero.attack(enemy.name);

        if (hero.isDead()) {
            System.out.println("Game Over : (");
        }
    
    Drone Ocobot = new Drone();
    
    Ocobot.energi = 50;
    Ocobot.ketinggian = 70;
    Ocobot.kecepatan = 80;
    Ocobot.merek = "NipponPaint";
    
    Ocobot.terbang();
    Ocobot.matikanMesin();
    Ocobot.turun();
    Ocobot.belok();
    Ocobot.maju();
    Ocobot.mundur();
    
    Pahlawan boy = new Pahlawan();
    
    boy.armor = 70;
    boy.damage = 90;
    boy.healthPoin = 100;
    boy.speed = 50;
    boy.name = "boboiboy" ;
    
    boy.defence();
    boy.run();
    boy.attack();
 
   }         
}
