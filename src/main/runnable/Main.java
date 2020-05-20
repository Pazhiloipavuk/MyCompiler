package main.runnable;

import gen.CoolLexer;
import gen.CoolParser;
import org.antlr.v4.runtime.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("CoolTest.cl");
        CoolLexer coolLexer = new CoolLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(coolLexer);
        CoolParser coolParser = new CoolParser(tokenStream);
        coolParser.program();
    }
}
