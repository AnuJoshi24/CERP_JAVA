package com.anupama.cerp;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CerpApplicationTests {

//	 @Autowired
//	 CourseRepository cr;
//
//	 @Test
//	 void courseData() {
//	 	cr.saveAll(List.of(new Course("PG-DAC"),new Course("PG-DBDA")));
//	 }
//
//	 @Autowired
//	 StudentRepository sr;
//
//	 @Test
//	 void studentData() {
//
//	 		List<Course> cs = cr.findAll();
//	 		Course cs1 = cs.get(0);
//	 		Course cs2 = cs.get(1);
//
//	 	sr.saveAll(List.of(new Student("Disha", "Murarka","dishamurarka1117@gmail.com","Female", "Dish@111", "Pune", cs1),
//	 			new Student("Rakshit", "Jain","rakshitjain@gmail.com","Male", "Rakshit@111", "Pune", cs1),
//	 			new Student("Saud","Mukhair","saud@gmail.com","Male","Saud@789","Mumbai",cs1),
//	 			new Student("Anu","Joshi","anu@gmail.com","Female","Anu@789","Nashik",cs1),
//	 			new Student("Mahak","Jain","mahak@gmail.com","Female","Mahak@789","Agra",cs2),
//	 			new Student("Sneha","Choudhari","sneha@gmail.com","Female","Sneha@789","Nashik",cs2),
//	 			new Student("Paras","Kesare","paras@gmail.com","Male","Paras@789","Gondia",cs2),
//	 			new Student("Jitendra","Rajput","jitendra@gmail.com","Male","Jitendra@789","Amravati",cs2),
//	 			new Student("Nikhil","Gupta","nikhil@gmail.com","Male","nikhil@789","Delhi",cs2),
//	 			new Student("Ashi","Jain","ashi@gmail.com","Female","Ashi@789","Nimaj",cs1),
//	 			new Student("Nipun","Taunk","nipun@gmail.com","Male","Nipun@789","Surat",cs1),
//	 			new Student("Aman","Bhadoriya","aman@gmail.com","Male","Aman@789","Gwalior",cs1),
//	 			new Student("Abhinav","Shukla","abhinav@gmail.com","Male","Abhinav@789","Allahabad",cs1),
//	 			new Student("Yashvardhan","Chauhan","yash@gmail.com","Male","Yash@789","Indore",cs1),
//	 			new Student("Pratik","Agrawal","pratik@gmail.com","Male","Pratik@789","Pune",cs1),
//	 			new Student("Deepesh","Kuwar","deepesh@gmail.com","Male","Deepesh@789","Allahabad",cs1),
//	 			new Student("Kajal","Khidalkar","kajal@gmail.com","Female","Kajal@789","Nagpur",cs1),
//	 			new Student("Divyangi","Aggarwal","divyangi@gmail.com","Female","Divyangi@789","Delhi",cs1),
//	 			new Student("Kajal","Kesare","kajalk@gmail.com","Female","Kajalk@789","Pune",cs2),
//	 			new Student("Chaitrali","Shinde","chaitrali@gmail.com","Female","Chaitrali@789","Pune",cs2),
//	 			new Student("Juilee","Bhave","juilee@gmail.com","Male","Juilee@789","Ratnagiri",cs2),
//	 			new Student("Harshada","Choudhari","harshada@gmail.com","Female","Harshada@789","Dhule",cs2),
//	 			new Student("Aishwarya","Dabhole","aishwarya@gmail.com","Female","Aishwarya@789","Islampur",cs2),
//	 			new Student("Madhav","Mundhada","madhav@gmail.com","Male","Madhav@789","Amravati",cs2),
//	 			new Student("Utkarsh","Deshmukh","utkarsh@gmail.com","Female","Utkarsh@789","Amravati",cs2),
//	 			new Student("Mrunmayee","Chaudhari","mrunmayee@gmail.com","Female","Mrunmayee@789","Amravati",cs2),
//	 			new Student("Dnyanvi","Bante","dnyanvi@gmail.com","Female","Dnyanvi@789","Nagpur",cs2),
//	 			new Student("Jayesh","Jaiswal","jayesh@gmail.com","Male","Jayesh@789","Pune",cs2),
//	 			new Student("Kanak","Murarka","kanak@gmail.com","Female","Kanak@789","Aurangabad",cs1),
//	 			new Student("Tanmay","Bagdiya","tanmay@gmail.com","Male","Tanmay@789","Aurangabad",cs1)));
//	 }
//
//
//	 @Autowired
//	 SubjectRepository sbr;
//
//
//
//	 @Test
//	 void subjectData() {
//	 	List<Course> cs = cr.findAll();
//	 	Course cs1 = cs.get(0);
//	 	Course cs2 = cs.get(1);
//	 	sbr.saveAll(List.of(new Subject("Core Java", cs1),new Subject("DSA", cs1),new Subject("DBT", cs1), new Subject("WPT", cs1), new Subject("OS", cs1), new Subject("DOTNET", cs1), new Subject("J2EE",cs1), new Subject("SDM", cs1),
//	 			new Subject("Linux Programming", cs2),new Subject("DBMS", cs2),new Subject("Python", cs2),new Subject("OOP Java", cs2),new Subject("Big Data Technologies", cs2),new Subject("Data Visualization", cs2),new Subject("Statistics", cs2),new Subject("Machine Learning", cs2)));
//	 }
//
//
//	 @Autowired
//	 AttendanceRepository ar;
//
//
//
//
//	 @Test
//	 void AttendanceData() {
//
//	 	List<Student> s = sr.findAll();
//	 	Student s1 = s.get(0);
//	 	Student s2 = s.get(1);
//	 	Student s3 = s.get(2);
//	 	Student s4 = s.get(3);
//	 	Student s5 = s.get(4);
//	 	Student s6 = s.get(5);
//	 	Student s7 = s.get(6);
//	 	Student s8 = s.get(7);
//	 	Student s9 = s.get(8);
//	 	Student s10 = s.get(9);
//	 	Student s11 = s.get(10);
//	 	Student s12 = s.get(11);
//	 	Student s13 = s.get(12);
//	 	Student s14 = s.get(13);
//	 	Student s15 = s.get(14);
//	 	Student s16 = s.get(15);
//	 	Student s17 = s.get(16);
//	 	Student s18 = s.get(17);
//	 	Student s19 = s.get(18);
//	 	Student s20 = s.get(19);
//
//
//	 	List<Subject> sb = sbr.findAll();
//	 	Subject sb1 = sb.get(0);
//	 	Subject sb2 = sb.get(1);
//	 	Subject sb3 = sb.get(2);
//	 	Subject sb4 = sb.get(3);
//	 	Subject sb5 = sb.get(4);
//	 	Subject sb6 = sb.get(5);
//	 	Subject sb7 = sb.get(6);
//	 	Subject sb8 = sb.get(7);
//	 	Subject sb9 = sb.get(8);
//	 	Subject sb10 = sb.get(9);
//	 	Subject sb11 = sb.get(10);
//	 	Subject sb12 = sb.get(11);
//	 	Subject sb13 = sb.get(12);
//	 	Subject sb14 = sb.get(13);
//	 	Subject sb15 = sb.get(14);
//	 	Subject sb16 = sb.get(15);
//
//	 	ar.saveAll(List.of(new Attendance(80, s1, sb1),new Attendance(90, s1, sb2),new Attendance(85, s1, sb3), new Attendance(70, s1, sb4), new Attendance(100, s1, sb5),new Attendance(80, s1, sb6),new Attendance(75, s1, sb7), new Attendance(60, s1, sb8),
//	 			new Attendance(60, s2, sb1),new Attendance(75, s2, sb2),new Attendance(85, s2, sb3), new Attendance(70, s2, sb4), new Attendance(99, s2, sb5),new Attendance(80, s2, sb6),new Attendance(76, s2, sb7), new Attendance(95, s2, sb8),
//	 			new Attendance(70, s3, sb1),new Attendance(70, s3, sb2),new Attendance(85, s3, sb3), new Attendance(60, s3, sb4), new Attendance(76, s3, sb5),new Attendance(81, s3, sb6),new Attendance(77, s3, sb7), new Attendance(97, s3, sb8),
//	 			new Attendance(90, s4, sb1),new Attendance(100, s4, sb2),new Attendance(90, s4, sb3), new Attendance(99, s4, sb4), new Attendance(87, s4, sb5),new Attendance(84, s4, sb6),new Attendance(79, s4, sb7), new Attendance(99, s4, sb8),
//	 			new Attendance(80, s5, sb9),new Attendance(99, s5, sb10),new Attendance(85, s5, sb11), new Attendance(99, s5, sb12), new Attendance(89, s5, sb13),new Attendance(86, s5, sb14),new Attendance(78, s5, sb15), new Attendance(91, s5, sb16),
//	 			new Attendance(95, s6, sb9),new Attendance(89, s6, sb10),new Attendance(75, s6, sb11), new Attendance(70, s6, sb12), new Attendance(98, s6, sb13),new Attendance(87, s6, sb14),new Attendance(80, s6, sb15), new Attendance(90, s6, sb16),
//	 			new Attendance(61, s7, sb9),new Attendance(89, s7, sb10),new Attendance(85, s7, sb11), new Attendance(80, s7, sb12), new Attendance(97, s7, sb13),new Attendance(88, s7, sb14),new Attendance(81, s7, sb15), new Attendance(92, s7, sb16),
//	 			new Attendance(77, s8, sb9),new Attendance(98, s8, sb10),new Attendance(85, s8, sb11), new Attendance(70, s8, sb12), new Attendance(79, s8, sb13),new Attendance(89, s8, sb14),new Attendance(85, s8, sb15), new Attendance(81, s8, sb16),
//	 			new Attendance(67, s9, sb9),new Attendance(97, s9, sb10),new Attendance(65, s9, sb11), new Attendance(80, s9, sb12), new Attendance(68, s9, sb13),new Attendance(90, s9, sb14),new Attendance(89, s9, sb15), new Attendance(82, s9, sb16),
//	 			new Attendance(78, s10, sb1),new Attendance(90, s10, sb2),new Attendance(85, s10, sb3), new Attendance(70, s10, sb4), new Attendance(69, s10, sb5),new Attendance(91, s10, sb6),new Attendance(85, s10, sb7), new Attendance(83, s10, sb8),
//	 			new Attendance(88, s11, sb1),new Attendance(90, s11, sb2),new Attendance(80, s11, sb3), new Attendance(90, s11, sb4), new Attendance(99, s11, sb5),new Attendance(92, s11, sb6),new Attendance(85, s11, sb7), new Attendance(84, s11, sb8),
//	 			new Attendance(89, s12, sb1),new Attendance(90, s12, sb2),new Attendance(85, s12, sb3), new Attendance(90, s12, sb4), new Attendance(78, s12, sb5),new Attendance(93, s12, sb6),new Attendance(95, s12, sb7), new Attendance(85, s12, sb8),
//	 			new Attendance(81, s13, sb1),new Attendance(90, s13, sb2),new Attendance(95, s13, sb3), new Attendance(80, s13, sb4), new Attendance(87, s13, sb5),new Attendance(94, s13, sb6),new Attendance(95, s13, sb7), new Attendance(86, s13, sb8),
//	 			new Attendance(80, s14, sb1),new Attendance(89, s14, sb2),new Attendance(90, s14, sb3), new Attendance(70, s14, sb4), new Attendance(88, s14, sb5),new Attendance(95, s14, sb6),new Attendance(78, s14, sb7), new Attendance(87, s14, sb8),
//	 			new Attendance(92, s15, sb1),new Attendance(76, s15, sb2),new Attendance(85, s15, sb3), new Attendance(70, s15, sb4), new Attendance(98, s15, sb5),new Attendance(96, s15, sb6),new Attendance(79, s15, sb7), new Attendance(88, s15, sb8),
//	 			new Attendance(98, s16, sb1),new Attendance(75, s16, sb2),new Attendance(85, s16, sb3), new Attendance(80, s16, sb4), new Attendance(89, s16, sb5),new Attendance(97, s16, sb6),new Attendance(88, s16, sb7), new Attendance(95, s16, sb8),
//	 			new Attendance(99, s17, sb1),new Attendance(80, s17, sb2),new Attendance(90, s17, sb3), new Attendance(70, s17, sb4), new Attendance(90, s17, sb5),new Attendance(98, s17, sb6),new Attendance(89, s17, sb7), new Attendance(94, s17, sb8),
//	 			new Attendance(97, s18, sb1),new Attendance(85, s18, sb2),new Attendance(85, s18, sb3), new Attendance(99, s18, sb4), new Attendance(99, s18, sb5),new Attendance(99, s18, sb6),new Attendance(98, s18, sb7), new Attendance(93, s18, sb8),
//	 			new Attendance(94, s19, sb9),new Attendance(80, s19, sb10),new Attendance(85, s19, sb11), new Attendance(88, s19, sb12), new Attendance(89, s19, sb13),new Attendance(89, s19, sb14),new Attendance(90, s19, sb15), new Attendance(97, s19, sb16),
//	 			new Attendance(67, s20, sb9),new Attendance(90, s20, sb10),new Attendance(85, s20, sb11), new Attendance(77, s20, sb12), new Attendance(99, s20, sb13),new Attendance(80, s20, sb14),new Attendance(90, s20, sb15), new Attendance(99, s20, sb16)));
//
//	 }
//
//
//	 @Autowired
//	 AdminRepository adr;
//
//	 @Test
//	 void AdminData() {
//	 	adr.saveAll(List.of(new Admin("admin@gmail.com", "Admin@123"),new Admin("adarsh@gmail.com","Adarsh@789")));
//
//	 }
//
//	 @Autowired
//	 ScheduleRepository sch;
//
//	 @Test
//	 void scheduleData() {
//	 	List<Course> cs = cr.findAll();
//	 	Course cs1 = cs.get(0);
//	 	Course cs2 = cs.get(1);
//
//	 	List<Subject> sb = sbr.findAll();
//	 	Subject sb1 = sb.get(0);
//	 	Subject sb2 = sb.get(1);
//	 	Subject sb3 = sb.get(2);
//	 	Subject sb4 = sb.get(3);
//	 	Subject sb5 = sb.get(4);
//	 	Subject sb6 = sb.get(5);
//	 	Subject sb7 = sb.get(6);
//	 	Subject sb8 = sb.get(7);
//	 	Subject sb9 = sb.get(8);
//	 	Subject sb10 = sb.get(9);
//	 	Subject sb11 = sb.get(10);
//	 	Subject sb12 = sb.get(11);
//	 	Subject sb13 = sb.get(12);
//	 	Subject sb14 = sb.get(13);
//	 	Subject sb15 = sb.get(14);
//	 	Subject sb16 = sb.get(15);
//
//	 	sch.saveAll(List.of(new Schedule(LocalDateTime.parse("2023-03-14T08:00:00"),LocalDateTime.parse("2023-03-14T11:30:00"),"Class 001",cs1,sb1),
//	 			new Schedule(LocalDateTime.parse("2023-03-14T13:00:00"),LocalDateTime.parse("2023-03-14T16:00:00"),"Class 001",cs1,sb8),
//	 			new Schedule(LocalDateTime.parse("2023-03-15T09:00:00"),LocalDateTime.parse("2023-03-15T12:00:00"),"Class 001",cs1,sb4),
//	 			new Schedule(LocalDateTime.parse("2023-03-15T18:00:00"),LocalDateTime.parse("2023-03-15T21:30:00"),"Class 001",cs1,sb2),
//	 			new Schedule(LocalDateTime.parse("2023-03-16T10:00:00"),LocalDateTime.parse("2023-03-16T13:00:00"),"Class 001",cs1,sb5),
//	 			new Schedule(LocalDateTime.parse("2023-03-16T15:00:00"),LocalDateTime.parse("2023-03-16T18:00:00"),"Class 001",cs1,sb7),
//	 			new Schedule(LocalDateTime.parse("2023-03-14T10:00:00"),LocalDateTime.parse("2023-03-14T13:00:00"),"Lab 102",cs2,sb11),
//	 			new Schedule(LocalDateTime.parse("2023-03-14T08:00:00"),LocalDateTime.parse("2023-03-14T12:00:00"),"Lab 102",cs2,sb12),
//	 			new Schedule(LocalDateTime.parse("2023-03-16T09:30:00"),LocalDateTime.parse("2023-03-16T13:30:00"),"Lab 102",cs2,sb9),
//	 			new Schedule(LocalDateTime.parse("2023-03-16T13:00:00"),LocalDateTime.parse("2023-03-16T16:00:00"),"Lab 102",cs2,sb15),
//	 			new Schedule(LocalDateTime.parse("2023-03-17T18:00:00"),LocalDateTime.parse("2023-03-17T20:00:00"),"Lab 102",cs2,sb12)));
//	 }
//
//	 @Test
//	 void sortTest(){
//	 	List<Student> listName = sr.findAll(Sort.by(Sort.Direction.ASC, "firstName"));
//	 	listName.forEach(System.out::println);
//	 }
//
//	 @Test
//	 void paginationTest(){
//	 	Page<Student> allStudentPage = sr.findAll(PageRequest.of(0, 10));
//	 	allStudentPage.forEach(System.out::println);
//	 	System.out.println(allStudentPage.getSize());
//	 }

}
