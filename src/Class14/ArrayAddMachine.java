package Class14;

public class ArrayAddMachine {

static void addArrayElementsMachine(int [] arr){
    int sum=0;
    for (int number:arr){

        sum+=number;

}
    System.out.println(sum);
}
public static void main(String[] args){
    int [] array2={10,10,10,20,30};
    addArrayElementsMachine(array2);
    int [] array3={10,10,15,20,30};
    addArrayElementsMachine(array3);
}
}