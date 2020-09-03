#include <iostream>
#include <deque>

using namespace std;

int main(){
    deque <int> d1 (10,0);

    for(int i=0 ; i<d1.size() ; i++){
        d1[i] = i+1;
    }

    for(int i=0 ; i<d1.size() ; i++){
        cout<<d1[i]<<" ";
    }
    cout<<endl<<getpt();
}