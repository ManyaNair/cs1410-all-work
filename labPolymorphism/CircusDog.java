package labPolymorphism;
/**
 * 
 * @author manya
 *extension of dog
 */
public class CircusDog extends Dog
{
    public CircusDog(String b)
    {
        super(b);
    }

    @Override
    public void move()
    {
        System.out.println("tightrope walking");
    }
}
