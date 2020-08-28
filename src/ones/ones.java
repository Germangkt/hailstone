/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class ones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        ArrayList<String> entrada=new ArrayList<String>();
        ArrayList<Long> numeros=new ArrayList<Long>();
        BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        String linea=null;
        while( (linea=b1.readLine())!=null && linea.length() > 0)
        {
        entrada.add(linea);
        }

        //numeros
          for(int pos=0;pos<entrada.size();pos++)
          {
           try//convertir a enteros
           {
               long num=Long.parseLong(entrada.get(pos));
               if(num > 0 && num <10000)
               numeros.add(num);
               else
                System.out.println("numero" + num +" invalido");
           }
           catch(NumberFormatException e)
           {continue;
           }
          }
 ArrayList<Long> multiplos=new ArrayList<Long>();
 ArrayList<Long> multiplos1=new ArrayList<Long>();
 //crear multiplos co unos
for(int i=0;i<=15;i++)
  {
  double otro=0;
  for(int j=0;j<=i;j++)
  {double mas=Math.pow(10, j);
      otro += 1 * mas;
  }
  multiplos1.add((long)otro);
}
 System.out.println("los unos");
for(int i=0;i<multiplos1.size();i++)
{System.out.println(multiplos1.get(i));
}
 System.out.println("los unos fin");
//realizar operaciones
/*    for(int pos=0;pos<numeros.size();pos++)
          {
         long n=numeros.get(pos);

         if(n%2 != 0 || n%5 != 0 )//divisible entro 2 y 5
           {
           continue;
           }
        else
          {
        //sacar todos los multiplos del numero
             for(int i =0;i<Integer.MAX_VALUE;i++)
                {
                 long multiplo=n * i;
                 multiplos.add(multiplo);
                }
            //ver cuales se pueden expresar como unos 1 *10 1 + 1*10 2 ...


          }


          } 
*/
        //mostrar
 double oo=1111111111111111d;
 System.out.println("do"+oo);
 long o=(long)oo;
 System.out.println("lo"+o);
        System.out.println("entrada");
        for(int pos=0;pos<entrada.size();pos++)
          {
           System.out.println(entrada.get(pos));
          }
 //mostrar numeros
        System.out.println("doble"+Double.MAX_VALUE);
        System.out.println("long"+Long.MAX_VALUE+"ams"+Integer.MAX_VALUE+"min"+Integer.MIN_VALUE);
        System.out.println("numeros");
        for(int pos=0;pos<numeros.size();pos++)
          {
           System.out.println(numeros.get(pos));
          }

        }

}
