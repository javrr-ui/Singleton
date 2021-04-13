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
public class DbSingleton {
    
    private static DbSingleton instance = new DbSingleton();
    
    private DbSingleton(){
        
    }
    
    public static DbSingleton getInstance(){
        return instance;
    }
}