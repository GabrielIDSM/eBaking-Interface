/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.pkg;
import Classes_utilit.pkg.*;
import Contas.pkg.*;
/**
 *
 * @author Gabri
 */
public class interfaceComum extends javax.swing.JPanel {
//Atributos IN
    static verificarExtrato V = null;
    static fazerTransferencia T = null;
    static emprego E = null;
    static empregoCargoAtual ECA = null;
    static empregoDem Dem = null;
    static empregoOfertas Ofertas = null;
    static poupanca Pou = null;
    static poupancaNovaPoupanca NvPo = null;
    static poupancaGerenciar PouGe = null;
    static emprestimo Emp = null;
    String conta;
    String senha;
    String saldo;
    String nome;
    String[] auxS;
    //Método construtor IN
    public interfaceComum(String conta, String senha) {
        this.conta = conta;
        this.senha = senha;
        this.auxS = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +this.conta+"\\Saldo.txt");
        this.saldo = this.auxS[this.auxS.length - 1];
        String[] auxNome = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +this.conta+"\\Nome.txt");
        this.nome = auxNome[0];
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        lSaldo = new javax.swing.JLabel();
        lImagem = new javax.swing.JLabel();
        lImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pkg/"+this.conta+".png")));
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lData = new javax.swing.JLabel();
        lData.setText(temporizadorDataTempo.retornaStringDataAtual());

        setBackground(new java.awt.Color(0, 0, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(214, 214, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 70), 2));

        lNome.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lNome.setForeground(new java.awt.Color(0, 0, 70));
        lNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNome.setText("Nome");
        lNome.setText(this.nome);

        lSaldo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lSaldo.setForeground(new java.awt.Color(0, 0, 70));
        lSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSaldo.setText("Saldo");
        lSaldo.setText("Saldo: "+stringSaldo.retornaStringSaldo(this.saldo));

        lImagem.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lImagem.setForeground(new java.awt.Color(0, 0, 0));
        lImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lImagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lNome)
                .addGap(18, 18, 18)
                .addComponent(lSaldo)
                .addGap(20, 20, 20))
        );

        jDesktopPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jDesktopPane1ComponentRemoved(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 70));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Transferência");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 70));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Extrato");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 70));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Emprego");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 70));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Poupança");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 70));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Empréstimo");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTA COMUM");

        lData.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        lData.setForeground(new java.awt.Color(255, 255, 255));
        lData.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lData.setText("data");
        lData.setText(temporizadorDataTempo.retornaStringDataAtual());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                        .addComponent(lData, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (T != null) {
            jDesktopPane1.remove(T);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        T = new fazerTransferencia(this.conta, this.senha);
        jDesktopPane1.add(T);
        T.setLocation(40,40);
        T.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDesktopPane1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentRemoved
        this.auxS = leituraEscrita.Leitura("Arquivos\\DadosContas\\"
        +this.conta+"\\Saldo.txt");
        this.saldo = this.auxS[this.auxS.length - 1];
        lSaldo.setText("Saldo: "+stringSaldo.retornaStringSaldo(this.saldo));
    }//GEN-LAST:event_jDesktopPane1ComponentRemoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (V != null) {
            jDesktopPane1.remove(V);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        V = new verificarExtrato(this.conta);
        jDesktopPane1.add(V);
        V.setLocation(40,40);
        V.setVisible(true);       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (ECA != null) {
            jDesktopPane1.remove(ECA);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        if (E != null) {
            jDesktopPane1.remove(E);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        if (Dem != null) {
            jDesktopPane1.remove(Dem);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        if (Ofertas != null) {
            jDesktopPane1.remove(Ofertas);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        E = new emprego(this.conta, this.senha);
        jDesktopPane1.add(E);
        E.setLocation(40,40);
        E.setVisible(true);       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (Pou != null) {
            jDesktopPane1.remove(Pou);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        if (interfaceComum.NvPo != null) {
            jDesktopPane1.remove(interfaceComum.NvPo);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        if (interfaceComum.PouGe != null) {
            jDesktopPane1.remove(interfaceComum.PouGe);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        Pou = new poupanca(this.conta, this.senha, 0);
        jDesktopPane1.add(Pou);
        Pou.setLocation(40,40);
        Pou.setVisible(true);     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (Emp != null) {
            jDesktopPane1.remove(Emp);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        Emp = new emprestimo(this.conta, this.senha, 0);
        jDesktopPane1.add(Emp);
        Emp.setLocation(20,40);
        Emp.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void retornaECA(empregoCargoAtual ECAins){
        if (ECA != null) {
            jDesktopPane1.remove(ECA);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        interfaceComum.ECA = ECAins;
        jDesktopPane1.add(ECA);
        ECA.setVisible(true);
        ECA.setLocation(25, 0);
        jDesktopPane1.repaint();
        jDesktopPane1.revalidate();
    }

    public static void retornaDem(empregoDem D) {
        if (Dem != null) {
            jDesktopPane1.remove(Dem);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        interfaceComum.Dem = D;
        jDesktopPane1.add(Dem);
        Dem.setVisible(true);
        Dem.setLocation(25, 0);
        jDesktopPane1.repaint();
        jDesktopPane1.revalidate();
    }
    
    public static void retornaOfertas(empregoOfertas O) {
        if (Ofertas != null) {
            jDesktopPane1.remove(Ofertas);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        interfaceComum.Ofertas = O;
        jDesktopPane1.add(Ofertas);
        Ofertas.setVisible(true);
        Ofertas.setLocation(40, 0);
        jDesktopPane1.repaint();
        jDesktopPane1.revalidate();
    }
    
    public static void retornaNovaPoupanca(poupancaNovaPoupanca NvP) {
        if (interfaceComum.NvPo != null) {
            jDesktopPane1.remove(interfaceComum.NvPo);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        interfaceComum.NvPo = NvP;
        jDesktopPane1.add(NvPo);
        NvPo.setVisible(true);
        NvPo.setLocation(6, 0);
        jDesktopPane1.repaint();
        jDesktopPane1.revalidate();
    }
    
    public static void retornaPoupancaGerenciar(poupancaGerenciar PG) {
        if (interfaceComum.PouGe != null) {
            jDesktopPane1.remove(interfaceComum.PouGe);
            jDesktopPane1.repaint();
            jDesktopPane1.revalidate();
        }
        interfaceComum.PouGe = PG;
        jDesktopPane1.add(PouGe);
        PouGe.setVisible(true);
        PouGe.setLocation(40, 30);
        jDesktopPane1.repaint();
        jDesktopPane1.revalidate();
    }
    
    public static void atualizaSaldo(String saldo){
        lSaldo.setText("Saldo: "+stringSaldo.retornaStringSaldo(saldo));
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lData;
    private javax.swing.JLabel lImagem;
    private javax.swing.JLabel lNome;
    public static javax.swing.JLabel lSaldo;
    // End of variables declaration//GEN-END:variables
}
