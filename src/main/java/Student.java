public class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public int compareTo(Student anotherStudent) {
        //return this.id - anotherStudent.id;
        return this.name.compareTo(anotherStudent.name);
    }

    @Override
    public String toString() {
        return "(" + id + ", " + name + ")";

    }
}
