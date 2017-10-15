/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.Scanner;

/**
 *
 * @author scheb
 */
public class School {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            GPACalculator add = new GPACalculator();
            add.addClasses();
            add.calcOverallGPA();
            System.out.println(add.toString());
        } catch (Exception e) {
            System.out.println("Exception " +e +"found.  Please enter correct datatypes as specified. ");
            main(args);
        }

    }
}
