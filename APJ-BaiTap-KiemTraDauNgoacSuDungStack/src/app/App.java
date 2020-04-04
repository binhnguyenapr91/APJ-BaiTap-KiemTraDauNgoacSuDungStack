package app;

import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Boolean status = true;
        String infixExpression = "((((A-B))+C))/D";
        String[] splited = infixExpression.split("");
        Stack<String> bStack = new Stack<>();
        String left;

        for(int i =0;i<splited.length;i++){
            if(splited[i].equals("(")){
                bStack.push(splited[i]);
                System.out.println(bStack.size());
            }
            if(splited[i].equals(")")){
                if(bStack.size()==0){
                    status = false;
                    break;
                }else{
                    left = bStack.pop();
                }
            }
        }
        System.out.println("Expression:"+infixExpression+" is "+status);
    }
}