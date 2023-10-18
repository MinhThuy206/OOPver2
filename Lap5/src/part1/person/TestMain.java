package part1.person;

public class TestMain {
    public static void main(String[] args) {
        Student student = new Student("Thuy", "Hai Phong", "abc", 2002, 10);
        System.out.println("Student: " + "name=" + student.getName() + " address=" + student.getAddress() + " program=" + student.getProgram() + " year=" + student.getYear() + " fee=" + student.getFee());
        student.setProgram("def");
        System.out.println("Student: " + "name=" + student.getName() + " address=" + student.getAddress() + " program=" + student.getProgram() + " year=" + student.getYear() + " fee=" + student.getFee());
        student.setFee(5.0);
        System.out.println("Student: " + "name=" + student.getName() + " address=" + student.getAddress() + " program=" + student.getProgram() + " year=" + student.getYear() + " fee=" + student.getFee());
        student.setYear(2012);
        System.out.println("Student: " + "name=" + student.getName() + " address=" + student.getAddress() + " program=" + student.getProgram() + " year=" + student.getYear() + " fee=" + student.getFee());
        System.out.println(student);


        Staff staff = new Staff("Minh", "HANOI", "HUST", 100);
        System.out.println(staff);
        staff.setSchool("HUS");
        System.out.println(staff.getSchool());
    }
}
