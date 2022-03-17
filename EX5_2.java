public class EX5_2 {
    public static void main(String[]args) {
        java.util.Scanner leitor = new java.util.Scanner (System.in);

    long numero;
    System.out.printf ("Qual o número\n");
    numero = leitor.nextLong();
    //if encadeado
    if ((numero >= 1) && (numero <= 12)) {
        if (numero==1)
        System.out.printf ("31 dias ");
        else if (numero==2)
        System.out.printf ("28 dias "); 
        if (numero==3)
        System.out.printf ("31 dias ");
        if (numero==4)
        System.out.printf ("30 dias "); 
        if (numero==5)
        System.out.printf ("31 dias "); 
        if (numero==6)
        System.out.printf ("30 dias "); 
        if (numero==7)
        System.out.printf ("31 dias "); 
        if (numero==8)
        System.out.printf ("31 dias "); 
        if (numero==9)
        System.out.printf ("30 dias ");
        if (numero==10)
        System.out.printf ("31 dias ");  
        if (numero==11)
        System.out.printf ("30 dias "); 
        if (numero==12)
        System.out.printf ("31 dias ");     
    }
    else
           System.out.printf ("número inválido");   
    leitor.close();  

    }
    
}  


    