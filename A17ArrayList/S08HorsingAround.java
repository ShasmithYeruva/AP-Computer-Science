import java.util.ArrayList;


public class S08HorsingAround
{
    public static int totalWidth(ArrayList<S08Animal> animals)
    {
        int width = 0;
        
        for(int i = 0; i < animals.size(); i++) {
        	width += animals.get(i).getWidth();
        }

        return width;
    }

    public static S08Animal tallestAnimal(ArrayList<S08Animal> animals)
    {
        S08Animal tallest = animals.get(0);
        
        for(int i = 0; i < animals.size(); i++) {
            if(animals.get(i).getHeight() > tallest.getHeight()) {
            	tallest = animals.get(i);
            }
        }
        
        return tallest;
    }

    public static int countYourChickens(ArrayList<S08Animal> animals)
    {
        int numOfChickens = 0;
        
        for(int i = 0; i < animals.size(); i++) {
            if(animals.get(i).getName().equals("chicken")) {
            	numOfChickens++;
            }
        }
        
        return numOfChickens;
    }

    public static ArrayList<String> inventory(ArrayList<S08Animal> animals)
    {
        ArrayList<String> zoo = new ArrayList<String>();
        
        for(int i = 0; i < animals.size(); i++) {
            zoo.add(animals.get(i).getName());
        }
        
        return zoo;
    }
public static void pestControl(ArrayList<S08Animal> animals)
    {
        int size = animals.size();
        
        for(int i = 0; i < size; i++) {
            if(animals.get(i).getName().equals("mouse")) {
                animals.remove(i);
                i--;
                size--;
            }
        }
    }

    public static void horsingAround(ArrayList<S08Animal> animals)
    {
        int size = animals.size();
        
        for(int i = 0; i < size; i++) {
            animals.add(i, new S08Animal("horse"));
            
            size++;
            i++;
        }
        animals.add(new S08Animal("horse"));
    }

    public static void feelingSheepish(ArrayList<S08Animal> animals)
    {
    	int size = animals.size();
        S08Animal[] otherlist = new S08Animal[size];
        otherlist = animals.toArray(otherlist);
        
        for(int i = 0; i < otherlist.length; i++) {
            if(i == 0 && otherlist[i].getName().equals("sheep")) {
                animals.set(i + 1, new S08Animal("sheep"));
            }
            
            else if(i == animals.size() - 1 && otherlist[i].getName().equals("sheep")) {
                animals.set(i - 1, new S08Animal("sheep"));
            }
            
            else if(otherlist[i].getName().equals("sheep")) {
                animals.set(i - 1, new S08Animal("sheep"));
                animals.set(i + 1, new S08Animal("sheep"));
            }
        }
    }
}