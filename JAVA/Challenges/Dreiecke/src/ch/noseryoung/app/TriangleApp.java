package ch.noseryoung.app;

import java.util.Scanner;
import ch.noseryoung.exceptions.*;

public class TriangleApp {

    private boolean isRunning = true;
    private String sideAInput, sideBInput, sideCInput, code;
    private double sideA, sideB, sideC;
    Scanner sc = new Scanner(System.in);

    public void start() {
        printHeader();
        while (isRunning) {
            System.out.println("TEST CASES TRIANGLE\n");
            System.out.println("Cathetus A:");
            sideAInput = promptSide();
            System.out.println("Cathetus B:");
            sideBInput = promptSide();
            System.out.println("Hypotenuse C:");
            sideCInput = promptSide();

            try {
                validateInput();
                code = determineTriangleType();
            } catch (TriangleException e) {
                code = e.getMessage();
            } finally {
                printResult();
                promptAction();
            }
        }
    }

    private void printHeader() {
        System.out.println("************************************************");
        System.out.println("TRIANGLE EVALUATOR");
        System.out.println("************************************************");
        String company = "Noser Young";
        System.out.println("COMPANY:" + company + ", 2023");
        String handler = "Aurora";
        System.out.println("HANDLER:" + handler);
        System.out.println("************************************************\n");

    }

    private void printResult() {
        System.out.println("---------------------------------------------");
        System.out.println("CODE: \t\t\t\t" + code);
        System.out.println("---------------------------------------------\n");
    }

    private String promptSide() {
        return sc.nextLine();
    }

    private void promptAction() {
        String action = "";
        while (isRunning) {
            System.out.println("q: quit");
            System.out.println("c: continue");
            action = sc.next();

            if (action.equals("q")) {
                isRunning = false;
            } else if (action.equals("c")) {
                TriangleApp TA = new TriangleApp();
                TA.start();
                System.out.println("******************************");
                sc.nextLine();
            }
        }
    }

    private void validateInput() throws TriangleException {
        // validate sideAInput, sideBInput, sideCInput as double
        try {
            sideA = Double.parseDouble(sideAInput);
            sideB = Double.parseDouble(sideBInput);
            sideC = Double.parseDouble(sideCInput);
        } catch (Exception e) {
            throw new IllegalTriangleSideException();
        }
        if (sideA == 0 || sideB == 0 || sideC == 0) {
            throw new ZeroTriangleSideException();
        } else if (sideA < 0 || sideB < 0 || sideC < 0) {
            throw new NegativeTriangleSideException();
        } else if (sideA + sideB < sideC) {
            throw new ImpossibleTriangleException();
        } else if (sideA + sideB == sideC) {
            throw new TriangleIsLineException();
        }
    }

    private String determineTriangleType() {
        if (sideA == sideB && sideA != sideC || sideA == sideC && sideA != sideB || sideB == sideC && sideB != sideA) {
            code = "TRI84TF";
        } else if (sideA == sideB && sideA == sideC) {
            code = "TRI66TF";

        } else if ((sideA * sideA) + (sideB * sideB) == sideC * sideC) {
                code = "TRI72TF";
        } else if (sideA != sideB && sideA != sideC) {
            code = "TRI60TF";
        }
        return code;
    }
}

