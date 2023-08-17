package project.team.service;

import project.team.domain.*;

import static project.team.service.Data.*;


/**
 * ClassName: NameListService
 * Description:
 *      负责将Data中的数据封装到Employee[]数组中，
 *      同时提供相关操作Employee[]的方法。
 * @Author ZhangJiaYuan
 * @Create 2023/4/18 11:40
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;//所有员工对象
    public NameListService(){
//        根据项目提供的Data类构建相应大小的employees数组
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            //获取通用的属性
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double price = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,price);
                    break;
                case PROGRAMMER:
                    equipment = creatEquipment(i);
                    employees[i] = new Programmer(id,name,age,price,equipment);
                    break;
                case DESIGNER:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,price,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,price,equipment,bonus,stock);
                    break;
            }
        }
//        再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
//                将对象存于数组中
//        Data类位于com.atguigu.team.service包中


    }
    private Equipment creatEquipment(int index){
        int equipmentType = Integer.parseInt(EQUIPMENTS[index][0]);

        String modelOrName = EQUIPMENTS[index][1];
        String priceOrDisplayOrType = EQUIPMENTS[index][2];

        switch (equipmentType){
            case PC:

                return new PC(modelOrName,priceOrDisplayOrType);
            case NOTEBOOK:
                double price = Double.parseDouble(priceOrDisplayOrType);
                return new NoteBook(modelOrName,price);
            case PRINTER:
                return new Printer(modelOrName,priceOrDisplayOrType);
        }
        return null;
    }

    public Employee[] getAllEmployees(){
        return employees;
    }

    /* @Description:获取指定id对应的员工
    * @Param [id]
    * @return project.team.domain.Employee
    */
    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId()){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }
}
