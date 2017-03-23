import java.io.*;
import java.util.concurrent.TimeUnit;
//Jacob Chapple Temp File delete
public class TempCleanup {
    public static void main(String[] args) throws IOException {
        //Get account of logged user
        String AccountUser = System.getProperty("user.name");
        //Finding Directory
        File tempDir = new File(String.format("C:\\Users\\%s\\AppData\\Local\\Temp",AccountUser));


        //Calling methods
        deleteAllFiles(tempDir);
        placeInStartup();

        //Delay after Directory is cleaned
        try{
            System.out.println("Your Temp Folder is cleaned. :) ");
            Thread.sleep(3000);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    public static void deleteAllFiles(File dirName){
        if (dirName.exists()) {
            if (dirName.isDirectory()) {
                String[] filenames = dirName.list();
                for (String f : filenames) {
                    deleteAllFiles(new File(dirName, f));
                }
            }
            System.out.println("Deleting " + dirName.getName());
            dirName.delete();
            //Delay after every deleted file
        }
        try{
            Thread.sleep(200);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    public static void placeInStartup(){

        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\Multitude\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup\\TempCleanup.cmd", "UTF-8");
            writer.println("java -jar TempCleanup.jar");
            writer.close();
        }catch(FileNotFoundException|UnsupportedEncodingException ex){
            System.out.println("A problem has occured aborting operation");
            System.exit(0);

        }
    }
}