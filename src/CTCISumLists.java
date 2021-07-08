import java.util.*;

public class CTCISumLists {
    public static void main(String[] args) {
        ListNode firstNumber = new ListNode(6,new ListNode(1,new ListNode(7)));
        ListNode secondNumber = new ListNode(2,new ListNode(9,new ListNode(5)));
        ListNode totalListNode = returnSum(firstNumber,secondNumber);
    }

    public static ListNode returnSum(ListNode numOne, ListNode numTwo) {
        String numOneString = "";
        String numTwoString = "";
        ListNode runner = numOne;
        while (runner != null) {
            numOneString += runner.val;
            runner = runner.next;
        }
        runner = numTwo;
        while (runner != null) {
            numTwoString += runner.val;
            runner = runner.next;
        }
        String totalNumber = String.valueOf(Integer.parseInt(numTwoString) + Integer.parseInt(numOneString));
        char[] charArray = totalNumber.toCharArray();
        ListNode totalNumberList = new ListNode();
        ListNode rememberTotal = totalNumberList;
        for (int x = 0; x < totalNumber.length(); x++) {
            totalNumberList.val = Character.getNumericValue(charArray[x]);
            if (x != totalNumber.length() - 1) {
                totalNumberList.next = new ListNode();
                totalNumberList = totalNumberList.next;
            }
        }
        return rememberTotal;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
