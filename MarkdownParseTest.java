import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void getLinksTester() throws IOException{
        Path actualOutput = Path.of("test-file.md");
        String contents = Files.readString(actualOutput);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }
    @Test
    public void getLinksTester2() throws IOException{
        Path actualOutput = Path.of("test-file2.md");
        String contents = Files.readString(actualOutput);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }
    @Test
    public void getLinksTester3() throws IOException{
        Path actualOutput = Path.of("labnew.md");
        String contents = Files.readString(actualOutput);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }
    @Test
    public void getLinksTester4() throws IOException{
        Path actualOutput = Path.of("test-file3.md");
        String contents = Files.readString(actualOutput);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void getLinksTester5() throws IOException{
        Path actualOutput = Path.of("test-file4.md");
        String contents = Files.readString(actualOutput);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void getLinksTester6() throws IOException{
        Path actualOutput = Path.of("test-file5.md");
        String contents = Files.readString(actualOutput);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void getLinksTester7() throws IOException{
        Path actualOutput = Path.of("test-file6.md");
        String contents = Files.readString(actualOutput);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }
    
    @Test
    public void snippet1Tester() throws IOException{
        Path actualOutput = Path.of("snippet1.md");
        String contents = Files.readString(actualOutput);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"), links);
    }

    @Test
    public void snippet2Tester() throws IOException{
        Path actualOutput = Path.of("snippet2.md");
        String contents = Files.readString(actualOutput);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("a.com", "a.com(())", "example.com"), links);
    }

    @Test
    public void snippet3Tester() throws IOException{
        Path actualOutput = Path.of("snippet3.md");
        String contents = Files.readString(actualOutput);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://www.twitter.com", 
            "https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/"), links);
    }
}
