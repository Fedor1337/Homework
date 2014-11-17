Блок 3.
package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 17.11.2014.
 */
public class End {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ac.next();
        }
        sort(arr);
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }

    public static String[] sort(String[] arr2) {
        for (int i = arr2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr2[j].compareTo(arr2[j + 1]) > 0) {
                    String tmp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = tmp;
                }
            }
        }
        return arr2;
    }
}
Блок 3.
package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 10.11.2014.
 */
public class lal {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 1; i < arr.length ; i++) {
            arr[i] = ac.next();
        }
    }
}
Блок.1
package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 17.11.2014.
 */
public class Arrr {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int[] arr = new int[20];
        int min = arr[0];
        int max= arr[20];
        for (int i = 0; i < arr.length; i++) {

            if (min < arr[i]){
            }
            min=arr[i];
            if (max > arr[i]){
            }
            max=arr[i];
            arr[i]=ac.nextInt();
        }
        System.out.println(min);
    }

}
Блок.1
package com.company;

import java.util.Scanner;

public class Loop{
        public static void main(String[] args) {
            Scanner ac = new Scanner(System.in);
            String[] arr = new String[2];
            int a = ac.nextInt();
            int b = ac.nextInt();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ac.next();
            }
            if (a > b){
            System.out.println(max is + arr[a]);    
            }
            if (b>a){
                System.out.println(max is + arr[b]);
            }
    }
}
