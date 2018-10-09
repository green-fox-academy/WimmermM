public class Student extends Person implements Cloneable{


    String previousOrganization;
    int skippedDays;


    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
//        this.skippedDays = skippedDays;
    }

    public Student() {

        previousOrganization = "The School of Life";
        name = "Jon Doe";
        age = 30;
        gender = "female";
        skippedDays = 0;

    }

    @Override
    public String toString() {
        return name;
    }


    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already. ");
    }

    public void skipDays(int numberOfDays) {

        skippedDays = numberOfDays;

    }


    public Object clone(){

        return new Student(this.name,this.age,this.gender,this.previousOrganization);
    }

}