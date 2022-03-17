import java.util.*; 
    public class EX3_2 {
        public static  void main(Double[]args){
                Scanner leitor = new Scanner (System.in);
                System.out.println("Digite um valor 1\n");
                double valor1 = leitor.nextInt();
                System.out.println("Digite um valor 2\n");
                double valor2 = leitor.nextInt();
                System.out.println("Digite um valor 3\n");
                double valor3 = leitor.nextInt();
                
                if ((valor1 > valor2) && (valor1 > valor3)) {
                    System.out.printf (
                        " %f ",
                        valor1
                    );
                }
                else if ((valor2 > valor1) && (valor2 > valor3)) {
                    System.out.printf (
                        " %f ",
                        valor2
                    );
                }    
                else if ((valor3 > valor1) && (valor3 > valor2)) {      
                    System.out.printf (
                        " %f ",
                        valor3 
                    );
                } 
                leitor.close();  
            
        } 
    }  
