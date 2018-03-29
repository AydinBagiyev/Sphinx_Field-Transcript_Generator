import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FileWork {
List<String> listPath ;
List<String> listNames;
String path;
String trimmedPath;
File streetNames;
File fileNames;

    public FileWork(String streetNames, String fileNames) {
        this.listPath = new ArrayList<String>();
        this.listNames = new ArrayList<String>();

        this.path = null;
        this.trimmedPath = null;

        this.streetNames = new File(streetNames);
        this.fileNames = new File(fileNames);

    }

    public List<String> getPathofFiles(File folder, int index) {
        for (File fileEntry : folder.listFiles()) {
            if (!fileEntry.isDirectory()) {

                path = fileEntry.getPath();
                trimmedPath = path.substring(index);
                listPath.add(trimmedPath);
                System.out.println(trimmedPath);

            } else {

                getPathofFiles(fileEntry, index);

            }
        }
        return listPath;
    }

    public List<String> getNamesofFiles(File file) {
        for (File fileEntry : file.listFiles()) {
            if (!fileEntry.isDirectory()) {

                String name = fileEntry.getName();
                listNames.add(name);

            } else {

                getNamesofFiles(fileEntry);
            }
        }
        return listNames;
    }
}
