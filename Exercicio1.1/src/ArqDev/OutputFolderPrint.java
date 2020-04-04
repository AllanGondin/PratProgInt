package ArqDev;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OutputFolderPrint extends Print {
	
	
	public void write() {
	  String content = "Hello, World!";
	  String local = "C:\\Users\\allan\\Documents\\output.log";
		
      try {

   
          Files.write(Paths.get(local), content.getBytes());


      } catch (IOException e) {
          e.printStackTrace();
      }
	
	
}
}
