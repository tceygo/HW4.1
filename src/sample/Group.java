package sample;

import java.util.Arrays;
import java.util.Comparator;

public class Group {

	private Student[] me3 = new Student[10];

	public Group(Student[] me3) {
		super();
		this.me3 = me3;
	}

	public Group() {
		super();

	}

	public Student[] getMe3() {
		return me3;
	}

	public void setMe3(Student[] me3) {
		this.me3 = me3;
	}

	public void addStudent(Student stud) {
		int count = 0;
		try {
			for (int i = 0; i < me3.length; i++) {
				if (me3[i] == null) {
					me3[i] = stud;
					count++;
					break;
				}
			}

			if (count == 0) {
				throw new FullExeption();
			}
		} catch (FullExeption e) {
			System.out.println("Група заповнена студент не доданий");
		}

	}

	public void dellStudent(long id) {
		for (int i = 0; i < me3.length; i++) {
			if (me3[i] != null && me3[i].getId() == id) {
				me3[i] = null;
			}
		}
	}

	public Student searchStudent(String lastName) {
		Student temp = new Student();
		for (int i = 0; i < me3.length; i++) {
			if (me3[i] != null && me3[i].getLastName().equals(lastName)) {
				temp = me3[i];
				break;
			} else {
				temp = null;
			}
		}
		return temp;
	}
	
	public void sortStudentsByLastName() {
		Arrays.sort(me3, Comparator.nullsLast(new StudentComparator()));
	}

	@Override
	public String toString() {
		return "Group [me3=" + Arrays.toString(me3) + "]";
	}

}
