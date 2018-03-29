import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Operations {
    private BufferedReader reader;
    private List<String> list;
    private List<String> modifiedList;
    private List<String> listStreetNames;
    private List<String> listFileNames;
    private List<String> listNumbersInDoc;
    private List<String> listNumbers;

    private List<String> listToWrite;
    private List<String> listAllRead;

    private FileWork filework;
    private Numbers numbers;



    private String text = null;
    private String modifiedString = null;
    private String fileToWrite = null;

    public Operations(FileWork filework, String fileToWrite) {
        this.list = new ArrayList<String>();
        this.listStreetNames = new ArrayList<String>();
        this.listNumbers = new ArrayList<String>();
        this.listNumbersInDoc = new ArrayList<>();
        this.listFileNames = new ArrayList<String>();
        this.modifiedList = new ArrayList<String>();
        this.listAllRead = new ArrayList<String>();
        this.listToWrite = new ArrayList<String>();

        this.filework = filework;
        this.fileToWrite = fileToWrite;
        this.numbers = new Numbers();


    }

    public List<String> readFile() {

        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(this.filework.streetNames), "UTF8"));

            while ((text = reader.readLine()) != null) {
                list.add(text);

            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        return list;
    }

    public List<String> modifyStringForStreetNames(){
        listStreetNames = readFile();
        listFileNames = this.filework.getNamesofFiles(this.filework.fileNames);

        try {
            for (int i = 0; i < listStreetNames.size(); i++) {
                modifiedString = "<s> " + listStreetNames.get(i) + " </s> " + "(" +(listFileNames.get(i).substring(0, listFileNames.get(i).length()-4)) + ")";
                modifiedList.add(modifiedString);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Strings cannot be modified.");
        }


        return modifiedList;
    }

    public List<String> modifyStringForNumbers(String range){
        listNumbersInDoc = this.filework.getNamesofFiles(this.filework.fileNames);
        listNumbers = numbers.modifyStringforNumber(range);

        try {
            for (int i = 0; i < listNumbers.size(); i++) {
                modifiedString = "<s> " + listNumbers.get(i) + " </s> " + "(" +(listNumbersInDoc.get(i).substring(0, listNumbersInDoc.get(i).length()-4)) + ")";
                modifiedList.add(modifiedString);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Strings cannot be modified.");
        }


        return modifiedList;
    }

    //reads file and collect it in array in order to merge with array that will be written to the file
    public List<String> readFileToWrite() {

        try {
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(this.fileToWrite), "UTF8"));

            while ((text = reader.readLine()) != null) {
                listToWrite.add(text);

            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        return listToWrite;
    }


    public void writeArraytoFile(List<String> names){
        try
        {
            this.listAllRead = readFileToWrite();
            for (String x:names) {
                listAllRead.add(x);
            }
            PrintWriter pr = new PrintWriter(this.fileToWrite);

            for (int i=0; i<listAllRead.size() ; i++)
            {
                pr.println(listAllRead.get(i));
            }
            pr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }
    }

    //Printing any list to the console
    public void printArraytoConsole(List<String> list){
        for (String x: list) {
            System.out.println(x);

        }
    }
}


