//Search  or  create  three  interfaces  in  the  java  and  make  a  test  program  to  check  these interfaces.

interface Hit{
    public void hit(double h);
}
interface Level{
    public void level(double l);
}
interface Health{
    public void health(double h);
}
class Player implements Hit,Level,Health{
    Double HealthBar,HitPower,SkillLevel;
    public void hit(double h){
        this.HitPower = h;
    }
    public void level(double l){
        this.SkillLevel = l;
    }
    public void health(double h){
        this.HealthBar = h;
    }
    void Display(){
        System.out.println("Player Health: "+HealthBar+" Player Skill Level: "+SkillLevel+" Player Hit Power: "+ HitPower);
    }
}

public class Game{
    public static void main(String []args){
        Player player = new Player();
        player.health(100);
        player.level(5);
        player.hit(50);
        player.Display();
    }
}
