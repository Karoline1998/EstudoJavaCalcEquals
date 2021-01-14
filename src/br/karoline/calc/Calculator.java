package br.karoline.calc;

import java.awt.event.ActionEvent;

public class Calculator extends javax.swing.JFrame {
	
	private javax.swing.JButton btn_resultado;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JTextField val1;
	private javax.swing.JTextField val2;
	private javax.swing.JTextField val3;
	private javax.swing.JTextField resultado;
	
	public	Calculator() {
		inputComponents();
	}
	
	private void inputComponents() {
		
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		btn_resultado = new javax.swing.JButton();
		resultado = new javax.swing.JTextField();
		val1 = new javax.swing.JTextField();
		val2 = new javax.swing.JTextField();
		val3 = new javax.swing.JTextField();	
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Equação do 2º Grau");
		 
		jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); 
		jLabel1.setText("Equação do 2º Grau ax² + bx + c = 0");

		
		jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); 
		jLabel2.setText("Valor de A");
		
		jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); 
		jLabel3.setText("Valor de B ");
		
		jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); 
		jLabel4.setText("Valor de C");
		
		btn_resultado.setText("Result");
		btn_resultado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_resultadoActionPerformed(evt);
			}

		});
		
		resultado.setFont(new java.awt.Font("Tahoma", 0, 14)); 
		resultado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				resultadoActionPerformed(evt);
			}

		});
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(layout.createSequentialGroup()
		.addGap(159, 159, 159)
		.addComponent(btn_resultado)
		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		.addContainerGap(90, Short.MAX_VALUE)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
		.addGroup(layout.createSequentialGroup()
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addGap(69, 69, 69)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		.addComponent(val1)
		.addComponent(val2)
		.addComponent(val3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))))
		.addGap(72, 72, 72))
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		.addContainerGap()
		.addComponent(resultado)
		.addGap(20, 20, 20))
		);
		layout.setVerticalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(layout.createSequentialGroup()
		.addContainerGap()
		.addComponent(jLabel1)
		.addGap(18, 18, 18)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
		.addComponent(val1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
		.addComponent(val2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
		.addComponent(val3))
		.addGap(18, 18, 18)
		.addComponent(btn_resultado)
		.addGap(18, 18, 18)
		.addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
		.addContainerGap(25, Short.MAX_VALUE))
		);

		pack();
		}	
		
		
	
	private void resultadoActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}
	private void btn_resultadoActionPerformed(ActionEvent evt) {
		
		try {
			float a = Float.parseFloat(val1.getText());
			float b = Float.parseFloat(val2.getText());
			float c = Float.parseFloat(val3.getText());
			float del = (b*b) - (4*a*c);
			
			
			if(del < 0){
				resultado.setText("Delta é negativo, logo x não pertence aos numeros reais!"); 
				}
				else{
				float x1 = (float) ((-b + Math.sqrt(del)) / (2*a));
				float x2 = (float) ((-b - Math.sqrt(del)) / (2*a));
				
				resultado.setText("X1 = " + Float.toString(x1)+ "," + " X2 = " + Float.toString(x2));
		}
		} catch (Exception e) {
			resultado.setText("Por Favor Digite Valores Validos!");
		}
			
	}

	
	
}
		
