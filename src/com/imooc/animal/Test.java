package com.imooc.animal;

public class Test {

    public static void main(String[] args) {
        //���ɸ����������,���鳤��Ϊ5
        Animal[] obj = new Animal[5];
		//���������������������־��������ʵ��
        for(int i = 0; i<5; i++){
            int random = (int)(Math.random()*3);
            switch(random){
                case 0:
                    obj[i] = new Cat();
                    break;
                case 1:
                    obj[i] = new Dog();
                    break;
                case 2:
                    obj[i] = new Sheep();
                    break;
            }
        }

       //ѭ�������ѭ������ÿ������ֱ����cry()������
        for(int i = 0; i<obj.length; i++){
            obj[i].cry();
        }


	}

}
