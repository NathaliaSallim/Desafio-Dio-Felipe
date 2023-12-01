import java.util.Locale;
import java.util.Scanner;

public class classificadorHeroi {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Herói: ");        
        String nomeHeroi = sc.next();
        System.out.println("Digite a quantidade de XP: ");
        double xp = sc.nextDouble();
        String nivel = new String();

        if (xp >= 0.0 && xp <= 1.000) {
            nivel = "Ferro";
        }
        else if (xp <= 2.000) {
            nivel = "Bronze";
        }
        else if (xp <= 5.000) {
            nivel = "Prata";
        }
        else if (xp <= 7.000) {
            nivel = "Ouro";
        }
        else if (xp <= 8.000) {
            nivel = "Platina";
        }
        else if (xp <= 9.000) {
            nivel = "Ascendente";
        }
        else if (xp <= 10.000) {
            nivel = "Imortal";
        }
        else {
            nivel = "Radiante";
        }
        System.out.printf("O herói de nome %s está no nível de %s", nomeHeroi, nivel);

        sc.close();
    }
}