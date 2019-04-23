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
		//录入对象
		Scanner sc= new Scanner(System.in);
		int stuId;
		while(true) {
			System.out.println("请输入学号：");
			stuId = sc.nextInt();
			boolean flag = false;
			for(int i=0;i<arry.size();i++) {
				Student s = arry.get(i);
				if(s.getID()==stuId) {		
					flag = true;			
					break;
				}
			}
			if(flag) {
				System.out.println("您输入的账号被占用！！！");
			}else {
				break;
			}
		}
		System.out.println("请输入姓名：");
		String name1 = sc.nextLine();
		String name = sc.nextLine();
		System.out.println("请输入出生日期：");
		String birDate = sc.nextLine();
		System.out.println("请输入性别，false代表女，true代表男：");
		boolean gender = sc.nextBoolean();
		//创建学生对象
		Student s = new Student();
		s.setID(stuId);
		s.setName(name);
		s.setBirDate(birDate);
		s.setGender(gender);
		//把学生对象添加到集合
		arry.add(s);
		System.out.println("添加学生成功！");
		
	}
	//删除类
	public static void deletestudent(ArrayList<Student> arry) {
		
	}
	//修改类
	public static void changestudent(ArrayList<Student> arry) {
		Scanner sc= new Scanner(System.in);
		System.out.print("请输入要改变的学号：");
		int changeId = sc.nextInt();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getID()==changeId) {		
				index = i;				
			}
		}
		if (index == -1) {
			System.out.println("您要改变的学生不存在，请重新操作！");
		} else {
			System.out.println("请输入新姓名：");
			String name1 = sc.nextLine();
			String name = sc.nextLine();
			System.out.println("请输入新出生日期：");
			String birDate = sc.nextLine();
			System.out.println("请输入新性别，false代表女，true代表男：");
			boolean gender = sc.nextBoolean();
			//创建学生对象
			Student s = new Student();
			s.setID(changeId);
			s.setName(name);
			s.setBirDate(birDate);
			s.setGender(gender);
			//修改学生对象
			arry.set(index,s);
			System.out.println("修改学生成功！！！");
		}
	}
}