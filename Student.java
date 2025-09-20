public class Student {
    private String name;
    private int id;
    private double gpa;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}