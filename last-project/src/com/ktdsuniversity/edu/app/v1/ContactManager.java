package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ContactManager {
	
	private List<Contact> contactList;
	
	public ContactManager() {
		this.contactList = new ArrayList<>();
	}
	
	// 1. contactList에 Contact 인스턴스를 추가하는 기능
	
	public void addContactList(Contact contact) {
		this.contactList.add(contact);
		System.out.println("추가 완료");
	}
	
	// 2. contactList의 모든 연락처 정보를 출력하는 기능
	public void printcontactList() {
//		this.contactList.forEach(System.out::println);
		System.out.println();
		System.out.println("=== 전체 연락처 목록 (" + this.contactList.size() + "건) ===");
		for (int i = 0; i < this.contactList.size(); i++) {
			System.out.println("[" + i + "] " + this.contactList.get(i));
		}
	}
	
	
	// 3. contactList에서 전화번호 검색결과가 출력하는 기능
	public void printFindPhoneNumberString(String phoneNumber) {
		System.out.println();
		System.out.println("입력받은 전화번호 : " + phoneNumber);
		this.contactList.stream()
								.filter(c -> c.getPhones() != null && // 리스트가 null인지 확인
										c.getPhones().stream()	// Phone 리스트를 다시 스트림으로 변환
													.anyMatch(p -> p.getPhoneNumber() != null && 
													p.getPhoneNumber().contains(phoneNumber)
													)
								) // 번호가 포함되어 있는지 확인
								.forEach(System.out::println);
	}
	
	
	
	// 4. contactList에서 이름 검색 결과 출력하는 기능
	// 예) "김"을 파라미터로 전달하면 name, firstName, lastName, companyName에 "김"이 포함된 연락처의 모든 정보를 출력
	public void printFindName(String name) {
		System.out.println();
		System.out.println("입력받은 이름 : " + name);
		this.contactList.stream()
							.filter(c -> c.getName().contains(name) || 
								c.getFirstName().contains(name) || 
								c.getLastName().contains(name) || 
								c.getCompany().getCompayName().contains(name))
							.forEach(System.out::println);
		
	}
	
	
	// 5. contactList에서 이메일 검색 결과 출력하는 기능.
	// "@abc.com"을 파라미터로 전달하면 이메일에 "@abc.com"이 포함된 연락처의 모든 정보를 출력
	public void printFindemail(String email) {
		System.out.println();
		System.out.println("입력받은 이메일 : " + email);
		
		this.contactList.stream()
								.filter(c -> c.getEmail().contains(email))
								.forEach(System.out::println);
		
	}
	
	
	// 6. 연락처 정보 수정기능
	// 다양한 검색의 결과중 하나를 선택해 연락처 정보를 수정할 수 있는 기능
	// 이름을 변경, 전화번호 추가, 전화번호수정, 회사정보수정 ...
	public void updatecontactList(int index, Contact contact) {
		System.out.println();
		System.out.println("연락처 정보 수정");
		
		
		contactList.set(index, contact);
		
		printcontactList();
		
		//set 사용없이 만들어보기
		// 변경할 것의 카테고리를 지정 후 해당카테고리에 있는 데이터 검색
		
		//검색 결과 출력
		
		//해당 데이터를선택 후 어떤 카테고리를 변경할 것인지 지정
		
		//해당 데이터의 전체데이터를 보여주며 맞는지 입력받기

		//해당 데이터를 어떤 데이터로 변경 할 것인지 입력받기
		
		//해당 데이터를 변경 후 변경된 데이터 보여주기
		
	}
	
	
	// 7. 연락처 정보 삭제 기능
	// 다양한 검색의 결과중 하나를 선택해 contactList에서 제거하는기능
	public void removecontactListPredicate(Predicate<Contact> predicate) {
		System.out.println();
		this.contactList.removeIf(predicate);
		System.out.println("제거 완료");
		printcontactList();
		System.out.println();
		// 전체 리스트 출력 후 그중 어떤건지 입력받기 - 
		
		//검색 결과 출력
		
		//해당 데이터를선택 후 어떤 데이터를 삭제할 것인지 지정
		
		//해당 데이터의 전체데이터를 보여주며 맞는지 입력받기
		
		//해당 데이터를 삭제 후 전체 리스트 보여주기
		
	}
	
	// 7. 연락처 정보 삭제 기능
	// 다양한 검색의 결과중 하나를 선택해 contactList에서 제거하는기능
	public void removecontactList(int index) {
		System.out.println();
		this.contactList.remove(index);
		System.out.println(index +"번째 인덱스 제거 완료");
		printcontactList();
		// 전체 리스트 출력 후 그중 어떤건지 입력받기 - 
		
		//검색 결과 출력
		
		//해당 데이터를선택 후 어떤 데이터를 삭제할 것인지 지정
		
		//해당 데이터의 전체데이터를 보여주며 맞는지 입력받기
		
		//해당 데이터를 삭제 후 전체 리스트 보여주기
		
	}
	
	public void addData(String name, String email, String firstName, String lastName,String memo, String nickName, List<Phone> phone, Company company) {
		Contact contact = new Contact();
		contact.setName(name);
		contact.setEmail(email);
		contact.setFirstName(firstName);
		contact.setLsatName(lastName);
		contact.setMemo(memo);
		contact.setNickname(nickName);
		contact.setPhones(phone);
		contact.setCompany(company);
		this.contactList.add(contact);
	}
	
	
	public static void main(String[] args) {
		ContactManager contectList = new ContactManager();
		// 데이터 추가 테스트
		contectList.addData("김철수 대표", "kim@abc.com", "철수", "김", "대표님", "찰스", List.of(new Phone(Phone.Type.COMPANY, "010-1234-5678")), new Company("김철수회사", "대표", "가도 나시 다구"));
		contectList.addData("김가나다", "rkskek@rse.com", "가나다", "김", "대리", "가나", List.of(new Phone(Phone.Type.COMPANY, "010-2345-5678")), new Company("김철수회사", "대리", "가도 나시 다구"));
		contectList.addData("asdf", "asdf@abc.com", "sdf", "a", "사원", "as", List.of(new Phone(Phone.Type.COMPANY, "010-5678-9876"),(new Phone(Phone.Type.HOME, "010-4444-1234")),new Phone(Phone.Type.PERSONAL, "010-9999-9999")), new Company("asf", "사원", "가도 나시 김군"));
		Scanner scanner = new Scanner(System.in);
		String str = "";
		int num = -1;
		while(true) {
			contectList.printcontactList();
			
			System.out.println("찾는 이름 입력 : ");
			str = scanner.nextLine();
			contectList.printFindName(str);
			
			System.out.println("찾는 번호 입력 : ");
			str = scanner.nextLine();
			contectList.printFindPhoneNumberString(str);
			
			System.out.println("찾는 이메일 입력 : ");
			str = scanner.nextLine();
			contectList.printFindemail(str);
			
			contectList.addData("qwer", "qwer@asdf.com", "wer", "q", "이사", "wr", List.of(new Phone(Phone.Type.PERSONAL, "010-0000-0000")), new Company("eww", "이사", "가도 나시 김군"));		
			
			System.out.println("삭제할 번호의 숫자를입력하세요 범위 : 0 ~ " + contectList.contactList.size());
			str = scanner.nextLine();
			try {
				num = Integer.parseInt(str);
				contectList.removecontactList(num);
				
			}catch(Exception e) {
				System.out.println("숫자가 아닙니다.");
			}finally {
				System.out.println("삭제할 사람의 이름을 작성하세요");
				String strs = scanner.nextLine();
				contectList.removecontactListPredicate(data -> data.getName().contains(strs));
			}
		}
	}
}
