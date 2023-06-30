package Lesson5.Homework.Task1;

import java.io.*;


public class CreateBackup {
    public static void main(String[] args) throws IOException {
        File pathBackup = new File( "src/Lesson5/Homework/Task1/backup");
        File path = new File("src/Lesson3/Seminar/Task1");
        try {
            copyDirectory(path,pathBackup);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void copyDirectory(File srcDrc, File destDrc) throws IOException {
        if (!destDrc.exists()){
            destDrc.mkdir();
        }

        for (String f:srcDrc.list()) {
            copyDirectoryCompatibityMode(new File(srcDrc,f), new File(destDrc,f));
        }
    }

    public static void copyDirectoryCompatibityMode(File source, File destination) throws IOException {
        if (source.isDirectory()) {
            copyDirectory(source, destination);
        } else {
            copyFile(source, destination);
        }
    }

    private static void copyFile(File sourceFile, File destinationFile)
            throws IOException {
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destinationFile)) {
            byte[] buf = new byte[1024];
            int length;
            while ((length = in.read(buf)) > 0) {
                out.write(buf, 0, length);
            }
        }
    }

}
