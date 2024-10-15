package Task1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Osama Benladen", "str. Pcii 11");
        Student student = new Student("Casian Igori", "str. Zadnipru 15", "java", 1, 1500.00);
        Staff staff = new Staff("Vlad Rusu", "Hincesti 10", "Orizont", 50000.00);

        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}