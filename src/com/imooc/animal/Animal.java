package com.imooc.animal;

public class Animal {
    //���ԣ�kind(����)
	private String kind;
	
	public Animal(){
		
	}
    
	//�������Σ�kingΪ���������캯��
	public Animal(String kind){
	    this.setKind(kind);
	}

    //Ӧ�÷�װʵ�ֶ�˽�����Ե�get/set����
	public String getKind(){
	    return kind;
	}
	
	public void setKind(String kind){
	    this.kind = kind;
	}
	
	
	//������Ա����cry():void
	public void cry(){
	    System.out.println("���ж��ﶼ���");
	}


}
