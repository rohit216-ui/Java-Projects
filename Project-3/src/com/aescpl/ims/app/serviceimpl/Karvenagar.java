package com.aescpl.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aescpl.ims.model.Batch;
import com.aescpl.ims.model.Course;
import com.aescpl.ims.model.Faculty;
import com.aescpl.ims.model.Student;
import com.aescpl.ims.servicei.CJC;

public class Karvenagar implements CJC {
	
	List<Course> clist=new ArrayList<Course>(); 
	List<Faculty> flist=new ArrayList<Faculty>(); 
	List<Batch> blist=new ArrayList<Batch>(); 
	List<Student> slist=new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void addCourse() {
		Course cs = new Course();
		System.out.println("Enter Course Id");
		int id = sc.nextInt();
		System.out.println("Enter Course Name");
		String name = sc.next() + sc.nextLine();
		cs.setCname(name);
		cs.setCid(id);
		clist.add(cs);	
		
	}
	
	
	@Override
	public void viewCourse() {
		
		for(Course cl: clist) {
			System.out.println(cl);
		}
		
	}
	
	@Override
	public void addFaculty() {
		Faculty ft = new Faculty();
		System.out.println("Enter Faculty Id");
		int id = sc.nextInt();
		System.out.println("Enter Faculty name");
		String name = sc.next() + sc.nextLine();
		ft.setFid(id);
		ft.setFname(name);
		System.out.println("Choose the Avilable course : ");
		for(int i = 0; i<clist.size(); i++) {
			System.out.println(" Enter  "+(i+1)+" for "+ clist.get(i));
		}
		int i = sc.nextInt()-1;
		ft.setCourse(clist.get(i));
		flist.add(ft);
		
	}
	@Override
	public void viewFaculty() {
		for(Faculty f: flist) {
			System.out.println(f);
		}
		
	}
	
	@Override
	public void addBatch() {
		Batch b = new Batch();
		System.out.println("Enter batch code");
		int bid = sc.nextInt();
		b.setBid(bid);
		System.out.println("Enter Batch Name");
		String bname = sc.next() + sc.nextLine();
		b.setBname(bname);
		System.out.println("Choose the Faculty to assign to the batch");
		for(int i = 0;i<flist.size();i++) {
			System.out.println("Enter "+(i+1)+" for "+flist.get(i));
		}
		int i = sc.nextInt() - 1;
		b.setFaculty(flist.get(i));
		blist.add(b);
		System.out.println("Faculty "+flist.get(i)+"is assigned to the batch "+b.getBid());
	}
	@Override
	public void viewBatch() {
		
		for(Batch b: blist) {
			System.out.println(b);
		}
	}
	
	@Override
	public void addStudent() {
	Student st = new Student();
	System.out.println("Enter Student id");
	int sid = sc.nextInt();
	st.setSid(sid);
	System.out.println("Enter student name");
	String sname = sc.next() + sc.nextLine();
	st.setSname(sname);
	System.out.println("Avilable batches:");
	for(int i = 0;i<blist.size();i++) {
		System.out.println("Enter "+(i+1)+" for "+blist.get(i));
	}
	int i = sc.nextInt()-1;
	st.setBatch(blist.get(i));
	slist.add(st);
	System.out.println("Student "+st.getSid()+"is added to the batch"+blist.get(i));
	}
	
	@Override
	public void viewStudent() {
		for(Student s: slist) {
			System.out.println(s);
		}
	}

}