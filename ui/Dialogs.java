// ui/Dialogs.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// Creating and using Dialog Boxes.
import javax.swing.*;
import java.awt.*;
import static onjava.SwingConsole.*;

class MyDialog extends JDialog {
  public MyDialog(JFrame parent) {
    super(parent, "My dialog", true);
    setLayout(new FlowLayout());
    add(new JLabel("Here is my dialog"));
    JButton ok = new JButton("OK");
    ok.addActionListener(e ->
      dispose()); // Closes the dialog
    add(ok);
    setSize(150,125);
  }
}

public class Dialogs extends JFrame {
  private JButton b1 = new JButton("Dialog Box");
  private MyDialog dlg = new MyDialog(null);
  public Dialogs() {
    b1.addActionListener(e -> dlg.setVisible(true));
    add(b1);
  }
  public static void main(String[] args) {
    run(new Dialogs(), 125, 75);
  }
}