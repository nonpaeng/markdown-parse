import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path testFile = Path.of("test-file.md");
	    String readFile = Files.readString(testFile);
        ArrayList<String> newList = MarkdownParse.getLinks(readFile);
        List<String> expectedList = List.of("https://something.com","some-page.html");
        assertEquals(expectedList,newList);
    }

    @Test
    public void testGetLinks2() throws IOException {
        Path testFile = Path.of("lab.md");
	    String readFile = Files.readString(testFile);
        ArrayList<String> newList = MarkdownParse.getLinks(readFile);
        List<String> expectedList = List.of();
        assertEquals(expectedList,newList);
    }

    @Test
    public void testGetLinks3() throws IOException {
        Path testFile = Path.of("labnew.md");
	    String readFile = Files.readString(testFile);
        ArrayList<String> newList = MarkdownParse.getLinks(readFile);
        List<String> expectedList = List.of();
        assertEquals(expectedList,newList);
    }
}