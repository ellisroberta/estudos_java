//Entrada de dados e formatação e casas decimais

/** import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
} **/

//Do While

/** import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        
        sc.close();
    }
} **/

// Exercícios While

/** import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha de 4 dígitos: ");
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("*** SENHA INVÁLIDA ***");
            System.out.print("Repita a senha de 4 dígitos: ");
            senha = sc.nextInt();
        }

        System.out.println("*** ACESSO PERMITIDO! ***");

        sc.close();
    }
} **/

/** import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ponto X: ");
        int x = sc.nextInt();
        System.out.print("Digite o ponto Y: ");
        int y = sc.nextInt();

        while (x !=0 && y !=0){
            if (x>0 && y>0){
                System.out.println("Esse ponto pertence ao primeiro quadrante");
            } else if (x<0 && y>0){
                System.out.println("Esse ponto pertence ao segundo quadrante");
            } else if (x<0 && y<0){
                System.out.println("Esse ponto pertence ao terceiro quadrante");
            } else{
                System.out.println("Esse ponto pertence ao quarto quadrante");
            }

            System.out.print("Digite outro ponto X: ");
            x= sc.nextInt();

            System.out.print("Digite outro ponto Y: ");
            y= sc.nextInt();
        }

        sc.close();
    }
} **/

/** import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu combustível preferido?" +
                " 1. Álcool " +
                " 2. Gasolina " +
                " 3. Diesel" );

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            }
            else if (tipo == 2) {
                gasolina = gasolina + 1;
            }
            else if (tipo == 3) {
                diesel = diesel + 1;
            }

            System.out.println("Qual é o seu combustível preferido?" +
                    " 1. Álcool " +
                    " 2.Gasolina " +
                    " 3.Diesel" );
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
} **/

// Exercícios For

/** import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++){
            if (i % 2 != 0){
                System.out.println("O número " + i + " é ímpar");
            }
        }

        sc.close();
    }
} **/

/** import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int N = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i=0; i<N; i++){

            System.out.print("Digite um número inteiro: ");
            int x = sc.nextInt();
            if (10 <= x && x <= 20){
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
} **/

/** import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int N = sc.nextInt();


        for (int i=0; i<N; i++){

            System.out.print("Digite três números reais com uma casa decimal: ");

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("A média é:  %.1f%n", media);

        }

        sc.close();
    }
} **/

/** import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = sc.nextInt();


        for (int i=0; i<N; i++){

            System.out.print("Digite dois números: ");

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0){
                System.out.println("Divisão impossível");
            } else {
                double divisao = (double) a / b;
                System.out.printf("A divisao é:  %.1f%n", divisao);
            }

        }

        sc.close();
    }
} **/

/** import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = sc.nextInt();

        int fat = 1;

        for (int i=1; i<=N; i++) {
            fat = fat * i;
        }

        System.out.println("O fatorial é: " + fat);

        sc.close();
    }
} **/

/** import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = sc.nextInt();


        for (int i=1; i<=N; i++) {
            if (N % i == 0){
                System.out.println(i);
            }
        }

        System.out.println("Esses são os divisores do número digitado");

        sc.close();
    }
} **/

/** import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = sc.nextInt();


        for (int i=1; i<=N; i++) {

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
} **/

//String

/** public class Main {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }
} **/

import java.util.Scanner;

/**public class Main {
    public static void main(String[] args) {
        String s = "potato apple lemon";

        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
} **/

//Funções

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher = max(a, b, c);
        showResult(higher);
        sc.close();
    }
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}