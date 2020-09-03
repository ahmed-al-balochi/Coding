// maps & multimaps

#include <iostream>
#include <map>
#include <iomanip>
#include <functional>
#include <string>
using namespace std;


template<class T> void print(T start, T end) {
        while (start != end) {
                std::cout<< start->first<<":"<<start->second<<" "; start++;
        }
    }

template<class T, class U> void fillMap(map<T, T> & m, U start, U end)
{
    for( ; start!= end; ++start)
    {
        m.insert(pair<T,T>(*start, *start));
    }
}

template<class T, class U> void fillMapu(multimap<T, T> & m, U start, U end)
{
    for( ; start!= end; ++start)
    {
        m.insert(pair<T,T>(*start, *start));
    }
}



int main(){

  // Operator [] – map class only!
  int t[]={1, 10, 8, 4, 6, 5, 3, 9, 7, 2};
  map<int,int>m1;
  fillMap(m1, t,t+10);
  print(m1.begin(), m1.end());cout<<" m1: "<<endl;
  //2b. iterator constructor - wrong
  //map<int, int> m2(t, t+10);
  map<int,int>m2;
  m2 = m1;
  cout<<" m2: "<<endl;print(m2.begin(), m2.end());

  map<int,int>m3;
  cout<<" size of m3: "<<m3.size()<<endl;
  cout<<" checks if m3 is empty: "<<m3.empty()<<endl;// 1 = empty
  cout<<" checks the max_size of m2: "<<m2.max_size()<<endl;// The maximum number of elements which can be held inside the map.
  m3[1] = 98;
  cout<<" m3: ";print(m3.begin(), m3.end());cout<<endl;
  m3.insert(pair <int,int>(2,38));
  m3.insert(pair <int,int>(3,178));
  cout<<" m3: ";print(m3.begin(), m3.end());cout<<endl;





  multimap<int, int > mu1;
  fillMapu(mu1, t,t+8);
  //2. iterator constructor
  multimap<int, int> mu2(m1.rbegin(), m1.rend());
  //2b. iterator constructor - wrong
  //multimap<int, int> m2(t, t+10);
  print(mu1.begin(), mu1.end());cout<<" mu1: "<<endl;
  print(mu2.begin(), mu2.end());cout<<" mu2: "<<endl;
  cout<<" size of mu2: "<<mu2.size()<<endl;
  cout<<" checks if mu2 is empty: "<<mu2.empty()<<endl;// 1 = empty
  cout<<" checks the max_size of mu2: "<<mu2.max_size()<<endl;// The maximum number of elements which can be held inside the map.
  mu2.insert(pair <int,int> (11,69));
  print(mu2.begin(), mu2.end());cout<<" mu2: "<<endl;
  multimap<int,int>mu3(mu2);
  multimap<int,int>::iterator itu1 = mu1.find(3);
  mu1.erase(itu1);
  print(mu1.begin(), mu1.end());cout<<" erased 3 element in mu1: "<<endl;
  mu2.swap(mu1);
  print(mu2.begin(), mu2.end());cout<<" swapped mu1 with mu2: "<<endl;
  mu1.insert(pair <int,int>(11,69));
  print(mu1.begin(), mu1.end());cout<<" mu1: "<<endl;
  cout<<" how many 11's in mu1: ";cout<<mu1.count(11)<<endl;
  multimap<int, int>::iterator it1 = mu1.lower_bound(4);
  multimap<int, int>::iterator it2 = mu1.upper_bound(6);
  print(it1,it2); cout<<endl<<endl;
  cout<<"Finding single value range using equal_bounds\n";
  pair<multimap<int, int>::iterator, multimap<int, int>::iterator> p = mu1.equal_range(4);
  print(p.first, p.second); cout<<endl;


  return 0;
}
