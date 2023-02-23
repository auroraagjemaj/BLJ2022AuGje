package ch.noseryoung.blj;

import java.io.FileReader;
import java.io.*;
import java.util.*;

public class TextFileAnalyzer {

    private int totNumWords = 0;
    static File textfile = new File("src/ch/noseryoung/blj/script.txt");
    ArrayList<String> scriptWords = new ArrayList<>();
    HashMap<String, Integer> listOfWords = new HashMap<>();
    BufferedReader bure;
    String word = "";


    public void textFileReader() throws FileNotFoundException {
        FileReader script = new FileReader(textfile);
        bure = new BufferedReader(script);
    }

    private void arraylist() throws IOException {
        String line;
        while ((line = bure.readLine()) != null) {
            if (!line.equals("")) {
                line = line.toLowerCase().replaceAll("[!\\-,.?]", "");
                ArrayList<String> wordList = new ArrayList<>(Arrays.asList(line.split(" ")));

                wordList.remove("");
                scriptWords.addAll(wordList);
            }
        }
    }

    private void totWords() throws FileNotFoundException {
        Scanner myObj = new Scanner(textfile);
        while (myObj.hasNextLine()) {
            myObj.next();
            totNumWords++;
        }

    }

    private void getUniqueWordCountInFile() {
        int i = 0;
        for (String o : scriptWords) {
            i++;
            listOfWords.put(o, i);
        }
        Set<Object> sameValues = new HashSet<>(listOfWords.values());
        System.out.println("Number of unique words:\t\t\t\t\t" +"[ "+ sameValues.size()+ " ]");
    }
    private void mostCommonWord() {
        int count, maxNum = 0;

        for (int i = 0; i < scriptWords.size(); i++) {
            count = 1;
            for (int j = i + 1; j < scriptWords.size(); j++) {
                if (scriptWords.get(i).equals(scriptWords.get(j))) {
                    count++;
                }
            }
            if (count > maxNum) {
                maxNum = count;
                word = scriptWords.get(i);
            }
        }
        }

        public void start() throws IOException {
        Calendar calendar = Calendar.getInstance();
        System.out.println("[ "+ calendar.getTime() + " ]\t\t"+"[ "+ "script.txt ]");
        System.out.println("-----------------------------------------------------------------");
        textFileReader();
        arraylist();
        totWords();
        System.out.println("Total number of words:\t\t\t\t\t" +"[ "+ totNumWords + " ]");
        getUniqueWordCountInFile();
        mostCommonWord();
        System.out.println("Most common word:\t\t\t\t\t\t" +"[ "+ word+ "  ]");
        System.out.println("-----------------------------------------------------------------");


    }
    }











