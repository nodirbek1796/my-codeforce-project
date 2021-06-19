package test;

public interface Test {
    default boolean test(String inputText){
        return inputText.startsWith("c");
    }

    String test1();
}