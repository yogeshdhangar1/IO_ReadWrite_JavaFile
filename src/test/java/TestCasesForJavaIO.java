import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestCasesForJavaIO {
    @Test
    public void givenPathWhenCheckedThenConfirm() {
        Path homePath = Paths.get("C:\\intallije workplace\\File_IO_WatchService\\PayRoll.txt");
        Assert.assertTrue(Files.exists(homePath));
    }
    @Test
    public void givenFileCheckedAreAvailable_NotIfAvailableThenDelete() throws IOException, IOException {
        Path playPath=Paths.get("C:\\IntelliJ workplace\\File_IO_WatchService\\"+"/"+"PayRoll.txt");
        Files.deleteIfExists(Paths.get("C:\\IntelliJ workplace\\File_IO_WatchService\\PayRoll.txt"));
        Assert.assertTrue(Files.notExists(playPath));
    }
    @Test
    public void givenPathCreateTheDirectory() throws IOException {
        Path playPath=Paths.get("C:\\intallije workplace\\File_IO_WatchService\\"+"/"+"JavaProgram.txt");
        Files.createDirectory(playPath);
        Assert.assertTrue(Files.exists(playPath));
    }
}

