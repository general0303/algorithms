package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(542);
		arrayList.add(18);
		arrayList.add(84);
		arrayList.add(3);
		arrayList.add(617);
		arrayList.add(908);
		arrayList.add(100);
		Integer a=arrayList.get(0);
		Queue[] queues = new Queue[10];
			for (int i=0; i<10; i++){
				queues[i] = new Queue();
			}
		for (Integer integer : arrayList) {
			if (integer > a) a = integer;
		}
		int d=0;
		while (a>0){
			d++;
			a/=10;
		}
		int m;
		for (int k=0; k<d; k++){
			for (Integer integer : arrayList){
				m=integer;
				for (int j=0; j<k; j++){
					m/=10;
				}
				m%=10;
				queues[m].add(integer);
			}
			arrayList=new ArrayList<>();
			for (int i=0; i<10; i++){
				int t= queues[i].getSize();
				for (int h=0; h<t; h++){
					arrayList.add(queues[i].get());
				}
				queues[i].makeNull();
			}
		}
		for (Integer integer : arrayList){
			System.out.print(integer + " ");
		}
    }
}
