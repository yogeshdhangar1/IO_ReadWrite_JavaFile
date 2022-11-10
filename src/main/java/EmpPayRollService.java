import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmpPayRollService {
   public void ReadData() throws IOException {
       List<String> lines = Files.readAllLines(Paths.get("C:\\IntelliJ workplace\\File_IO_WatchService\\PayRoll.txt"));
       for(String line:lines){
           System.out.println(line);
       }
   }
    public void writeData() throws IOException {
        ArrayList<String> data = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the id");
        data.add(sc.next());
        System.out.println("Ente the Name");
        data.add(sc.next());
        System.out.println("Ente the Salary");
        data.add(sc.next());
        Files.write(Paths.get("C:\\IntelliJ workplace\\File_IO_WatchService\\PayRoll.txt"),data, StandardOpenOption.CREATE);
    }
    public static void main(String[] args) throws IOException {
        EmpPayRollService obj = new EmpPayRollService();
      obj.ReadData();
        obj.writeData();
    }
    }
