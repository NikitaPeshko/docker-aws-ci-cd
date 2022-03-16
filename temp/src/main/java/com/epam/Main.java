package com.epam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws FactorialException {
//        List<String> collection1 = Arrays.asList("a1", "a2", "a3", "a1");
//
//        List<String> collection2 = Arrays.asList("1,2,0", "4,5");
//
//
//        collection1.stream().mapToInt(s-> Integer.parseInt(s.substring(1))).forEach(System.out::println);
//        collection2.stream().flatMap(s -> Arrays.asList(s.split(",")).stream()).forEach(System.out::print);
//        int sum = collection2.stream().flatMap(s -> Arrays.asList(s.split(",")).stream()).mapToInt(number->Integer.parseInt(number)+1).sum();
//        System.out.println("Summa:"+sum);
//
//        collection1.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);

//        Person person=new Person("Mikita",20,"vbxcnvbxncvbxcnbv");
//        ((Person)person).accaunt.displayAccauntInfo();
//        Person.Accaunt accaunt=person.new Accaunt("dvbsvbxn");;
        int num=-1;
        if(num<1) throw new FactorialException("The number is less than 1", num);
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");
        System.out.println("dvbxncbvxncbv");








    }
}

class FactorialException extends Exception{

    private int number;
    public int getNumber(){return number;}
    public FactorialException(String message, int num){

        super(message);
        number=num;
    }
}


class Person{
    private String name;
    private int age;

    Accaunt accaunt;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.accaunt = new Accaunt(password);
    }
    void displayInfo(){
        System.out.println(this.name+this.accaunt.password);
    }



    public class Accaunt{
        private String password;

        public Accaunt(String password) {
            this.password = password;
        }

        void displayAccauntInfo(){
            System.out.println(Person.this.name+'+'+this.password);
        }
    }


}