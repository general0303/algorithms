package com.company;

import java.util.ArrayList;

public class Queue {
   private ArrayList<Integer> arrayList=new ArrayList<>();
   public void add(Integer a){
       arrayList.add(a);
   }
   public Integer get(){
       int a= arrayList.get(0);
       arrayList.remove(0);
       return a;
   }
   public void makeNull(){
       arrayList = new ArrayList<>();
   }
   public int getSize(){
       return arrayList.size();
   }

   public boolean isNull(){
       return arrayList.size() == 0;
   }
}
