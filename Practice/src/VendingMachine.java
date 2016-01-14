/*
 * 음료
 * 	- 이름 : 코카콜라, 칠성사이다, 사과스퀴즈, 포도스퀴즈, 하늘보리
 * 	- 가격 : 800, 800, 700, 700, 1000
 * 
 * 자판기
 * 	- 음료종류 : 5종류
 * 	- 보유금액 : 
 * 	- 화폐종류 : 1000원권, 500원권, 100원권, 50원권, 10원권
 * 
 * 사람
 * 	- 이름 : ?
 * 	- 가진 돈 : ?
 * 
 * 돈
 * 	- 화폐타입 : 화폐, 주화
 * 	- 가진 돈 : 
 * 
 */
public class VendingMachine {
	int[] beverage=new int[5];
	int[] money=new int[5];
	int[] readymoney=new int[5];
	// 음료 개수
	void getDrinks(){
		for(int i=0;i<beverage.length;i++){
			beverage[i]=(int)(Math.random()*10)+1;
		}
	}
	// 각 화폐당 개수
	void RandomMoney(){
		for(int i=0;i<money.length;i++){
			money[i]=(int)(Math.random()*10)+1;
		}
	}
	// 각 인물당 소지금
	void getMoney(){
		for(int i=0;i<readymoney.length;i++){
			readymoney[i]=
					1000*money[0]+500*money[1]+
					100*money[2]+50*money[3]+10*money[4];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
