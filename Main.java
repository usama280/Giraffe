public class Main
{
    public static final String COLOR = "Yellow with brown polka-dots";  
    public static void main(String[] args)
    {
        int age = 21;
        boolean isMale = true;
        String name = "Melman";
        double weight = (double)(Math.random()*1600.0 + 600.0);
        
        Giraffe giraffe = new Giraffe();
        GiraffeTwo giraffe2 = new GiraffeTwo(age,isMale,name,weight);
        
        giraffe.setAge(age);
        giraffe.setGender(isMale);
        giraffe.setWeight(weight);
        giraffe.setName(name);

        System.out.println("Giraffe Class");
        System.out.println("Output: " + giraffe + "\n");

        System.out.println("GiraffeTwo Class");
        System.out.println("Output: " + giraffe2);
    }
}
