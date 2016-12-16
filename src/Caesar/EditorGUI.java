package Caesar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by caesa on 2016/12/11.
 */
public class EditorGUI extends javax.swing.JFrame{

    JTree htmlTree = new JTree();
    private JScrollPane htmlTreePanelScrol=new JScrollPane(htmlTree);

    JButton toDocx=new JButton("导出docx");
    JButton preview=new JButton("预览");
    JEditorPane edit=new JEditorPane();
    private JScrollPane editPanelScrol=new JScrollPane(edit);

    TextPanel text = (TextPanel) new TextPanel();
    private JScrollPane textPanelScrol=new JScrollPane(text);

    GridBagLayout gbaglayout = new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();


    public EditorGUI(){

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
        text.setEditable(false);
        gbaglayout.setConstraints(textPanelScrol,constraints);
        add(textPanelScrol);

        constraints.gridx=6;
        constraints.gridy=7;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        constraints.fill=GridBagConstraints.NONE;
        gbaglayout.setConstraints(toDocx,constraints);
        add(toDocx);

        constraints.gridx=7;
        gbaglayout.setConstraints(preview,constraints);
        add(preview);

        setVisible(true);
    }
    public void PreviewFunc()
    {
        preview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(edit.getText());
            }
        });
    }
}