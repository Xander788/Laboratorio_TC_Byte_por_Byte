/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victims;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author oscar
 */
public class victim extends person {
    private String id;
    private String name;
    private LocalDate birthday;
    private String gender;
    private String address;

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }
    public static String convertir(String id){
        int num = id.hashCode();
        String idt = Integer.toString(num);
        return idt;
    }
    public static String convertir2(String name){
        int num = name.hashCode();
        String namet = Integer.toString(num);
        return namet;
    }

    public String getId() {
        return convertir(id);
    }
    
    
    public static int calculateAge(LocalDate birthday){
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public victim(String id, String name, LocalDate birthday, String gender, String address, String phone, String email) {
        super(id, name, phone, email);
        this.id = convertir(id);
        this.name = convertir2(name);
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Victim{"+"name"+name+ "birthday=" + birthday + ", gender=" + gender + ", phone=" + phone + ", address=" + address + '}';
    }
    
}
