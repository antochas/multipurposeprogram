/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author a
 */
public class email {
    private String sender = "antochas90";
    private String password = "antonius2";
    private String subject="n";
    private String message="n";
//    private String recipients[];
    
    public void setSubject(String sbj){
        subject = sbj;
    }
    public void setMessage(String msg){
        message = msg;
    }
    
    public String sender(){
        return sender;
    }
    
    
    public String psswrd(){
        return password;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public String getMessage(){
        return message;
    }


    
}
