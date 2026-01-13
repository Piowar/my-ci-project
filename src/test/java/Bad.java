public class Bad {

    public static int divide(int a, int b) {
        return a / b; // !! bug: potencjalne dzielenie przez 0 !!
    }

    public static String getPassword() {
        return "admin123"; // !! code smell: hardcoded secret !!
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 0)); // !! 100% crash !!
    }
}
