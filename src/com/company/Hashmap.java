package com.company;

import java.util.ArrayList;

public class Hashmap<K,V> {

    ArrayList<HashmapEntry>[] entryList;
    static final int DEFAULT_SIZE = 10;

    Hashmap(int size) throws IllegalArgumentException{
        if(size==0) throw new IllegalArgumentException();
        entryList = new ArrayList[size];
        for(int i=0 ; i<size ; i++) entryList[i] = new ArrayList<HashmapEntry>();
    }

    Hashmap(){
        entryList = new ArrayList[DEFAULT_SIZE];
        for(int i=0 ; i<DEFAULT_SIZE ; i++) entryList[i] = new ArrayList<HashmapEntry>();
    }

    public void put(K key, V value) throws IllegalArgumentException{
        if(key==null)   throw new IllegalArgumentException();
        int index = Math.abs(key.hashCode())%entryList.length;
        for(HashmapEntry entry : entryList[index]){
            if(entry.key.equals(key)){
                entry.value = value;
                return;
            }
        }
        entryList[index].add(new HashmapEntry(key,value));
        return;
    }
    

    public static void main(String[] args) {

	// write your code here


    }

    class HashmapEntry{

        K key;
        V value;

        HashmapEntry(K key , V value){
            this.key = key;
            this.value = value;
        }
    }

}


