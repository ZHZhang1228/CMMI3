package management;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

class WarrantorCheck extends JPanel {
 // private  boolean success;
 private int flag=-1 ;
 String YHworkerID;

 JLabel jLabel1 = new JLabel();
  JTextField jTextField1 = new JTextField();
  JButton jButton1 = new JButton();
  JLabel jLabel5 = new JLabel();
  JTextField jTextField2 = new JTextField();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JTextField jTextField4 = new JTextField();
  JTextField jTextField3 = new JTextField();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel11 = new JLabel();
  JLabel jLabel12 = new JLabel();
  JLabel jLabel13 = new JLabel();
  JButton jButton2 = new JButton();
  GridBagLayout gridBagLayout1 = new GridBagLayout();

  public WarrantorCheck() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }


  public WarrantorCheck(String  str) {
      YHworkerID =str;
      try {
        jbInit();
      }
      catch(Exception ex) {
        ex.printStackTrace();
      }
    }





  public WarrantorCheck(int flag) {

    this.flag =flag;
  try {
    jbInit();
  }
  catch(Exception ex) {
    ex.printStackTrace();
  }
}


  public  int  getState()
  {
      return flag;
  }

  void jbInit() throws Exception {
    jLabel1.setFont(new java.awt.Font("Dialog", 0, 15));
    jLabel1.setText("���������֤��");
    this.setLayout(gridBagLayout1);
    jTextField1.setFont(new java.awt.Font("Dialog", 0, 15));
    jTextField1.setText("");
    jButton1.setBackground(new Color(151, 164, 203));
    jButton1.setFont(new java.awt.Font("Dialog", 0, 15));
    jButton1.setText("��    ��");
    jButton1.addActionListener(new WarrantorCheck_jButton1_actionAdapter(this));
    jLabel5.setFont(new java.awt.Font("Dialog", 0, 15));
    jLabel5.setText("����������");
    jTextField2.setFont(new java.awt.Font("Dialog", 0, 15));
    jTextField2.setText("");
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 30));
    jLabel2.setText("�������뵣������Ϣ");
    jLabel3.setFont(new java.awt.Font("Dialog", 0, 15));
    jLabel3.setText("����������");
    jTextField4.setFont(new java.awt.Font("Dialog", 0, 15));
    jTextField4.setText("");
    jTextField3.setFont(new java.awt.Font("Dialog", 0, 15));
    jTextField3.setText("");
    jLabel4.setFont(new java.awt.Font("Dialog", 0, 15));
    jLabel4.setText("���������֤��");
    jLabel11.setBounds(new Rectangle(22, 149, 54, 15));
    jLabel11.setText("��������");
    jLabel12.setBounds(new Rectangle(22, 149, 54, 15));
    jLabel12.setText("��������");
    jLabel13.setBounds(new Rectangle(22, 149, 54, 15));
    jLabel13.setText("��������");
    jButton2.addActionListener(new WarrantorCheck_jButton2_actionAdapter(this));
    jButton2.setText("��    ��");
    jButton2.addActionListener(new WarrantorCheck_jButton2_actionAdapter(this));
    jButton2.setBackground(new Color(151, 164, 203));
    jButton2.setFont(new java.awt.Font("Dialog", 0, 15));
    this.setBackground(new Color(217, 230, 236));
    this.add(jLabel5,  new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(26, 29, 0, 54), 14, -6));
    this.add(jLabel1,  new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(21, 29, 0, 27), 11, -6));
    this.add(jTextField1,  new GridBagConstraints(1, 4, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(19, 11, 0, 43), 155, -8));
    this.add(jTextField2,  new GridBagConstraints(1, 3, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(24, 11, 0, 110), 88, -9));
    this.add(jTextField4,  new GridBagConstraints(1, 1, 1, 2, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(24, 13, 35, 110), 86, -9));
    this.add(jTextField3,  new GridBagConstraints(1, 2, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(21, 10, 0, 43), 157, -9));
    this.add(jLabel2,  new GridBagConstraints(0, 0, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(51, 44, 0, 51), 8, -11));
    this.add(jLabel3,  new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(22, 29, 0, 56), 13, -6));
    this.add(jLabel4,  new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(22, 29, 0, 27), 11, -3));
    this.add(jButton1,  new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(15, 91, 20, 0), 1, -5));
    this.add(jButton2,  new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(15, 65, 20, 68), 1, -5));

    //String UID;

  }

  void jButton1_actionPerformed(ActionEvent e) {


    String grade;
    String newGrade="";
    int flag=0;
    CheckDialog CheckDialog1=new CheckDialog();
   // jTextField2.setText("");
    String UID;       //�û���
    String Username;  //������������
    String UserPID;   //�����������֤��
    String  UPID; //���������֤��
    String DBname;//����������

    //ѡ���Ϊ��
    if((jTextField3.getText() ).equals("")||(jTextField4.getText() ).equals("")
       ||(jTextField1.getText() ).equals("")||(jTextField2.getText() ).equals(""))
        {   CheckDialog CheckDialogErr=new CheckDialog("����ʧ�ܣ�����ȷ��д�������ϣ�");
            CheckDialogErr.setBounds(300,200,300,200);
            CheckDialogErr.show();
          }
    else if((jTextField1.getText() ).equals(jTextField3.getText() ))
    {
          CheckDialog CheckDialogErr=new CheckDialog("��������������");
          CheckDialogErr.setBounds(300,200,300,200);
          CheckDialogErr.show();

    }
    else
    {
      try
      {

      Connection con;
      String query;
      String query2;
      ResultSet rs;
      ResultSet rs2;
      PreparedStatement pstmt;
      PreparedStatement pstmt2;
      Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
      String url =
          "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CCES";

      String username = "sa";
      String password = "";
      con = DriverManager.getConnection(url, username, password);
      query = "select * from Users where UserCard=? ";
      pstmt = con.prepareStatement(query);
      UPID = jTextField1.getText();
      Username=jTextField4.getText();
      UserPID=jTextField3.getText();
      DBname=jTextField2.getText();
      pstmt.setString(1, UPID);
      rs = pstmt.executeQuery();
      if (!rs.next()) {
        //jTextField2.setText("����ʧ�ܣ� �����˲����ڣ�");
        //CheckDialog1.setLocation(300,300);
        CheckDialog CheckDialog2=new CheckDialog("�����쿨ʧ�ܣ� �����˲����ڣ�");
        CheckDialog2.setBounds(300,200,300,200);
        CheckDialog2.show();
        flag=1;
      }
      else {
        UID = rs.getString("UserId");
        query2 = "select * from Creditcard where UserId=? ";
        pstmt2 = con.prepareStatement(query2);
        pstmt2.setString(1, UID);
        rs2 = pstmt2.executeQuery();
        if (!rs2.next()) {
          //jTextField2.setText("����ʧ�ܣ����������������ÿ���");
        CheckDialog CheckDialog3=new CheckDialog("�����쿨ʧ�ܣ����������������ÿ���");
        CheckDialog3.setBounds(300,200,300,200);
        CheckDialog3.show();

          flag=2;
        }
        else {
           grade = rs2.getString("CreditcardGrade");
         if(grade.equals("A")||grade.equals("B")||grade.equals("C")||grade.equals("D")||grade.equals("E")||grade.equals("F"))
           { // jTextField2.setText("�����ɹ��� �������������õȼ��� " + grade);
             //jSplitPane1.add(WarranteeEvaluate1,JSplitPane.RIGHT);
       //      CheckDialog CheckDialog3=new CheckDialog("�����ɹ��� ����д��ϸ�û�����");
       //      CheckDialog3.setBounds(300,200,300,150);
       //      CheckDialog3.show();
             flag = 0;

      if (grade.equals("A"))
          newGrade="B";
      if (grade.equals("B"))
          newGrade="C";
        if (grade.equals("C"))
            newGrade="D";
        if (grade.equals("D"))
            newGrade="E";
        if (grade.equals("E"))
            newGrade="F";
        if (grade.equals("F"))
            newGrade="G";


      //�����ʻ���дUSERS��
       JbxxDialog JbxxDialog1=new JbxxDialog(jTextField4.getText() ,jTextField3.getText() ,jTextField1.getText() ,newGrade,YHworkerID);
    //  JbxxDialog1=new JbxxDialog(jTextField4.getText(),jTextField3.getText());
      JbxxDialog1.setBounds(200,50,500,400);
      JbxxDialog1.show();





         //  jTextField5.enable()=true;


           }
         else
           {   //jTextField2.setText("����ʧ�ܣ� �������������õȼ�̫�ͣ� " + grade);
             CheckDialog CheckDialog3=new CheckDialog("�����쿨ʧ�ܣ� �������������õȼ�̫�ͣ� " + grade);
            CheckDialog3.setBounds(300,200,300,150);
            CheckDialog3.show();

               flag=3;
           }
         }
      }
      String reason="";
      switch (flag)
      {
          case 1:
                 reason="�����쿨ʧ�ܣ� �����˲����ڣ�";
                 break;
          case 2:
                 reason="�����쿨ʧ�ܣ����������������ÿ���";
                 break;
          case 3:
                  reason="�����쿨ʧ�ܣ� �������������õȼ�̫��";
                  break;

      }
      //System.out.println(flag);
      if(flag!=0)        //����ʧ��
      {
        java.util.Date today=new java.util.Date();
        //need  mofify the rejecttable!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        SimpleDateFormat sdf;
        sdf =new  SimpleDateFormat("yyyy��MM��dd��hhʱmm��ss�� ");
        //String aa="today";
        //if failure occurs,then it should been written into the rejecttable!
        // String SQL = "Insert Into rejecttable(UserName,UserCard,Datet,Rejectexcuse) Values( "+username+","+UserPID+","+System.currentTimeMillis()+","+ reason+")";
       //OK:   String SQL = "Insert Into rejecttable(UserName,UserCard,Datet,Rejectexcuse) Values("+"\'"+Username+"\'"+ ","+"\'"+UserPID+"\'"+","+"\'"+System.currentTimeMillis()+"\'"+","+"\'"+reason+"\'"+")";
      String SQL = "Insert Into rejecttable(UserName,UserCard,RejectDate,Rejectexcuse) Values("+"\'"+Username+"\'"+ ","+"\'"+UserPID+"\'"+","+"\'"+sdf.format(today)+"\'"+","+"\'"+reason+"\'"+")";
       //String SQL="Insert Into rejecttable(UserName,UserCard,RejectDate,Rejectexcuse) Values("+"\'"+username+"\'"+","+"\'"+usercard+"\'"+","+"\'"+str1+"\'"+","+"\'"+str2+"\'"+")";
      //pstmt = con.prepareStatement(SQL);
        Statement stmt=con.createStatement();

//        String Username;  //������������
//    String UserPID;   //�����������֤��


      //UPID = jTextField1.getText();
        //pstmt.setString(1, UPID);
        //rs = pstmt.executeQuery();
        stmt.executeUpdate(SQL);
        }
        else              // �����ɹ�������쿨����Ҫд3�������ÿ����ʻ����û���
        {
       //  CalcWarranteeTotal1;
        }

    }
    catch(Exception ee)
       {
 //        CheckDialog CheckDialog3=new CheckDialog("ϵͳ�����������Ա��ϵ��");
 //        CheckDialog3.setBounds(300,200,300,200);
 //        CheckDialog3.show();
         ee.printStackTrace();
       }

    }


  }

  void jButton2_actionPerformed(ActionEvent e) {
      jTextField1.setText("");
       jTextField4.setFocusable(true);
    //  jTextField2.setText("") ;
      jTextField3.setText("");
      jTextField4.setText("");
      jTextField2.setText("");
  }

}

class WarrantorCheck_jButton1_actionAdapter implements java.awt.event.ActionListener {
  WarrantorCheck adaptee;

  WarrantorCheck_jButton1_actionAdapter(WarrantorCheck adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class WarrantorCheck_jButton2_actionAdapter implements java.awt.event.ActionListener {
  WarrantorCheck adaptee;

  WarrantorCheck_jButton2_actionAdapter(WarrantorCheck adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}
