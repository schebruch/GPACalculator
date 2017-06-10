package school;

import java.util.ArrayList;
import java.util.Scanner;

/*
General Idea:

Have the user input grades and credit hours into a list (done in "setGradeAndCreditArrayList").
Convert number (semester grades) into letter grades and make a String letter grade array (done in "set letterGradeArray").
Convert letter grades to GPA Number (ex: A = 4.0).  Store these in GPANumber array.  Done in setGPAScaleArray.
Calculate total quality points (which is the sum of each credit hour times the GPA number).  Done in "calcQualityPoints".
Calculate total credit hours by summing each credit hour in the creditHours array.  Done in "calcTotalCreditHrs".
Calculate GPA by dividing total quality points by total credit hours.  Done in "calcGPA".

Also note I did not take into account overall GPA for now, just semester GPA.  I also assumed the user correctly
inputs every entry thus far.
 */
///////////CLASS//////////////
public class GPACalculator {

    private ArrayList<Class> classes;
    private double semesterGPA; //GPA this semester
    private double overallGPA;

    //Constructor
    public GPACalculator() {
        classes = new ArrayList<>();
    }

    //Prompts user to enter all grade this semester (assuming at most 6 classes).
    public void addClasses() {
        Scanner scan = new Scanner(System.in); //declare scanner object
            try {
                System.out.print("How many classes did you take this semester?: ");
                int numClasses = scan.nextInt();
                int count = 1;
                while (count <= numClasses) {
                    System.out.print("For class " + count + ", how many credit hours was the course?: ");
                    double numCreditHours = scan.nextDouble();
                    System.out.print("For class " + count + ", what was the numerical grade you earned?: ");
                    double numericalGrade = scan.nextDouble();
                    Class class_ = new Class(numCreditHours, numericalGrade);
                    classes.add(class_);
                    count++;
                }
                System.out.println("Classes added to list");

            } catch (Exception e) {
                System.out.println("Exception found in askForInput() method! " + e);
                System.out.println("Please enter the proper datatype of the variable (i.e. int, double, String): ");
                System.out.println();
                addClasses();
            }    
    }

    public double calcGPA() {
        double sumCreditHr = 0;
        double sumGPATimesCreditHr = 0;
        for (int i = 0; i < classes.size(); i++) {
            double creditHrs = classes.get(i).getCreditHours();
            double GPATimesCreditHr = classes.get(i).getCreditHours() * classes.get(i).getGPA();
            GPATimesCreditHr += sumGPATimesCreditHr;
            sumGPATimesCreditHr = GPATimesCreditHr;
            creditHrs += sumCreditHr;
            sumCreditHr = creditHrs;
        }
        double GPA = sumGPATimesCreditHr / sumCreditHr;
        this.semesterGPA = GPA;
        return GPA;
    }

    public void calcOverallGPA() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many semesters have you taken so far, including this semester?: ");
        int numSemesters = scan.nextInt();
        int count = 1;
        double sum =0;
        double totalSemesterGPA = 0;
        while(count<numSemesters){
            System.out.println("What is your GPA of semeseter "+count+"? ");
            totalSemesterGPA =scan.nextDouble();
            totalSemesterGPA += sum;
            sum = totalSemesterGPA;           
            ++count;
        }
        double overallGPA = (totalSemesterGPA + calcGPA()) / numSemesters;
        this.overallGPA = overallGPA;
    }

    @Override
    public String toString() {
        return "Your semester GPA is " + semesterGPA + " and your overall GPA is " + overallGPA+".";
    }
}
