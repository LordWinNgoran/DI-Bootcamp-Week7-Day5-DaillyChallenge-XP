//Daily Challenge : Password Generator
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Java Password Generator
 * Date : 10/02/2023
 */

// class Main call the Question of the Game
package main.password.generator;

public class Main {
    public static void main(String[] args) {
        //Test with Passay Library
        System.out.println(new Validator().generatePasswordWithPassyLibrary());

        //Test with Apache Common Text Library
        System.out.println(new Validator().generatePasswordWithApachCommonTextLibrary());
    }
}