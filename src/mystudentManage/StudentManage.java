package mystudentManage;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class StudentManage {
	//������app������
	public static void app(String[] args) {
		ArrayList<Student> arry = new ArrayList<>();
		while(true) {
			//���ǳɼ�����ϵͳ��������
			System.out.println("------ѧ������ϵͳ------");
			System.out.println(" 1.����");
			System.out.println(" 2.����");
			System.out.println(" 3.ɾ��");
			System.out.println(" 4.�޸�");
			System.out.println(" 5.���");
			System.out.println(" 6.�˳�");
			Scanner sc =new Scanner(System.in);
			System.out.println("���������ѡ����Ӧ�Ĺ��ܣ�");
			String stufunction = sc.nextLine();
			switch (stufunction) {
			case "1":
				//����ѧ������Ϣ
				addstudent(arry);
				break;
			case "2":
				//����ĳһ��ѧ������Ϣ
				findstudent(arry);
				break;
			case "3":
				//ɾ��ѧ������Ϣ
				deletestudent(arry);
				break;
			case "4":
				//�޸�ѧ������Ϣ
				changestudent(arry);
				break;
			case "5":
				//�������ѧ������Ϣ
				printstudent(arry);
				break;
			case "6":
				//�˳�
			default:
				System.out.println("лл���ʹ��.");
				System.exit(0);		
				//�˳�JVM
				break;
			}
		}
	}
	
	//����ѧ����
	public static void findstudent(ArrayList<Student> arry) {
		if(arry.size()==0) {
			System.out.println("������˼��Ŀǰ��û��ѧ������Ϣ�ɹ���ѯ���뷵�����²�����");
			return;
		}
		System.out.println("������Ҫ���ҵ�ѧ��ѧ�ţ�");
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
			System.out.println("ѧ��\t����\t��������\t�Ա�");
			String gender;
			if(s.isGender())
				gender = "��";
			else
				gender = "Ů";
			System.out.println(s.getID()+"\t"+s.getName()+"\t"+s.getBirDate()+"\t"+gender);
		}else {
			System.out.println("û�в鵽��ѧ����Ϣ.");
		}
	}
	
	//�������ѧ������
	public static void printstudent(ArrayList<Student> arry) {
		if(arry.size()==0) {
			System.out.println("������˼��Ŀǰ��û��ѧ������Ϣ�ɹ���ѯ���뷵�����²�����");
			return;
		}
		System.out.println("ѧ��\t����\t��������\t�Ա�");
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			String gender;
			if(s.isGender())
				gender = "��";
			else
				gender = "Ů";
			System.out.println(s.getID()+"\t"+s.getName()+"\t"+s.getBirDate()+"\t"+gender);
		}
	}

	//�����
	public static void addstudent(ArrayList<Student> arry) {
		Scanner sc= new Scanner(System.in); //¼�����
		int stuId;
		while(true) {
			System.out.println("������ѧ�ţ�");
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
				System.out.println("��������˺ű�ռ�ã�����");
			 }
                                                else {
				break;
			}
		}
		System.out.println("������������");
		String name1 = sc.nextLine();
		String name = sc.nextLine();
		System.out.println("������������ڣ�");
		String birDate = sc.nextLine();
		System.out.println("�������Ա�false����Ů��true�����У�");
		boolean gender = sc.nextBoolean();
		Student s = new Student(); //����ѧ������
		s.setID(stuId);
		s.setName(name);
		s.setBirDate(birDate);
		s.setGender(gender);
		arry.add(s); //��ѧ��������ӵ�����
		System.out.println("���ѧ���ɹ���");
		
	}
	//ɾ����
	public static void deletestudent(ArrayList<Student> arry) {
		Scanner sc= new Scanner(System.in);
		System.out.print("������Ҫɾ����ѧ�ţ�");
		int deleId = sc.nextInt();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getID()==deleId) {		
				index=i;					
			}			
			if (index == -1) {
				System.out.println("��Ҫɾ����ѧ�������ڣ�������ѡ��");
			}
                                              else {
				arry.remove(index);
				System.out.println("ɾ��ѧ���ɹ�����");
			}
		} 
	}
	//�޸���
	public static void changestudent(ArrayList<Student> arry) {
		Scanner sc= new Scanner(System.in);
		System.out.print("������Ҫ�ı��ѧ�ţ�");
		int changeId = sc.nextInt();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getID()==changeId) {		
				index = i;				
			}
		}
		if (index == -1) {
			System.out.println("��Ҫ�ı��ѧ�������ڣ������²�����");
		} 
                               else {
			System.out.println("��������������");
			String name1 = sc.nextLine();
			String name = sc.nextLine();
			System.out.println("�������³������ڣ�");
			String birDate = sc.nextLine();
			System.out.println("���������Ա�false����Ů��true�����У�");
			boolean gender = sc.nextBoolean();
			Student s = new Student(); //����ѧ������
			s.setID(changeId);
			s.setName(name);
			s.setBirDate(birDate);
			s.setGender(gender);
			arry.set(index,s); //�޸�ѧ������
			System.out.println("�޸�ѧ���ɹ�������");
		}
	}
}