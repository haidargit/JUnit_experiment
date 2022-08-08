import org.junit.Test;

public class DividedBy {
    static void printNumbers(int limit, int firstCondition, int secondCondition){
        int total = 0;
        int tempVal;
        for(int i = 1; i <= limit; i++){
            if(i % firstCondition == 0 && i % secondCondition == 0){
                tempVal = Integer.parseInt(Integer.toString(firstCondition+secondCondition)+Integer.toString(firstCondition+secondCondition));
                total += tempVal;
                System.out.print(tempVal);
            }else if(i % firstCondition == 0){
                tempVal = Integer.parseInt(Integer.toString(firstCondition)+Integer.toString(firstCondition)); 
                total += tempVal;
                System.out.print(tempVal);
            }else if(i % secondCondition == 0){
                tempVal = Integer.parseInt(Integer.toString(secondCondition)+Integer.toString(secondCondition));
                total += tempVal;
                System.out.print(tempVal);
            }else{
                total +=i;
                System.out.print(i);
            }

            if(i < limit){
                System.out.print(" + ");
            }else{
                System.out.print(" = "+ total+"\n");
            }
        }
    }
    public static void main(String args[]) {
        printNumbers(15, 3, 5);
    }

    @Test
    public void testPrintNumers(){

    }
}