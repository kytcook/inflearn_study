package com.eunmi.myspace;

import java.util.Scanner;

public class test2 {
     void star(int n, int m){
        if(0 < n && n < 1000 && 0 < m && m < 1000)
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++) {
                	System.out.print("*");
                }
                System.out.println();
            }
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		int n = sc.nextInt();
    		int m = sc.nextInt();
    		new test2().star(n, m);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
        
    }
}