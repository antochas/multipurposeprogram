/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exceptions.InvalidEmailException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author a
 */
public class emailAddressCheck {
    
    private boolean result;
    
    public emailAddressCheck(){
        this.result = false;
    }
    
    public boolean checkaddress(String address) throws InvalidEmailException{
        
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(address);

        if(mat.matches()){
            result = true;
            return result;
        }
        else{

           InvalidEmailException e = new InvalidEmailException();
           throw e;
        }
        
       
    }
}
