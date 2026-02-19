package mypack;
class University {

    String universityName;
    String location;

    class Department {
        String deptName;
        String hodName;

        void display() {
            System.out.println("University: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department: " + deptName);
            System.out.println("HOD: " + hodName);
        }
    }

    public static void main(String[] args) {

        University u = new University();
        u.universityName = "ABC University";
        u.location = "Delhi";

        University.Department d = u.new Department();
        d.deptName = "Computer Science";
        d.hodName = "Dr. Sharma";

        d.display();
    }
}
