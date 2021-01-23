//package proxy.ex2;
//
//import java.util.stream.Collectors;
//
//import java.util.Arrays;
//
//import java.util.List;
//
//public class TestMain {
//	public static void main() {
//		// 직원별 개인 객체 생성
//	    Employee CTO = new NormalEmployee("Dragon Jung", GRADE.VicePresident);
//	    Employee CFO = new NormalEmployee("Money Lee", GRADE.VicePresident);
//	    Employee devManager = new NormalEmployee("Cats Chang", GRADE.Manager);
//	    Employee financeManager = new NormalEmployee("Dell Choi", GRADE.Manager);
//	    Employee devStaff = new NormalEmployee("Dark Kim", GRADE.Staff);
//	    Employee financeStaff = new NormalEmployee("Pal Yoo", GRADE.Staff);
//
//	    // 직원들을 리스트로 가공.
//	    List<Employee> employees = Arrays.asList(CTO, CFO, devManager, financeManager, devStaff, financeStaff);
//
//	    System.out.println("================================================================");
//	    System.out.println("시나리오1. Staff(Dark Kim)가 회사 인원 인사 정보 조회");
//	    System.out.println("================================================================");
//
//	    // 자신의 직급에 관계 없이 모든 직급의 인사 정보를 열람 (문제!!)
//	    printAllInformationInCompany(devStaff, employees);
//
//	    System.out.println("================================================================");
//	    System.out.println("보호 프록시 서비스를 가동.");
//	    System.out.println("================================================================");
//	    List<Employee> protectedEmployees = employees.stream().map(ProtectedEmployee::new).collect(Collectors.toList());
//
//	    System.out.println("================================================================");
//	    System.out.println("시나리오2. Staff(Dark Kim)가 회사 인원 인사 정보 조회");
//	    System.out.println("================================================================");
//	    printAllInformationInCompany(devStaff, protectedEmployees);
//
//	    System.out.println("================================================================");
//	    System.out.println("시나리오3. Manger(Cats Chang)가 회사 인원 인사 정보 조회");
//	    System.out.println("================================================================");
//	    printAllInformationInCompany(devManager, protectedEmployees);
//
//	    System.out.println("================================================================");
//	    System.out.println("시나리오4. VicePresident(Dragon Jung)가 회사 인원 인사 정보 조회");
//	    System.out.println("================================================================");
//	    printAllInformationInCompany(CTO, protectedEmployees);
//	}
//
//	public void printAllInformationInCompany(Employee viewer, List<Employee> employees) {
//	    employees.stream()
//	            .map(employee -> {
//	                try {
//	                    return employee.getInformation(viewer);
//	                } catch (NotAuthorizedException e) {
//	                    return "Not authorized.";
//	                }
//	            })
//	            .forEach(System.out::println);
//	}
//}
