var Prealink=-1,Pcollapse=0;
var iconblank="images/01.gif";
var iconcollapse="images/03.gif";
var iconexpand="images/02.gif";
var iconaccout="images/01.gif";
var iconfolder="images/03.gif";
var iconfolderopen="images/02.gif";
//-------------------- ���Ŀ¼��js���� ---------------
function TreeExpand(eimg) {//--����չ��-������+
if (eimg.alt=="+") {
	eimg.alt="-";
	eimg.src=iconexpand;
	eimg.parentNode.parentNode.getElementsByTagName("span")[0].style.display="block";
	}
else {
	eimg.alt="+";
	eimg.src=iconcollapse;
	eimg.parentNode.parentNode.getElementsByTagName("span")[0].style.display="none";
	var Curalink=eimg.parentNode.getElementsByTagName("a")[0]
	if (Prealink == -1 || Prealink == Curalink)		{return;}
	var parentTree,CurTree;//--����,�۵�λ����ԭ�۽��ڵ�ĸ��ڵ㣬�򴥷����ڵ�ĵ��
	parentTree=Prealink.parentNode.parentNode;
	CurTree=eimg.parentNode.parentNode;
	while(parentTree.className == "ChildTree" || parentTree.className == "RootTree"){
		if(CurTree == parentTree){
			Pcollapse=1;
			imgFolder(eimg);
			break;}
		parentTree=parentTree.parentNode.parentNode;		
		}	
	}//endelse
}
function imgFolder(fimg) {//--Ŀ¼�ĵ�� ���Ǵ�������A
var alink=fimg.parentNode.getElementsByTagName("a")[0]
alink.focus();
//open (alink.href, alink.target ?alink.target : '_blank');   //--ģ��a.click()�����Լ���firefox
if(alink.name == "accountlink")		aFolder(alink,0);
else	aFolder(alink,1);
}
function aFolder(fa,i) {//--���ӵĵ��-Ŀ¼�򿪼�չ������ ��i=0 ��i=1
var expandimg=fa.parentNode.getElementsByTagName("img")[0];
//--ǰ�ڵ�Ŀ¼ͼ��ر�
if(Prealink != -1 && Prealink.name != "accountlink")	
	{Prealink.parentNode.getElementsByTagName("img")[1].src=iconfolder;}
//--��ǰ�ڵ�Ŀ¼ͼ���;��i=0����i=1
if(i) 
	{fa.parentNode.getElementsByTagName("img")[1].src=iconfolderopen;}
//--Ŀ¼����չ��
if(Pcollapse==0 && expandimg.alt=="+"){
	var expandimg=fa.parentNode.getElementsByTagName("img")[0];
	expandimg.alt="-";
	expandimg.src=iconexpand;
	fa.parentNode.parentNode.getElementsByTagName("span")[0].style.display="block";
	}
else	{Pcollapse=0;}
Prealink=fa;
}