package ie.tudublin;

public class Cat extends Animal
{
    private int numLives = 9;

    public void setNumLives(int lives)
    {
        this.numLives = lives;
    }
    public int getNumLives()
    {
        return numLives;
    }

    public int kill(){


        int livesleft = numLives;
        livesleft = livesleft - 1;
        setNumLives(livesleft);

        if (livesleft != 0){
            System.out.println("Ouch "+ livesleft);
        }
        else if (livesleft == 0){
            System.out.println("Dead "+ livesleft);
        }
        else{
            System.out.println("Well Dead");
        }

        return livesleft;
    }

    public void speak()
    {
        System.out.println("Meow!");
    }
}