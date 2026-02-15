public class StringExample {

    public static void main(String[] args) {

        // 1st way
        String name = "Rama";
        System.out.println("Name (1st way): " + name);

        // 2nd way
        String newname = new String("Gopal");
        System.out.println("Name (2nd way): " + newname);

        // 3rd way
        char st[] = {'a','b','c'};
        String str = new String(st);
        System.out.println("Name (3rd way): " + str);

        // Demonstrations
        changeCase(str);
        System.out.println("Reversed (without function): " + reverseString(str));
        System.out.println("Reversed (using function): " + revString(str));
    }

    // i) Change the case of the string
    static String changeCase(String str) {
        String result = str.toUpperCase();
        System.out.println("The changed string is " + result);
        return result;
    }

    // ii) Reverse the string without using built-in reverse function
    static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // iii) Reverse using StringBuffer function
    static String revString(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}
