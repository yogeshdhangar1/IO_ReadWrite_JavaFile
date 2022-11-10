import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class TestCasesForJavaIO {
//    @Test
//    public void givenPathWhenCheckedThenConfirm() {
//        Path homePath = Paths.get("C:\\intallije workplace\\File_IO_WatchService\\PayRoll.txt");
//        Assert.assertTrue(Files.exists(homePath));
//    }
//    @Test
//    public void givenFileCheckedAreAvailable_NotIfAvailableThenDelete() throws IOException, IOException {
//        Path playPath=Paths.get("C:\\IntelliJ workplace\\File_IO_WatchService\\"+"/"+"PayRoll.txt");
//        Files.deleteIfExists(Paths.get("C:\\IntelliJ workplace\\File_IO_WatchService\\PayRoll.txt"));
//        Assert.assertTrue(Files.notExists(playPath));
//    }
//    @Test
//    public void givenPathCreateTheDirectory() throws IOException {
//        Path playPath=Paths.get("C:\\intallije workplace\\File_IO_WatchService\\"+"/"+"JavaProgram.txt");
//        Files.createDirectory(playPath);
//        Assert.assertTrue(Files.exists(playPath));
//    }
//    @Test
//    public void givenPathCreateTheFileInGivenDirectory() throws IOException {
//        Path playPath=Paths.get("C:\\intallije workplace\\File_IO_WatchService\\");
//        Path tempFile=Paths.get(playPath+"/temp"+"Demo.txt");
//        Files.createFile(tempFile);
//        Assert.assertTrue(Files.exists(tempFile));
//    }
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEnteries() throws Exception {
        List<String> somelines = new ArrayList<String>();
        somelines.add("Id : 111 , Name : Yogesh ,  Salary : 150000");
        somelines.add("Id : 112 , Name : Amol ,  Salary : 120000");
        Files.write(Paths.get("C:\\intallije workplace\\File_IO_WatchService\\Test1.txt"), somelines, StandardOpenOption.CREATE);
        EmpPayRollService obj=new EmpPayRollService();
        Assert.assertEquals(2, obj.listFilesDirectory());
    }
}

