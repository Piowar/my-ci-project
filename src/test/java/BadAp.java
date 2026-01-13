public class BadApp {

    // 1. SECURITY HOTSPOT: Zahardkodowane hasło
    // SonarQube natychmiast to wykryje jako zagrożenie bezpieczeństwa.
    private static final String MY_PASSWORD = "superSecretPassword123";

    public static void main(String[] args) {
        // 2. CODE SMELL: Używanie System.out zamiast loggera
        System.out.println("Starting application...");

        // 3. BUG: Potencjalny NullPointerException
        String text = null;
        if (text != null && text.length() > 0) {
            System.out.println("Text exists");
        } else {
            // Celowy błąd logiczny
            test(null); 
        }
        
        // 4. CODE SMELL: Zakomentowany kod
        // int x = 5; 
        // System.out.println(x);
    }

    public static void test(String input) {
        // 5. BUG / CODE SMELL: Pusty blok catch (połykanie wyjątków)
        try {
            int result = 10 / 0; 
        } catch (Exception e) {
            // Ignorowanie błędu - SonarQube tego nienawidzi
        }
    }

    // 6. CODE SMELL: Nieużywana metoda prywatna
    private void unusedMethod() {
        int i = 0;
        // 7. BUG: Nieskończona pętla lub bezsensowny warunek
        while (i == 0) {
            i++; 
            break; 
        }
    }
}
