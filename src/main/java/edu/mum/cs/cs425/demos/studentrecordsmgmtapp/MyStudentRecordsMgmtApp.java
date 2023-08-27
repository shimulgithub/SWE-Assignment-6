package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.Model.Student;

import java.io.Console;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args)
    {
        ArrayList<Student> studentList = new ArrayList<>();

        // Adding demo data to the ArrayList
        studentList.add(new Student(110001, "Dave", LocalDate.parse("11/18/1951", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
        studentList.add(new Student(110002, "Anna",  LocalDate.parse("11/18/1951", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
        studentList.add(new Student(110003, "Erica", LocalDate.parse("11/18/1951", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
        studentList.add(new Student(110004, "Carlos",LocalDate.parse("11/18/1951", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
        studentList.add(new Student(110005, "Bop", LocalDate.parse("11/18/1999", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));

        printListOfStudents(studentList);
        getListOfPlatinumAlumniStudents(studentList);
        int[] inputArray = { 3, 5, 7, 10, 14, 15, 21, 25, 30,35 };
        printHelloWorld(inputArray);

        int[] example1 = {1, 2, 3, 4, 5};
        int[] example2 = {19, 9, 11, 0, 12};

        System.out.println("Second biggest in example1: " + findSecondBiggest(example1));
        System.out.println("Second biggest in example2: " + findSecondBiggest(example2));
    }
    public static void  printListOfStudents(ArrayList<Student> list)
    {
        for (var item : list) {
            System.out.println("Id: "+ item.getStudentId()+" " +"Name: " +item.getName()+" "+ "Admission Date : "+item.getDateOfAdmission());
        }
    }
    public static void  getListOfPlatinumAlumniStudents(ArrayList<Student> list)
    {
        int currentYear = java.time.Year.now().getValue();

        System.out.println("Platinum  Student  List :");

        for (Student item : list) {
            if (currentYear - item.getDateOfAdmission().getYear() >= 30) {

                System.out.println("Id: "+ item.getStudentId()+" " +"Name: " +item.getName()+" "+ "Admission Date : "+item.getDateOfAdmission());
            }
        }
    }
    public static void printHelloWorld(int[] numbers)
    {
        for (int number : numbers)
        {
            if (number % 5 == 0 && number % 7 == 0)
            {
                System.out.println("HelloWorld");
            }
            else if (number % 5 == 0)
            {
                System.out.println("Hello");
            }
            else if (number % 7 == 0)
            {
                System.out.println("World");
            }
            else
            {
                System.out.println( "This  is invalid  input element  of  an  array  " +number);
            }
        }
    }
    public static int findSecondBiggest(int[] numbers) {
        if (numbers == null || numbers.length < 2)
        {
            throw new IllegalArgumentException("The Array should  have at least two elements");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers)
        {
            if (number > firstMax)
            {
                secondMax = firstMax;
                firstMax = number;
            } else if (number > secondMax && number != firstMax)
            {
                secondMax = number;
            }
        }

        return secondMax;
    }
}
