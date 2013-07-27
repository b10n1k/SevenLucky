/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sevenlucky;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author j0ni
 */
public class SevenLucky extends JFrame{

    /**
     * @param args the command line arguments
     */
    JPanel panel;
    JButton spinBtn;
    JButton quitBtn;
    Image icon;
    JLabel i1,i2,i3;
    JLabel lbl;

    public SevenLucky(){
        super("Lucky Seven");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        spinBtn = new JButton("Spin");
        quitBtn = new JButton("Quit");
        i1=new JLabel("0");
        i2=new JLabel("0");
        i3=new JLabel("0");
       // icon = new Image("fnksda.jpg");

        panel.add(i1);
        panel.add(i2);
        panel.add(i3);

        add(panel,BorderLayout.NORTH);
        add(spinBtn,BorderLayout.SOUTH);

        lbl=new JLabel(" try your luck");
        add(lbl);

        spinBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //String txt=null;
                boolean win=false;
               while(!win){

                   i1.setText(spin());
                   i2.setText(spin());
                   i3.setText(spin());

                   if(i1.getText().equals(i2.getText()) )
                           win=true;
                   lbl.setText("Win!!!!!!!!!!");

               }
            }
        });

        spinBtn.addMouseListener(new MouseAdapter(){
            public void MouseReleased() {
                String txt=null;
                boolean win=false;
                while(!win){

                   i1.setText(spin());
                   i2.setText(spin());
                   i3.setText(spin());

                   if(i1.getText().equals(i2.getText()) )
                           win=true;
                   lbl.setText("Win!!!!!!!!!!");

               }
            }
        });
    }

    public String spin(){
        Random rand=new Random();
        int a=0;
        for(int i=0;i<3;i++){
            a=rand.nextInt(9);
        }
        String luckyNum=Integer.toString(a);
        return luckyNum;
    }

    public static void main(String[] args){
        SevenLucky sevenLucky = new SevenLucky();

    }


}
