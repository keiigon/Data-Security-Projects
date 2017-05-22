package rsa.project;

import java.util.Scanner;

public class RSAProject {

    public static void main(String[] args) {
        RSA rsa = new RSA();
        Scanner sc = new Scanner(System.in);
        String teststring;
        System.out.println("Enter the plain text:");
        teststring = sc.next();
        
        System.out.println("Encrypting String: " + teststring);
        
        System.out.println("String in Bytes: " + RSA.bytesToString(teststring.getBytes()));
        
        // encrypt
        byte[] encrypted = rsa.encrypt(teststring.getBytes());
        // decrypt
        byte[] decrypted = rsa.decrypt(encrypted);
        System.out.println("Decrypting Bytes: " + RSA.bytesToString(decrypted));
        System.out.println("Decrypted String: " + new String(decrypted));
    }
    
}
