public class TestingParameters {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        swap(s1, s2);
        System.out.println("First student: " + s1.getName());
        System.out.println("Second student: " + s2.getName());
    }
    public static void swap(Student st1, Student st2) {
        String tmpName = st1.getName();
        st1.setName(st2.getName());
        st2.setName(tmpName);
    }
}