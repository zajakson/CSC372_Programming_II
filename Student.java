
// Student class to represent each student's data
class Student {
    private String name;
    private String address;
    private double gpa;

    // Constructor to initialize Student object
    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    // Getters and setters for student data
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getGpa() {
        return gpa;
    }

    // Formatted output for student_list.txt
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", GPA: " + gpa;
    }
}