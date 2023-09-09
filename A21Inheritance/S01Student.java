public class S01Student extends S01Person {
    private int grade;

    public S01Student(String name, int grade)
    {
        super(name);
        this.grade = grade;
    }

    public void printGrade(){
        System.out.print("Grade: " + grade);
    }

}
