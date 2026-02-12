class universityp {

    String universityName = "ABC University";
    String location = "Delhi";

    class Department {

        String deptName = "Computer Science";
        String hodName = "Dr. Sharma";

        void display() {
            System.out.println(universityName + ", " + location);
            System.out.println(deptName + ", " + hodName);
        }
    }

    public static void main(String[] args) {

        universityp u = new universityp();
        universityp.Department d = u.new Department();

        d.display();
    }
}
