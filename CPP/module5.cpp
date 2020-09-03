#include<iostream>
#include <algorithm>
#include <list>
#include <deque>
#include <vector>
#include <iterator>
#include <ctype.h>
#include <string>

using namespace std;

template<class T>
void print(const T & value)
{
    cout<<value<<" ";
}

template <class T> void Print(T start, T end) {
    for (; start != end; ++start) {
        std::cout << *start << " ";
    }
}


bool compare(int a, int b)
{
    return b < a;
}

void printMessage(bool value, int element)
{
    if (value)
    {
        cout<<"Element "<<element<<" has been found!\n";
    }
    else
    {
        cout<<"Element "<<element<<" could not be found!\n";
    }
}

int main(){

  int n[]={18, 2, 32, 1, 589, 6, 72, 888, 98, 170};

  vector<int> v1(n, n+10);
  sort(v1.begin(), v1.end());                        //    sort, stable_sort only for vector,  deque,  array you can also use them with classes and objects
  cout<<"v1: "; for_each(v1.begin(), v1.end(), print<int>); cout<<endl;

  deque<int>d1(n,n+10);
  stable_sort(d1.begin(), d1.end());
  cout<<"d1: "; for_each(d1.begin(), d1.end(), print<int>); cout<<endl;
  deque<int>::iterator it1 = lower_bound(d1.begin(), d1.end(), 6); // lower bound and upper bound are like having a itetator start from one point to another
  deque<int>::iterator it2 = upper_bound(d1.begin(), d1.end(), 72);
  Print(it1, it2); cout<<" upper and lower bound ftn"<<endl;

  pair<deque<int>::iterator, deque<int>::iterator>p = equal_range(d1.begin(), d1.end(),98);
  Print(p.first, p.second); cout<<" found an element that equals to 98 in d1"<<endl;

 printMessage(binary_search(d1.begin(), d1.end(), 1), 18);




 return 0;
 }
