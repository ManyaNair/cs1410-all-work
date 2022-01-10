package labPolymorphism;
/**
 * 
 * @author manya
 * creates a new dog and tells it how to communicate, move, and assigns its breed
 *
 */
public class Dog
{
    private final String breed;

    public Dog(String b)
    {
        breed = b;
    }

    public void communicate()
    {
        System.out.println("bark bark");
    }

    public void move()
    {
        System.out.println("run");
    }

    public String getBreed()
    {
        return breed;
    }
    @Override
    public String toString()
    {
    	// TODO Auto-generated method stub
    	
    	return String.format(this.getClass().getSimpleName() + ": " + breed);
    }
}
