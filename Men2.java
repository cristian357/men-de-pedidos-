package n1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Men2 {

	public static void main(String[] args) {
	 JFrame ven =new JFrame("menu de pedido");
	 ven.setSize(500,500);
	 ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 ven.setLayout(new FlowLayout());
     JTextField texto = new JTextField(15);
     /* JButton para pponer un boton*/
     JButton mostrar = new JButton("Mostrar texto");
     /* JLable para mostra texto simple*/
     JLabel titulo=new JLabel("<Html>  <h1> poner nombre </h1> <Html>");

     mostrar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, texto.getText());
         }
     });  
     ven.add(titulo);
     ven.add(texto);
     ven.add(mostrar);
	 ven.setVisible(true);
	}

}
