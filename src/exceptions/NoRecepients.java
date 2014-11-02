/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author a
 */
public class NoRecepients extends Exception{
    


      public NoRecepients() {}


      public NoRecepients(String message)
      {
         super(message);
      }
}