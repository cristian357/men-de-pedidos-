package n1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Men2 {

    public static void main(String[] args) {
        JFrame ven = new JFrame("menu de pedido");
        ven.setSize(500, 500);
        ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ven.setLayout(new BoxLayout(ven.getContentPane(), BoxLayout.Y_AXIS));
        JLabel titulo = new JLabel("<html><h1>Poner nombre</h1></html>", SwingConstants.CENTER);
        JTextField texto = new JTextField(15);
        texto.setMaximumSize(texto.getPreferredSize());/*az que el campo donde el usuario escribe su 
        nombre no cubra todo el ancho*/
        JButton mostrar = new JButton("Mguardar");
        JButton platos_típicos =new JButton("Platos típicos");
        JButton Platos_internacionales =new JButton("Platos internacionales");
        JButton Carnes =new JButton("Carnes");
        JButton compra =new JButton("compra");
       
        mostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 if(texto!=null &&   !texto.getText().isBlank()/*esto com prueba si al algo en texto  */ ){
            		 JOptionPane.showMessageDialog(null, texto.getText());
                 }else {
         			JOptionPane.showConfirmDialog(null,"error texto está vacío","erro",JOptionPane.WARNING_MESSAGE);
         		}
                
            }
        });// getText() SIRVE PARA SACAR EL TESTO DE las interfase de swing 
        JLabel menu=new JLabel("<html> <h1>Panel de opciones </h1> </html>");
       platos_típicos.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame ven_tipico=new JFrame();
			ven_tipico.setSize(500,500);
			ven_tipico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ven_tipico.setLayout(new BoxLayout(ven_tipico.getContentPane(), BoxLayout.Y_AXIS));
			//voy a hacer el menu de la comida
			ven_tipico.setVisible(true);//esto sirve para que la ventana se vea
			
		}
	});
       Platos_internacionales.addActionListener(new ActionListener() {
   		
   		@Override
   		public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
   			
   		}
   	});
       Carnes.addActionListener(new ActionListener() {
   		
   		@Override
   		public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
   			
   		}
   	});
       compra.addActionListener(new ActionListener() {
   		
   		@Override
   		public void actionPerformed(ActionEvent e) {
   			// TODO Auto-generated method stub
   			
   		}
   	});
     
        ven.add(titulo);
        ven.add(texto);
        ven.add(mostrar);
        ven.add(menu);
        ven.add(platos_típicos);
        ven.add(Platos_internacionales);
        ven.add(Carnes);
        ven.add(compra);

        ven.setVisible(true);
    }
}