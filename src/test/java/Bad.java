import java.util.logging.Logger;
import java.util.logging.Level;

public class Bad { // Nazwa klasy musi pasować do nazwy pliku!

    // Używamy profesjonalnego loggera zamiast System.out.println
    private static final Logger logger = Logger.getLogger(Bad.class.getName());

    public static void main(String[] args) {
        logger.info("Start aplikacji...");

        int number = 10;
        int divisor = 2; // Zmieniliśmy 0 na 2, żeby program miał sens

        // Zabezpieczenie przed dzieleniem przez zero (Reliability: A)
        if (divisor != 0) {
            int result = number / divisor;
            logger.log(Level.INFO, "Wynik dzielenia: {0}", result);
        } else {
            logger.warning("Nie można dzielić przez zero!");
        }

        // Usunęliśmy zahardkodowane hasło (Security: A)
        // Usunęliśmy puste metody i nieużywane zmienne (Maintainability: A)
    }
}
