package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점에 T의 타입 결정
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>(); // 생성 시점에 T의 타입 결정
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.2);
        Double d = doubleBox.get();
        System.out.println("doubleBox = " + d);

        // 타입 추론: 생성하는 재네릭의 타입 추론
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
