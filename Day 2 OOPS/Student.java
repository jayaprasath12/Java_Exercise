public class Student {    //used class
//encapsulation 
    private int studentID; //used access modifier
    private int age;// used private to restrict access from outside class
    public String name;
//constructor for student details
    public Student(int studentID, int age, String name) {
        this.studentID = studentID;  
        this.age = age;              
        this.name = name;            
    }
//method is used to dispaly the details
    public void displayInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Student Age: " + this.age);
    }
//method to update the age
    public void updateAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
            System.out.println("Age updated successfully!");
        } else {
            System.out.println("Invalid age! Please enter a valid age.");
        }
    }
//method to update name
    public void updateName(String newName) {
        this.name = newName;
        System.out.println("Name updated successfully!");
    }
//used getter method to get StudentID since its private 
    public int getStudentID() {
        return this.studentID;
    }
    public void setStudentID(int newID) { //setter method to change ID
        if (newID > 0) {
            this.studentID = newID;
            System.out.println("Student ID updated successfully!");
        } else {
            System.out.println("Invalid ID! Please enter a valid ID.");
        }
    }
//main method to run code
    public static void main(String[] args) {
//new object created
        Student student1 = new Student(1, 17, "Prag");

        System.out.println("Student 1 Info:");
        student1.displayInfo();
        System.out.println();

        student1.updateAge(19);
        student1.displayInfo();
        System.out.println();

        student1.updateName("Praggnanantha");
        student1.displayInfo();
        System.out.println();

        student1.setStudentID(2);
        System.out.println("New Student ID: " + student1.getStudentID());
        System.out.println();

        student1.updateAge(-5);//to show using invalid values 
    }
}
