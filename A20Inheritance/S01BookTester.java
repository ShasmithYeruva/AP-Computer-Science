/* TODO: 01
For this activity, you are going to refactor the Book superclass and the 
S01Encyclopedia and S01Mystery subclasses.

Right now, the S01Book class is empty and the S01Encyclopedia and S01Mystery 
classes have instance variables and getter and setter methods. Your task is 
to move common attributes and methods to the Book superclass and remove them 
from the subclasses.

Note: You do not need a constructor in any class.
 */
public class S01BookTester
{
    public static void main(String[] args)
    {
        S01Mystery oneIsLying = new S01Mystery();
        
        oneIsLying.setPages(374);
        oneIsLying.setTitle("One of Us Is Lying");
        oneIsLying.setAuthor("Karen M. McManu");
        oneIsLying.setSubgenre("Crime Mystery");
        
        
        S01Encyclopedia britannica = new S01Encyclopedia();
        britannica.setPages(1009);
        britannica.setTitle("Original Encyclopedia Britannica, Vol. 3");
        britannica.setArticles(30);
        britannica.setStartLetter("C");
        britannica.setEndLetter("L");
        
        
        System.out.println(oneIsLying.getTitle());
        System.out.println(britannica.getTitle());
    }
}