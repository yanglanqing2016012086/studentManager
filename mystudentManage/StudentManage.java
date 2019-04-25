package mystudentManage;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class StudentManage {
	public static void app(String[] args) {
		ArrayList<Student> arry = new ArrayList<>();
		while(true) {
			//这是成绩管理系统的主界面
			System.out.println("------学生管理系统------");
			System.out.println(" 1.插入");
			System.out.println(" 2.查找");
			System.out.println(" 3.删除");
			System.out.println(" 4.修改");
			System.out.println(" 5.输出");
			System.out.println(" 6.退出");
			Scanner sc =new Scanner(System.in);
			System.out.println("请输入序号选择相应的功能：");
			String stufunction = sc.nextLine();
			switch (stufunction) {
			case "1":
				//插入学生
				addstudent(arry);
				break;
			case "2":
				//查找学生
				findstudent(arry);
				break;
			case "3":
				//删除学生
				deletestudent(arry);
				break;
			case "4":
				//修改学生
				changestudent(arry);
				break;
			case "5":
				//输出所有学生
				printstudent(arry);
				break;
			case "6":
				//退出
			default:
				System.out.println("谢谢你的使用.");
				System.exit(0);//退出JVM
				break;
			}
		}
	}
	//查找学生类
	public static void findstudent(ArrayList<Student> arry) {
		if(arry.size()==0) {
			System.out.println("不好意思，目前还没有学生的信息可供查询，请返回重新操作！");
			return;
		}
		System.out.println("输入你要查找的学生学号：");
		Scanner sc= new Scanner(System.in);
		int stuId = sc.nextInt();
		boolean flag = false;
		Student s = null;
		for(int i=0;i<arry.size();i++) {
			s = arry.get(i);
			if(s.getID()==stuId) {		
				flag = true;			
				break;
			}
		}
		if(flag) {
			System.out.println("学号\t姓名\t出生日期\t性别");
			String gender;
			if(s.isGender())
				gender = "男";
			else
				gender = "女";
			System.out.println(s.getID()+"\t"+s.getName()+"\t"+s.getBirDate()+"\t"+gender);
		}else {
			System.out.println("没有查到此学号信息.");
		}
	}
	//输出所有类
	public static void printstudent(ArrayList<Student> arry) {
		if(arry.size()==0) {
			System.out.println("不好意思，目前还没有学生的信息可供查询，请返回重新操作！");
			return;
		}
		System.out.println("学号\t姓名\t出生日期\t性别");
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			String gender;
			if(s.isGender())
				gender = "男";
			else
				gender = "女";
			System.out.println(s.getID()+"\t"+s.getName()+"\t"+s.getBirDate()+"\t"+gender);
		}
	}
	//添加类
	public static void addstudent(ArrayList<Student> arry) {
		//创建键盘录入对象
		
	}
	//删除类
	public static void deletestudent(ArrayList<Student> arry) {
		Scanner sc= new Scanner(System.in);
		System.out.print("请输入要删除的学号：");
		int deleId = sc.nextInt();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getID()==deleId) {		
				index=i;					
			}			
			if (index == -1) {
				System.out.println("你要删除的学生不存在，请重新选择！");
			} else {
				arry.remove(index);
				System.out.println("删除学生成功！！");
			}
		} 
	}
	//修改类
	public static void changestudent(ArrayList<Student> arry) {
		
	}
}