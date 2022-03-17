public class EX4_2 {
    public static void main(String[]args) {
        java.util.Scanner leitor = new java.util.Scanner (System.in);

    long numero;
    System.out.printf ("Qual o número\n");
    numero = leitor.nextLong();
    //if encadeado
    if ((numero >= 1) && (numero >= 1)) {
        if (numero==1)
       System.out.printf ("Domingo");   
        else if (numero == 2)
       System.out.printf ("segunda");   
       else if (numero == 3)
       System.out.printf ("terça"); 
       else if (numero == 4)
       System.out.printf ("quarta");
       else if (numero == 5)
       System.out.printf ("quinta");
       else if (numero == 6)
       System.out.printf ("sexta");
       else if (numero == 7)
       System.out.printf ("sábado");
    }
    else
           System.out.printf ("número inválido");   
    leitor.close();  

    }
    
}  

