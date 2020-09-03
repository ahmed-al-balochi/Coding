#include <iostream>
#include <algorithm>
#include <vector>
#include <deque>
#include <functional>

using namespace std;

template <class T> void print(T start, T end) {
        for ( ;start != end; ++start) {
                std::cout << *start << " ";
        }
    }

int compare(int a, int b)
{
    return b < a;
}

void printMessage(bool value)
{
    if (value)
    {
        cout<<"Collection d1 contains all elements from collection d2!\n";
    }
    else
    {
        cout<<"Collection d1 does not contain all elements from collection d2!\n";
    }
}

int main(){

  int t1[]={1, 10, 3, 4, 6, 8, 9, 2};
  int t2[]={8, 4, 5, 6, 9, 7};

  deque<int>d1(t1,t1+8);
  deque<int>d2(t2,t2+6);
  deque<int>d3(d1.size() + d2.size());
 
  print(d1.begin(), d1.end());cout<<" d1:"<<endl;
  print(d2.begin(), d2.end());cout<<" d2:"<<endl;

  merge(d1.begin(),d1.end(), d2.begin(), d2.end(), d3.begin());
  print(d3.begin(), d3.end());cout<<" after merging d1 & d2 into d3"<<endl;

  sort(d1.begin(), d1.end());  sort(d2.begin(), d2.end());
  merge(d1.begin(),d1.end(), d2.begin(), d2.end(), d3.begin());
  print(d3.begin(), d3.end());cout<<" after sorting and merging d1 & d2 into d3"<<endl;

  inplace_merge(d3.begin(), d3.begin()+d1.size(), d3.end());
  cout<<" using inplace_merge the d3: ";     print(d3.begin(), d3.end());cout<<endl<<endl;

  printMessage( includes(d1.begin(), d1.end(), d2.begin(), d2.end())); cout<<endl;  // checks if every element is available in both d1, d2

  print(d1.begin(), d1.end());cout<<" d1:"<<endl;
  print(d2.begin(), d2.end());cout<<" d2:"<<endl<<endl;

  deque<int>::iterator resultEnd = set_intersection(d1.begin(), d1.end(), d2.begin(), d2.end(), d3.begin());
  cout<<" set_intersection d3: ";     print(d3.begin(), resultEnd);cout<<endl<<endl;

  resultEnd = set_union(d1.begin(), d1.end(), d2.begin(), d2.end(), d3.begin());
  cout<<"union: "; print(d3.begin(), resultEnd);cout<<endl;

  resultEnd = set_difference(d1.begin(), d1.end(), d2.begin(), d2.end(), d3.begin());
  cout<<"difference: "; print(d3.begin(), resultEnd);cout<<endl;
  resultEnd = set_symmetric_difference(d1.begin(), d1.end(), d2.begin(), d2.end(), d3.begin());
  cout<<"symmetric difference: "; print(d3.begin(), resultEnd);cout<<endl<<endl;

  cout<<"min: "<< min(4,3)<<endl;
  cout<<"max: "<< max(4,3)<<endl<<endl;

  cout<<" d1 min: "<<*(min_element(d1.begin(), d1.end()))<<endl;
  cout<<" d1 max: "<<*(max_element(d1.begin(), d1.end()))<<endl;





  return 0;
}
