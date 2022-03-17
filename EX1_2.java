public class EX1_2 {
    public static void main(String[]args) {
        java.util.Scanner leitor = new java.util.Scanner (System.in);

    long numero;
    System.out.printf ("Qual o numero");
    numero = leitor.nextLong();
    //if encadeado
        if (numero == 0)
        System.out.printf ("NEUTRO");
        else if (numero > 0)
        System.out.printf ("POSITIVO");   
        else 
       System.out.printf ("NEGATIVO");    
    leitor.close();  

    }
    
}
