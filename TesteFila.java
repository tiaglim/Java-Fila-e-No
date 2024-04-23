
import java.util.Random;

public class TesteFila {
    /**
     * @param args
     */

    
    public static void main(String[] args) {
        
        Random random = new Random();
        Fila f = new Fila();
        int contpar = 0;
        int contimpar = 0;

        
        for(int i =0;i<10;i++)
        {
            if (i % 2 != 0){
                f.enfileira(random.nextInt(10));
               f.enfileira(i);
               i = contpar;
                contpar ++;
                }
                else{
           contimpar++; 
      {
         System.out.println(f);
        System.out.println("Numeros Positivos: "+contpar);
        System.out.println("Numeros Negativos: "+contimpar);
       }
    }
}
    }
}



   

    
        

    
      
