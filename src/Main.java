import java.io.File;

public class Main {
   FileWork fileWork;
   Operations operations;

    public Main(String streetNames, String fileNames, String fileToWrite) {
        this.fileWork = new FileWork(streetNames, fileNames);
        this.operations = new Operations(fileWork, fileToWrite);
    }

    public static void main(String[] args){
     String fileName = "C:\\Users\\bagiy\\Desktop\\StreetNames.txt";
     String docNames = "C:\\Users\\bagiy\\Desktop\\readiVoc\\req";
     String fileToWrite = "C:\\Users\\bagiy\\Desktop\\num.txt";

        Main main = new Main(fileName,docNames,fileToWrite);
//        File filePaths = main.fileWork.fileNames;

//        main.operations.writeArraytoFile(main.operations.modifyStringForStreetNames());
//        main.operations.printArraytoConsole(main.fileWork.getPathofFiles(filePaths,32));
//        main.operations.printArraytoConsole(main.operations.modifyStringForNumbers("100-200"));
//        main.operations.printArraytoConsole(main.operations.modifyStringForStreetNames());
        main.operations.writeArraytoFile(main.operations.modifyStringForNumbers("100-200"));

    }
}
