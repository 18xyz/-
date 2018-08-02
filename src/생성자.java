
/*
������(Construnctor) Ư¡
�������� �̸��� Ŭ������ �̸��� ���ƾ� �Ѵٴ� ���
�����ڴ� ���ϰ� X
�����ڴ� �����ε��� ������ �ϳ��� Ŭ������ ���� ���� �����ڰ� ������ �� ����
�����ε�(Overloading): ���� �̸��� �޼ҵ带 ���� �� �����鼭 �Ű������� ������ ������ �ٸ����� �ϴ� ���
�����ڵ� �޼ҵ��̹Ƿ� ���ϰ��� ���ٸ� void�� ����� ������, ��� �����ڰ� ���ϰ��� �����Ƿ� void ����

�۾� ���� �� å�� ġ��� �� � ���� �����ϱ� ���� �غ� �ϰ� �Ǵ� ������ �ʱ�ȭ��� ��
�̷� �ʱ�ȭ�� �ش��ϴ� ����� �����ڰ� ����
*/		

class Calculator {
	int left, right;

	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class ������ {

	public static void main(String[] args) {

		Calculator c1 = new Calculator(10, 20);
		c1.sum();
		c1.avg();

		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();
	}

}