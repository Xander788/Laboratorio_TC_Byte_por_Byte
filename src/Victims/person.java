/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victims;

/**
 *
 * @author oscar
 */
public abstract class person {
    protected String id;
    protected String name;
    protected String phone;
    public static final String phoneRegex = "^[245678]\\d[7]$";
    protected String email;
    public static final String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    
    private static boolean validateEmail(String email){
        if(email.matches(emailRegex)== false){
            return false;
        }
        return true;
    }
    private static boolean validatePhone(String phone){
        if(phone.matches(phoneRegex) == false){
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public person(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
         if (validatePhone(phone)==false){
            this.phone = "invalid number";
        }else{
            this.phone = phone;
        }
         if(validateEmail(email)== false){
            this.email = "invalid email";
        }else{
            this.email = email;
        }
    }
 
}
