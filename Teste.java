public class Teste {
    public static void main(string[]args) {Scanner scanner = new Scanner(system.in);

        System.out.print("insira o primeiro n�mero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("insira o segundo n�mero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("insira o terceiro n�mero: ");
        double numero3 = scanner.nextDouble();

        double maior = Math.max(numero1, Math.max(numero2, numero3));

        double menor = Math.min(numero1, Math.min(numero2, numero3));

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("O maior: " + maior);
        System.out.println("O menor: " + menor);
        System.out.println("A m�dia aritm�tica: " + media);

        scanner.close();
        
    }
}