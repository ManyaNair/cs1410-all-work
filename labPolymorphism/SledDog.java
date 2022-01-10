package labPolymorphism;
/**
 * 
 * @author manya
 * extension of dog
 * tells the dog it's action of the pulling the sled if called
 */
public class SledDog extends Dog
{
    public SledDog(String b)
    {
        super(b);
    }

    public void pullSled()
    {
        System.out.println("pulling the sled");
    }
}
