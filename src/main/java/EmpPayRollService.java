import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.nio.file.StandardWatchEventKinds.*;

public class EmpPayRollService {
    public long listFilesDirectory() throws IOException, InterruptedException  {

        long enteries=0;
        enteries=Files.lines(new File("C:\\intallije workplace\\File_IO_WatchService\\Test1.txt").toPath())
                .count();
        System.out.println(enteries);
        return enteries;
    }
}
