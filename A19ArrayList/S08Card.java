public class S08Card {
    private double value_;
    private String name_;
    private int numSet_;
    private String condition_;
    
    public S08Card (String name, String condition, double value, int numSet) {
        name_ = name;
        condition_ = condition;
        value_ = value;
        numSet_ = numSet;
    }

    public String getName(){
        return name_;
    }
    
    public String getCondition(){
        return condition_;
    }
    
    public double getValue(){
        return value_;
    }
    
    public int getSetNum(){
        return numSet_;
    }

}
