
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * See page 115 in the book.
 * This uses the auto-generated PropertyFileBaseLoader  to parse property files
 * and store the properties in a hashmap
 *
 * See https://stackoverflow.com/questions/50541321/antlrinputstream-and-antlrfilestream-are-deprecated-what-are-the-alternatives
 * for how to load the input
 */
public class PropertyFileLoader extends PropertyFileBaseListener {
    private final Map<String, String> props = new HashMap<>();

    //notice we use exitProp, not enterProp - this way we can be sure the whole property has been parsed
    @Override
    public void exitProp(PropertyFileParser.PropContext ctx) {
        var key = ctx.key().ID().getText();
        var value = ctx.value().STRING().getText();
        props.put(key, value);
    }

    void main() throws IOException {
        var walker = new ParseTreeWalker();
        var propLoader = new PropertyFileLoader();
        // https://stackoverflow.com/questions/50541321/antlrinputstream-and-antlrfilestream-are-deprecated-what-are-the-alternatives
        var lexer = new PropertyFileLexer(CharStreams.fromFileName("antlr/definitive-antlr-reference-book/07-listeners-visitors/t.properties"));
        var tokens = new CommonTokenStream(lexer);
        var parser = new PropertyFileParser(tokens);
        walker.walk(propLoader, parser.file());

        System.out.println("I parsed these properties: " + propLoader.props);
    }
}

