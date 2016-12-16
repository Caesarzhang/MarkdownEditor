package Caesar;

import org.markdown4j.Markdown4jProcessor;

import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;
import java.io.IOException;

/**
 * Created by caesa on 2016/12/15.
 */
public class TextPanel extends JEditorPane {

    HTMLEditorKit kit = new HTMLEditorKit();
    Markdown4jProcessor converter= new Markdown4jProcessor();

    public TextPanel() {
        setEditable(false);
        setEditorKit(kit);
    }


    @Override
    public void setText(String text)
    {
        String htmlString;
        try {
            htmlString = converter.process(text);
            super.setText(htmlString);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
