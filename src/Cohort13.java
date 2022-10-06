public class Cohort13 {

    private String firstName;
    private String lastName;
    private String otherName;
    private double height;
    private String color;
    private double weight;

    public Cohort13(String firstName, String lastName, String otherName){
        this.lastName = lastName;
        this.otherName = otherName;
    }

    public Cohort13(String firstName, String lastName, String otherName, double height, String color, double weight){
        this.lastName = lastName;
        this.otherName = otherName;
        this.height = height;
        this.color = color;
        this.weight = weight;
    }

    public Cohort13(){
    }

    public void setName(String firstName){
        this.firstName = firstName;
    }

    public void setName(String firstName, String lastName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getOtherName(){
        return otherName;
    }
    public String getColor(){
        return color;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }


}
