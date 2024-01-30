class Problem {

    private int oprate(int a,int b,String str){
        if(str.equals("+")){
            return a + b;
        }

        if(str.equals("-")){
            return a - b;
        }

        if(str.equals("*")){
            return a * b;
        }
        return a / b;
    }
    public int evalRPN(String[] tokens) {
       Stack<Integer> s1 = new Stack<>();

       for(String str : tokens){
           if(str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*")){
               int b = s1.pop();
               int a = s1.pop();

               int res = oprate(a,b,str);

               s1.push(res);
           }else{
               int data = Integer.parseInt(str);
               s1.push(data);
           }
       } 
       return s1.peek();
    }
}