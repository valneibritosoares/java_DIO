public class Operadores {
    public static void main(String[] args) {
        String nomeUm, nomeDois, nomeTres; 
        int n, a, b;
        n = 3;
        System.out.println(n);
        n = - n;
        System.out.println(n);
        n = + (-n);
        System.out.println(++n);
       
        a = 5;
        b = 8;
        boolean t = a != b ? true : false;
        boolean c = a == b;
        System.out.println(t);
        System.out.println(c);
        System.out.println(++n + " , " + t);

        nomeUm = "Paulo";
        nomeDois = "Paulo";
        nomeTres = new String("Paulo");
        boolean r = nomeUm == nomeDois;
        System.out.println("NomeUm é igual a NomeDois (" + r + ")");
        boolean r2 = nomeUm == nomeTres;
        System.out.println("NomeUm é igual a NomeTres (" + r2 + ")");
        System.out.println("NomeUm é igual a NomeTres (" + nomeUm.equals(nomeTres) + ")");

        if (r && r2) {
            System.out.println("É Verdadeiro");
        } else {
            System.out.println("É Falso");
        }
        if (r || r2) {
            System.out.println("É Verdadeiro");
        } else {
            System.out.println("É Falso");
        }
     }
}
