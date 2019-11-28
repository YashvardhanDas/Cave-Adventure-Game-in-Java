
public class PretendTreasure extends AdventureLevel {

    private Treasure secondTreasure;

    public PretendTreasure(String location, String task, Treasure treasure, Monster monster, Treasure secondTreasure)
    {
        super(location, task, treasure, monster);
        this.secondTreasure = secondTreasure;
    }

    public void printOptions()
    {
        if(this.isMonsterAlive())
        {
            if(this.isTreasurePicked() == false)
            {
                System.out.println("\nYou have entered the " + this.getLocation() + ". What would you like to do? \n");
                System.out.println("1) Attack the " + this.getMonsterName() +  " and " + this.getTask() +"\n");
                System.out.println("2) Pick up the " + this.getTreasureName() + "\n");
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
                System.out.println("\nYou have entered the " + this.getLocation() + ". What would you like to do? \n");
                System.out.println("\n1) Attack the " + this.getMonsterName() +  " and " + this.getTask() +"\n");
                System.out.println("2) Pick up the " + this.secondTreasure.getDescription() + "\n");
                int n = -1;

                n = Helper.numericalInputs(2);

                if(n == 1)
                {
                    this.killMonster();
                }
                if(n == 2)
                {
                    this.penance();
                }
            }
        }
        else
        {
            //Monster is dead
            if(this.isTreasurePicked() == false)
            {
                System.out.println("\nYou slayed the " + this.getMonsterName() + " and are sill alive, what would you like to do?\n");
                System.out.println("1) Move on to the next adventure \n");
                System.out.println("2) Pick up the " + this.getTreasureName() + "\n");
                int n = Helper.numericalInputs(2);

                if(n == 1)
                {
                    this.setAdventureDone();
                }
                if(n==2)
                {
                    this.pickTreasure();
                    this.setAdventureDone();
                }
            }

            else
            {
                System.out.println("\nYou slayed the " + this.getMonsterName() + " and are sill alive, what would you like to do?\n");
                System.out.println("1) Move on to the next adventure \n");
                System.out.println("2) Pick up the " + this.secondTreasure.getDescription() + "\n");
                int n = Helper.numericalInputs(2);

                if(n == 1)
                {
                    this.setAdventureDone();
                }
                if(n==2)
                {
                    this.pickTreasure();
                }
            }
        }
    }
}
