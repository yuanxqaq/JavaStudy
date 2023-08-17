package project.team.service;

import project.team.domain.Architect;
import project.team.domain.Designer;
import project.team.domain.Employee;
import project.team.domain.Programmer;

/**
 * ClassName: TeamService
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/18 11:41
 * @Version 1.0
 */
public class TeamService {
    private int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    public TeamService() {
    }

    public TeamService(int counter, Programmer[] team, int total) {
        this.counter = counter;
        this.team = team;
        this.total = total;
    }
    /* @Description: 返回当前团队的所有对象
    * @Param []
    * @return 包含所有成员对象的数组，数组大小与成员人数一致
    */
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /* @Description: 向团队中添加成员
    * @Param [e] 待添加成员的对象
    * @return
    * 异常：添加失败， TeamException中包含了失败原因
     */
    public void addMember(Employee e) throws TeamException{
        if (total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        if (!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        Programmer p = (Programmer) e;
        Status status = p.getStatus();
        switch (status){
            case BUSY -> throw new TeamException("该员工已是团队成员");
            case VOCATION -> throw new TeamException("该成员正在休假，无法添加");
        }
        boolean isExist = isExist(p);
        if (isExist){
            throw new TeamException("该成员已在本开发团队中");
        }
        int progNum,desNum,arcNum;
        progNum = desNum = arcNum= 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect){
                arcNum++;
            }else if (team[i] instanceof Designer){
                desNum++;
            }else {
                progNum++;
            }
        }
        if (p instanceof Architect){
            if (arcNum >= 1 ){
                throw new TeamException("团队中最多只能有一名架构师");
            }
        }else if (p instanceof Designer){
            if (desNum >= 2 ){
                throw new TeamException("团队中最多只能有两名设计师");
            }
        }else{
            if (progNum >= 3 ){
                throw new TeamException("团队中最多只能有三名程序员");
            }
        }
        //代码能执行到此位置，意味着p是可以添加到team数组中的
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
    }

    /* @Description: 判断p是否在当前的开发团队中
    * @Param [p]
    * @return 
    */
    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()){
                return true;
            }
        }
        return false;
    }

    /* @Description: 从团队中删除成员
    * @Param [memberId] 待删除成员的memberId
    * @return
    * 异常：找不到指定memberId的员工，删除失败
     */
    public void removeMember(int memberId)throws TeamException{
        int i;
        for (i = 0; i < total; i++) {
            if (team[i].getId() == memberId){
                //找到了这个员工
                team[i].setStatus(Status.FREE);
                //员工的memberID可以不修改
                break;
            }
        }
        //没找到
        if (i == total){
            throw new TeamException("找不到指定memberID的员工，删除失败");
        }
        //调整数组
        for (int j = i; j < total - 1; j++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;
    }
}
