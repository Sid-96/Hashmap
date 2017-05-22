package com.company;
import com.company.Hashmap;

/**
 * Created by mohibmanva on 22/05/17.
 */

public class Tester {

    public static void main(String[] args){
        Hashmap<Long,String> hashmap = new Hashmap<>();
        hashmap.put(2L,"Mohib");
        hashmap.put(3L,"Deepit");
        System.out.println(hashmap.get(3L));
    }

}