import java.util.Scanner;

public class Person {
    private int age;

    public Person(int initialAge) {

        if(initialAge<0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else
            age = initialAge;
        // Add some more code to run some checks on initialAge

        amIOld();
        yearPasses();
        yearPasses();
        yearPasses();
        amIOld();
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if(age < 13)
            System.out.println("You are young.");


        else if(age>=13 && age<18)
            System.out.println("You are a teenager.");

        else
            System.out.println("You are old.");
    }

    public void yearPasses() {
        age++;
        // Increment this person's age.
    }
    public static void main(String args[])
    {
        int T,age,i;
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        if (T >=1 && T <=4)
        {
            for (i=1;i<=T;i++)
            {
                age = in.nextInt();

                if (age >=-5 && age <=30)
                {
                    Person  p1=new Person(age);
                }
                System.out.println();



            }
        }
        in.close();

    }
}
