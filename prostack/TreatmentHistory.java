package prostack;

import java.util.Stack;

public class TreatmentHistory {
    Stack<String> hh = new Stack<>();
    //each obj will be a string in the stack

    //adding treatment
    public void addTreatment(String treat) {
        hh.push(treat);
    }

    //to know the last treatment
    public String addTreatment() {
        return hh.isEmpty() ? "There is no treatment" : hh.peek(); //without removing
    }

    public String getLastTreatment() {
        return hh.isEmpty() ? "There is no treatment" : hh.peek();
    }
    
    //display doesnt return a value
    public void displayHistory() {
        if (hh.isEmpty()) {
            System.out.println("There is no treatment history.");
        } else {
            System.out.println("The treatment history is: " + hh);
        }
    }
}