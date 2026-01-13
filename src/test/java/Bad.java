public class Bad { // Nazwa klasy musi pasować do nazwy pliku (Bad.java)

    // 1. SECURITY HOTSPOT: Hasło wpisane na sztywno
    private static final String HARDCODED_PASSWORD = "mySuperSecretPassword123";

    public static void main(String[] args) {
        // 2. CODE SMELL: Użycie System.out zamiast Loggera
        System.out.println("Start aplikacji...");

        int a = 10;
        int b = 0;

        // 3. BUG: Dzielenie przez zero
        // SonarQube powinien to wykryć jako błąd krytyczny (Reliability)
        if (true) {
            int result = a / b;
            System.out.println("Wynik: " + result);
        }

        // 4. CODE SMELL: Nieużywana zmienna
        int unusedVariable = 123;
    }
    
    // 5. CODE SMELL: Pusta metoda
    public void emptyMethod() {
    }
}
