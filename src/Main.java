import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<ExampleDTO> dtos = Arrays.asList(
                new ExampleDTO(12, "test1", "TestData input 01", "T0200KS9", 'Y'),
                new ExampleDTO(2031, "test2", "TestData input 02", "T1283SU8", 'N'),
                new ExampleDTO(12093, "test112", "TestData input 03", "Txla123X2", 'Y')
        );

        //forEach 사용
        dtos.stream().forEach(x->{
            System.out.println("이름 : " + x.getName() + ", 데이터 : " + x.getData());
        });

        //map으로 이름만 출력
        dtos.stream().map(x-> x.getName()).forEach(System.out::println);

        //filter로 isUse 값이 Y인 항목만 출력
        dtos.stream().filter(x->x.getIsUse() == 'Y')
                .forEach(result -> System.out.println("filter 결과 : " + result.getName() + ", isUse : " + result.getIsUse()));

        //collect사용 List 형태로 반환
        List<Integer> getList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8).collect(Collectors.toList());
        System.out.println("getList result : " + getList);

        //map 형태로 반환
        Map<String, Integer> getMap = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(Collectors.toMap(key -> "key_" + key, value -> value));
        System.out.println("Map 출력 : " + getMap);

        //reduce 사용
        Optional<Integer> getReduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .reduce(Integer::sum);
        System.out.println("sum reduce : " + getReduce);

        //다른 방법
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce(
                0, (x, z) -> x + z);
        System.out.println("other reduce result : " + sum);

        //MAP <-> DTO Reflection 사용
        
    }
}