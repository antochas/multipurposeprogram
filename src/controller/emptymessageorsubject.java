/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import exceptions.EmptyBodySubjException;

/**
 *
 * @author a
 */
public class emptymessageorsubject {
    private boolean result;
    
    public boolean checkMessageandSubject(String msg, String sbj) throws EmptyBodySubjException{
        if("".equals(msg) || "".equals(sbj)){
            EmptyBodySubjException e = new EmptyBodySubjException();
            throw e;
        }
        else{
            result = true;
            return result;
        }
    }
}
