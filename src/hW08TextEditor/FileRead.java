package hW08TextEditor;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void read() {
		try (FileReader fr = new FileReader("D:\\SourceIT\\src\\hW08TextEditor\\note.txt")) {
			int i;
			while ((i = fr.read()) != -1) {

				System.out.print((char) i);
			}
		} catch (IOException FileReader) {

			System.out.println(FileReader.getMessage());
		}
	}
}