public class Operacoes {

    public void adicao(Integer numberOne, Integer numberTwo){
        Integer soma = numberOne + numberTwo;
        System.out.println(numberOne +  " + " + numberTwo + " = " + soma);
    }

    public void subtracao(Integer numberOne, Integer numberTwo){
        Integer subtracao = numberOne - numberTwo;
        System.out.println(numberOne + " - " + numberTwo + " = " + subtracao);
    }
  
    public void multiplicacao(Integer numberOne, Integer numberTwo){
        Integer multiplicacao = numberOne * numberTwo; 
        System.out.println(numberOne + " * " + numberTwo + " = " + multiplicacao);
    }

    public void divisao(Integer numberOne, Integer numberTwo){
        Integer divisao = numberOne / numberTwo;
        System.out.println(numberOne + " / " + numberTwo + " = " + divisao);
    }
}
