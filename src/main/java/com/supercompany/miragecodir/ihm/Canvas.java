/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supercompany.miragecodir.ihm;


import com.supercompany.miragecodir.ihm.details.DetailsCandidature;
import com.supercompany.miragecodir.ihm.details.DetailsDemandeDeCompetences;
import com.supercompany.miragecodir.ihm.details.DetailsFicheDePoste;
import com.supercompany.miragecodir.ihm.popup.ErrorPopUp;
import com.supercompany.miragecodir.ihm.table.CellRenderer.BlueTableColoredCellRenderer;
import com.supercompany.miragecodir.ihm.table.TableModel.CandidatureTableModel;
import com.supercompany.miragecodir.ihm.table.TableModel.DmdCompetenceTableModel;
import com.supercompany.miragecodir.ihm.table.TableModel.FicheDePosteTableModel;
import com.supercompany.miragecodir.service.RMICODIRClientService;
import fr.jaschavolp.m1.jee.mirageshared.candidature.CandidatureVM;
import fr.jaschavolp.m1.jee.mirageshared.candidature.DetailsCandidatureVM;
import fr.jaschavolp.m1.jee.mirageshared.dmdcompetences.DmdCompetencesVM;
import fr.jaschavolp.m1.jee.mirageshared.fichedeposte.DetailsFichePosteVM;
import fr.jaschavolp.m1.jee.mirageshared.fichedeposte.FichePosteVM;
import fr.jaschavolp.m1.jee.mirageshared.shared.exceptions.IdentifiantInvalideException;
import fr.jaschavolp.m1.jee.mirageshared.shared.services.ServicesCODIRRemote;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;

/**
 * Structure une JFrame de l'application MIA pour les CODIR
 * @author FlorianDELSOL
 */
public class Canvas extends javax.swing.JFrame {
    
    /**
     * Singleton
     */
    private static Canvas canvas;
    
    /**
     * Service par lequel le client communique avec le serveur
     */
    private final ServicesCODIRRemote service;

    /**
     * Créer une nouvelle instance de classe Canvas (pour l'application MIA-CODIR)
     * @throws javax.naming.NamingException
     */
    private Canvas() throws NamingException {
        initComponents();
        service = new RMICODIRClientService().getDabRemoteSvc();
        jLabelTitle.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jSplitPane = new javax.swing.JSplitPane();
        leftSplitBackground = new javax.swing.JPanel();
        boutons = new javax.swing.JPanel();
        jButtonDemandeDeCompetence = new javax.swing.JButton();
        jButtonFicheDePoste = new javax.swing.JButton();
        jPanelTitreApplication = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rightSplitBackground = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jScrollPaneBody = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 540));
        setSize(new java.awt.Dimension(960, 540));

        background.setBackground(new java.awt.Color(255, 255, 255));

        leftSplitBackground.setBackground(new java.awt.Color(50, 50, 98));

        boutons.setBackground(new java.awt.Color(50, 50, 98));
        boutons.setEnabled(false);
        boutons.setLayout(new java.awt.GridLayout(10, 0));

        jButtonDemandeDeCompetence.setBackground(new java.awt.Color(50, 50, 98));
        jButtonDemandeDeCompetence.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonDemandeDeCompetence.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDemandeDeCompetence.setText("Demandes de compétences");
        jButtonDemandeDeCompetence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDemandeDeCompetenceActionPerformed(evt);
            }
        });
        boutons.add(jButtonDemandeDeCompetence);

        jButtonFicheDePoste.setBackground(new java.awt.Color(50, 50, 98));
        jButtonFicheDePoste.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonFicheDePoste.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFicheDePoste.setText("Fiches de postes");
        jButtonFicheDePoste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFicheDePosteActionPerformed(evt);
            }
        });
        boutons.add(jButtonFicheDePoste);

        jPanelTitreApplication.setBackground(new java.awt.Color(50, 50, 98));

        jLabel3.setFont(new java.awt.Font("Vladimir Script", 0, 33)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MIA for CODIR");

        javax.swing.GroupLayout jPanelTitreApplicationLayout = new javax.swing.GroupLayout(jPanelTitreApplication);
        jPanelTitreApplication.setLayout(jPanelTitreApplicationLayout);
        jPanelTitreApplicationLayout.setHorizontalGroup(
            jPanelTitreApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitreApplicationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTitreApplicationLayout.setVerticalGroup(
            jPanelTitreApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitreApplicationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout leftSplitBackgroundLayout = new javax.swing.GroupLayout(leftSplitBackground);
        leftSplitBackground.setLayout(leftSplitBackgroundLayout);
        leftSplitBackgroundLayout.setHorizontalGroup(
            leftSplitBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boutons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTitreApplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftSplitBackgroundLayout.setVerticalGroup(
            leftSplitBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelTitreApplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boutons, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(leftSplitBackground);

        rightSplitBackground.setBackground(new java.awt.Color(50, 50, 98));

        jPanelHeader.setBackground(new java.awt.Color(50, 50, 98));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Titre de la page");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPaneBody.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout rightSplitBackgroundLayout = new javax.swing.GroupLayout(rightSplitBackground);
        rightSplitBackground.setLayout(rightSplitBackgroundLayout);
        rightSplitBackgroundLayout.setHorizontalGroup(
            rightSplitBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPaneBody)
        );
        rightSplitBackgroundLayout.setVerticalGroup(
            rightSplitBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSplitBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneBody, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(rightSplitBackground);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Traitement qui s'execute à la suite d'un clic sur le bouton "Fiche de poste" du menu
     * @param evt 
     */
    private void jButtonFicheDePosteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFicheDePosteActionPerformed
        goToListeFichesDePoste();
    }//GEN-LAST:event_jButtonFicheDePosteActionPerformed

    /**
     * Traitement qui s'execute à la suite d'un clic sur le bouton "Demande de compétences" du menu
     * @param evt 
     */
    private void jButtonDemandeDeCompetenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDemandeDeCompetenceActionPerformed
        goToListeDemandesDeCompetence();
    }//GEN-LAST:event_jButtonDemandeDeCompetenceActionPerformed

    /**
     * Change le Panel "Body" présent dans la jFrame (Partie en bas à droite)
     * @param p 
     */
    private void changerPanel(JPanel p){
        jScrollPaneBody.setViewportView(p);
        this.repaint();
        this.revalidate();
        this.repaint();
    }
    
     /**
     * Charge une page blanche (vide)
     */
    public void goToNothing(){
        JPanel jpanel = new JPanel();
        jpanel.setBackground(Color.white);
        changerPanel(jpanel);
        jLabelTitle.setText("");
    }
    
    /**
     * Charge la page visualisant les informations sur les fiches de poste
     */
    public void goToListeFichesDePoste(){
        //On récupère les informations
        List<FichePosteVM> viewModel = service.consulterLesFichesDePoste();
        //On prépare les JPANEL
        Contenu contenu = new Contenu();
        JPanel panelListe = new JPanel(new GridLayout());
        contenu.setPanelIndex(panelListe);
        //On prépare le tableau
        JTable tableauFdP = new JTable(new FicheDePosteTableModel(viewModel));
        panelListe.add(new JScrollPane(tableauFdP), new GridLayout());
        tableauFdP.setDefaultRenderer(Object.class, new BlueTableColoredCellRenderer());
        tableauFdP.getSelectionModel().addListSelectionListener((ListSelectionEvent e) ->{
            DetailsFichePosteVM detailVM;
            try {
                detailVM = service.consulterLeDetailFicheDePoste(Integer.parseInt(tableauFdP.getValueAt(tableauFdP.getSelectedRow(), 0).toString()));
                contenu.setPanelDetail(new DetailsFicheDePoste(detailVM));
            } catch (IdentifiantInvalideException ex) {
                Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        jLabelTitle.setText("Les fiches de postes");
        changerPanel(contenu);
    }
    
    /**
     * Charge la page visualisant les informations sur les candidatures
     * répondant à une fiche de poste
     * @param identifiantFdP identifiant d'une fiche de poste
     */
    public void goToListeCandidatures(int identifiantFdP){
        //On récupère les informations
        List<CandidatureVM> viewModel;
        try {
            viewModel = service.consulterLesCandidaturesPourUneFicheDePoste(identifiantFdP);
            //On prépare les JPANEL
            Contenu contenu = new Contenu();
            JPanel panelListe = new JPanel(new GridLayout());
            contenu.setPanelIndex(panelListe);
            //On prépare le tableau
            JTable tableauCandidatures = new JTable(new CandidatureTableModel(viewModel));
            panelListe.add(new JScrollPane(tableauCandidatures), new GridLayout());
            tableauCandidatures.setDefaultRenderer(Object.class, new BlueTableColoredCellRenderer());
            tableauCandidatures.getSelectionModel().addListSelectionListener((ListSelectionEvent e) ->{
                DetailsCandidatureVM detailVM;
                try {
                    detailVM = service.consulterLeDetailCandidature(Integer.parseInt(tableauCandidatures.getValueAt(tableauCandidatures.getSelectedRow(), 0).toString()));
                    contenu.setPanelDetail(new DetailsCandidature(detailVM, service));
                } catch (IdentifiantInvalideException ex) {
                    Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            jLabelTitle.setText("Les candidature de la fiche : " + identifiantFdP);
            changerPanel(contenu);
        } catch (IdentifiantInvalideException ex) {
            ErrorPopUp popUp = new ErrorPopUp("Impossible de consulter la liste des candidatures");
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Charge la page visualisant les informations sur les demandes de compétences
     */
    public void goToListeDemandesDeCompetence(){
        //On récupère les informations
        List<DmdCompetencesVM> viewModel = service.consulterLesDemandesDeCompetences();
        //On prépare les JPANEL
        Contenu contenu = new Contenu();
        JPanel panelListe = new JPanel(new GridLayout());
        contenu.setPanelIndex(panelListe);
        //On prépare le tableau
        JTable tableauDmdCompetence = new JTable(new DmdCompetenceTableModel(viewModel));
        tableauDmdCompetence.setDefaultRenderer(Object.class, new BlueTableColoredCellRenderer());
        panelListe.add(new JScrollPane(tableauDmdCompetence), new GridLayout());
        tableauDmdCompetence.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            contenu.setPanelDetail(new DetailsDemandeDeCompetences(viewModel.stream().filter((data) -> data.getIdentifiant().toString().equals(tableauDmdCompetence.getValueAt(tableauDmdCompetence.getSelectedRow(), 0).toString())).findFirst().orElse(null), service));
        });
        jLabelTitle.setText("Liste des demandes de compétences");
        changerPanel(contenu);
    }
    
    /**
     * Créer s'il n'existe pas, ou récupère l'unique instance de classe Canvas
     * @return l'unique instance de Canvas (Mia-Manager)
     */
    public static Canvas getCanvasInstance(){
        if(canvas == null){
            try {
                canvas = new Canvas();
            } catch (NamingException ex) {
                ErrorPopUp errorPopUp = new ErrorPopUp(ex.getMessage());
                Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return canvas;
    }
    
    
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
            java.util.logging.Logger.getLogger(Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Canvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Canvas.getCanvasInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel boutons;
    private javax.swing.JButton jButtonDemandeDeCompetence;
    private javax.swing.JButton jButtonFicheDePoste;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelTitreApplication;
    private javax.swing.JScrollPane jScrollPaneBody;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPanel leftSplitBackground;
    private javax.swing.JPanel rightSplitBackground;
    // End of variables declaration//GEN-END:variables
}
