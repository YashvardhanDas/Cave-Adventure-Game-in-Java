import java.util.Scanner;

public class CaveAdventureMain {
    public static void main(String [] args)
    {
        System.out.println("Brave knight!!! What is your name?");
        Scanner scanner = new Scanner(System. in);
        String name = scanner. nextLine();
        Player player = new Player(name);
        System.out.println("\nWe are in need of your help, " + player.getName() +"! \n "
                + "Our village is being overrun by the goblins of the NorthernCaves. "
                + "\nWe need you to defeat them!\n Will you accept the challenge (Y/N)?");

        char response = scanner.nextLine().charAt(0);

        while(response != 'Y' && response != 'y')
        {
            System.out.println("Please, please help up brave knight, are you ready to enter the mouth of the caves (Y/N)?");
            response = scanner.nextLine().charAt(0);
            System.out.println(response);
        }

        System.out.println("Thank You Thank You Oh brave knight!\n\n");

        //create 3 adventures
        Treasure t1 = new Treasure("Golden Sword", true);
        Monster m1 = new Monster("Evil Goblin Macel");
        AdventureLevel A1 = new AdventureLevel("Mouth of the cave", "clean up all the cob webs", t1, m1);
        Treasure t2 = new Treasure("Golden Shield", true);
        Monster m2 = new Monster("Evil Wombat Limpian");
        AdventureLevel A2 = new AdventureLevel("deeper into the cave", "turn off the water supply", t2, m2);
        Treasure t3 = new Treasure("Golden Helmet", true);
        Treasure t4 = new Treasure("Silver Tray of Life", false);
        Monster m3 = new Monster("Hobgoblin Lord DivaDon");
        PretendTreasure A3 = new PretendTreasure("depths of the cave", "perform the poetry of lifes", t3, m3, t4);


        //run first adventure and keep checking if it is finished

        while(A1.isAdventureDone() == false)
        {
            A1.playAdventure();
        }
        //run second adventure and keep checking if it is finished
        while(A2.isAdventureDone() == false)
        {
            A2.playAdventure();
        }

        //run third adventure and keep checking if it is finished
        while(A3.isAdventureDone() == false)
        {
            A3.playAdventure();
        }

        //go to final mission
        FinalMission fm = new FinalMission();
        fm.playFinalMission();
    }



}

