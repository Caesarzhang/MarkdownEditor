package Caesar;

import javax.swing.*;
import java.awt.*;

/**
 * Created by caesa on 2016/12/11.
 */
public class Editor extends javax.swing.JFrame{

    JTree htmlTree = new JTree();
    JScrollPane htmlTreePanelScrol=new JScrollPane(htmlTree);

    JButton toDocx=new JButton("导出docx");

    JEditorPane edit=new JEditorPane();
    JScrollPane editPanelScrol=new JScrollPane(edit);

    JTextArea text = new JTextArea();
    JScrollPane textPanelScrol=new JScrollPane(text);

    GridBagLayout gbaglayout = new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();


    public Editor(){

        setSize(1200,800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setLayout(gbaglayout);

        /*树*/
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 7;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(0, 0, 0, 0);
        constraints.ipadx = 0;
        constraints.ipady = 0;

        gbaglayout.setConstraints(htmlTreePanelScrol,constraints);
        add(htmlTreePanelScrol);

        constraints.gridx = 2;
        constraints.gridwidth = 5;
        gbaglayout.setConstraints(editPanelScrol,constraints);
        add(editPanelScrol);

        constraints.gridx = 7;
        constraints.gridwidth = 5;
        gbaglayout.setConstraints(textPanelScrol,constraints);
        add(textPanelScrol);

        constraints.gridx=6;
        constraints.gridy=7;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        constraints.fill=GridBagConstraints.NONE;
        gbaglayout.setConstraints(toDocx,constraints);
        add(toDocx);

        setVisible(true);
//            try
//            {
//                String html = new Markdown4jProcessor().process(edit.getText());
//            }
//            catch (Exception e)
//            {
//
//            }
    }



}