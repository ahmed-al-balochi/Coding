#include<iostream>
#include<deque>
#include<list>
#include<vector>

using namespace std;
int main(){

    vector <int> v1(10,0);
    deque <int> d1(10,0);
    list <int> l1(10,0);

    int i = 1;
    // vector itration
    vector<int>::iterator itV;      // think of it like the dummy variables ypu use in loops like i
    for(itV = v1.begin() ; itV != v1.end() ; itV++, ++i){
        *itV = i;
    }
    for(itV = v1.begin() ; itV != v1.end() ; itV ++, ++i){
        cout<<*itV<<" ";
    }
    cout<<endl;

    //deque
    deque<int>::iterator itQ = d1.begin();
    for(itQ = d1.begin() ; itQ != d1.end() ; ++itQ, ++i){
        *itQ = i;
    }
    for(deque<int>::reverse_iterator itD = d1.rbegin(); itD != d1.rend() ; ++itD){
        cout<<*itD<<" ";        //output reversed
    }
    cout<<endl;

    //list
    list<int>::iterator itL = l1.begin();
    for( list<int>::const_iterator it = l1.begin() ; it != l1.end() ; ++it, ++i){       // this iterator is read only 
        *itL = i;
    }
    for(list<int>::const_iterator it = l1.begin() ; it != l1.end() ; ++it){
        cout<<*it<<" ";
    }
    cout<<endl;
}