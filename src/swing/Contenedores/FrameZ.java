/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.Contenedores;

import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author darce
 */
public class FrameZ extends JFrame {

    private String title = "";
    int x = 0, y = 0;
    boolean isMax = false;

    public FrameZ() {
        initComponents();
    }

    public FrameZ(String title) {
        this.title = title;
        initComponents();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Creates new form FrameZ
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pToolBar = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        bCerrar = new javax.swing.JButton();
        bMaximizar = new javax.swing.JButton();
        bMinimizar = new javax.swing.JButton();
        pContent = new javax.swing.JPanel();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pToolBar.setBackground(new java.awt.Color(0, 102, 255));
        pToolBar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        pToolBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pToolBarMouseDragged(evt);
            }
        });
        pToolBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pToolBarMousePressed(evt);
            }
        });
        pToolBar.setLayout(new java.awt.GridBagLayout());

        lTitle.setForeground(new java.awt.Color(29, 32, 98));
        lTitle.setText("Texto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        pToolBar.add(lTitle, gridBagConstraints);

        bCerrar.setBackground(new java.awt.Color(0, 102, 255));
        bCerrar.setToolTipText("");
        bCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCerrarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCerrarMouseEntered(evt);
            }
        });
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pToolBar.add(bCerrar, gridBagConstraints);

        bMaximizar.setBackground(new java.awt.Color(0, 102, 255));
        bMaximizar.setToolTipText("");
        bMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bMaximizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bMaximizarMouseExited(evt);
            }
        });
        bMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaximizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pToolBar.add(bMaximizar, gridBagConstraints);

        bMinimizar.setBackground(new java.awt.Color(0, 102, 255));
        bMinimizar.setToolTipText("");
        bMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bMinimizarMouseExited(evt);
            }
        });
        bMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinimizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pToolBar.add(bMinimizar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(pToolBar, gridBagConstraints);

        pContent.setBackground(new java.awt.Color(255, 247, 162));

        javax.swing.GroupLayout pContentLayout = new javax.swing.GroupLayout(pContent);
        pContent.setLayout(pContentLayout);
        pContentLayout.setHorizontalGroup(
            pContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pContentLayout.setVerticalGroup(
            pContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        getContentPane().add(pContent, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void bCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCerrarMouseExited
        bCerrar.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_bCerrarMouseExited

    private void bCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCerrarMouseEntered
        //[0,153,255]
        bCerrar.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_bCerrarMouseEntered

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bCerrarActionPerformed

    private void bMaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMaximizarMouseEntered
        bMaximizar.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_bMaximizarMouseEntered

    private void bMaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMaximizarMouseExited
        bMaximizar.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_bMaximizarMouseExited

    private void bMaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaximizarActionPerformed
        if (isMax) {
            this.setExtendedState(NORMAL);
            isMax = false;
        } else {
            this.setExtendedState(MAXIMIZED_BOTH);
            isMax = true;
        }
    }//GEN-LAST:event_bMaximizarActionPerformed

    private void bMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMinimizarMouseEntered
        bMinimizar.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_bMinimizarMouseEntered

    private void bMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMinimizarMouseExited
        bMinimizar.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_bMinimizarMouseExited

    private void bMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_bMinimizarActionPerformed

    private void pToolBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pToolBarMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_pToolBarMouseDragged

    private void pToolBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pToolBarMousePressed

        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_pToolBarMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getContentPane().setBackground(new Color(0, 0, 204));
        //creando iconos 
        ImageIcon iconoCerrar, iconoMinimizar, iconoMaximizar;
        URL ruta = getClass().getClassLoader().getResource("img//close.png");
        iconoCerrar = new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        bCerrar.setIcon(iconoCerrar);
        ruta = getClass().getClassLoader().getResource("img//minimize.png");
        iconoMinimizar = new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        bMinimizar.setIcon(iconoMinimizar);
        ruta = getClass().getClassLoader().getResource("img//maximizar.png");
        iconoMaximizar = new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        bMaximizar.setIcon(iconoMaximizar);
        //escribiendo título
        if ("".equals(title)) {
            title = "Nueva Ventana";
        }
        lTitle.setText(title);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String[] args) {
                /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameZ prueba = new FrameZ("Axel García");
                prueba.setSize(600, 700);
                prueba.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bMaximizar;
    private javax.swing.JButton bMinimizar;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pContent;
    private javax.swing.JPanel pToolBar;
    // End of variables declaration//GEN-END:variables
}
