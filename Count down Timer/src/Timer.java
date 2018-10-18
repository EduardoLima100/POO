import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer {
    static int time,startTime;
    static JLabel text;
    static boolean stop,rst,ply,ps;
    public static void main(String args[]) {
        JFrame window = new JFrame("Timer");
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        FlowLayout flow = new FlowLayout();
        Container box = window.getContentPane();
        box.setLayout(flow);
        JButton start = new JButton("Start");
        JButton pause = new JButton("Pause");
        JButton reset = new JButton("Reset");
        JButton play = new JButton("Play");
        box.add(start);
        text = new JLabel ("Time: ");
        box.add(text);

        JTextField field = new JTextField(5);
        box.add(field);
        window.pack();
        window.setVisible(true);
        while(true) {
            start.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String seconds = field.getText();
                    time = Integer.parseInt(seconds);
                    startTime = time;
                    stop = false;
                    text.setText("Time: " + time);
                    if(time <= 0){
                        time = 1;
                    }
                }
            });
            if(rst){
                box.add(start);
                box.add(text);
                box.add(field);

                box.remove(reset);
                box.remove(play);

                window.pack();

                rst = false;
            }
            while (time > 0 && !stop) {
                box.remove(start);
                box.remove(field);
                box.add(pause);

                window.pack();

                pause.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ps = true;
                    }
                });

                reset.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        time = startTime;
                        text.setText("Time: " + time);
                        rst = true;
                    }
                });
                play.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        stop = false;
                        ply = true;
                    }
                });
                if(ply){
                    box.remove(play);
                    box.remove(reset);

                    window.pack();

                    ply = false;
                }

                if (!stop) {
                    time--;
                    text.setText("Time: " + time);
                    try {
                        Thread.sleep((long) 1000.);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(ps){
                    stop = true;
                    box.remove(pause);
                    box.add(reset);
                    box.add(play);
                    window.pack();
                    ps = false;
                }
                if(time == 0){
                    box.add(start);
                    box.add(text);
                    box.add(field);

                    box.remove(pause);
                    box.remove(reset);

                    window.pack();
                    stop = true;
                }
            }
        }
    }
}
