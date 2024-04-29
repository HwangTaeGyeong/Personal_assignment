import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //배열과 카운트 선언
        int index = 10;
        int[] resultArray = new int[index];
        int count = 0;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요:");
            char symbol = sc.next().charAt(0);

            int result = 0;
            switch (symbol) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = firstNumber / secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
            }
            System.out.println("result = " + result);

            //배열의 인덱스가 초과할 때 첫번째 데이터 삭제 후 데이터 앞으로 이동
            if (count >= index) {
                for (int i = 0; i < resultArray.length - 1; i++) {
                    resultArray[i] = resultArray[i + 1];
                }
                resultArray[resultArray.length - 1] = result;
            } else {
                resultArray[count] = result;
                count++;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }
        }
        //배열에 값을 출력
        for (int i : resultArray) {
            System.out.print(i + " ");
        }


    }
}