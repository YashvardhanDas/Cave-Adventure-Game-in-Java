public class Monster {
    private String Name;
    private Boolean alive;

    public Monster(String name)
    {
        this.Name = name;
        this.alive = true;
    }

    public Boolean isAlive()
    {
        return this.alive;
    }

    public String getName()
    {
        return this.Name;
    }

    public Boolean slay()
    {
        if(this.alive == true)
        {
            this.alive = false;
        }

        else
        {
            return false;
        }

        return true;//Slaying was successful
    }

}
