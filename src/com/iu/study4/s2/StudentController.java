package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {

	public void start() {
		//1. �л����� ���� -- makeStudents ȣ��
		//2. �л����� ��� -- SV���� ���
		//3. ���α׷� ����
		int select = 0;
		StudentService studentService = new StudentService();
		StudentView studentView = new StudentView();
		Student [] students = null;
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("1. �л���������");
			System.out.println("2. �л��������");
			System.out.println("3. �л������˻�");
			System.out.println("4. ���α׷�����");
			select = sc.nextInt();
			
			if(select == 1) {
				students = studentService.makeStudents();
			}
			else if(select ==2) {
				studentView.view(students);
			}
			else if(select ==3) {
				// 1. findByNum ȣ��
				Student student = studentService.findByNum(students);
				// 2. viewOne ���
				studentView.view(student);
			}
			else {
				System.out.println("����");
				break;
			}
		}
	}
}
