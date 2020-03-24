import java.io.*;
import java.util.*;
public class HelloWorldFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("s1.html");
        PrintWriter toFile = new PrintWriter(fileWriter);
        toFile.println("<H1>Hello, World!</H1>");
        fileWriter.close();
    }
}