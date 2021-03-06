/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Gonsaez
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
        //Para poder conseguir que solo abra los archivos .txt lo que he hecho
        //es hacer un filtro de extensión y se lo he aplicado al jFileChooser.
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".txt", "txt");
        abrirComo.setFileFilter(filtro);
        guardarComo.setFileFilter(filtro);
        //Pongo la pantalla al iniciar el bloc de notas en blanco. No es
        //necesario pero he querido hacerlo.
        texto.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        abrirComo = new javax.swing.JFileChooser();
        jDialog2 = new javax.swing.JDialog();
        guardarComo = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        abrir = new javax.swing.JMenuItem();
        guardarS = new javax.swing.JMenuItem();
        guardarC = new javax.swing.JMenuItem();
        importar = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(abrirComo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(abrirComo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(guardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(guardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane2.setViewportView(texto);

        jMenu1.setText("File");

        abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/abrir.png"))); // NOI18N
        abrir.setText("Abrir");
        abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                abrirMousePressed(evt);
            }
        });
        jMenu1.add(abrir);

        guardarS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        guardarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/g.png"))); // NOI18N
        guardarS.setText("Guardar");
        guardarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardarSMousePressed(evt);
            }
        });
        jMenu1.add(guardarS);

        guardarC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        guardarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/guardar.png"))); // NOI18N
        guardarC.setText("Guardar Como");
        guardarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardarCMousePressed(evt);
            }
        });
        jMenu1.add(guardarC);

        importar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        importar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/0.png"))); // NOI18N
        importar.setText("Importar al archivo anterior");
        importar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                importarMousePressed(evt);
            }
        });
        jMenu1.add(importar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarSMousePressed
        //Para hacer el guardado simple, lo que hago es coger la ruta
        //del fichero antiguo que queremos sobreescribir.
        File ficheroViejo = new File(abrirComo.getSelectedFile().getPath());
        //Lo borro.
        ficheroViejo.delete();
        //Creo un fichero a partir de la ruta y el nombre que tiene.
        File ficheroNuevo = new File(ficheroViejo.toString());
        //Guardo en un String lo que he escrito nuevo en el jTextArea.
        String linea = texto.getText();
        try {
            //Se crea un Nuevo objeto FileWriter
            FileWriter fichero = new FileWriter(ficheroNuevo, true);
            //Se escribe el fichero con lo que he guardado en el String.
            fichero.write(linea);
            //Se cierra el fichero
            fichero.close();
        } catch (IOException ex) {
            //Si me da error salta por consola que no se ha podido guardar.
            System.out.println("No se ha podido guardar");
        }
    }//GEN-LAST:event_guardarSMousePressed

    private void abrirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirMousePressed
        //A la hora de abrir, utilizo el jFileChooser para que me salga la
        //ventana.
        int resultado = abrirComo.showOpenDialog(null);
        //Creo un if que si le doy al botón abrir, me haga la lectura del archivo.
        if (resultado == JFileChooser.APPROVE_OPTION) {
            //Creo el try catch para hacer que lea el archivo.
            try {
                //Creo el BufferedReader y que coja la ruta del archivo elegido.
                BufferedReader archivo = new BufferedReader(new FileReader(abrirComo.getSelectedFile()));
                //Creo un String que guarde el texto del archivo a abrir.
                String aux;
                //Hago un bucle para poder leer todas las líneas del documento.
                while ((aux = archivo.readLine()) != null) {
                    texto.append(aux + "\n");
                }
                //Cierro el fichero.
                archivo.close();
            } catch (IOException ex) {
                //Si me da error salta por consola que no se ha podido guardar.
                System.out.println("Error al leer el fichero");
            }
            //Si no le doy al botón abrir, creo un else if que
            //si le doy al botón cancelar me sale del jFileChooser.
        } else if (resultado == JFileChooser.CANCEL_OPTION) {
            System.out.println("");
        }

    }//GEN-LAST:event_abrirMousePressed

    private void guardarCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarCMousePressed
        //A la hora de guardar como, abro un jFileChooser.
        int result = guardarComo.showSaveDialog(null);
        //Cojo la ruta del fichero que queremos guardar.
        File archivo = new File(guardarComo.getSelectedFile().getPath());
        //Creo un String que guarde con el nombre que queramos.
        String nombre = archivo.getName();
        //Creo otro String que coja el texto del jTextArea y lo guarde en el String.
        String lineas = texto.getText();
        //Creo un if que si le doy a guardar, me haga el guardado.
        if (result == JFileChooser.APPROVE_OPTION) {
            //Creo el try catch para que me guarde el documento.
            //Creo el BufferedWriter con el nombre que le hemos dado en el String nombre.
            try (BufferedWriter fichero1 = new BufferedWriter(new FileWriter(archivo))) {
                //Escribo las lineas.
                fichero1.write(lineas);
                //Creo una nueva linea en blanco.
                fichero1.newLine();
                //Cierro el fichero.
                fichero1.close();
            } catch (IOException ex) {
                //Si me da error salta por consola que no se ha podido guardar.
                System.out.println("error al guardar el fichero");
            }
            //Si no le doy al botón guardar, creo un else if que
            //si le doy al botón cancelar me sale del jFileChooser.
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("");
        }
    }//GEN-LAST:event_guardarCMousePressed

    private void importarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importarMousePressed
        //Cojo la ruta del archivo abierto, anteriormente.
        File ficheroNuevo = new File(abrirComo.getSelectedFile().getPath());
        //Guardo en un String lo que se ha añadido en el jTextArea.
        String linea = texto.getText();
        //Creo un try catch donde me haga la importación al anterior fichero.
        try {
            //Se crea un Nuevo objeto FileWriter.
            FileWriter fichero = new FileWriter(ficheroNuevo, true);
            //Se escribe el fichero.
            fichero.write(linea);
            //Se cierra el fichero.
            fichero.close();
        } catch (IOException ex) {
            //Si me da error salta por consola que no se ha podido importar.
            System.out.println("error al importar al fichero");
        }
    }//GEN-LAST:event_importarMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JFileChooser abrirComo;
    private javax.swing.JMenuItem guardarC;
    private javax.swing.JFileChooser guardarComo;
    private javax.swing.JMenuItem guardarS;
    private javax.swing.JMenuItem importar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
