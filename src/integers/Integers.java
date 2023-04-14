/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * modelo para presentar un grupo de enteros
 * @author ACR
 */
public class Integers {
 ArrayList<Integer> integers;
 
  public Integers()
  {
  integers = new ArrayList<>();
  llenar();
  }
  
  private void llenar()
  {
   Random rmd=new Random();
  for(int i=0;i<10;i++) integers.add(rmd.nextInt(12));   
  }
  public void mostrarRepetidos()
  {
  HashMap<Integer,Integer> numeros_con_sus_repeticiones=new HashMap<>();    
   for(Integer numero_unico:integers)numeros_con_sus_repeticiones.put(numero_unico,contarRepetidos(numero_unico));
  
  System.out.println(numeros_con_sus_repeticiones);
  }
  
  private Integer contarRepetidos(Integer numero_unico)
  {
      int contador=0;
      for(Integer sig_numero:integers)if(Objects.equals(sig_numero, numero_unico))contador+=1;
      return contador;
  }
  
  public void mostrarIntegers()
  {
  for(Integer numero:integers)System.out.println(numero);
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Integers numeros=new Integers();
       numeros.mostrarIntegers();
       numeros.mostrarRepetidos();
    }
    
}
