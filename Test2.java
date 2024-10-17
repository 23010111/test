/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wavhu
 */
public class Test2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(findProductIndex ());
        
    }
    public static int findProductIndex (){
 Scanner obj = new Scanner(System.in) ;
 System.out.print("Input product Id: ");
int productId = obj.nextInt();
int[] productIDs = {104,105,106,107,101,102,103};
    return Arrays.binarySearch(productIDs, productId); 
    }
    
}
    
    

