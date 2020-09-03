#include<iostream>
#include<queue>

using namespace std;
void dispQueue(queue <int> st){
    //declare temp. statck
    queue <int> s = st;
    while(!s.empty()){
        cout<<s.front()<<" ";
        s.pop();
    }
    cout<<endl;
}

int main(){
    queue<int> q1;
    int in=0;
    cout<<"Enqueue"<<endl;
    for(int i = 0; i<5 ; i++){
        cin>>in;
        q1.push(in);
    }
    cout<<"Queue Data"<<endl;
    dispQueue(q1);
    q1.pop();
     cout<<"Queue Data"<<endl;
    dispQueue(q1);
    
}





















/*
int a1[]={1,2,3,4,5,6,7,8,9,10};
    //1. default constructor
    queue <int> s1;
    //2. copy constructor;
    queue <int> s2(s1);
    //3. initiilization using predefined container
    deque <int> d1(a1, a1+10);
    queue <int> s3(d1);
    
    //4. using non-default storage
    queue<int, list <int> > s4;
    queue<int, vector <int> > s5;*/