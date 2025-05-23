/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

import static codigo.Tokens.CorcheteCerradura;
import static codigo.Tokens.NumeroDecimal;
import static codigo.Tokens.NumeroEntero;
import static codigo.Tokens.NumeroHexadecimal;
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
 * @author Ricardo Ibarra
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
                this.setLocationRelativeTo(null);

    }
    
    private void analizarLexico() throws IOException
    {
            int contador = 1;
    
    String expr = (String) TextoResultado.getText();
    Lexer lexer = new Lexer(new StringReader(expr));
    String resultado = "LINEA " + contador + "\t\tSIMBOLO\n";
    while (true)
            {
                Tokens token = lexer.yylex();
                if(token == null)
                {
                    TextoLexico.setText(resultado);
                    return;
                }
                switch (token) {
            case Linea:
                contador++;
                resultado += "LINEA " + contador + "\n";
                break;
    case Pregunta:
        resultado += "  <Pregunta>\t\t" + lexer.lexeme + "\n";
        break;
    case Contrario:
        resultado += "  <Contrario>\t\t" + lexer.lexeme + "\n";
        break;
        case NumeroEntero:
        resultado += "  <NumeroEntero>\t" + lexer.lexeme + "\n";
        break;
    case NumeroDecimal:
        resultado += "  <NumeroDecimal>\t" + lexer.lexeme + "\n";
        break;
    case NumeroHexadecimal:
        resultado += "  <NumeroHexadecimal>\t" + lexer.lexeme + "\n";
        break;
    case Comparar:
        resultado += "  <Comparar>\t\t" + lexer.lexeme + "\n";
        break;
    case Identificador:
        resultado += "  <Identificador>\t" + lexer.lexeme + "\n";
        break;
    case Literal:
        resultado += "  <Literal>\t\t" + lexer.lexeme + "\n";
        break;
    case Numero:
        resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
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
        resultado += "  <ControlFlujo>\t" + lexer.lexeme + "\n";
        break;
    case Constantes:
        resultado += "  <Constantes>\t\t" + lexer.lexeme + "\n";
        break;
    case OperadoresEspeciales:
        resultado += "  <OperadoresEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case ManejoErrores:
        resultado += "  <ManejoErrores>\t" + lexer.lexeme + "\n";
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
        resultado += "  <EspacioNombre>\t" + lexer.lexeme + "\n";
        break;
    case Herencia:
        resultado += "  <Herencia>\t\t" + lexer.lexeme + "\n";
        break;
    case Modificadores:
        resultado += "  <Modificadores>\t" + lexer.lexeme + "\n";
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
        resultado += "  <Concurrencia>\t" + lexer.lexeme + "\n";
        break;
    case OtrosReservados:
        resultado += "  <OtrosReservados>\t" + lexer.lexeme + "\n";
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
        resultado += "  <EstructurasAdicionales>\t" + lexer.lexeme + "\n";
        break;
    case Streams:
        resultado += "  <Streams>\t\t" + lexer.lexeme + "\n";
        break;
    case Metaprogramacion:
        resultado += "  <Metaprogramacion>\t" + lexer.lexeme + "\n";
        break;
    case OtrosValores:
        resultado += "  <OtrosValores>\t" + lexer.lexeme + "\n";
        break;
    case Alias:
        resultado += "  <Alias>\t\t" + lexer.lexeme + "\n";
        break;
    case Seguridad:
        resultado += "  <Seguridad>\t\t" + lexer.lexeme + "\n";
        break;
    case ManejoMemoria:
        resultado += "  <ManejoMemoria>\t" + lexer.lexeme + "\n";
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
        resultado += "  <Sincronizacion>\t" + lexer.lexeme + "\n";
        break;
    case Basededatos:
        resultado += "  <Basededatos>\t\t" + lexer.lexeme + "\n";
        break;
    case Vectores:
        resultado += "  <Vectores>\t\t" + lexer.lexeme + "\n";
        break;
    case FuncionesEspeciales:
        resultado += "  <FuncionesEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case CiclosEspeciales:
        resultado += "  <CiclosEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case TiposEspeciales:
        resultado += "  <TiposEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case Otros:
        resultado += "  <Otros>\t\t" + lexer.lexeme + "\n";
        break;
    case EscrituraPantalla:
        resultado += "  <EscrituraPantalla>\t" + lexer.lexeme + "\n";
        break;
    case FinalizarPrograma:
        resultado += "  <FinalizarPrograma>\t" + lexer.lexeme + "\n";
        break;
    case Opcionales:
        resultado += "  <Opcionales>\t\t" + lexer.lexeme + "\n";
        break;
    case Iteradores:
        resultado += "  <Iteradores>\t\t" + lexer.lexeme + "\n";
        break;
    case Conversiones:
        resultado += "  <Conversiones>\t" + lexer.lexeme + "\n";
        break;
    case CodigosRetorno:
        resultado += "  <CodigosRetorno>\t" + lexer.lexeme + "\n";
        break;
    case Estados:
        resultado += "  <Estados>\t\t" + lexer.lexeme + "\n";
        break;
    case EstructuraCondicional:
        resultado += "  <EstructuraCondicional>\t" + lexer.lexeme + "\n";
        break;
    case VariablesEspeciales:
        resultado += "  <VariablesEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case LiteralesEspeciales:
        resultado += "  <LiteralesEspeciales>\t" + lexer.lexeme + "\n";
        break;
    case Serializacion:
        resultado += "  <Serializacion>\t" + lexer.lexeme + "\n";
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
        resultado += "  <Declaraciones>\t" + lexer.lexeme + "\n";
        break;
    case Generadores:
        resultado += "  <Generadores>\t\t" + lexer.lexeme + "\n";
        break;
    case Modularizacion:
        resultado += "  <Modularizacion>\t" + lexer.lexeme + "\n";
        break;
    case OperacionesMatematicas:
        resultado += "  <OperacionesMatematicas>\t" + lexer.lexeme + "\n";
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
        resultado += "  <SeguridadWeb>\t" + lexer.lexeme + "\n";
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
        resultado += "  <Identificiadores>\t" + lexer.lexeme + "\n";
        break;
    case Caracter:
        resultado += "  <Caracter>\t\t" + lexer.lexeme + "\n";
        break;
    case Cadena:
        resultado += "  <Cadena>\t\t" + lexer.lexeme + "\n";
        break;
    case EnlaceExterno:
        resultado += "  <EnlaceExterno>\t" + lexer.lexeme + "\n";
        break;
    case LlaveApertura:
        resultado += "  <LlaveApertura>\t" + lexer.lexeme + "\n";
        break;
    case LlaveCerradura:
        resultado += "  <LlaveCerradura>\t" + lexer.lexeme + "\n";
        break;
    case ParentesisApertura:
        resultado += "  <ParentesisApertura>\t" + lexer.lexeme + "\n";
        break;
    case ParentesisCerradura:
        resultado += "  <ParentesisCerradura>\t" + lexer.lexeme + "\n";
        break;
    case CorcheteApertura:
        resultado += "  <CorcheteApertura>\t" + lexer.lexeme + "\n";
        break;
    case CorcheteCerradura:
        resultado += "  <CorcheteCerradura>\t" + lexer.lexeme + "\n";
        break;
    case Delimitador:
        resultado += "  <Delimitador>\t" + lexer.lexeme + "\n";
        break;
    case ERROR:
        resultado += "  <ERROR>\t\t" + lexer.lexeme + "\n";
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
        BotonArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoLexico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextoResultado = new javax.swing.JTextArea();
        BtnAnalizarLexico = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextoSintactico = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Analizador léxico");

        BotonArchivo.setText("Abrir archivo");
        BotonArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArchivoActionPerformed(evt);
            }
        });

        TextoLexico.setEditable(false);
        TextoLexico.setColumns(20);
        TextoLexico.setRows(5);
        jScrollPane1.setViewportView(TextoLexico);

        TextoResultado.setColumns(20);
        TextoResultado.setRows(5);
        jScrollPane2.setViewportView(TextoResultado);

        BtnAnalizarLexico.setText("Analizar");
        BtnAnalizarLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarLexicoActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Analizador sintactico");

        TextoSintactico.setEditable(false);
        TextoSintactico.setColumns(20);
        TextoSintactico.setRows(5);
        jScrollPane3.setViewportView(TextoSintactico);

        jButton4.setText("Analizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        label1.setText("Ricardo Ibarra Garcia 22211585 - Lenguajes y Automatas I");

        label2.setText("Ricardo Ibarra Garcia 22211585 - Lenguajes y Automatas I");

        label3.setText("Ricardo Ibarra Garcia 22211585 - Lenguajes y Automatas I");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAnalizarLexico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))))
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonArchivo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonArchivo)
                            .addComponent(BtnAnalizarLexico)))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            TextoResultado.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonArchivoActionPerformed

    private void BtnAnalizarLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnalizarLexicoActionPerformed
        // TODO add your handling code here:
                try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAnalizarLexicoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                TextoLexico.setText(null);
                TextoResultado.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String ST = TextoResultado.getText();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
        
        try {
            s.parse();
            TextoSintactico.setText("Analisis correcto");
        } catch (Exception ex) {
            Symbol sym = s.getS();
            TextoSintactico.setText("Analisis incorrecto, error linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                        TextoSintactico.setText(null);

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonArchivo;
    private javax.swing.JButton BtnAnalizarLexico;
    private javax.swing.JTextArea TextoLexico;
    private javax.swing.JTextArea TextoResultado;
    private javax.swing.JTextArea TextoSintactico;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables

}
