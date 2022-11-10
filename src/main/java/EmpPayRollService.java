import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.nio.file.StandardWatchEventKinds.*;

public class EmpPayRollService {
    public void ListOfDirectory() throws IOException, InterruptedException {
        // Activate Watch Service
        WatchService watchService = FileSystems.getDefault().newWatchService();
        // Convert Location To File Path
        Path path = Paths.get("C:\\intallije workplace\\File_IO_WatchService");
        // Register watch service on above path ==> Pass events to be watched
        // (Create/Delete/Modify)
        path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

        List<String> logs = new ArrayList<String>();
        boolean poll = true;
        while(poll){
            // Refreance Current Folder Or File For Watch
            WatchKey key = watchService.take();
            // Printing the events (Create / Modify / Delete)
            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println("Event kind : " + event.kind() + " - File : " + event.context());

                logs.add("Event kind : " + event.kind() + " - File : " + event.context());
            }

            Files.write(Paths.get("C:\\intallije workplace\\File_IO_WatchService\\Test.txt"), logs, StandardOpenOption.CREATE);

            // Reseting the reference so that it can be used later
            poll = key.reset();
        }

        }
    public static void main(String[] args) throws IOException, InterruptedException {
        EmpPayRollService obj = new EmpPayRollService();
        obj.ListOfDirectory();
    }
    }

