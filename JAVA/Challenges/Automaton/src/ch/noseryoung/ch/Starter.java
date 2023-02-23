package ch.noseryoung.ch;


import ch.noseryoung.blj.Automaton;

public class Starter {
    public static void main(String[] args) {
        Automaton automaton = new Automaton(90, "0".repeat(1000) + "1" + "0".repeat(1000));
        automaton.run(automaton.getCurrentGeneration().length());
        new AutomatonRenderer(automaton, 1);
    }
}
