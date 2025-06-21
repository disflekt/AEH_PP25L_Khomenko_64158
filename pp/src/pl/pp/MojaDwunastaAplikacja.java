package pl.pp;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MojaDwunastaAplikacja {
    public static void main(String[] args) {
        String userDirectory = System.getProperty("user.dir");
        System.out.println("Bieżący katalog to:");
        System.out.println(userDirectory);

        Scanner scanner = new Scanner(System.in);
        Path inputPath;

        while (true) {
            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            String inputFilePath = scanner.nextLine();
            inputPath = Paths.get(inputFilePath);

            if (Files.exists(inputPath) && Files.isRegularFile(inputPath)) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Spróbuj ponownie.");
            }
        }

        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        String outputFilePath = scanner.nextLine();
        Path outputPath = Paths.get(outputFilePath);

        long lineCount = 0;

        try {
            lineCount = Files.lines(inputPath).count();
            System.out.println("Plik: " + inputPath.getFileName());
            System.out.println("Liczba linii: " + lineCount);
            String result = "Nazwa pliku: " + inputPath.getFileName() + System.lineSeparator() +
                    "Liczba linii: " + lineCount;
            Files.write(outputPath, result.getBytes(Charset.defaultCharset()));
            System.out.println("Zapisano wynik do pliku: " + outputPath);

        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu/zapisu: " + e.getMessage());
        }

//        try {
//
//            byte[] bytes = Files.readAllBytes(pathToFile);
//            String fileContent = new String(bytes, Charset.defaultCharset());
//
//            System.out.println("Zawartość pliku to: ");
//            System.out.println(fileContent);
//
//
//            fileContent += " więcej tekstu ..."; // dopisujemy coś do pliku
//            fileContent += " jeszcze więcej tekstu ..."; // dopisujemy coś do pliku
//
//            Files.write(pathToFile, fileContent.getBytes(Charset.defaultCharset()));
//
//
//            List<String> lines = Files.readAllLines(pathToFile);
//
//            System.out.println("Aktualna zawartość pliku: ");
//            System.out.println(lines);
//
//            lines.add(" więcej tekstu dodane W LIŚCIE..."); // dopisujemy coś do pliku
//
//            Files.write(pathToFile, lines);
//
//
//
//            String path = "sample_text.txt";
//            System.out.println("Przykład nr 1 - FileInputStream");
//            try (FileInputStream inputStream = new FileInputStream(path)) {
//                int character = inputStream.read();
//                while (character != -1) {
//                    System.out.print((char) character);
//                    character = inputStream.read();
//                }
//                System.out.println(); // kończymy linię i zaczynamy nową
//            } catch (IOException e) {
//                System.out.println("Problem z odczytem pliku");
//                e.printStackTrace();
//            }
//
//            System.out.println("Przykład nr 2 - FileReader");
//            try (FileReader fileReader = new FileReader(path)) {
//                int character = fileReader.read();
//                while (character != -1) {
//                    System.out.print((char) character);
//                    character = fileReader.read();
//                }
//                System.out.println(); // kończymy linię i zaczynamy nową
//            } catch (IOException io) {
//                System.out.println("Problem z odczytem pliku");
//                io.printStackTrace();
//            }
//
//            System.out.println("Przykład nr 3 - BufferedReader");
//            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
//                String line = bufferedReader.readLine();
//                while (line != null) {
//                    System.out.println(line);
//                    line = bufferedReader.readLine();
//                }
//            } catch (IOException io) {
//                System.out.println("Problem z odczytem pliku");
//                io.printStackTrace();
//            }
//
//            System.out.println("Przykład nr 4 - Scanner");
//            try (Scanner in = new Scanner(new FileReader(path))) {
//                while (in.hasNext()) {
//                    String next = in.next();
//                    System.out.print(next + " ");
//                }
//            } catch (IOException io) {
//                System.out.println("Problem z odczytem pliku");
//                io.printStackTrace();
//            }
//
//
//        } catch (Exception e){
//
//            System.out.println("Dostaliśmy błąd obsługi pliku: " + e.getMessage());
//        } finally {
//
//        }

    }


}