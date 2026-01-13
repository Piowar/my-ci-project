public class Bad {  // <--- Upewnij się, że ta nazwa pasuje do nazwy pliku!

    // 1. SECURITY HOTSPOT
    private static final String MY_PASSWORD = "superSecretPassword123";

    public static void main(String[] args) {
        // 2. CODE SMELL
        System.out.println("Starting application...");

        int a = 10;
        int b = 0; // 3. BUG: Dzielenie przez zero

        // To wywoła błąd Reliability w SonarQube
        int result = a / b; 

        System.out.println("Wynik: " + result);
    }
}

