package management;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class testPanel extends JPanel {
  JTextField jTextField1 = new JTextField();
  JLabel jLabel1 = new JLabel();
  JButton jButton1 = new JButton();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JLabel jLabel6 = new JLabel();
  TitledBorder titledBorder1;
  TitledBorder titledBorder2;
  TitledBorder titledBorder3;
  TitledBorder titledBorder4;
  Connection con;
  JLabel jLabel2 = new JLabel();
  JLabel jLabel7 = new JLabel();
  TitledBorder titledBorder5;
  JButton jButton2 = new JButton();
  JLabel jLabel8 = new JLabel();
  JTextField jTextField2 = new JTextField();
  JLabel jLabel9 = new JLabel();
  JLabel jLabel10 = new JLabel();
  TitledBorder titledBorder6;
  GridBagLayout gridBagLayout1 = new GridBagLayout();

  public testPanel() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    titledBorder1 = new TitledBorder("");
    titledBorder2 = new TitledBorder("");
    titledBorder3 = new TitledBorder("");
    titledBorder4 = new TitledBorder("");
    titledBorder5 = new TitledBorder("");
    titledBorder6 = new TitledBorder("");
    jTextField1.setText("");
    this.setLayout(gridBagLayout1);
    jLabel1.setFont(new java.awt.Font("����", 1, 22));
    jLabel1.setText("������������(<=20��)��");
    jButton1.setBackground(new Color(151, 164, 203));
    jButton1.setFont(new java.awt.Font("Dialog", 0, 13));
    jButton1.setActionCommand("ȷ��");
    jButton1.setText("ȷ��");
    jButton1.addActionListener(new testPanel_jButton1_actionAdapter(this));
    jLabel3.setFont(new java.awt.Font("����", 1, 22));
    jLabel3.setText("���û������õȼ�Ϊ��");
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel4.setBorder(titledBorder2);
    jLabel4.setDebugGraphicsOptions(0);
    jLabel4.setText("");
    jLabel5.setFont(new java.awt.Font("����", 1, 22));
    jLabel5.setText("���û���͸֧��Ϊ��");
    jLabel6.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel6.setBorder(titledBorder4);
    jLabel6.setText("");

      Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
       String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CCES";
       String username= "sa";
       String password= "";
       con = DriverManager.getConnection(url,username,password);

    jLabel2.setFont(new java.awt.Font("����", 1, 22));
    jLabel2.setText("���û��ĳ�����Ϊ��");
    jLabel7.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel7.setBorder(titledBorder5);
    jLabel7.setText("");
    jButton2.setBackground(new Color(151, 164, 203));
    jButton2.setFont(new java.awt.Font("Dialog", 0, 13));
    jButton2.setToolTipText("");
    jButton2.setText("����");
    jButton2.addActionListener(new testPanel_jButton2_actionAdapter(this));
    jLabel8.setFont(new java.awt.Font("����", 1, 22));
    jLabel8.setText("�������û��ţ�");
    jLabel9.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel9.setText("���û������ÿ����ţ�");
    jLabel10.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel10.setBorder(titledBorder6);
    jLabel10.setRequestFocusEnabled(true);
    jLabel10.setText("");
    this.setBackground(new Color(217, 230, 236));
    this.add(jLabel1,  new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(14, 13, 0, 0), 2, 4));
    this.add(jTextField1,  new GridBagConstraints(2, 1, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(19, 14, 0, 8), 137, 1));
    this.add(jTextField2,  new GridBagConstraints(2, 0, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(12, 14, 0, 8), 135, 2));
    this.add(jLabel8,  new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(12, 13, 0, 39), 43, -2));
    this.add(jLabel5,  new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(10, 13, 22, 29), 7, -1));
    this.add(jLabel6,  new GridBagConstraints(1, 6, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(12, 8, 22, 18), 141, 12));
    this.add(jLabel3,  new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(6, 13, 0, 9), 5, 14));
    this.add(jLabel2,  new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(10, 13, 0, 16), 22, 0));
    this.add(jLabel9,  new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(15, 13, 0, 0), 12, -5));
    this.add(jButton1,  new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(14, 126, 0, 59), 12, -4));
    this.add(jButton2,  new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(14, 0, 0, 105), 12, -4));
    this.add(jLabel7,  new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(12, 8, 0, 17), 142, 13));
    this.add(jLabel10,  new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(18, 8, 0, 18), 141, 12));
    this.add(jLabel4,  new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(14, 8, 8, 18), 141, 12));
  }
  public int Badrecordadjust(){
     PreparedStatement pstmt5;
     ResultSet rs5;
     String strx0 = "";
     String queryb;
     String queryx[] = new String[3];
     String strbl = "";
     String strbx1[] = new String[3];
     int sum1=0;
    try{
           //����״��
          queryb= "select * from Users where userid=?";
          pstmt5 = con.prepareStatement(queryb);
         strx0=jTextField2.getText();
         pstmt5.setString(1,strx0);
          rs5=pstmt5.executeQuery();
          if(rs5.next()){
          strbl=rs5.getString("MarriageState");
          }
       if(strbl!=null) {
          if (strbl.equals("δ��")) {
            queryx[0] = "select Nomarry from userlist ";
            strbx1[0] = "Nomarry";
         }
          else if (strbl.equals("�ѻ�����Ů")) {
            queryx[0] = "select MarriedBaby from userlist";
            strbx1[0] = "MarriedBaby";
          }
          else if (strbl.equals("�ѻ�����Ů")) {
            queryx[0] = "select MarriedNoBaby from userlist";
            strbx1[0] = "MarriedNoBaby";
          }
          else if (strbl.equals("����")) {
            queryx[0] = "select OtherMarry from userlist";
            strbx1[0] = "OtherMarry";
          }
          pstmt5 = con.prepareStatement(queryx[0]);
          rs5 = pstmt5.executeQuery();
          if (rs5.next()) {
            strx0 = rs5.getString(strbx1[0]); //������
           sum1 += Integer.parseInt(strx0);
           jTextField1.setText(sum1+" ");
          }
        }
        else  sum1 += 0;
        // �Ա�
      queryb= "select * from Users where userid=?";
      pstmt5 = con.prepareStatement(queryb);
     strx0=jTextField2.getText();
     pstmt5.setString(1,strx0);
      rs5=pstmt5.executeQuery();
      if(rs5.next()){
      strbl=rs5.getString("UserSex");
      }
   if(strbl!=null) {
      if (strbl.equals("��")) {
        queryx[0] = "select Male from userlist ";
        strbx1[0] = "Male";
     }
      else if (strbl.equals("Ů")) {
        queryx[0] = "select Female from userlist";
        strbx1[0] = "Female";
      }
      pstmt5 = con.prepareStatement(queryx[0]);
      rs5 = pstmt5.executeQuery();
      if (rs5.next()) {
        strx0 = rs5.getString(strbx1[0]); //������
        sum1 += Integer.parseInt(strx0);
        jTextField1.setText(sum1+" ");
      }
    }
    else  sum1 += 0;
    // �Ļ��̶�
        queryb= "select * from Users where userid=?";
        pstmt5 = con.prepareStatement(queryb);
       strx0=jTextField2.getText();
       pstmt5.setString(1,strx0);
        rs5=pstmt5.executeQuery();
        if(rs5.next()){
        strbl=rs5.getString("CultureState");
        }
     if(strbl!=null) {
        if (strbl.equals("�о�������")) {
          queryx[0] = "select GraduateS from userlist ";
          strbx1[0] = "GraduateS";
       }
        else if (strbl.equals("����")) {
          queryx[0] = "select UnGraduateS from userlist";
          strbx1[0] = "UnGraduateS";
        }
        else if (strbl.equals("��ר")) {
         queryx[0] = "select Junior from userlist";
         strbx1[0] = "Junior";
       }
       else if (strbl.equals("��ר������")) {
         queryx[0] = "select Intermediate from userlist";
         strbx1[0] = "Intermediate";
         }
      else if (strbl.equals("����")) {
         queryx[0] = "select OtherKnowledge from userlist";
         strbx1[0] = "OtherKnowledge";
        }
        pstmt5 = con.prepareStatement(queryx[0]);
        rs5 = pstmt5.executeQuery();
        if (rs5.next()) {
          strx0 = rs5.getString(strbx1[0]); //������
          sum1 += Integer.parseInt(strx0);
          jTextField1.setText(sum1+" ");
        }
      }
      else  sum1 += 0;
      // סլ����
             queryb= "select * from Users where userid=?";
             pstmt5 = con.prepareStatement(queryb);
            strx0=jTextField2.getText();
            pstmt5.setString(1,strx0);
             rs5=pstmt5.executeQuery();
             if(rs5.next()){
             strbl=rs5.getString("HouseState");
             }
          if(strbl!=null) {
             if (strbl.equals("����ס��")) {
               queryx[0] = "select HaveHouse from userlist ";
               strbx1[0] = "HaveHouse";
            }
             else if (strbl.equals("�����")) {
               queryx[0] = "select LoanBuyHouse from userlist";
               strbx1[0] = "LoanBuyHouse";
             }
             else if (strbl.equals("���ù���")) {
              queryx[0] = "select RentHouse from userlist";
              strbx1[0] = "RentHouse";
            }
            else if (strbl.equals("����")) {
              queryx[0] = "select OtherHouse from userlist";
              strbx1[0] = "OtherHouse";
              }
             pstmt5 = con.prepareStatement(queryx[0]);
             rs5 = pstmt5.executeQuery();
             if (rs5.next()) {
               strx0 = rs5.getString(strbx1[0]); //������
               sum1 += Integer.parseInt(strx0);
               jTextField1.setText(sum1+" ");
             }
           }
           else  sum1 += 0;
           //��������
               queryb= "select * from Users where userid=?";
               pstmt5 = con.prepareStatement(queryb);
              strx0=jTextField2.getText();
              pstmt5.setString(1,strx0);
               rs5=pstmt5.executeQuery();
               if(rs5.next()){
               strbl=rs5.getString("RegistereState");
               }
            if(strbl!=null) {
               if (strbl.equals("��ס����")) {
                 queryx[0] = "select Cregistered from userlist ";
                 strbx1[0] = "Cregistered";
              }
               else if (strbl.equals("��ʱ����")) {
                 queryx[0] = "select Lregistere from userlist";
                 strbx1[0] = "Lregistere";
               }
               pstmt5 = con.prepareStatement(queryx[0]);
               rs5 = pstmt5.executeQuery();
               if (rs5.next()) {
                 strx0 = rs5.getString(strbx1[0]); //������
                 sum1 += Integer.parseInt(strx0);
                 jTextField1.setText(sum1+" ");
               }
             }
             else  sum1 += 0;
          // ְҵ���
             queryb= "select * from view2 where userid=?";
             pstmt5 = con.prepareStatement(queryb);
            strx0=jTextField2.getText();
            pstmt5.setString(1,strx0);
             rs5=pstmt5.executeQuery();
             if(rs5.next()){
             strbl=rs5.getString("ProfessionTypes");
             }
          if(strbl!=null) {
             if (strbl.equals("����Ա")) {
               queryx[0] = "select Gwy from ProfessionThing ";
               strbx1[0] = "Gwy";
            }
             else if (strbl.equals("��ʦ��ҽ��")) {
               queryx[0] = "select Jshys from ProfessionThing";
               strbx1[0] = "Jshys";
             }
             else if (strbl.equals("���ڡ���ʦ")) {
              queryx[0] = "select Jrhls from ProfessionThing";
              strbx1[0] = "Jrhls";
            }
            else if (strbl.equals("���ˡ�����")) {
              queryx[0] = "select Jrhjz from ProfessionThing";
              strbx1[0] = "Jrhjz";
              }
           else if (strbl.equals("��ҵ������˾ְԱ")) {
              queryx[0] = "select Qyzhgszy from ProfessionThing";
              strbx1[0] = "Qyzhgszy";
             }
          else if (strbl.equals("����ְҵ")) {
             queryx[0] = "select Qtzy from ProfessionThing";
             strbx1[0] = "Qtzy";
            }
             pstmt5 = con.prepareStatement(queryx[0]);
             rs5 = pstmt5.executeQuery();
             if (rs5.next()) {
               strx0 = rs5.getString(strbx1[0]); //������
               sum1 += Integer.parseInt(strx0);
               jTextField1.setText(sum1+" ");
             }
           }
           else  sum1 += 0;
           //��������
               queryb= "select * from view3 where userid=?";
               pstmt5 = con.prepareStatement(queryb);
              strx0=jTextField2.getText();
              pstmt5.setString(1,strx0);
               rs5=pstmt5.executeQuery();
               if(rs5.next()){
               strbl=rs5.getString("WorkingFirm");
               }
            if(strbl!=null) {
               if (strbl.equals("5������")) {
                 queryx[0] = "select Gz5n from ProfessionThing ";
                 strbx1[0] = "Gz5n";
              }
               else if (strbl.equals("3-5��")) {
                 queryx[0] = "select Gz3_5n from ProfessionThing";
                 strbx1[0] = "Gz3_5n";
               }
               else if (strbl.equals("1-3��")) {
                queryx[0] = "select Gz1_3n from ProfessionThing";
                strbx1[0] = "Gz1_3n";
              }
              else if (strbl.equals("1������")) {
                queryx[0] = "select Gzxy1n from ProfessionThing";
                strbx1[0] = "Gzxy1n";
                }
               pstmt5 = con.prepareStatement(queryx[0]);
               rs5 = pstmt5.executeQuery();
               if (rs5.next()) {
                 strx0 = rs5.getString(strbx1[0]); //������
                 sum1 += Integer.parseInt(strx0);
                 jTextField1.setText(sum1+" ");
               }
             }
             else  sum1 += 0;
             //��λ����
            queryb= "select * from view3 where userid=?";
            pstmt5 = con.prepareStatement(queryb);
           strx0=jTextField2.getText();
           pstmt5.setString(1,strx0);
            rs5=pstmt5.executeQuery();
            if(rs5.next()){
            strbl=rs5.getString("WorkingState");
            }
         if(strbl!=null) {
            if (strbl.equals("���ּ�����")) {
              queryx[0] = "select Tjys from ProfessionThing ";
              strbx1[0] = "Tjys";
           }
            else if (strbl.equals("����")) {
              queryx[0] = "select Cj from ProfessionThing";
              strbx1[0] = "Cj";
            }
            else if (strbl.equals("�Ƽ�")) {
             queryx[0] = "select Kj from ProfessionThing";
             strbx1[0] = "Kj";
           }
           else if (strbl.equals("һ����ظɲ�")) {
             queryx[0] = "select Ybgjgb from ProfessionThing";
             strbx1[0] = "Ybgjgb";
             }
          else if (strbl.equals("��������Ա��")) {
           queryx[0] = "select Qtgjgb from ProfessionThing";
           strbx1[0] = "Qtgjgb";
           }
           else if (strbl.equals("�����ܾ���")) {
            queryx[0] = "select Zfzjl from ProfessionThing";
            strbx1[0] = "Zfzjl";
            }
          else if (strbl.equals("���ž���")) {
              queryx[0] = "select Bmjl from ProfessionThing";
              strbx1[0] = "Bmjl";
            }
         else if (strbl.equals("һ����ҵ�ɲ�")) {
               queryx[0] = "select Ybqygb from ProfessionThing";
               strbx1[0] = "Ybqygb";
            }
         else if (strbl.equals("������ҵԱ��")) {
          queryx[0] = "select Qtqyzy from ProfessionThing";
          strbx1[0] = "Qtqyzy";
      }
            pstmt5 = con.prepareStatement(queryx[0]);
            rs5 = pstmt5.executeQuery();
            if (rs5.next()) {
              strx0 = rs5.getString(strbx1[0]); //������
              sum1 += Integer.parseInt(strx0);
              jTextField1.setText(sum1+" ");
            }
          }
          else  sum1 += 0;
          //����������
                queryb= "select * from view3 where userid=?";
                pstmt5 = con.prepareStatement(queryb);
               strx0=jTextField2.getText();
               pstmt5.setString(1,strx0);
                rs5=pstmt5.executeQuery();
                if(rs5.next()){
                strbl=rs5.getString("IndividualIcome");
                }
             if(strbl!=null) {
                if (strbl.equals("10000Ԫ����")) {
                  queryx[0] = "select Ysr10000 from ProfessionThing ";
                  strbx1[0] = "Ysr10000";
               }
                else if (strbl.equals("8000-10000Ԫ")) {
                  queryx[0] = "select Ysr8000 from ProfessionThing";
                  strbx1[0] = "Ysr8000";
                }
                else if (strbl.equals("5000-8000Ԫ")) {
                 queryx[0] = "select Ysr5000 from ProfessionThing";
                 strbx1[0] = "Ysr5000";
               }
               else if (strbl.equals("4000-5000Ԫ")) {
                 queryx[0] = "select Ysr4000 from ProfessionThing";
                 strbx1[0] = "Ysr4000";
                 }
                 else if (strbl.equals("3000-4000Ԫ")) {
                queryx[0] = "select Ysr3000 from ProfessionThing";
                strbx1[0] = "Ysr3000";
                }
                else if (strbl.equals("2000-3000Ԫ")) {
              queryx[0] = "select Ysr2000 from ProfessionThing";
              strbx1[0] = "Ysr2000";
              }
              else if (strbl.equals("1000-2000Ԫ")) {
             queryx[0] = "select Ysr1000 from ProfessionThing";
             strbx1[0] = "Ysr1000";
             }
             else if (strbl.equals("1000Ԫ����")) {
             queryx[0] = "select Ysrxy1000 from ProfessionThing";
              strbx1[0] = "Ysrxy1000";
            }

                pstmt5 = con.prepareStatement(queryx[0]);
                rs5 = pstmt5.executeQuery();
                if (rs5.next()) {
                  strx0 = rs5.getString(strbx1[0]); //������
                  sum1 += Integer.parseInt(strx0);
                  jTextField1.setText(sum1+" ");
                }
              }
              else  sum1 += 0;
              //����ְ��
                   queryb= "select * from view3 where userid=?";
                   pstmt5 = con.prepareStatement(queryb);
                  strx0=jTextField2.getText();
                  pstmt5.setString(1,strx0);
                   rs5=pstmt5.executeQuery();
                   if(rs5.next()){
                   strbl=rs5.getString("WorkingPost");
                   }
                if(strbl!=null) {
                   if (strbl.equals("�߼�")) {
                     queryx[0] = "select Gj from ProfessionThing ";
                     strbx1[0] = "Gj";
                  }
                   else if (strbl.equals("�м�")) {
                     queryx[0] = "select Zj from ProfessionThing";
                     strbx1[0] = "Zj";
                   }
                   else if (strbl.equals("����")) {
                    queryx[0] = "select Cjj from ProfessionThing";
                    strbx1[0] = "Cjj";
                  }
                  else if (strbl.equals("��")) {
                    queryx[0] = "select Mei from ProfessionThing";
                    strbx1[0] = "Mei";
                    }
                   pstmt5 = con.prepareStatement(queryx[0]);
                   rs5 = pstmt5.executeQuery();
                   if (rs5.next()) {
                     strx0 = rs5.getString(strbx1[0]); //������
                     sum1 += Integer.parseInt(strx0);
                     jTextField1.setText(sum1+" ");
                   }
                 }
                 else  sum1 += 0;
                 //��ͥ�˾�������
                        queryb= "select * from users where userid=?";
                        pstmt5 = con.prepareStatement(queryb);
                       strx0=jTextField2.getText();
                       pstmt5.setString(1,strx0);
                        rs5=pstmt5.executeQuery();
                        if(rs5.next()){
                        strbl=rs5.getString("AverageIcome");
                        }
                     if(strbl!=null) {
                        if (strbl.equals("5000Ԫ����")) {
                          queryx[0] = "select Rjsr5q from FamilyThing ";
                          strbx1[0] = "Rjsr5q";
                       }
                        else if (strbl.equals("3000-5000Ԫ")) {
                          queryx[0] = "select Rjsr3_5q from FamilyThing";
                          strbx1[0] = "Rjsr3_5q";
                        }
                        else if (strbl.equals("2000-3000Ԫ")) {
                         queryx[0] = "select Rjsr2_3q from FamilyThing";
                         strbx1[0] = "Rjsr2_3q";
                       }
                       else if (strbl.equals("1000-2000Ԫ")) {
                         queryx[0] = "select Rjsr1_2q from FamilyThing";
                         strbx1[0] = "Rjsr1_2q";
                         }
                        else if (strbl.equals("500-1000Ԫ")) {
                           queryx[0] = "select Rjsr5b_1q from FamilyThing";
                           strbx1[0] = "Rjsr5b_1q";
                           }
                        else if (strbl.equals("500Ԫ����")) {
                             queryx[0] = "select Rjsr5b from FamilyThing";
                             strbx1[0] = "Rjsr5b";
                             }
                        pstmt5 = con.prepareStatement(queryx[0]);
                        rs5 = pstmt5.executeQuery();
                        if (rs5.next()) {
                          strx0 = rs5.getString(strbx1[0]); //������
                          sum1 += Integer.parseInt(strx0);
                          jTextField1.setText(sum1+" ");
                        }
                      }
                      else  sum1 += 0;
                      //��ͥ�˾��¹̶�֧��
                                 queryb= "select * from users where userid=?";
                                 pstmt5 = con.prepareStatement(queryb);
                                strx0=jTextField2.getText();
                                pstmt5.setString(1,strx0);
                                 rs5=pstmt5.executeQuery();
                                 if(rs5.next()){
                                 strbl=rs5.getString("AverageExpend");
                                 }
                              if(strbl!=null) {
                                 if (strbl.equals("500Ԫ����")) {
                                   queryx[0] = "select Rjzc5b from FamilyThing ";
                                   strbx1[0] = "Rjzc5b";
                                }
                                 else if (strbl.equals("500-1000Ԫ")) {
                                   queryx[0] = "select Rjzc5b_1q from FamilyThing";
                                   strbx1[0] = "Rjzc5b_1q";
                                 }
                                 else if (strbl.equals("1000-3000Ԫ")) {
                                  queryx[0] = "select Rjzc1_3q from FamilyThing";
                                  strbx1[0] = "Rjzc1_3q";
                                }
                                else if (strbl.equals("3000Ԫ����")) {
                                  queryx[0] = "select Rjzc3q from FamilyThing";
                                  strbx1[0] = "Rjzc3q";
                                  }
                                 pstmt5 = con.prepareStatement(queryx[0]);
                                 rs5 = pstmt5.executeQuery();
                                 if (rs5.next()) {
                                   strx0 = rs5.getString(strbx1[0]); //������
                                   sum1 += Integer.parseInt(strx0);
                                   jTextField1.setText(sum1+" ");
                                 }
                               }
                               else  sum1 += 0;
                               //�����ʻ�����
                                          queryb= "select * from view4 where userid=?";
                                          pstmt5 = con.prepareStatement(queryb);
                                         strx0=jTextField2.getText();
                                         pstmt5.setString(1,strx0);
                                          rs5=pstmt5.executeQuery();
                                          if(rs5.next()){
                                          strbl=rs5.getString("AccountType");
                                          }
                                       if(strbl!=null) {
                                          if (strbl.equals("�����Լ����п�")) {
                                            queryx[0] = "select Dqhyhk from UserBank ";
                                            strbx1[0] = "Dqhyhk";
                                         }
                                          else if (strbl.equals("����")) {
                                            queryx[0] = "select Dq from UserBank";
                                            strbx1[0] = "Dq";
                                          }
                                          else if (strbl.equals("���п�")) {
                                           queryx[0] = "select Yhk from UserBank";
                                           strbx1[0] = "Yhk";
                                         }
                                         else if (strbl.equals("���������ڴ����ʻ�")) {
                                           queryx[0] = "select Jkhqzh from UserBank";
                                           strbx1[0] = "Jkhqzh";
                                           }
                                          else if (strbl.equals("���ʻ�")) {
                                             queryx[0] = "select Wzh from UserBank";
                                             strbx1[0] = "Wzh";
                                             }
                                          pstmt5 = con.prepareStatement(queryx[0]);
                                          rs5 = pstmt5.executeQuery();
                                          if (rs5.next()) {
                                            strx0 = rs5.getString(strbx1[0]); //������
                                            sum1 += Integer.parseInt(strx0);
                                            jTextField1.setText(sum1+" ");
                                          }
                                        }
                                        else  sum1 += 0;

                                        //����
                                          queryb= "select * from Users where userid=?";
                                          pstmt5 = con.prepareStatement(queryb);
                                         strx0=jTextField2.getText();
                                         pstmt5.setString(1,strx0);
                                          rs5=pstmt5.executeQuery();
                                          if(rs5.next()){
                                          strbl=rs5.getString("UserAge");
                                          }
                                       if(strbl!=null) {
                                        int a=Integer.parseInt(strbl);
                                         if (18<=a && 22>=a) {
                                            queryx[0] = "select Callan from userlist ";
                                            strbx1[0] = "Callan";
                                         }
                                          else if (23<=a && 34>=a) {
                                            queryx[0] = "select Youth from userlist";
                                            strbx1[0] = "Youth";
                                          }
                                          else if (35<=a && 40>=a) {
                                            queryx[0] = "select Midlife from userlist";
                                            strbx1[0] = "Midlife";
                                          }
                                          else if (41<=a && 60>=a) {
                                            queryx[0] = "select Adiaphorous from userlist";
                                            strbx1[0] = "Adiaphorous";
                                          }
                                          else if (61<=a ) {
                                          queryx[0] = "select Agedness from userlist";
                                          strbx1[0] = "Agedness";
                                        }
                                          pstmt5 = con.prepareStatement(queryx[0]);
                                          rs5 = pstmt5.executeQuery();
                                          if (rs5.next()) {
                                            strx0 = rs5.getString(strbx1[0]); //������
                                            sum1 += Integer.parseInt(strx0);
                                              jTextField1.setText(sum1+" ");
                                          }
                                        }
                                        else  sum1 += 0;
                                        //ҵ������
                                             queryb= "select * from view5 where userid=?";
                                             pstmt5 = con.prepareStatement(queryb);
                                            strx0=jTextField2.getText();
                                            pstmt5.setString(1,strx0);
                                             rs5=pstmt5.executeQuery();
                                             if(rs5.next()){
                                             strbl=rs5.getString("UseNum");
                                             }
                                          if(strbl!=null) {
                                           int a=Integer.parseInt(strbl);
                                            if (2>a) {
                                               queryx[0] = "select Ywjs from UserBank ";
                                               strbx1[0] = "Ywjs";
                                            }
                                            else if (6>=a && 2<=a) {
                                              queryx[0] = "select Ywyb from UserBank ";
                                              strbx1[0] = "Ywyb";
                                           }
                                             else if (6<a ) {
                                             queryx[0] = "select Ywmq from UserBank";
                                             strbx1[0] = "Ywmq";
                                           }
                                             pstmt5 = con.prepareStatement(queryx[0]);
                                             rs5 = pstmt5.executeQuery();
                                             if (rs5.next()) {
                                               strx0 = rs5.getString(strbx1[0]); //������
                                               sum1 += Integer.parseInt(strx0);
                                                 jTextField1.setText(sum1+" ");
                                             }
                                           }
                                           else  sum1 += 0;
                                          //�Ƿ���Ա��
                                           queryb= "select * from users where userid=?";
                                           pstmt5 = con.prepareStatement(queryb);
                                          strx0=jTextField2.getText();
                                          pstmt5.setString(1,strx0);
                                           rs5=pstmt5.executeQuery();
                                           if(rs5.next()){
                                           strbl=rs5.getString("UserCard");
                                           strbl=strbl.trim();
                                           }
                                        if(strbl!=null) {
                                        queryx[0] = "select * from YHworker where YHworkerCard=?";
                                        strbx1[0] = "YHworkerCard";
                                         pstmt5 = con.prepareStatement(queryx[0]);
                                         pstmt5.setString(1,strbl);
                                           rs5 = pstmt5.executeQuery();
                                           if (rs5.next()) {
                                              sum1 +=2;
                                              }
                                             else {
                                               sum1 +=0;
                                             }
                                             jTextField1.setText(sum1+" ");
                                        }
                                         else  sum1 += 0;
                                         //������
                                             queryb= "select * from view6 where userid=?";
                                             pstmt5 = con.prepareStatement(queryb);
                                            strx0=jTextField2.getText();
                                            pstmt5.setString(1,strx0);
                                             rs5=pstmt5.executeQuery();
                                             if(rs5.next()){
                                             strbl=rs5.getString("UseState");
                                             }
                                          if(strbl!=null) {
                                             if (strbl.equals("�н���ѻ���")) {
                                               queryx[0] = "select Yjkyh from UserBank ";
                                               strbx1[0] = "Yjkyh";
                                            }
                                             else if (strbl.equals("�����ڼ�¼")) {
                                               queryx[0] = "select Yyqjl from UserBank";
                                               strbx1[0] = "Yyqjl";
                                             }
                                             else if (strbl.equals("��δ���")) {
                                              queryx[0] = "select Cwjk from UserBank";
                                              strbx1[0] = "Cwjk";
                                            }
                                            else if (strbl.equals("�н����¼��������δ���ڽ��")) {
                                              queryx[0] = "select Y_ywdqjk from UserBank";
                                              strbx1[0] = "Y_ywdqjk";
                                              }
                                             else if (strbl.equals("�޽����¼��������δ���ڽ��")) {
                                                queryx[0] = "select W_ywdqjk from UserBank";
                                                strbx1[0] = "W_ywdqjk";
                                                }
                                             pstmt5 = con.prepareStatement(queryx[0]);
                                             rs5 = pstmt5.executeQuery();
                                             if (rs5.next()) {
                                               strx0 = rs5.getString(strbx1[0]); //������
                                               sum1 += Integer.parseInt(strx0);
                                               jTextField1.setText(sum1+" ");
                                             }
                                           }
                                           else  sum1 += 0;
                                           //������
                                             queryb= "select * from view7 where userid=?";
                                             pstmt5 = con.prepareStatement(queryb);
                                            strx0=jTextField2.getText();
                                            pstmt5.setString(1,strx0);
                                             rs5=pstmt5.executeQuery();
                                             if(rs5.next()){
                                             strbl=rs5.getString("AccountDeposit");
                                             }
                                          if(strbl!=null) {
                                            int a=Integer.parseInt(strbl);
                                           if (10000>a) {
                                              queryx[0] = "select Ck1w from UserBank ";
                                              strbx1[0] = "Ck1w";
                                           }
                                           else if (30000>=a && 10000<=a) {
                                             queryx[0] = "select Ck1_3w from UserBank ";
                                             strbx1[0] = "Ck1_3w";
                                          }
                                            else if (30000<a ) {
                                            queryx[0] = "select Ck3w from UserBank";
                                            strbx1[0] = "Ck3w";
                                          }

                                             pstmt5 = con.prepareStatement(queryx[0]);
                                             rs5 = pstmt5.executeQuery();
                                             if (rs5.next()) {
                                               strx0 = rs5.getString(strbx1[0]); //������
                                               sum1 += Integer.parseInt(strx0);
                                               jTextField1.setText(sum1+" ");
                                             }
                                           }
                                           else  sum1 += 0;
      }

    catch(Exception ef)
          { System.out.print("ϵͳ�������������С�"+ef.getClass().getName());
            ef.printStackTrace();
           }
   return sum1;
  }




  void jButton1_actionPerformed(ActionEvent e) {
    String m=jTextField1.getText();
    String c=m;
    PreparedStatement pstmt;
    ResultSet rs;
    try
    {
      int i = Integer.parseInt(m);
      if (i <= 20 && 0 <= i) {
        i = i + this.Badrecordadjust();
        jLabel7.setText(i + " ");
        if (120 >= i && 100 <= i) {
          jLabel4.setText("A");
          jLabel6.setText("50000Ԫ");
        }
        else if (100 > i && 90 <= i) {
          jLabel4.setText("B");
          jLabel6.setText("40000Ԫ");
        }
        else if (90 > i && 80 <= i) {
          jLabel4.setText("C");
          jLabel6.setText("30000Ԫ");
        }
        else if (80 > i && 70 <= i) {
          jLabel4.setText("D");
          jLabel6.setText("20000Ԫ");
        }
        else if (70 > i && 60 <= i) {
          jLabel4.setText("E");
          jLabel6.setText("10000Ԫ");
        }
        else if (60 > i && 50 <= i) {
          jLabel4.setText("F");
          jLabel6.setText("5000Ԫ");
        }
        else if (50 > i && 35 <= i) {
          jLabel4.setText("G");
          jLabel6.setText("2000Ԫ");
        }
        else {
          jLabel4.setText("H");
          jLabel6.setText("0Ԫ");
        }

        jTextField1.setText(c);
        c = jTextField2.getText();
        String qur =
            "insert into Creditcard(UserId,CreditcardGrade,CreditcardCode) values('" +
            c + "\'" + "," + "\'" + jLabel4.getText() + "\'" + ",'000')";
        Statement ps;
        ps = con.createStatement();
        ps.execute(qur);

        String qur1 = "update Users set  CpCredit='" + jLabel7.getText() +
            "' where UserId=" + "\'" + c + "\'";
        ps = con.createStatement();
        ps.execute(qur1);


        String sel="select CreditcardId from Creditcard where UserId='"+c+"' and CreditcardGrade='"+jLabel4.getText()+"\'";
        pstmt= con.prepareStatement(sel);
        rs = pstmt.executeQuery();
        if (rs.next()) {
         String  strx0 = rs.getString("CreditcardId"); //������
         jLabel10.setText(strx0);
              }

        String ins="insert into Account(CreditcardId,AccountType,AccountDeposit) values('"+jLabel10.getText()+"','���п�','0')";
        ps = con.createStatement();
        ps.execute(ins);

      }
      else jTextField1.setText("������С��20��������");
    }

    catch(Exception eff)
     { jTextField1.setText("���������֣�лл������");
     }
  }

  void jButton2_actionPerformed(ActionEvent e) {
    eventFrame.jSplitPane1.remove(eventFrame.jSplitPane1.getRightComponent());
    eventFrame.jSplitPane1.add(new helloPanel(),eventFrame.jSplitPane1.RIGHT);
  }
}

class testPanel_jButton1_actionAdapter implements java.awt.event.ActionListener {
  testPanel adaptee;

  testPanel_jButton1_actionAdapter(testPanel adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class testPanel_jButton2_actionAdapter implements java.awt.event.ActionListener {
  testPanel adaptee;

  testPanel_jButton2_actionAdapter(testPanel adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}
