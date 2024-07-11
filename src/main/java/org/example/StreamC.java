package org.example;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamC {
    public static void main(String[] args) {
        //example 1
  /*      Stream.iterate(0l,aLong -> aLong < 500 , aLong -> aLong+15)
                .filter(aLong -> aLong %2 != 0)
                .map(aLong -> aLong/2)
                .forEach(aLong -> System.out.println(aLong));*/
        //example 2
      /*  Stream.iterate(BigInteger.ONE,bigInteger -> bigInteger.multiply(BigInteger.TWO))
                .skip(132)
                .limit(300)
                .forEach(bigInteger -> System.out.println(bigInteger));*/

        //example 3
     //   Stream.generate( Math::random).limit(45).skip(5).forEach(s -> System.out.println(s));

    //    FileStream.readFile("src/main/java/org/example/milad.txt");
 //       FileStream.readFile("src/main/java/org/example/StreamA.java");
    //    FileStream.readFile("pom.xml");
     //   FileStream.readFileTree();
        streamChars();
    }

    //example 5
    public static void streamChars(){
        String str = "milad , rostami , java, spring framework, sql , docker";
        str.chars()
                .map(operand -> ((char)operand) == ',' ? '-' :  (char)operand)
                .forEach(value -> System.out.println((char) value));
        Pattern.compile(",")
                .splitAsStream(str)
                .forEach(System.out::println);
    }


    //example 4

    public static class FileStream{
        public static void readFile(String pathFile){
            Path path = Paths.get(pathFile);
            if (!Files.exists(path)){
                System.out.println("File not exist!!");
                return;
            }
            try (Stream<String> stream = Files.lines(path)){
                stream.forEach(System.out::println);
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

        public static void readFileTree(){
            Path directory = Paths.get("");
            System.out.println(directory.toAbsolutePath());
            try(Stream<Path> pathStream = Files.walk(directory)){
                pathStream.forEach(System.out::println);
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

    }


}
