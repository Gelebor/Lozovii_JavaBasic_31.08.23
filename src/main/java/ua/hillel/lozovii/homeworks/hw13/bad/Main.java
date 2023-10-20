package ua.hillel.lozovii.homeworks.hw13.bad;

public class Main {
    public static void main(String[] args) {

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleWall obstacleWall = new ObstacleWall();

        ParticipantCat cat = new ParticipantCat("Cat1");
//        ParticipantDog dog = new ParticipantDog("Dog1");
        ParticipantFrog frog = new ParticipantFrog("Frog1");

        obstaclePool.start(cat);
//        obstaclePool.start(dog);
        obstaclePool.start(frog);

        obstacleWall.start(cat);
//        obstacleWall.start(dog);
        obstacleWall.start(frog);

    }
}
