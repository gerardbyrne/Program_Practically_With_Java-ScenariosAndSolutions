package com.gerry;

import javax.swing.*;
import java.awt.*;

public class JavaSwingFormExample
{
    static private JFrame frame;
    static private JTextField textField;

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    //Create and set up the window
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setTitle("COURSE");
                    JLabel label = new JLabel("Program Practically With Java");
                    frame.add(label);

                    //Display the window
                    frame.setMinimumSize(new Dimension(200, 200));
                    frame.pack();
                    frame.setVisible(true);
                } // End of try section
                catch (Exception e)
                {
                    e.printStackTrace();
                } // End of catch section
            } // End of run() method
        });
    } // End of main() method
} // End of JavaSwingFormExample class
