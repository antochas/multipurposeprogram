package exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author a
 */
public class InvalidEmailException extends Exception{
    


      public InvalidEmailException() {}


      public InvalidEmailException(String message)
      {
         super(message);
      }
}
