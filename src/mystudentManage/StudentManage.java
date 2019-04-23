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
		
	}
	//输出所有类
	public static void printstudent(ArrayList<Student> arry) {
		
	}
	//添加类
	public static void addstudent(ArrayList<Student> arry) {
		//创建键盘录入对象
		
	}
	//删除类
	public static void deletestudent(ArrayList<Student> arry) {
		
	}
	//修改类
	public static void changestudent(ArrayList<Student> arry) {
		
	}
}