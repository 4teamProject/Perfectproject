/*
 * ����
 * 	- �̸� : ��ī�ݶ�, ĥ�����̴�, ���������, ����������, �ϴú���
 * 	- ���� : 800, 800, 700, 700, 1000
 * 
 * ���Ǳ�
 * 	- �������� : 5����
 * 	- �����ݾ� : 
 * 	- ȭ������ : 1000����, 500����, 100����, 50����, 10����
 * 
 * ���
 * 	- �̸� : ?
 * 	- ���� �� : ?
 * 
 * ��
 * 	- ȭ��Ÿ�� : ȭ��, ��ȭ
 * 	- ���� �� : 
 * 
 */
public class VendingMachine {
	int[] beverage=new int[5];
	int[] money=new int[5];
	int[] readymoney=new int[5];
	// ���� ����
	void getDrinks(){
		for(int i=0;i<beverage.length;i++){
			beverage[i]=(int)(Math.random()*10)+1;
		}
	}
	// �� ȭ��� ����
	void RandomMoney(){
		for(int i=0;i<money.length;i++){
			money[i]=(int)(Math.random()*10)+1;
		}
	}
	// �� �ι��� ������
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
