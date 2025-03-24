public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        byte numero1 = 100;
        short  numero2=numero1;
        numero1 = (byte) numero2;
        System.out.println(numero1);
    }
}