public class Bobby {
    //encapsulation
    private String name;
    private int age;
    private double coolnessFactor; //camelCase

    /*
    primitives from c/c++
    int(short, int, long), double (float), boolean, char
     */
    private final char duh= 'd';

    /**
     * Javadoc comment
     * constructor-- biuld an object of this class
     *
     */
    /**
     *
     * @param n=name
     * @param a=age
     * @param c=coolnessfactor
     */
    public  Bobby(String n, int a, double c){
        name=n;             //ASINGMENT OPERATOR -- right associative
        age=a;
        coolnessFactor=c;
    }

    //ACCESSOR METHODS
    public String getname()     {    return name;    }
    public int getAge()         {    return age;     }
    public double getCoolnessFactor() {     return coolnessFactor;      }

    public String toString()    {
        return name + "is" + age + "years old and is " + (coolnessFactor*100) + "% cool";
    }

    public static void main(String[] args) {
        Bobby b= new Bobby("methusalah", 969, 99);
        System.out.println(b);

    }
}
