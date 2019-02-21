public class GiraffeTwo extends Animal
{
    public GiraffeTwo(int age, boolean isMale, String name, double weight)
    {
        super(age,isMale,name,weight);
    }
    //Override
        public String getName()
    {
        // put your code here
        return "Not Melman";
    }
 
    public String toString()
    {
        return getName() + " is " + getAge() + " years old, and is a " + getGender() + " who weighs " + getWeight()+ ". "+ getName() +" is " + Main.COLOR;
    }
}
