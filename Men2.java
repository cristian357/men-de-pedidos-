package n1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Men2 {

    public static void main(String[] args) {
    	// aqui va a ir la variable que guarde los peditos de los platos
    	final int[]  com= {0};// metoco que aselo asi ya que no medeja modificar lo que ase el botton 
    	final  int[] típico= {0};
    	final  int[] internacionales= {0};
    	final  int[] Carnes_platos= {0};
    	//
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
			JLabel titulo=new JLabel("<html>   <h1>Platos típicos</h1>   </html>",SwingConstants.CENTER);
			JButton  frijoles=new JButton("Frijoles");
			JButton Sancocho =new JButton("Sancocho");
			JButton  Patacon =new JButton("Patacon");
			JButton salir =new JButton("salir");
			// esta cosa seva arrepetir apara cada opsion 
			frijoles.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//codejavu fue don de saque esto
					Object opciones = JOptionPane.showInputDialog(null,"los frijoles valen $3,500 \n Quiere agregar al carrito",
							   "opciones", JOptionPane.QUESTION_MESSAGE, null,
							  new Object[] { "Seleccione","si", "no"},"Seleccione");
					if(opciones.equals("si")){
						// me esta  saliendo un errror com+=3500; típicos++; por tener las variable asim por que sera
						// va tocar que utilisar un objeto
						com[0] +=3500;
						típico[0]++;
						//Las variables que vienen de afuera no pueden cambiar dentro de esa clase
					}
					
					
					
				}
			});
			Sancocho.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object opciones = JOptionPane.showInputDialog(null,"los Sancocho  valen $3,500 \n Quiere agregar al carrito",
							   "opciones", JOptionPane.QUESTION_MESSAGE, null,
							  new Object[] { "Seleccione","si", "no"},"Seleccione");
					if(opciones.equals("si")){
						// me esta  saliendo un errror com+=3500; típicos++; por tener las variable asim por que sera
						// va tocar que utilisar un objeto
						com[0] +=19900;
						típico[0]++;
						//Las variables que vienen de afuera no pueden cambiar dentro de esa clase
					}
					
					
					
				}
			});
			Patacon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object opciones = JOptionPane.showInputDialog(null,"los Patacon  valen $24940 \n Quiere agregar al carrito",
							   "opciones", JOptionPane.QUESTION_MESSAGE, null,
							  new Object[] { "Seleccione","si", "no"},"Seleccione");
					if(opciones.equals("si")){
						// me esta  saliendo un errror com+=3500; típicos++; por tener las variable asim por que sera
						// va tocar que utilisar un objeto
						com[0] +=24940;
						típico[0]++;
						//Las variables que vienen de afuera no pueden cambiar dentro de esa clase
					}
					
					
					
				}
			});
			salir.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
					ven_tipico.dispose(); // cierra la ventana
					
				}
			});
			
			ven_tipico.add(titulo);
			ven_tipico.add(frijoles);
			ven_tipico.add(Sancocho);
			ven_tipico.add(Patacon);
			ven_tipico.add(salir);
			ven_tipico.setVisible(true);//esto sirve para que la ventana se vea
			
		}
	});
       Platos_internacionales.addActionListener(new ActionListener() {
   		
 
   		public void actionPerformed(ActionEvent e) {
   			//Voy a copiar y pegar lo que ya tengo para optimizar tiempo.
			JFrame ven_tipico=new JFrame();
			ven_tipico.setSize(500,500);
			ven_tipico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ven_tipico.setLayout(new BoxLayout(ven_tipico.getContentPane(), BoxLayout.Y_AXIS));
			//voy a hacer el menu de la comida
			JLabel titulo=new JLabel("<html>   <h1>Platos típicos</h1>   </html>",SwingConstants.CENTER);
			JButton  asado_argentino=new JButton("Asado argentino");
			JButton Xiaolongbao =new JButton("Xiaolongbao");
			JButton  Jamón_de_Parma =new JButton("Jamón de Parma");
			JButton salir =new JButton("salir");
			// esta cosa seva arrepetir apara cada opsion 
			asado_argentino.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//codejavu fue don de saque esto
					Object opciones = JOptionPane.showInputDialog(null,"los asado_argentino valen $6997 \n Quiere agregar al carrito",
							   "opciones", JOptionPane.QUESTION_MESSAGE, null,
							  new Object[] { "Seleccione","si", "no"},"Seleccione");
					if(opciones.equals("si")){
						// me esta  saliendo un errror com+=3500; típicos++; por tener las variable asim por que sera
						// va tocar que utilisar un objeto
						com[0] +=6997;
						internacionales[0]++;
						//Las variables que vienen de afuera no pueden cambiar dentro de esa clase
					}
					
					
					
				}
			});
			Xiaolongbao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object opciones = JOptionPane.showInputDialog(null,"los Xiaolongbao  valen $350000\n Quiere agregar al carrito",
							   "opciones", JOptionPane.QUESTION_MESSAGE, null,
							  new Object[] { "Seleccione","si", "no"},"Seleccione");
					if(opciones.equals("si")){
						// me esta  saliendo un errror com+=3500; típicos++; por tener las variable asim por que sera
						// va tocar que utilisar un objeto
						com[0] +=350000;
						internacionales[0]++;
						//Las variables que vienen de afuera no pueden cambiar dentro de esa clase
					}
					
					
					
				}
			});
			Jamón_de_Parma.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object opciones = JOptionPane.showInputDialog(null,"los Jamón_de_Parma  valen $26000 \n Quiere agregar al carrito",
							   "opciones", JOptionPane.QUESTION_MESSAGE, null,
							  new Object[] { "Seleccione","si", "no"},"Seleccione");
					if(opciones.equals("si")){
						// me esta  saliendo un errror com+=3500; típicos++; por tener las variable asim por que sera
						// va tocar que utilisar un objeto
						com[0] +=26000;
						internacionales[0]++;
						//Las variables que vienen de afuera no pueden cambiar dentro de esa clase
					}
					
					
					
				}
			});
			salir.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
					ven_tipico.dispose(); // cierra la ventana
					
				}
			});
			
			ven_tipico.add(titulo);
			ven_tipico.add(asado_argentino);
			ven_tipico.add(Xiaolongbao);
			ven_tipico.add(Jamón_de_Parma);
			ven_tipico.add(salir);
			ven_tipico.setVisible(true);//esto sirve para que la ventana se vea
			
		}
   			
   		});
       
       Carnes.addActionListener(new ActionListener() {
   		
   
   		public void actionPerformed(ActionEvent e) {
   			//Voy a copiar y pegar lo que ya tengo para optimizar tiempo.
			JFrame ven_tipico=new JFrame();
			ven_tipico.setSize(500,500);
			ven_tipico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ven_tipico.setLayout(new BoxLayout(ven_tipico.getContentPane(), BoxLayout.Y_AXIS));
			//voy a hacer el menu de la comida
			JLabel titulo=new JLabel("<html>   <h1>Platos típicos</h1>   </html>",SwingConstants.CENTER);
			JButton  Carne_asada=new JButton("Asado argentino");
			JButton Costillas_BBQ =new JButton("Costillas_BBQ");
			JButton  Chuleta_de_cerdo=new JButton("Jamón de Parma");
			JButton salir =new JButton("salir");
			// esta cosa seva arrepetir apara cada opsion 
			Carne_asada.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//codejavu fue don de saque esto
					Object opciones = JOptionPane.showInputDialog(null,"los  Carne asada valen $25000 \n Quiere agregar al carrito",
							   "opciones", JOptionPane.QUESTION_MESSAGE, null,
							  new Object[] { "Seleccione","si", "no"},"Seleccione");
					if(opciones.equals("si")){
						// me esta  saliendo un errror com+=3500; típicos++; por tener las variable asim por que sera
						// va tocar que utilisar un objeto
						com[0] +=25000;
						Carnes_platos[0]++;
						//Las variables que vienen de afuera no pueden cambiar dentro de esa clase
					}
					
					
					
				}
			});
			Costillas_BBQ.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object opciones = JOptionPane.showInputDialog(null,"los Costillas BBQ valen $32000 \n Quiere agregar al carrito",
							   "opciones", JOptionPane.QUESTION_MESSAGE, null,
							  new Object[] { "Seleccione","si", "no"},"Seleccione");
					if(opciones.equals("si")){
						// me esta  saliendo un errror com+=3500; típicos++; por tener las variable asim por que sera
						// va tocar que utilisar un objeto
						com[0] +=320000;
						Carnes_platos[0]++;
						//Las variables que vienen de afuera no pueden cambiar dentro de esa clase
					}
					
					
					
				}
			});
			Chuleta_de_cerdo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object opciones = JOptionPane.showInputDialog(null,"los Chuleta_de_cerdo  valen $18000 \n Quiere agregar al carrito",
							   "opciones", JOptionPane.QUESTION_MESSAGE, null,
							  new Object[] { "Seleccione","si", "no"},"Seleccione");
					if(opciones.equals("si")){
						// me esta  saliendo un errror com+=3500; típicos++; por tener las variable asim por que sera
						// va tocar que utilisar un objeto
						com[0] +=18000;
						Carnes_platos[0]++;
						//Las variables que vienen de afuera no pueden cambiar dentro de esa clase
					}
					
					
					
				}
			});
			salir.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
					ven_tipico.dispose(); // cierra la ventana
					
				}
			});
			
			ven_tipico.add(titulo);
			ven_tipico.add(Carne_asada);
			ven_tipico.add(Costillas_BBQ);
			ven_tipico.add(Chuleta_de_cerdo);
			ven_tipico.add(salir);
			ven_tipico.setVisible(true);//esto sirve para que la ventana se vea
   			
   		}
   	});
       compra.addActionListener(new ActionListener() {
   		
   		
   		public void actionPerformed(ActionEvent e) {
   			if( texto!=null && !texto.getText().isBlank()) {
   				JOptionPane.showConfirmDialog(null,"hola  "+texto.getText()+"\n platos_típicos "+típico[0]+"\n internacionales "
   			+ internacionales[0]+"\n platos con platos"+Carnes_platos[0]+"\n valor de tu compra es "+com[0]);
   			}else {
   				JOptionPane.showConfirmDialog(null,"error poner nombre");
			}
   			
   		}
   	});
     
        ven.add(titulo);
        ven.add(texto);
        ven.add(mostrar);
        ven.add(menu);
        ven.add(platos_típicos);
        ven.add(Platos_internacionales);
        ven.add(Carnes);
        ven.add(compra);// esto fue difisil
        ven.setVisible(true);// QUE PEREZA
    }
}