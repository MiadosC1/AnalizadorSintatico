/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;

/**
 *
 * @author USUARIO
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
    }
    
    private void analizarLexico() throws IOException
    {
                int cont = 1;
        
        String expr = (String) txtResultado.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Pregunta:
                    resultado += "  <Pregunta>\t\t" + lexer.lexeme + "\n";
                    break;
                case Contrario:
                    resultado += "  <Contrario>\t\t" + lexer.lexeme + "\n";
                    case Comparar:
                    resultado += "  <Comparar>\t\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Literal:
                    resultado += "  <Literal>\t\t" + lexer.lexeme + "\n";
                    break;
                case Operaciones:
                    resultado += "  <Operaciones>\t\t" + lexer.lexeme + "\n";
                    break;
                case Tipodato:
                    resultado += "  <Tipodato>\t\t" + lexer.lexeme + "\n";
                    break;
                case Acceso:
                    resultado += "  <Acceso>\t\t" + lexer.lexeme + "\n";
                    break;
                case ControlFlujo:
                    resultado += "  <ControlFlujo>\t\t" + lexer.lexeme + "\n";
                    break;
                case Constantes:
                    resultado += "  <Constantes>\t\t" + lexer.lexeme + "\n";
                    break;
                case OperadoresEspeciales:
                    resultado += "  <OperadoresEspeciales>\t\t" + lexer.lexeme + "\n";
                    break;
                case ManejoErrores:
                    resultado += "  <ManejoErrores>\t\t" + lexer.lexeme + "\n";
                    break;
                case Reservadas:
                    resultado += "  <Reservadas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Asignacion:
                    resultado += "  <Asignacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case Incremento:
                    resultado += "  <Incremento>\t\t" + lexer.lexeme + "\n";
                    break;
                case Decremento:
                    resultado += "  <Decremento>\t\t" + lexer.lexeme + "\n";
                    break;
                case Punto:
                    resultado += "  <Punto>\t\t" + lexer.lexeme + "\n";
                    break;
                case Logico:
                    resultado += "  <Logico>\t\t" + lexer.lexeme + "\n";
                    break;
                case Bits:
                    resultado += "  <Bits>\t\t" + lexer.lexeme + "\n";
                    break;
                case Relacional:
                    resultado += "  <Relacional>\t\t" + lexer.lexeme + "\n";
                    break;
                case Funciones:
                    resultado += "  <Funciones>\t\t" + lexer.lexeme + "\n";
                    break;
                case Clases:
                    resultado += "  <Clases>\t\t" + lexer.lexeme + "\n";
                    break;
                case Excepciones:
                    resultado += "  <Excepciones>\t\t" + lexer.lexeme + "\n";
                    break;
                case EspacioNombre:
                    resultado += "  <EspacioNombre>\t\t" + lexer.lexeme + "\n";
                    break;
                case Herencia:
                    resultado += "  <Herencia>\t\t" + lexer.lexeme + "\n";
                    break;
                case Modificadores:
                    resultado += "  <Modificadores>\t\t" + lexer.lexeme + "\n";
                    break;
                case Variables:
                    resultado += "  <Variables>\t\t" + lexer.lexeme + "\n";
                    break;
                case Ciclos:
                    resultado += "  <Ciclos>\t\t" + lexer.lexeme + "\n";
                    break;
                case Condiciones:
                    resultado += "  <Condiciones>\t\t" + lexer.lexeme + "\n";
                    break;
                case ES:
                    resultado += "  <ES>\t\t" + lexer.lexeme + "\n";
                    break;
                case Require:
                    resultado += "  <Require>\t\t" + lexer.lexeme + "\n";
                    break;
                case Punteros:
                    resultado += "  <Punteros>\t\t" + lexer.lexeme + "\n";
                    break;
                case Genericos:
                    resultado += "  <Genericos>\t\t" + lexer.lexeme + "\n";
                    break;
                case Concurrencia:
                    resultado += "  <Concurrencia>\t\t" + lexer.lexeme + "\n";
                    break;
                case OtrosReservados:
                    resultado += "  <OtrosReservados>\t\t" + lexer.lexeme + "\n";
                    break;
                case Aserciones:
                    resultado += "  <Aserciones>\t\t" + lexer.lexeme + "\n";
                    break;
                case Comentarios:
                    resultado += "  <Comentarios>\t\t" + lexer.lexeme + "\n";
                    break;
                case TipadoDebil:
                    resultado += "  <TipadoDebil>\t\t" + lexer.lexeme + "\n";
                    break;
                case EstructurasAdicionales:
                    resultado += "  <EstructurasAdicionales>\t\t" + lexer.lexeme + "\n";
                    break;
                case Streams:
                    resultado += "  <Streams>\t\t" + lexer.lexeme + "\n";
                    break;
                case Metaprogramacion:
                    resultado += "  <Metaprogramacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case OtrosValores:
                    resultado += "  <OtrosValores>\t\t" + lexer.lexeme + "\n";
                    break;
                case Alias:
                    resultado += "  <Alias>\t\t" + lexer.lexeme + "\n";
                    break;
                case Seguridad:
                    resultado += "  <Seguridad>\t\t" + lexer.lexeme + "\n";
                    break;
                case ManejoMemoria:
                    resultado += "  <ManejoMemoria>\t\t" + lexer.lexeme + "\n";
                    break;
                case Archivos:
                    resultado += "  <Archivos>\t\t" + lexer.lexeme + "\n";
                    break;
                case Redes:
                    resultado += "  <Redes>\t\t" + lexer.lexeme + "\n";
                    break;
                case Web:
                    resultado += "  <Web>\t\t" + lexer.lexeme + "\n";
                    break;
                case Contexpr:
                    resultado += "  <Contexpr>\t\t" + lexer.lexeme + "\n";
                    break;
                case Conceptos:
                    resultado += "  <Conceptos>\t\t" + lexer.lexeme + "\n";
                    break;
                case Sincronizacion:
                    resultado += "  <Sincronizacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case Basededatos:
                    resultado += "  <Basededatos>\t\t" + lexer.lexeme + "\n";
                    break;
                case Vectores:
                    resultado += "  <Vectores>\t\t" + lexer.lexeme + "\n";
                    break;
                case FuncionesEspeciales:
                    resultado += "  <FuncionesEspeciales>\t\t" + lexer.lexeme + "\n";
                    break;
                case CiclosEspeciales:
                    resultado += "  <CiclosEspeciales>\t\t" + lexer.lexeme + "\n";
                    break;
                case TiposEspeciales:
                    resultado += "  <TiposEspeciales>\t\t" + lexer.lexeme + "\n";
                    break;
                case Otros:
                    resultado += "  <Otros>\t\t" + lexer.lexeme + "\n";
                    break;
                case EscrituraPantalla:
                    resultado += "  <EscrituraPantalla>\t\t" + lexer.lexeme + "\n";
                    break;
                case FinalizarPrograma:
                    resultado += "  <FinalizarPrograma>\t\t" + lexer.lexeme + "\n";
                    break;
                case Opcionales:
                    resultado += "  <Opcionales>\t\t" + lexer.lexeme + "\n";
                    break;
                case Iteradores:
                    resultado += "  <Iteradores>\t\t" + lexer.lexeme + "\n";
                    break;
                case Conversiones:
                    resultado += "  <Conversiones>\t\t" + lexer.lexeme + "\n";
                    break;
                case CodigosRetorno:
                    resultado += "  <CodigosRetorno>\t\t" + lexer.lexeme + "\n";
                    break;
                case Estados:
                    resultado += "  <Estados>\t\t" + lexer.lexeme + "\n";
                    break;
                case EstructuraCondicional:
                    resultado += "  <EstructuraCondicional>\t\t" + lexer.lexeme + "\n";
                    break;
                case VariablesEspeciales:
                    resultado += "  <VariablesEspeciales>\t\t" + lexer.lexeme + "\n";
                    break;
                case LiteralesEspeciales:
                    resultado += "  <LiteralesEspeciales>\t\t" + lexer.lexeme + "\n";
                    break;
                case Serializacion:
                    resultado += "  <Serializacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case Tiempo:
                    resultado += "  <Tiempo>\t\t" + lexer.lexeme + "\n";
                    break;
                case Random:
                    resultado += "  <Random>\t\t" + lexer.lexeme + "\n";
                    break;
                case Recursos:
                    resultado += "  <Recursos>\t\t" + lexer.lexeme + "\n";
                    break;
                case Logs:
                    resultado += "  <Logs>\t\t" + lexer.lexeme + "\n";
                    break;
                case Enums:
                    resultado += "  <Enums>\t\t" + lexer.lexeme + "\n";
                    break;
                case Declaraciones:
                    resultado += "  <Declaraciones>\t\t" + lexer.lexeme + "\n";
                    break;
                case Generadores:
                    resultado += "  <Generadores>\t\t" + lexer.lexeme + "\n";
                    break;
                case Modularizacion:
                    resultado += "  <Modularizacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case OperacionesMatematicas:
                    resultado += "  <OperacionesMatematicas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Matrices:
                    resultado += "  <Matrices>\t\t" + lexer.lexeme + "\n";
                    break;
                case Compilacion:
                    resultado += "  <Compilacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case Versiones:
                    resultado += "  <Versiones>\t\t" + lexer.lexeme + "\n";
                    break;
                case Git:
                    resultado += "  <Git>\t\t" + lexer.lexeme + "\n";
                    break;
                case SeguridadWeb:
                    resultado += "  <SeguridadWeb>\t\t" + lexer.lexeme + "\n";
                    break;
                case Anotaciones:
                    resultado += "  <Anotaciones>\t\t" + lexer.lexeme + "\n";
                    break;
                case Proxies:
                    resultado += "  <Proxies>\t\t" + lexer.lexeme + "\n";
                    break;
                case Reflexion:
                    resultado += "  <Reflexion>\t\t" + lexer.lexeme + "\n";
                    break;
                case Identificiadores:
                    resultado += "  <Identificiadores>\t\t" + lexer.lexeme + "\n";
                    break;
                case NumeroEntero:
                    resultado += "  <NumeroEntero>\t\t" + lexer.lexeme + "\n";
                    break;
                case NumeroDecimal:
                    resultado += "  <NumeroDecimal>\t\t" + lexer.lexeme + "\n";
                    break;
                case NumeroHexadecimal:
                    resultado += "  <NumeroHexadecimal>\t\t" + lexer.lexeme + "\n";
                    break;
                case Caracter:
                    resultado += "  <Caracter>\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultado += "  <Cadena>\t\t" + lexer.lexeme + "\n";
                    break;
                case EnlaceExterno:
                    resultado += "  <EnlaceExterno>\t\t" + lexer.lexeme + "\n";
                    break;
                case LlaveApertura:
                    resultado += "  <LlaveApertura>\t\t" + lexer.lexeme + "\n";
                    break;
                case LlaveCerradura:
                    resultado += "  <LlaveCerradura>\t\t" + lexer.lexeme + "\n";
                    break;
                case ParentesisApertura:
                    resultado += "  <ParentesisApertura>\t\t" + lexer.lexeme + "\n";
                    break;
                case ParentesisCerradura:
                    resultado += "  <ParentesisCerradura>\t\t" + lexer.lexeme + "\n";
                    break;
                case CorcheteApertura:
                    resultado += "  <CorcheteApertura>\t\t" + lexer.lexeme + "\n";
                    break;
                case CorcheteCerradura:
                    resultado += "  <CorcheteCerradura>\t\t" + lexer.lexeme + "\n";
                    break;
                case Delimitador:
                    resultado += "  <Delimitador>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnAnalizarLex = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        btnAnalizarSin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Analizador léxico");

        btnArchivo.setText("Abrir archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnAnalizarLex.setText("Analizar");
        btnAnalizarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLexActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        btnAnalizarSin.setText("Analizar");
        btnAnalizarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSinActionPerformed(evt);
            }
        });

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Analizador sintactico");

        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ricardo Ibarra Garcia 22211585 - Lenguajes y Automatas I");

        jLabel4.setText("Ricardo Ibarra Garcia 22211585 - Lenguajes y Automatas I");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAnalizarSin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnArchivo))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAnalizarLex)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArchivo)
                    .addComponent(btnAnalizarLex)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalizarSin)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // TODO add your handling code here:
                JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        try
        {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtResultado.setText(ST);
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnAnalizarLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarLexActionPerformed
        // TODO add your handling code here:
                try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarLexActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        txtAnalizarLex.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtAnalizarSin.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAnalizarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSinActionPerformed
        // TODO add your handling code here:
        String ST = txtResultado.getText();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
        
        try {
            s.parse();
            txtAnalizarSin.setText("Analisis correcto");
            txtAnalizarSin.setForeground(Color.GREEN);
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarSin.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnAnalizarSinActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarLex;
    private javax.swing.JButton btnAnalizarSin;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
