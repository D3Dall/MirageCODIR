package com.supercompany.miragecodir.ihm.details;

import com.supercompany.miragecodir.ihm.Canvas;
import fr.jaschavolp.m1.jee.mirageshared.fichedeposte.DetailsFichePosteVM;

/**
 * Défini une JPanel personnalisé visualisant l'ensemble des informations d'une fiche de poste
 * @author FlorianDELSOL
 */
public class DetailsFicheDePoste extends javax.swing.JPanel {
    
    private final DetailsFichePosteVM data;

    /**
     * Creates new form DetailFicheDePoste
     * @param data les données sur une fiche de poste
     */
    public DetailsFicheDePoste(DetailsFichePosteVM data) {
        initComponents();
        this.data = data;
        actualize();
    }
    
    private void actualize(){
        if(data != null){
            jLabelIdentifiantData.setText(data.getIdentifiant().toString());
            jLabelNomData.setText(data.getNom());
            jLabelPresentationData.setText(data.getPresentationPoste());
            jLabelPresentationEntrepriseData.setText(data.getPresentationEntreprise());
            jLabelStatutData.setText(data.getStatut());
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

        jPanelIdentifiant = new javax.swing.JPanel();
        jLabelIdentifiantTitre = new javax.swing.JLabel();
        jLabelIdentifiantData = new javax.swing.JLabel();
        jPanelNom = new javax.swing.JPanel();
        jLabelNomTitre = new javax.swing.JLabel();
        jLabelNomData = new javax.swing.JLabel();
        jPanelPresentation = new javax.swing.JPanel();
        jLabelPresentationTitre = new javax.swing.JLabel();
        jLabelPresentationData = new javax.swing.JLabel();
        jPanelPresentationEntreprise = new javax.swing.JPanel();
        jLabelPresentationEntrepriseTitre = new javax.swing.JLabel();
        jLabelPresentationEntrepriseData = new javax.swing.JLabel();
        jPanelStatut = new javax.swing.JPanel();
        jLabelStatutTitre = new javax.swing.JLabel();
        jLabelStatutData = new javax.swing.JLabel();
        jPanelAction = new javax.swing.JPanel();
        jButtonVoirCandidatures = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelIdentifiant.setBackground(new java.awt.Color(250, 250, 255));

        jLabelIdentifiantTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelIdentifiantTitre.setText("Identifiant :");

        jLabelIdentifiantData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelIdentifiantData.setText("identifiant");

        javax.swing.GroupLayout jPanelIdentifiantLayout = new javax.swing.GroupLayout(jPanelIdentifiant);
        jPanelIdentifiant.setLayout(jPanelIdentifiantLayout);
        jPanelIdentifiantLayout.setHorizontalGroup(
            jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIdentifiantTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIdentifiantData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIdentifiantLayout.setVerticalGroup(
            jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIdentifiantLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIdentifiantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIdentifiantLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelIdentifiantData))
                    .addComponent(jLabelIdentifiantTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelNom.setBackground(new java.awt.Color(250, 250, 255));

        jLabelNomTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelNomTitre.setText("Nom de la fiche");

        jLabelNomData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelNomData.setText("Nom de la fiche");
        jLabelNomData.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelNomLayout = new javax.swing.GroupLayout(jPanelNom);
        jPanelNom.setLayout(jPanelNomLayout);
        jPanelNomLayout.setHorizontalGroup(
            jPanelNomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNomLayout.createSequentialGroup()
                        .addComponent(jLabelNomTitre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelNomData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelNomLayout.setVerticalGroup(
            jPanelNomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNomData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelPresentation.setBackground(new java.awt.Color(250, 250, 255));

        jLabelPresentationTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelPresentationTitre.setText("Présentation du poste");

        jLabelPresentationData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelPresentationData.setText("Ici, la présentation du poste");
        jLabelPresentationData.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelPresentationLayout = new javax.swing.GroupLayout(jPanelPresentation);
        jPanelPresentation.setLayout(jPanelPresentationLayout);
        jPanelPresentationLayout.setHorizontalGroup(
            jPanelPresentationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPresentationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPresentationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPresentationLayout.createSequentialGroup()
                        .addComponent(jLabelPresentationTitre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelPresentationData, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPresentationLayout.setVerticalGroup(
            jPanelPresentationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPresentationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPresentationTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPresentationData, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelPresentationEntreprise.setBackground(new java.awt.Color(250, 250, 255));

        jLabelPresentationEntrepriseTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelPresentationEntrepriseTitre.setText("Présentation de l'entreprise");

        jLabelPresentationEntrepriseData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelPresentationEntrepriseData.setText("Ici, la présentation de l'entreprise.");
        jLabelPresentationEntrepriseData.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelPresentationEntrepriseLayout = new javax.swing.GroupLayout(jPanelPresentationEntreprise);
        jPanelPresentationEntreprise.setLayout(jPanelPresentationEntrepriseLayout);
        jPanelPresentationEntrepriseLayout.setHorizontalGroup(
            jPanelPresentationEntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPresentationEntrepriseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPresentationEntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPresentationEntrepriseData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPresentationEntrepriseLayout.createSequentialGroup()
                        .addComponent(jLabelPresentationEntrepriseTitre)
                        .addGap(203, 203, 203)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPresentationEntrepriseLayout.setVerticalGroup(
            jPanelPresentationEntrepriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPresentationEntrepriseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPresentationEntrepriseTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPresentationEntrepriseData, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelStatut.setBackground(new java.awt.Color(250, 250, 255));

        jLabelStatutTitre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelStatutTitre.setText("Statut");

        jLabelStatutData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelStatutData.setText("Ici, le statut de la fiche de poste");
        jLabelStatutData.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelStatutLayout = new javax.swing.GroupLayout(jPanelStatut);
        jPanelStatut.setLayout(jPanelStatutLayout);
        jPanelStatutLayout.setHorizontalGroup(
            jPanelStatutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStatutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelStatutLayout.createSequentialGroup()
                        .addComponent(jLabelStatutTitre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelStatutData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelStatutLayout.setVerticalGroup(
            jPanelStatutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStatutTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStatutData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelAction.setBackground(new java.awt.Color(50, 50, 98));

        jButtonVoirCandidatures.setBackground(new java.awt.Color(50, 50, 98));
        jButtonVoirCandidatures.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonVoirCandidatures.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoirCandidatures.setText("Voir les candidatures");
        jButtonVoirCandidatures.setFocusable(false);
        jButtonVoirCandidatures.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVoirCandidatures.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonVoirCandidatures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoirCandidaturesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelActionLayout = new javax.swing.GroupLayout(jPanelAction);
        jPanelAction.setLayout(jPanelActionLayout);
        jPanelActionLayout.setHorizontalGroup(
            jPanelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelActionLayout.createSequentialGroup()
                .addComponent(jButtonVoirCandidatures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(583, 583, 583))
        );
        jPanelActionLayout.setVerticalGroup(
            jPanelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelActionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonVoirCandidatures))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIdentifiant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPresentation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPresentationEntreprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelStatut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelIdentifiant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanelNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelStatut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelPresentation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPresentationEntreprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoirCandidaturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoirCandidaturesActionPerformed
        Canvas.getCanvasInstance().goToListeCandidatures(data.getIdentifiant());
    }//GEN-LAST:event_jButtonVoirCandidaturesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoirCandidatures;
    private javax.swing.JLabel jLabelIdentifiantData;
    private javax.swing.JLabel jLabelIdentifiantTitre;
    private javax.swing.JLabel jLabelNomData;
    private javax.swing.JLabel jLabelNomTitre;
    private javax.swing.JLabel jLabelPresentationData;
    private javax.swing.JLabel jLabelPresentationEntrepriseData;
    private javax.swing.JLabel jLabelPresentationEntrepriseTitre;
    private javax.swing.JLabel jLabelPresentationTitre;
    private javax.swing.JLabel jLabelStatutData;
    private javax.swing.JLabel jLabelStatutTitre;
    private javax.swing.JPanel jPanelAction;
    private javax.swing.JPanel jPanelIdentifiant;
    private javax.swing.JPanel jPanelNom;
    private javax.swing.JPanel jPanelPresentation;
    private javax.swing.JPanel jPanelPresentationEntreprise;
    private javax.swing.JPanel jPanelStatut;
    // End of variables declaration//GEN-END:variables
}
