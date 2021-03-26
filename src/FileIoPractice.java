import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoPractice {

    public static void main(String[] args) {

        Path p = Paths.get("fileIo", "people.txt");

        List<String> peopleStatus = new ArrayList<>();

        try {

            peopleStatus = Files.readAllLines(p);

            for (String staff : peopleStatus) {
                System.out.printf("%s works at Codeup %n", staff);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println(peopleStatus);


        List<String> breakoutRoom = Arrays.asList("Colin", "Jeanette", "Javier", "Jacob");

        try {

            Files.write(p, breakoutRoom);
        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println(breakoutRoom);


        List<String> codeupStaff = Arrays.asList(
                "Justin",
                "Casey",
                "Ry",
                "David"
        );


        try {

            Files.write(p, codeupStaff);
        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println(codeupStaff);


        deleteEntry("David");


    }

    public static void deleteEntry(String name) {

        Path testFilePath = Paths.get("fileIo", "people.txt");

        try {

            List<String> names = Files.readAllLines(testFilePath);
            names.remove(name);
            Files.write(testFilePath, names);

        } catch (IOException e) {

            e.printStackTrace();
        }

    }



}
