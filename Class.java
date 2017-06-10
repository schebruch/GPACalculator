/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author scheb
 */
public class Class {

    ////////////////////Fields////////////////////////
    private double creditHours;
    private double numericalGrade;
    private double GPANumber;
    ///////////////////Constructor//////////////////
    public Class(double creditHours, double numericalGrade) {
        this.creditHours = creditHours;
        this.numericalGrade = numericalGrade;

        if (numericalGrade >= 93) {
            GPANumber = 4.0;
        } else if (numericalGrade >= 90 && numericalGrade < 93) {
            GPANumber = 3.7;
        } else if (numericalGrade < 90 && numericalGrade >= 87) {
            GPANumber = 3.3;
        } else if (numericalGrade < 87 && numericalGrade >= 84) {
            GPANumber = 3.0;
        } else if (numericalGrade >= 80 && numericalGrade < 84) {
            GPANumber = 2.7;
        } else if (numericalGrade <= 79 && numericalGrade >= 77) {
            GPANumber = 2.3;
        } else if (numericalGrade < 77 && numericalGrade >= 74) {
            GPANumber = 2.0;
        } else if (numericalGrade < 74 && numericalGrade >= 70) {
            GPANumber = 1.7;
        } else if (numericalGrade < 70 && numericalGrade >= 67) {
            GPANumber = 1.3;
        } else if (numericalGrade < 67 && numericalGrade >= 64) {
            GPANumber = 1.0;
        } else if (numericalGrade >= 60 && numericalGrade < 64) {
            GPANumber = 0.7;
        } else {
            GPANumber = 0.0;
        }
    }

    /////////////////////Methods/////////////////////////
    public double getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int hours) {
        creditHours = hours;
    }

    public double getNumericalGrade() {
        return numericalGrade;
    }

    public void setNumericalGrade(double grade) {
        numericalGrade = grade;
    }

    public double getGPA() {
        return GPANumber;
    }

    public void setGPA(double GPA) {
        GPANumber = GPA;
    }
}
