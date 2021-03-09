#include <iostream>
#include<stack>
#include<climits>
using namespace std;
int main(){
    int x;
    cout<<"Enter Intergers";
    cin>>x;
   long long num = 0;
        int a = 0;
        while(x){
            a = x %10;
	    cout<<endl<<"a = "<<a<<endl;
            num = a + num *10;
	    cout<<endl<<"num = "<<num<<endl;
            x = x /10;
	    cout<<endl<<"x = "<<x<<endl;
        }
        return (num>INT_MAX || num<INT_MIN)?0:num;
    } 
