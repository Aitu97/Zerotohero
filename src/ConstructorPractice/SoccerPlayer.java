package ConstructorPractice;

import Arrays.ScoreBoard;

public class SoccerPlayer {

    String name;
    int age;
    String nationality;
    String teamName;
    double height;
    double weight;

    public SoccerPlayer(){

    }
    public  SoccerPlayer(String sname, int sage, String snational, String steamName, double sheight, double sweight){
        name=sname;
        age=sage;
        nationality=snational;
        teamName=steamName;
        height=sheight;
        weight=sweight;
    }

    public void run(){
        System.out.println("Soccer player is running ");
    }
    public void isRunning(String name){
        System.out.println(name+" is running");
    }


    public void shoot (){
        System.out.println( "soccer player is kicking the ball ");
    }
    public void shoot(int speed){
        System.out.println(" speed of the shoot is "+speed);
    }
    public void shoot(int speed, int distance){
        shoot(speed);
        if (speed>50 && distance <25) {
            System.out.println("it is goal");
        }else {
            System.out.println("it is not goal");
        }
    }

    public static void main(String[] args) {


        SoccerPlayer sp=new SoccerPlayer(); // --> i used default contractor

        sp.name ="Ronaldo";
        sp.age=34;
        sp.nationality="Brazilian";
        sp.teamName="Juventus";
        sp.height=180.5;
        sp.weight=80.5;

        sp.run();
        sp.isRunning("Ronaldo");

        sp.shoot();
        sp.shoot(50);
        sp.shoot(60, 26 );

        SoccerPlayer player=new SoccerPlayer("Messi", 32, "Argentina", "Barselona", 5.7, 185.4);

        System.out.println(player.name);
        System.out.println(player.teamName);


        SoccerPlayer player2=new SoccerPlayer("Eden Hazard", 35, "Belgium", "Real Madrid", 5.10, 175.6);

      //  SoccerPlayer player3=new SoccerPlayer(" ")



    }
}
