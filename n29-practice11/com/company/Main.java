package com.company;


public class Main {
    private static Speciality[][] hashtable;

    public static int makeHash(int id){
        return id%13+id%11;
    }

    public static void add(Speciality speciality){
        int i=0;
        while (hashtable[makeHash(speciality.id)][i]!=null)
            i++;
        hashtable[makeHash(speciality.id)][i] = speciality;
    }

    public static void delete(Speciality speciality){
        int i=0;
        while (hashtable[makeHash(speciality.id)][i]!=speciality)
            i++;
        while (hashtable[makeHash(speciality.id)][i]!=null){
            hashtable[makeHash(speciality.id)][i]=hashtable[makeHash(speciality.id)][i+1];
            i++;
        }
    }
    public static void print(){
        for (int i=0; i<23; i++){
            int j=0;
            while (hashtable[i][j]!=null) {
                System.out.print(hashtable[i][j].name + " ");
                j++;
            }
            if (hashtable[i][0]!=null)
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        hashtable = new Speciality[23][10];
        for (int i=0; i<23; i++){
            for (int j=0; j<10; j++){
                hashtable[i][j]=null;
            }
        }
        Speciality speciality = new Speciality("MIREA", 15);
        add(speciality);
        speciality =new Speciality("MGTU", 15);
        add(speciality);
        speciality =new Speciality("MGU", 28);
        add(speciality);
        speciality =new Speciality("MIREA", 36);
        add(speciality);
        delete(speciality);
        print();
    }
}
