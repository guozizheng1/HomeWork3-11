package com.imooc.animal;

public class Test {

    public static void main(String[] args) {
        //生成父类对象数组,数组长度为5
        Animal[] obj = new Animal[5];
		//产生随机数，随机产生三种具体子类的实例
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

       //循环输出，循环体中每个对象分别调用cry()方法。
        for(int i = 0; i<obj.length; i++){
            obj[i].cry();
        }


	}

}
