package Controller;

import Common.Algorithm;
import Common.Validation;
import Model.Element;
import View.Menu;

public class Program extends Menu<String> {
    static String [] mainChoice = {"Input elemnet","Sort Ascending","Sort Descending","Exit"};
    protected Algorithm a;
    protected Element e;

    public Program(){
        super("========== Bubble Sort Program ==========", mainChoice);
        a = new Algorithm();
        e = new Element();
    }

    public void execute(int n){
        switch (n){
            case 1:{
                e.setSize(Validation.getInt("Input length of array: "));
                e.setA(Validation.getArray(e.getSize()));
                break;
            }
            case 2:{
                a.bubbleSortAscending(e.getA());
                break;
            }
            case 3:{
                a.bubbleSortDescending(e.getA());
                break;
            }
            case 4:{
                System.exit(0);
            }
        }
    }
}
