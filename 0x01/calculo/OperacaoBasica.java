public class OperacaoBasica {

    public static double somar(double a, double b){
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double sqrt (double valor) {
        return Math.sqrt(valor);
    }

    public static String numero_primo(double valor) {
        if (valor <= 1) {
            return "Número invalido. Numero menor ou igual a 1 não é primo";
        }

        if (valor % 2 == 0) {
            return "Número válido, mas o numero não é primo";
        }else {
            return "Numero válido, o numero é primo";
        }
    }

}
