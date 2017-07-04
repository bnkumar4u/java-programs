import java.util.*;

class Person 
{
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    // Constructor
    
    Person(String firstName, String lastName, int identification)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    // Print person data
    public void printPerson()
    {
       System.out.println( "Name: " + lastName + ", " + firstName +   "\nID: " + idNumber);
    }

}
class Student extends Person
{
	private int[] testScores;

    public Student(String firstName, String lastName, int id, int scores[])
    {
        super(firstName,lastName,id);
        // this.firstName = firstName;
        // this.lastName = lastName;
        // this.idNumber = id;
        testScores=scores;
    }

    char calculate()
    {
        int average=0;

        for(int i=0 ;i<testScores.length;i++)
        {
            average=average+testScores[i];
        }

        average=average/testScores.length;

        switch(average/10)
        {
            case 10:
            case 9:
            return 'O';

            case 8:
            return 'E';

            case 7:
            return 'A';
        }

        if(average>=55&&average<70)
            return 'P';

        if(average>=40&&average<55)
            return 'D';

        else
            return 'T';

    }

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}

public class InheritanceProb   
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++)
        {
            testScores[i] = scan.nextInt();
        }
        scan.close();
        
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}