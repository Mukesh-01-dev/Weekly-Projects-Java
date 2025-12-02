public class Student {
    int id;
    String name;
    int age;
    String course;
    float marks;

    Student(int id, String name, int age, String course, float marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //Java old version support.
        sb.append("ID: ").append(id).append(", Name: ").append(name).append(", Age: ").append(age).append(", Course: ")
                .append(course).append(", Marks: ").append(String.format("%.2f", marks));
        return sb.toString();
    }
}