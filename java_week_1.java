#Plus Minus
class Result {
    public static void plusMinus(List<Integer> arr) {
        float negative=0;
        float positive=0;
        float zero=0;
        int n=arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i)<0)
                negative+=1;
            if(arr.get(i)>0)
                positive+=1;
            if(arr.get(i)==0)
                zero+=1;
        }float a=(positive/n);
        float b=(negative/n);
        float c=(zero/n);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}



#Mini-Max Sum
class Result {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long sum=0;
        int n=arr.size();
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        System.out.println((sum-arr.get(n-1))+" "+(sum-arr.get(0)));
    }
}



#Time Conversion
class Result {
    public static String timeConversion(String s) {
        int n=s.length();
        if(s.substring(0,2).equals("12") && s.substring(n-2).equals("PM")){
            return s.substring(0,n-2);
        }
        if(s.substring(0,2).equals("12") && s.substring(n-2).equals("AM")){
            return "00"+s.substring(2,n-2); 
        }
        if(s.substring(n-2).equals("PM")){
            int a=Integer.parseInt(s.substring(0,2));
            return a+12+s.substring(2,n-2);
        }
        return s.substring(0,n-2);
        }
}



#Sparse Arrays
class Result {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        int n=strings.size();
        int m=queries.size();
        String a="";
        int count=0;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            a=queries.get(i);
            for(int j=0;j<n;j++){
                if(a.equals(strings.get(j)))
                    count+=1;

            }list.add(count);
            count=0;
        }return list;
    }
}



#LonelyInteger
class Result {
    public static int lonelyinteger(List<Integer> a) {
        int n=a.size();
        int count=0;
        while(n>1){
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(a.get(i).equals(a.get(j)))
                    count++;

            }
            if(count==1)
            return a.get(i);
        }

}
return a.get(0);
    }

}



#Flippingbits
class Result {
    public static long flippingBits(long n) {
    long a=2;
    for(int i=1;i<32;i++){
        a=a*2;
    }
    return (a-1)-n;
    }
}



#Diagonal Difference
class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
       int sum1=0;
        int sum2=0;
        int i=0,j=0;
        int n=arr.size();
        while(i<n){
            while(j<n){
                sum1=sum1+arr.get(i).get(j);
                j++;
                i++;
            }
        }
        int k=0,l=n-1;
        while(k<n){
            while(l>=0){
                sum2=sum2+arr.get(k).get(l);
                k++;
                l--;
            }
        }
        return Math.abs(sum1-sum2);
    }
}



#Counting Sort 1
class Result {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> count=new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            count.add(0);
        }
        for(int i:arr){
            count.set(i,count.get(i)+1);
        }
        return count;

    }
}


#Panagrams
class Result {
    public static String pangrams(String s) {
           s= s.toUpperCase();
        boolean val= true;
        for(char ch='A';ch<='Z';ch++){
            if(!s.contains(String.valueOf(ch))){
                val=false;
                break;
            }
        }
        if(val==true)
                return "pangram";
        return "not pangram";
    }
}




#Permuting Two Arrays
class Result {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
            Collections.sort(A);
            Collections.sort(B);
            int n=B.size();
            for(int i = 0; i < A.size(); i++) {
                if(A.get(i) + B.get(n-1-i) < k) {
                    return "NO";
                }
            }
            return "YES";
    }
}
