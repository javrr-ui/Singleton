/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Javi
 */
public class DbSingletonDemo {
    
    public static void main(String[] args) {
        
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);
        
        DbSingleton instance2 = DbSingleton.getInstance();
        System.out.println(instance2);
        
    }
}
