public class Bad { 

    // 1. SECURITY HOTSPOT: Hasło wpisane na sztywno
    // SonarQube wykryje to jako zagrożenie bezpieczeństwa (Security Rating E)
    private static final String HARDCODED_PASSWORD = "mySuperSecretPassword123";

    public static void main(String[] args) {
        // 2. CODE SMELL: Użycie System.out zamiast Loggera
        System.out.println("Start aplikacji...");

        int a = 10;
        int b = 0;

        // 3. BUG: Dzielenie przez zero
        // SonarQube wykryje to jako błąd krytyczny (Reliability Rating D/E)
        if (true) {
            int result = a / b;
            System.out.println("Wynik: " + result);
        }

        // 4. CODE SMELL: Nieużywana zmienna
        int unusedVariable = 123;
        
        // 5. CODE SMELL: Zakomentowany kod
        // int x = 1;
    }
    
    // 6. CODE SMELL: Pusta metoda
    public void emptyMethod() {
    }
}
