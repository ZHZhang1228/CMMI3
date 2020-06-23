package management;

import java.awt.*;
import javax.swing.*;
import com.borland.dx.dataset.*;
import com.borland.dbswing.*;
import java.io.*;
import java.text.SimpleDateFormat;
//import com.borland.internetbeans.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class UserHelp extends JPanel {
  String strx="";
  String Host="";

  JPanel jPanel1 = new JPanel();
  JPanel jPanel2 = new JPanel();
  JTabbedPane jTabbedPane1 = new JTabbedPane();
  JScrollPane jScrollPane2 = new JScrollPane();
  JdbTextPane jdbTextPane2 = new JdbTextPane();
  JPanel jPanel4 = new JPanel();
  JScrollPane jScrollPane3 = new JScrollPane();
  JdbTextPane jdbTextPane5 = new JdbTextPane();
  CardLayout cardLayout3 = new CardLayout();
  CardLayout cardLayout4 = new CardLayout();
  CardLayout cardLayout5 = new CardLayout();
  JScrollPane jScrollPane1 = new JScrollPane();
  JdbTextPane jdbTextPane1 = new JdbTextPane();
  BorderLayout borderLayout1 = new BorderLayout();

  public UserHelp() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  public UserHelp(String strx1,String sHost) {
    strx = strx1;
    Host=sHost;
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }


  void jbInit() throws Exception {
    this.setLayout(borderLayout1);
    jPanel1.setFont(new java.awt.Font("Dialog", 0, 14));
    jPanel1.setDebugGraphicsOptions(0);
    jPanel1.setToolTipText("");
    jPanel1.setLayout(cardLayout5);
    this.setFont(new java.awt.Font("�����п�", 0, 11));
    this.setToolTipText("");
    jPanel2.setLayout(cardLayout4);

    String sT1="";
   // file fIn;

    jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    jdbTextPane2.setBackground(new Color(217, 230, 236));
    jdbTextPane2.setFont(new java.awt.Font("Dialog", 0, 14));
    jdbTextPane2.setLocale(new java.util.Locale("zh", "CN", ""));
    jdbTextPane2.setMinimumSize(new Dimension(6, 100));
    jdbTextPane2.setPreferredSize(new Dimension(71, 200));
    jdbTextPane2.setToolTipText("");
    jdbTextPane2.setEditable(false);
    jdbTextPane2.setText("\t\t\t����ϵͳ�������������취\n\t\t\t�ڶ���\t�������������\n\t������\t���ÿ��ĸ����������������ھ߱������ʸ�����ÿ����������˺������ֿ��ˣ������������ˡ��ֿ����Լ����߱������ʸ�ģ������������� " +
    "�����ʸ�ָ���������ÿ�ҵ�����취���涨�ľ�ס�����ڷ��������ڵز��ڵ��ع��������ڷ��������ڵع��������й������ų��ߵľ�ס��������֤���������ȶ��������ȫ������Ϊ������ " +
    "\n\t������\t�������С�˾�����Ŵ��ڲ�����¼�ģ������пɸ�������ڣ���ȡ�������õȼ���ֱ�Ӿܾ��������ÿ����롢ֹͣʹ�����ÿ��ȴ�ʩ���������������п��������ҵ��Ӧ���ڣ�ÿ�£������в�����Ϊ��¼�Ŀͻ���" +
    "������ͳһͨ������֧�н��з��տ��ƣ�����ܹ�ȷ�����ÿ��ͻ��������д����͸֧��Ϊ�ģ�������Ӧ�Կͻ������е�����������е��顣����������������л�˾�������в�����¼����Ϊ�� " +
    "\n\t\t��һ��\t�����л��������ÿ�������������͸֧����������׷�չ黹���ڵ�����ȷ�������õȼ�ʱ��Ӧ����1����2�����õȼ��� \n\t\t������\t�����л������ж���͸֧��Ϊ��һ�ɲ�������ȡ����ʹ�����ÿ��ʸ� " +
    "\n\t\t������\t�����л����д�����թƭ��Ϊ����������δ�黹���ڴ����һ�ɲ������� \n\t\t���ģ�\t�����������������������Ժǿ��ִ�ж���������Ƿ�������һ�ɲ������� " +
    "\n\t\t���壩\t���ӷ������ڽ��ܵ��飬�����������ܵ����ɴ�����һ�ɲ�������     \n\t������\t�����������õȼ����������ݰ�������Ȼ�����ְҵ�������ͥ����������й�ϵ�ȡ� " +
    "\n\t\t��һ��\t��Ȼ���ָ������������䡢�Ա𡢻���״�����Ļ��̶ȡ������Լ�סլ���ʵȸ��˻�������� \n\t\t������\tְҵ���ָ���������ְҵ�����ֵ�λ�������ޡ�ְ��ְ�ƺ����������� " +
    "\n\t\t������\t��ͥ���ָ���������ͥ�˾������롢��ͥ�˾��¹̶�֧���ȡ� \n\t\t���ģ�\t�����й�ϵָ���������Ƿ���Ա�����ڱ����ʻ��������ҵ�������������������ȡ� " +
    "\n\t�ڰ���\t�Գֿ��˵����ø���������Ҫ��ָ�ֿ���ʹ�����ÿ�������������¾�������¾��ۼ�͸֧�͸֧����������¾����ѱ������¾����׶�ȡ� " +
    "\n\t�ھ���\t���ÿ����õȼ��ɷ������ڲ�����ʹ�ã�����֪�����˻�ֿ��ˣ������⹫��������ֿ��˵�͸֧��ȣ��ɷ���������֪ͨ�ֿ��ˡ��ֿ��˵�͸֧����������䶯��������Ӧ��ʱ֪ͨ�ֿ��ˡ�͸֧����Ƿ�����" +
    "�������ÿ��ֿ���ʹ�����ÿ�͸֧����߶�ȡ� ");
    jdbTextPane2.setPostOnFocusLost(true);
    jTabbedPane1.setBackground(new Color(217, 230, 236));
    jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 14));
    jTabbedPane1.setMaximumSize(new Dimension(32767, 32767));
    jTabbedPane1.setMinimumSize(new Dimension(49, 68));
    jdbTextPane5.setBackground(new Color(217, 230, 236));
    jdbTextPane5.setFont(new java.awt.Font("Dialog", 0, 14));
    jdbTextPane5.setEditable(false);
    jdbTextPane5.setText("\t\t\t����ϵͳ�������������취 \n\t\t\t������\t�û�Ȩ�� \n\t��һ��\t�û�ӵ�������������ÿ��ķ�ʽ�������ⵣ�����룬��֤���� ����͵�Ѻ��Ѻ�������롣 " +
    "\n\t�ڶ���\t�û��������������ĵ�����Ը�ⵣ��������¿������뱣֤�� ���쿨�������˿�����ʱ�����������˵��ʸ񣬱������˿�����ʱ����������� " +
    "�ˡ� \n\t������\t��Ѻ��Ѻ��������쿨���û���������ʱ���ӵ�Ѻ��Ѻ����� �����Ѻ��Ѻ� \n\t������\t�κ��û�������ͨ���˽������������ĺͻ������ϲ�ѯ�� " +
    "\n\t������\t����ÿ���꽫����һ��ȫ���Ե��������û�ע���ѯ���еĵ� ��֪ͨ��");
    jPanel4.setLayout(cardLayout3);
    jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    jdbTextPane1.setBackground(new Color(217, 230, 236));
    jdbTextPane1.setFont(new java.awt.Font("Dialog", 0, 14));
    jdbTextPane1.setEditable(false);

    jdbTextPane1.setText("\t\t\t����ϵͳ�������������취\n\t\t\t��һ��\t��   ��\n\t��һ��\tΪ�˼�ǿ�����ÿ��ֿ��˵����ù����淶���ÿ�������������������������ĸ������ù�����ϵ��������Ӫ���գ��������ÿͻ�Ⱥ�壬���ݡ���������" +
    "��ҵ������ƶȡ������������ÿ�ҵ������ƶȡ����������ÿ�ҵ��չ��ʵ����������ƶ����취��\n\t�ڶ���\t�����ⵣ�����������������ÿ�ʱ��Ӧ���ձ��취�������˽��и������õȼ����������������������õȼ�������" +
    "��Ӧ��͸֧��ȡ�\n\t������\t�������ⵣ�����������������ÿ�ʱ��Ӧ�ṩ��Ч�������Ա�֤������ʽ�������ÿ��ģ�Ӧ�Ե����˽��и������õȼ��������Ե�Ѻ����Ѻ������ʽ�������ÿ��ģ�����������������ֱ�Ӱ�����Ч��" +
    "Ѻ����Ѻ�����һ����������͸֧��ȡ�\n\t������\t���ÿ��ĸ�������������ֿ͹ۡ���ѧ�������Ͷ��������붨�Է������ϵ�ԭ�����������ݵĲ��Ϻ���ʵ������ʵ���ɿ��� ");
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    jPanel4.setBackground(new Color(217, 230, 236));
    jTabbedPane1.add(jPanel1, "����");
    jPanel1.add(jScrollPane1, "jScrollPane1");
    jTabbedPane1.add(jPanel2, "�������������");
    jPanel2.add(jScrollPane2, "jScrollPane2");
    jTabbedPane1.add(jPanel4, "�û�Ȩ��");
    jPanel4.add(jScrollPane3, "jScrollPane3");
    jScrollPane3.getViewport().add(jdbTextPane5, null);
    jScrollPane2.getViewport().add(jdbTextPane2, null);
    jScrollPane1.getViewport().add(jdbTextPane1, null);
    this.add(jTabbedPane1, BorderLayout.CENTER);
    //jdbTextPane1.setEnableFileLoading(true);




  }
}
