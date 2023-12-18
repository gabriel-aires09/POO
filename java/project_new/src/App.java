

public class App {
    public static void main(String[] args) throws Exception {
        int numero = 10;
        double numero_float = 10.5;
        System.out.println(numero + numero_float);
        String java ="oi, como vai voce";

        System.out.println(java);
        //int indice = java.indexOf("e");
        
        //String novoTexto = java.replace("i", "CARAI");

        String str1 = "hello";
        String str2 = "hello";

        boolean equalsTo = str1.equals(str2);

        if (equalsTo == true) {
            System.out.println("São iguais");
        }else {
            System.out.println("São diferentes");

        };

        String maisculo = "VALERIA";
        String minusculo = "xvaleria";

        if (maisculo.equalsIgnoreCase(minusculo)) {
            System.out.println(String.format("%s e %s são iguais", maisculo, minusculo));
        } else {
            System.out.println(String.format("%s e %s são diferentes", maisculo, minusculo));
        }

        String numerostr = "123";
        Double pi = 3.14;

        int converter_inteiro = Integer.parseInt(numerostr);
        System.out.println(converter_inteiro);

        String converter_double = Double.toString(pi);
        System.out.println(converter_double);

        
        // find the type of obj
        Object obj = 1;
        System.out.println("type = " + obj.getClass().getName());

        if (obj instanceof String) {
            System.out.println("String");
        } else {
            System.out.println("Not a string");
        }

        String textao = " Spaces    Notok  ";

        System.out.println(textao.trim());

        // for (int i = 1; i < 10; ++i){
        //     System.out.println(i);
        // }
    }
}
