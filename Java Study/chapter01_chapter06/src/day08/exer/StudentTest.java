package day08.exer;

public class StudentTest {

    public static void main(String[] args) {
        //声明一个Student类型的数组
        Student[] stus = new Student[20];
        for (int i = 0;i < stus.length;i++){
            stus[i] = new Student();
            //给Student属性赋值
            stus[i].number = i + 1;
            //年级[1,6]
            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            //成绩[0,100]
            stus[i].score = (int)(Math.random() * (100 - 0 + 1));
        }

        //遍历学生数组
        for (int i = 0;i < stus.length;i++){
            System.out.println(stus[i].info());
        }

        System.out.println("*****************");
        //打印出state为3的学生信息
        for (int i = 0; i<stus.length;i++){
            if (stus[i].state == 3){
                System.out.println(stus[i].info());
            }
        }
        //冒泡按照成绩排序并遍历所有学生信息
        System.out.println("*****************");
        for (int i = 0;i < stus.length -1;i++){
            for (int j = 0;j < stus.length - 1 - i;j++){
                if (stus[j].score > stus[j+1].score){
                    //如果需要换序，交换的是Student对象
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }

        //遍历学生数组
        for (int i = 0;i < stus.length;i++){
            System.out.println(stus[i].info());
        }
    }
}

class Student{

    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生信息的方法
    public String info(){
        return "学号："+ number+",年级："+state+",成绩"+score;
    }

}