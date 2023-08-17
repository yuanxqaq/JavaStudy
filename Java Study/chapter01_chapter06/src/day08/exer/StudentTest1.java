package day08.exer;

public class StudentTest1 {

    public static void main(String[] args) {
        //声明一个Student类型的数组
        Student1[] stus = new Student1[20];
        for (int i = 0;i < stus.length;i++){
            stus[i] = new Student1();
            //给Student属性赋值
            stus[i].number = i + 1;
            //年级[1,6]
            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            //成绩[0,100]
            stus[i].score = (int)(Math.random() * (100 - 0 + 1));
        }

        StudentTest1 test = new StudentTest1();
        //遍历学生数组
        test.print(stus);

        System.out.println("*****************");
        //打印出state为3的学生信息
        test.searchState(stus,3);
        //冒泡按照成绩排序并遍历所有学生信息
        System.out.println("*****************");
        test.sort(stus);
        test.print(stus);

    }
    //遍历Student1[]数组的操作
    public void print(Student1[] stus){
        for (int i = 0;i < stus.length;i++){
            System.out.println(stus[i].info());
        }
    }

    //查找Student数组中指定年级的学生信息
    public void searchState(Student1[] stus,int state){
        for (int i = 0; i<stus.length;i++){
            if (stus[i].state == state){
                System.out.println(stus[i].info());
            }
        }
    }

    //冒泡排序数组的成绩
    public void sort(Student1[] stus){
        for (int i = 0;i < stus.length -1;i++){
            for (int j = 0;j < stus.length - 1 - i;j++){
                if (stus[j].score > stus[j+1].score){
                    //如果需要换序，交换的是Student对象
                    Student1 temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }
}

class Student1{

    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生信息的方法
    public String info(){
        return "学号："+ number+",年级："+state+",成绩"+score;
    }

}