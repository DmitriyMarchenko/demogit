package lesson03;

import java.util.Scanner;

public class homeWork05 {
	private static Scanner scan05;
	
	public static void main(String args[]){
		scan05 = new Scanner(System.in);
		//������ ������ ���������� ������� �� ��������
		System.out.print("������� ������ �������: ");
		int size = scan05.nextInt();
		System.out.print("�� �����: " + size);
		scan05.close();
		int [][] matrix = new int[size][size];
	}
}
