import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

    //     System.out.print("Digite a senha: ");
    //     String password = input.next();

    //     boolean encontrarNumeros = false;
    //     for (int i = 0; i < password.length(); i++) {
    //         char c = password.charAt(i);
    //         if (Character.isDigit(c)) {
    //             encontrarNumeros = true;
    //             break;
    //         }
    //     }

    //     if (password.length() >= 8 && encontrarNumeros) {
    //         System.out.println("Access granted");  
    //     } else{
    //         System.out.println("Senha invalida");
    //     }

    // // Atividade 2
    //     String[] nomes = {"Gabriel", "João", "Mauricio"};
    //     for (String i : nomes) {
    //         System.out.println(i.charAt(0));
    //     }

    // Atividade 3
 
        // System.out.print("Digite seu email: ");
        // String email = input.next();

        // if (email.contains("@")) {
        //     System.out.println("Email valido");
        // } else {
        //     System.out.println("Email invalido");
        // }

    // Atividade 4

        System.out.print("Digite uma frase: ");
        String frase = input.nextLine(); // se der problema, coloque next()
        int contarVogais = 0;
        frase.toLowerCase();
        for (int i = 0; i < frase.length(); ++i){
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contarVogais++;
            }
        }
        System.out.println("Numero de vogais: " + contarVogais);
        input.close();
    }
}
