import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.nio.file.StandardWatchEventKinds.*;

public class EmpPayRollService {
    public void listFilesDirectory() throws IOException, InterruptedException  {
        ArrayList<String> writing = new ArrayList<String>();

        writing.add("Id : 111");
        writing.add("Name : Yogesh");
        writing.add("Salary : 150000");
//		File Exist => Override
        // Will create new file if not exist
        Files.write(Paths.get("C:\\intallije workplace\\File_IO_WatchService\\Test1.txt"), writing, StandardOpenOption.CREATE);
        System.out.println("The Writing is done.......");

        List<String> line=	Files.readAllLines(Paths.get("C:\\intallije workplace\\File_IO_WatchService\\Test1.txt"));
        for(String lines:line) {
            System.out.println(lines);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        EmpPayRollService obj = new EmpPayRollService();
        obj.listFilesDirectory();
    }
}
