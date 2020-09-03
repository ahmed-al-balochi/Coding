#include<iostream>
#include<stack>
#include<deque>

using namespace std;

void dispStack(stack <int> st){
    //declare temp. statck
    stack <int> s = st;
    while(!s.empty()){
        cout<<s.top()<<" ";
        s.pop();
    }
    cout<<endl;
}

int main(){
    stack<int> s1;
    int in=0;
    cout<<"Enter Data into Stack: "<<endl;
    for(int i = 0; i < 5 ; i++){
        cin>>in;
        s1.push(in);
    }
    
    cout<<"Stack Data: "<<endl;
    dispStack(s1);

    s1.pop();
    cout<<"Top = "<<s1.top()<<endl;
    cout<<"Stack Data: "<<endl;
    dispStack(s1);
    
}

/*int a1[]={1,2,3,4,5,6,7,8,9,10};
    //1. default constructor
    stack <int> s1;
    //2. copy constructor;
    stack <int> s2(s1);
    //3. initialization using predefined container
    deque <int> d1(a1, a1+10);
    stack <int> s3(d1);
    
    //4. using nondefault storage
    stack<int, list <int> > s4;
    stack<int, vector <int> > s5;*/