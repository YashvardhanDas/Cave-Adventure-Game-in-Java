import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class FinalMission {
    private String poem;
    private Villager villagers[];
    private int villagerCount;
    private Hashtable<String, Boolean> h;

    public FinalMission()
    {
        this.villagerCount = Helper.getRandomNumber(100);
        this.villagers = new Villager[100];
        this.h = new Hashtable<String, Boolean>();
        this.poem = "";

    }

    public void randomizeVillagers()
    {
        int index;
        Villager temp;
        Random random = new Random();
        for (int j = this.villagerCount - 1; j > -1; j--)
        {
            index = random.nextInt(j + 1);
            temp = this.villagers[index];
            this.villagers[index] = this.villagers[j];
            this.villagers[j] = temp;
        }
    }

    public void playFinalMission()
    {

        Scanner sc = new Scanner(System.in);
        String s;

        for(int i=0; i<this.villagerCount; i++)
        {
            System.out.println("Village Idiot #" + i + ", what is your special word?");
            s = sc.nextLine();
            if(h.containsKey(s))
            {
                System.out.println("You have entered a duplicate speacial word!!! The goblins have destroyed the village!!!");
                System.out.println("GAME OVER!!!");
                return;
            }

            else
            {
                this.h.put(s, true);
                villagers[i] = new Villager(s);
            }
        }
        this.randomizeVillagers();
        this.setPoem();
        this.printpoem();
    }

    public void setPoem()
    {
        for(int i=0; i<this.villagerCount; i++)
        {
            this.poem = this.poem + " " + this.villagers[i].getSpecialWord();
        }
    }

    public void printpoem()
    {
        System.out.println("\n\nPOEM : \n" + this.poem);
        System.out.println("\n\n GAME OVER!!! YOU WON!!!");
    }
}