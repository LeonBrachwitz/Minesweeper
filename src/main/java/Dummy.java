public class Dummy
{
    public static void main(String[] args)
    {
        System.out.println("Main Methode");
    }

    public int dummyMethode(Integer wert1, Integer wert2)
    {
        System.out.println("Trigger Build");
        return wert1 + wert2;
    }
}
