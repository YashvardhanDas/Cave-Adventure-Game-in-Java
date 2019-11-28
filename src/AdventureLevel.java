import java.util.Random;

public class AdventureLevel {
    private String location;
    private String task;
    private Monster monster;
    private Treasure treasure;
    private Boolean treasurePicked;
    private Boolean taskDone;
    private Boolean adventureDone;

    private final String TwelveDaysOfChristmas = "\nOn the first day of Christmas\n" +
            "My true love gave to me\n" +
            "A partridge in a pear tree\n" +
            "On the second day of Christmas\n" +
            "My true love gave to me\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree\n" +
            "On the third day of Christmas\n" +
            "My true love gave to me\n" +
            "Three French hens\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree\n" +
            "On the fourth day of Christmas\n" +
            "My true love gave to me\n" +
            "Four calling birds\n" +
            "Three French hens\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree\n" +
            "On the fifth day of Christmas\n" +
            "My true love gave to me\n" +
            "Five gold rings\n" +
            "Four calling birds\n" +
            "Three French hens\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree\n" +
            "On the sixth day of Christmas\n" +
            "My true love gave to me\n" +
            "Six geese a laying\n" +
            "Five gold rings\n" +
            "Four calling birds\n" +
            "Three French hens\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree\n" +
            "On the seventh day of Christmas\n" +
            "My true love gave to me\n" +
            "Seven swans a swimming\n" +
            "Six geese a laying\n" +
            "Five gold rings\n" +
            "Four calling birds\n" +
            "Three French hens\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree\n" +
            "On the eighth day of Christmas\n" +
            "My true love gave to me\n" +
            "Eight maids a milking\n" +
            "Seven swans a swimming\n" +
            "Six geese a laying\n" +
            "Five gold rings\n" +
            "Four calling birds\n" +
            "Three French hens\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree\n" +
            "On the ninth day of Christmas\n" +
            "Me me me me me me\n" +
            "Nine ladies dancing\n" +
            "Eight maids a milking\n" +
            "Seven swans a swimming\n" +
            "Six geese a laying\n" +
            "Five gold rings, badam-pam-pam\n" +
            "Four calling birds\n" +
            "Three French hens\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree\n" +
            "On the tenth day of Christmas\n" +
            "My true love gave to me\n" +
            "Ten lords a leaping\n" +
            "Nine ladies dancing\n" +
            "Eight maids a milking\n" +
            "Seven swans a swimming\n" +
            "Six geese a laying\n" +
            "Five gold rings, badam-pam-pam\n" +
            "Four calling birds\n" +
            "Three French hens\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree\n" +
            "On the eleventh day of Christmas\n" +
            "My true love gave to me\n" +
            "Eleven pipers piping\n" +
            "Ten lords a leaping\n" +
            "Nine ladies dancing\n" +
            "Eight maids a milking\n" +
            "Seven swans a swimming\n" +
            "Six geese a laying\n" +
            "Five gold rings, badam-pam-pam\n" +
            "Four calling birds\n" +
            "Three French hens\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree\n" +
            "On the twelfth day of Christmas\n" +
            "My true love gave to me\n" +
            "12 drummers drumming\n" +
            "Eleven pipers piping\n" +
            "Ten lords a leaping\n" +
            "Nine ladies dancing\n" +
            "Eight maids a milking\n" +
            "Seven swans a swimming\n" +
            "Six geese a laying\n" +
            "Five gold rings, badam-pam-pam\n" +
            "Four calling birds\n" +
            "Three French hens\n" +
            "Two turtle doves\n" +
            "And a partridge in a pear tree";

    protected void penance()
    {
        int penanceChoice = Helper.getRandomNumber(2);
        if(penanceChoice == 0)
        {
            System.out.println("\nYour penance is to sing the Twelve Days of Christmas");
            System.out.println(this.TwelveDaysOfChristmas);
        }

        else
        {
            System.out.println("\nYour penance is to perform 5 math equations");
            for(int i=0; i<5; i++)
            {
                System.out.println("\nEquation " + i +": ");
                int x = Helper.getRandomNumber(10);
                int y = Helper.getRandomNumber(10);
                System.out.println(x + "+" + y + "= ?");
                int result = -1;
                while(result!=(x+y))
                {
                    result = Helper.numericalInputs(1000);
                    if(result != (x+y))
                    {
                        System.out.println("\nYour input is incorrect!!");
                    }
                }
            }
        }
    }

    protected void snooze()
    {
        Animal animals[] = new Animal[4];
        animals[0] = new Animal("cow", "moo");
        animals[1] = new Animal("sheep", "baa");
        animals[2] = new Animal("pig", "oink");
        animals[3] = new Animal("chicken", "cluck");
        animals = this.shuffleArray(animals);

        String song = "";

        for(int i=0; i<4; i++)
        {
            song = song + "\nOld Macdonald had a farm, E-I-E-I-O\nAnd on his farm he had a " + animals[i].getName() + ", E-I-E-I-O \n" +
                    "With a " + animals[i].getSound() + "-" + animals[i].getSound()+" here and a " + animals[i].getSound() + "-" + animals[i].getSound() + " there \n"+
                    "Here a " + animals[i].getSound() + " there a " + animals[i].getSound() +"\n"+
                    "Everywhere a " + animals[i].getSound() + "-" + animals[i].getSound() + "\nOld Macdonald had a farm, E-I-E-I-O\n\n";
        }

        System.out.println(song);
    }

    protected void pickTreasure()
    {
        if(this.monster.isAlive())
        {
            System.out.println("\nYou have picked up the " + this.treasure.getDescription() + ", now go rest before continuing the mission");
            this.treasurePicked = true;
            this.snooze();
            System.out.println("Great! You are awake and rested.");
        }

        else
        {
            System.out.println("You have picked up the " + treasure.getDescription()+" and are still alive, you can move on to your next Adventure!");
        }

    }

    protected Animal[] shuffleArray(Animal[] array)
    {
        int index;
        Animal temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public AdventureLevel(String location, String task, Treasure treasure, Monster monster)
    {
        this.task = task;
        this.location = location;
        this.treasure = treasure;
        this.monster = monster;
        this.treasurePicked = false;
        this.adventureDone = false;
    }

    public String getLocation() {
        return this.location;
    }

    public void setAdventureDone()
    {
        this.adventureDone = true;
    }

    public String getTask()
    {
        return this.task;
    }

    public Boolean isMonsterAlive()
    {
        return this.monster.isAlive();
    }

    public Boolean isTreasurePicked()
    {
        return this.treasurePicked;
    }

    public String getMonsterName()
    {
        return this.monster.getName();
    }

    public String getTreasureName()
    {
        return this.treasure.getDescription();
    }
    public Boolean isAdventureDone()
    {
        return this.adventureDone;
    }

    public void killMonster()
    {
        this.monster.slay();
    }




    public void playAdventure()
    {
        if(this.isMonsterAlive())
        {
            if(this.treasurePicked == false)
            {
                System.out.println("\nYou have entered the " + this.location + ". What would you like to do? \n");
                System.out.println("1) Attack the " + this.getMonsterName() + " and " + this.task + "\n");
                System.out.println("2) Pick up the " + this.treasure.getDescription() + "\n");
                int n = Helper.numericalInputs(2);

                if(n == 1)
                {
                    this.killMonster();
                }
                if(n==2)
                {
                    this.pickTreasure();
                }

            }
            else
            {
                System.out.println("What would you like to do?");
                System.out.println("\n1) Attack the " + this.getMonsterName() +  " and " + this.task +"\n");

                int n = Helper.numericalInputs(1);

                if(n == 1)
                {
                    this.killMonster();
                }
                else
                {
                    System.out.println("You are a hero....do not bow done in the face of fear!! Try again...\n");
                }
            }
        }

        else
        {
            //Monster is dead
            if(this.treasurePicked == false)
            {
                System.out.println("\nYou slayed the " + this.getMonsterName() + " and are sill alive, what would you like to do?\n");
                System.out.println("1) Move on to the next adventure \n");
                System.out.println("2) Pick up the " + this.getTreasureName() + "\n");
                int n = Helper.numericalInputs(2);

                if(n == 1)
                {
                    this.adventureDone = true;
                }
                if(n==2)
                {
                    this.pickTreasure();
                    this.adventureDone = true;
                }
            }

            else
            {
                System.out.println("You slayed the " + this.getMonsterName() + " and are sill alive, you can move on to the next Adventure!!\n\n");
                this.adventureDone = true;
            }
        }
    }
}
