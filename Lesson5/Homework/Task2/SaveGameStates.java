package Lesson5.Homework.Task2;

import java.io.*;

public class SaveGameStates {
    public static void main(String[] args) throws IOException {
        try {
            int field = 101202303;
            ByteArrayOutputStream out = recordingState(field);
            File file = new File("src/Lesson5/Homework/Task2/save");
            writeBytes(out, file);
            readBytes(file);
        } catch (IOException e) {
            System.out.println("Error input/output");
        } catch (Exception e) {
            System.out.println("Unexpected error" + e.getMessage());
        }

    }

    public static ByteArrayOutputStream recordingState(int field) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream(3);
        String temp = Integer.toString(field);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }
        int valueFieldOne = Integer.parseInt("" + newGuess[0] + newGuess[1] + newGuess[2]);
        int valueFieldTwo = Integer.parseInt("" + newGuess[3] + newGuess[4] + newGuess[5]);
        int valueFieldThree = Integer.parseInt("" + newGuess[6] + newGuess[7] + newGuess[8]);

        out.write(valueFieldOne);
        out.write(valueFieldTwo);
        out.write(valueFieldThree);

        return out;
    }


    public static void writeBytes(ByteArrayOutputStream out, File file) throws IOException {
        try (FileOutputStream outFile = new FileOutputStream(file)) {
            outFile.write(out.toByteArray());

        }
    }

    public static void readBytes(File file) throws FileNotFoundException {
        try (FileInputStream inFIle = new FileInputStream(file)) {
            byte[] bitesToRead = new byte[10];
            int bytesAvailable = inFIle.available();
            System.out.println("Ready to read " + bytesAvailable + " bytes");
            int count = inFIle.read(bitesToRead, 0, bytesAvailable);
            for (int i = 0; i < count; i++) {
                System.out.println(" " + bitesToRead[i]);
            }

            System.out.println("Input stream closed");

        } catch (IOException e) {
            System.out.println("Error output: " + e.toString());
        }
    }
}
