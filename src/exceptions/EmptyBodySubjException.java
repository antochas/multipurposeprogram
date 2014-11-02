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
public class EmptyBodySubjException extends Exception{
    


      public EmptyBodySubjException() {}


      public EmptyBodySubjException(String message)
      {
         super(message);
      }
}
