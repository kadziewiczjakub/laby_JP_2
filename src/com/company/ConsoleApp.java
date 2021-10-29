package com.company;

import java.util.Scanner;

public class ConsoleApp
{
    public static void mainLoop()
    {

        Scanner in=new Scanner(System.in);
        int a=-1;
        while(true)
        {
            System.out.println("Podaj Wybor:\n1.Dodaj element do kolekcji\n2.Wypisz kolekcje\n3.usun element z wszystkich kolekcji\n4. dodaj dwa takie same elementy\n0. wyjdz z programu");
            try
            {
                a=in.nextInt();
            }catch (Exception e){
                e.printStackTrace();
                a=-1;
            }
            switch(a)
            {
                case -1:
                    System.out.println("Sprobuj jeszcze raz");
                    break;
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Collections.addElementToALlCollections();
                    break;
                case 2:
                    Collections.displayAllCollections();
                    break;
                case 3:
                    Person person=new Person();
                    Collections.removeElementFromAllCollections(person);
                    break;
                case 4:
                    Collections.addTwoElementsToAllCollections();
                    break;
                default:
                    break;
            }
        }
    }
}
