import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


class LengthConvt extends JFrame {
    private Container c;
    private JLabel l1=new JLabel();
    private JTextField t1;
    private JTextField t2;
    private JButton b1;
    String[] choice_1 = {"MILE", "METER", "FEET", "KILOMETER"};
    ArrayList<String> list1 = new ArrayList<String>();
    private JComboBox c1;
    String[] choice_2 = {"MILE", "METER", "FEET", "KILOMETER"};
    private JComboBox c2;
    
    public LengthConvt() {
  

        setTitle("Length Converter");
        setBounds(500, 250, 350, 280);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setBackground(Color.LIGHT_GRAY);
        c.setSize(400, 250);
        c.setLayout(null);
        c.setVisible(true);

       ImageIcon img= new ImageIcon("length.jpg");
       l1.setIcon(img);
       l1.setLocation(630,-40);
       l1.setSize(600,500);
       c.add(l1);

        t1 = new JTextField();
        t1.setFont(new Font("CAMBRIA", Font.BOLD, 17));
        t1.setSize(120, 40);
        t1.setLocation(800, 330);
        c.add(t1);

        t2 = new JTextField();
        t2.setFont(new Font("CAMBRIA", Font.BOLD, 17));
        t2.setSize(120, 40);
        t2.setLocation(800, 400);
        c.add(t2);

        c1 = new JComboBox<>(choice_1);
        c1.setFont(new Font("CAMBRIA", Font.BOLD, 17));
        c1.setSize(120, 40);
        c1.setLocation(630, 330);
        c.add(c1);

        c2 = new JComboBox<>(choice_2);
        c2.setFont(new Font("CAMBRIA", Font.BOLD, 17));
        c2.setSize(120, 40);
        c2.setLocation(630, 400);
        c.add(c2);

        b1 = new JButton("Convert Length");
        b1.setFont(new Font("CAMBRIA", Font.BOLD, 17));
        b1.setSize(200, 40);
        b1.setLocation(700, 480);
        c.add(b1);

        b1.addActionListener(new ConvertBtnListener());

        setVisible(true);
    }


    class ConvertBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String Str = t1.getText();
            double km = Double.parseDouble(Str);
            double f = Double.parseDouble(Str);
            double mil = Double.parseDouble(Str);
            double m = Double.parseDouble(Str);
            if (c1.getSelectedItem().equals("KILOMETER") && c2.getSelectedItem().equals("MILE")){
                double MILE = convertKmToMi(km);
                t2.setText("" + MILE);
            }
            else if(c1.getSelectedItem().equals("KILOMETER") && c2.getSelectedItem().equals("METER")){
                double METER = convertKmToMETER(f);
                t2.setText("" + METER);
            }
            else if(c1.getSelectedItem().equals("KILOMETER") && c2.getSelectedItem().equals("FEET")) {
                double FEET = convertKmToFEET(km);
                t2.setText("" + FEET);
            }
            else if(c1.getSelectedItem().equals("MILE") && c2.getSelectedItem().equals("KILOMETER")) {
                double KILOMETER = convertMiToKm(mil);
                t2.setText("" + KILOMETER);
            }
            else if(c1.getSelectedItem().equals("MILE") && c2.getSelectedItem().equals("METER")) {
                double METER = convertMiToMETER(mil);
                t2.setText("" + METER);
            }
            else if(c1.getSelectedItem().equals("MILE") && c2.getSelectedItem().equals("FEET")) {
                double FEET = convertMiToFEET(mil);
                t2.setText("" + FEET);
            }
            else if(c1.getSelectedItem().equals("FEET") && c2.getSelectedItem().equals("KILOMETER")) {
                double KILOMETER = convertFEETToKm(f);
                t2.setText("" + KILOMETER);
            }
            else if(c1.getSelectedItem().equals("FEET") && c2.getSelectedItem().equals("METER")) {
                double METER = convertFEETToMETER(f);
                t2.setText("" + METER);
            }
            else if (c1.getSelectedItem().equals("FEET") && c2.getSelectedItem().equals("MILE")){
                double MILE = convertFEETToMi(f);
                t2.setText("" + MILE);
            }
            else if(c1.getSelectedItem().equals("METER") && c2.getSelectedItem().equals("KILOMETER")) {
                double KILOMETER = convertMETERToKm(m);
                t2.setText("" + KILOMETER);
            }
            else if(c1.getSelectedItem().equals("METER") && c2.getSelectedItem().equals("FEET")) {
                double FEET = convertMETERToFEET(m);
                t2.setText("" + FEET);
            }
            else if (c1.getSelectedItem().equals("METER") && c2.getSelectedItem().equals("MILE")){
                double MILE = convertMETERToMi(m);
                t2.setText("" + MILE);
            }
        }
    }

   
    public static double convertKmToMi(double KILOMETER) {    // CONVERTING  KILOMETER TO MILES,METER AND FEET
        double MILE = KILOMETER * 0.621;
        return MILE;
    }
    public static double convertKmToMETER(double KILOMETER) {
        double METER = KILOMETER * 1000;
        return METER;
    }
    public static double convertKmToFEET(double KILOMETER) {
        double FEET = KILOMETER * 3280.84;
        return FEET;
    }

    
    public static double convertMiToKm(double MILE) {         // CONVERTING  MILES TO KILOMETER, METER AND FEET
        double KILOMETER = MILE * 1.60934;
        return KILOMETER;
    }
    public static double convertMiToMETER(double MILE) {
        double METER = MILE * 1609.34;
        return METER;
    }
    public static double convertMiToFEET(double MILE) {
        double FEET = MILE * 5280;
        return FEET;
    }

    public static double convertFEETToKm(double FEET) {         // CONVERTING  FOOT TO KILOMETER, METER AND MILES.

        double KILOMETER = FEET * 0.0003048;
        return KILOMETER;
    }
    public static double convertFEETToMETER(double FEET) {
        double METER = FEET * 0.3048;
        return METER;
    }
    public static double convertFEETToMi(double FEET) {
        double MILE = FEET * 0.000189394;
        return MILE;
    }

    public static double convertMETERToKm(double METER) {         // CONVERTING  METER TO KILOMETER, FEET AND MILES

        double KILOMETER = METER * 0.001;
        return KILOMETER;
    }
    public static double convertMETERToFEET(double METER) {
        double FEET = METER * 3.28084;
        return FEET;
    }
    public static double convertMETERToMi(double METER) {
        double MILE = METER * 0.000621371;
        return MILE;
    }

}
class LenConv {
    public static void main(String[] args) {
        JFrame window = new LengthConvt();
        window.setExtendedState(Frame.MAXIMIZED_BOTH);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
    }
}