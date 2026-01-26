package com.ktdsuniversit.edu.relay;

import java.util.Scanner;

public class RelayGame2 {
	
	private Scanner keboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame2() {
		this.keboard = new Scanner(System.in);
	}
	public void startGame() {
		System.out.println("게임이 시작되었습니다");
		System.out.println("시작 단어를 입력해주세요");
		this.startWord = this.keboard.nextLine();
		
		String lastLetter = "";
		
		while(true) {
			System.out.println("다음 단어를 입력해주세요");
			this.nextWord = this.keboard.nextLine();
			this.nextWord = this.nextWord.trim();
			
			//시작단어의 마지막 글자 추출
			lastLetter = this.startWord.charAt(this.startWord.length()-1) + "";
			
			if(this.nextWord.startsWith(lastLetter)) {
				if(this.nextWord.length() >= 3) {
					this.startWord =this.nextWord;
				}else {
					System.out.println("게임이 종료되었습니다.");
					break;
				}
			}else {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		RelayGame game = new RelayGame();
		game.startGame();
	}

}
