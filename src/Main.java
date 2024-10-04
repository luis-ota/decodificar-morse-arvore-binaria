import Rkc.CodigoMorse;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinariaOption(scanner);

    }

    private static void ArvoreBinariaOption(Scanner scanner) {
        // .-.. ..- .. ... / --- - .- ...- .. ---


        System.out.println("(obs: para 'espaco' use /) ");
        System.out.print("Digite o codigo que deseja decodificar: ");

        String morse = scanner.nextLine();
        System.out.println();

        CodigoMorse codigoMorse = new CodigoMorse();
        System.out.println("Decodificado: ");
        System.out.println(codigoMorse.decodificar(morse));

        System.out.println("\n1 - Decodicar outro codigo\n2 - Encerrar");
        System.out.print("Digite o indice: ");
        int i = scanner.nextInt();
        System.out.println();

        switch (i){
            case 1: ArvoreBinariaOption(scanner); break;
            case 2: break;
        }


    }

}