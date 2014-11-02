/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exceptions.NoRecepients;

/**
 *
 * @author a
 */
public class EmptyRecepients {
    private boolean result;
    
    public boolean checkRecepients(int recCount) throws NoRecepients{
        if(recCount>0){
            result = true;
            return result;
        }
        else{
            NoRecepients e = new NoRecepients();
            throw e;
        }
    }
}
