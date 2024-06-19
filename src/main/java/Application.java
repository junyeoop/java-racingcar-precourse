import racingcar.Car;
import racingcar.Racing;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // main

        Scanner scanner = new Scanner(System.in);

        List<Car> cars;
        int iterNum;

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carInput = scanner.nextLine();
        cars = stringToCar(carInput);
        System.out.println("시도할 회수는 몇회인가요?");
        String iterInput = scanner.nextLine();
        try {
            iterNum = Integer.parseInt(iterInput);
        }
        catch (NumberFormatException ex) {
            throw new IllegalArgumentException();
        }

        Racing racing = new Racing(cars, iterNum, 4);
        racing.run();
    }

    private static List<Car> stringToCar(String carInput) {
        List<Car> cars = new ArrayList<>();
        String[] nameArray = carInput.split(",");
        for (String name : nameArray) {
            if (name.length() > 5)
                throw new IllegalArgumentException();
            else {
                Car car = new Car(name);
                cars.add(car);
            }
        }
        return cars;
    }
}

//https://velog.io/@byeonggwan/%EC%9A%B0%ED%85%8C%EC%BD%94%ED%94%84%EB%A6%AC%EC%BD%94%EC%8A%A4-%EC%9E%90%EB%8F%99%EC%B0%A8-%EA%B2%BD%EC%A3%BC