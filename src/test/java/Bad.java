public class Bad { // <--- Ta nazwa jest kluczowa! Musi pasować do nazwy pliku.

    public static void main(String[] args) {
        System.out.println("Start aplikacji...");

        int number = 10;
        int zero = 0;

        // BŁĄD KRYTYCZNY (Reliability: C)
        // SonarQube wykryje: "Fix this call that leads to a division by zero"
        int result = number / zero; 

        System.out.println("Wynik: " + result);
    }

    // Code Smell (Maintainability: A - lekkie uwagi)
    // Pusta metoda, której nikt nie używa
    public void emptyMethod() {
    }
}
