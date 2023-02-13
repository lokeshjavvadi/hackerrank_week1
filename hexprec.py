#Superior Array Element
l=[int(i) for i in input().split()]
n=len(l)
count=0
for i in range(n):
    for j in range(i+1,n):
        if l[i]<=l[j]:
            break
        if j==n-1:
            count=count+1
       
print(count+1)



#Maximum Sum_
a=int(input())
b=int(input())
x=[int(p) for p in input().split()]
maxrow=0
i=0
while(i<len(x)):
    sum=0
    for j in range(i,i+b):
        sum+=x[j]
        if(sum>maxrow):
            maxrow=sum
    i+=b;
maxcol=0
i=0
while(i<len(x)):
    sum=0
    for j in range(i,len(x),b):
        sum+=x[j]
        if(sum>maxcol):
            maxcol=sum
    i+=1;
print(maxcol+maxrow)



#Maximum Subarray
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
   Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int sum=0;
        int arr[]=new int[b];
        for(int i=0;i<b;i++){
            arr[i]=a.nextInt();
        }
        for(int k:arr){
            sum=sum+k;
        }
        System.out.println(sum);
    }
}



#persist no position change
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
   Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        String str1="";
        int count=0;
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        for(int k=0;k<n;k++){
            if(str.charAt(k)==str1.charAt(k)){
                count++;
            }
        }System.out.println(count);
    }    
}



#Making Anagrams
def makingAnagrams(s1, s2):
    a=Counter(s1)
    b=Counter(s2)
    c=a-b
    d=b-a
    e=c+d
    return len(list(e.elements()))
