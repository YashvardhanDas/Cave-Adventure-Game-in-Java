public class Treasure {
    private String description;
    private Boolean real;

    public Treasure(String description, Boolean real)
    {
        this.description = description;
        this.real = real;
    }

    public Boolean isReal()
    {
        return real;
    }

    public String getDescription()
    {
        return this.description;
    }

}
