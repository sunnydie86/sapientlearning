package assgn5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileHandler {

	public void displayFiles(Path p) throws IOException {
		Files.list(p).forEach(System.out::println);
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		FileHandler fh = new FileHandler();

		System.out.println("enter directory");
		String path = scanner.next();
		fh.displayFiles(Paths.get(path));
		scanner.close();
	}

}
