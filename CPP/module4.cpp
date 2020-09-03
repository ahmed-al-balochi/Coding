#include <iostream>
#include <algorithm>
#include <vector>
#include <deque>
#include <list>

using namespace std;

template<class T>
void print(const T & value)
{
    cout<<value<<" ";
}

struct Add
{
    int _v;
    Add(int v): _v(v){}
    int operator()(int a)
    {
        return a+_v;
    }
};

struct Even
{
    bool operator()(const int & a)
    {
        return a % 2 == 0;
    }
};

struct Odd
{
    bool operator()(const int & a)
    {
        return a % 2 !=0;
    }
};

struct Pred
{
    int value;
    Pred(const int & v):value(v){}
    bool operator()(const int & a)
    {
        return a < value;
    }
};


struct Generate
{
    int n;
    Generate(): n(0) {}
    int calculate(int number)
    {
        if (number == 0)
            return 0;
        if (number == 1)
            return 1;
        int n1=1, n2=0, nn=0;
        for (int i=2; i<=number; ++i)
        {
            nn = n1 + n2;
            n2 = n1;
            n1 = nn;
        }

        return nn;
    }
    int operator()()
    {
        n++;
        return calculate(n-1);
    }
};

struct Equal
{
    //elements are equal if they are both odd or even
    bool operator()(const int & a, const int & b)
    {
        return a % 2 == b % 2;
    }
};


int main(){

  int t[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  vector<int> v1(t,t+10);
  for_each(v1.begin(), v1.end(), print<int>);cout<<" v1"<<endl;

  deque<int> d1(5);
  copy(v1.begin(), v1.end()+5, d1.begin());
  for_each(d1.begin(), d1.end(),print<int>);cout<<" d1"<<endl;
  deque<int>::iterator itD1 = d1.end();

  list<int>l1(10);
  copy_backward(v1.begin(), v1.end()+10, l1.begin());
  for_each(l1.begin(), l1.end(), print<int>);cout<<" l1"<<endl;

  vector<int>v2(t,t+8);
  swap(v1,v2); for_each(l1.begin(), l1.end(), print<int>);cout<<" swapped l1 with l2"<<endl;
  deque<int>d2(t+2,t+7);
  deque<int>::iterator itD2 = d2.begin();
  iter_swap(d1.begin(), itD2);
  for_each(d1.begin(), d1.end(),print<int>);cout<<" swapped the first value of d1 with d2"<<endl;

  swap_ranges(d1.begin(), itD1,itD1);
  for_each(d1.begin(), d1.end(),print<int>);cout<<" swapped d1 with d1 end"<<endl;
  transform(v1.begin(), v1.end(), l1.begin(), Add(10));
  for_each(l1.begin(), l1.end(), print<int>);cout<<" l1"<<endl;

  replace(v1.begin(), v1.end(), 5,15);
  for_each(v1.begin(), v1.end(), print<int>);cout<<" replaced 5 with 15 v1"<<endl;


  replace_if(d1.begin(), d1.end(),Odd(),98);
  for_each(d1.begin(), d1.end(),print<int>);cout<<" swapped odd values with 98 d1"<<endl;

  list<int> l2 (5);
  fill(l2.begin(),l2.end(),5);
  for_each(l2.begin(), l2.end(), print<int>);cout<<" created and filled l2 with 5s"<<endl;

  vector<int>v3(5);
  fill_n(v3.begin(), 5,8);
  for_each(v3.begin(), v3.end(), print<int>);cout<<" created and filled v3 with 8s"<<endl;

  deque<int>d3(5);
  generate(d3.begin(), d3.end(), Generate());
  for_each(d3.begin(), d3.end(), print<int>);cout<<" created and generated d3 with febunachi "<<endl;

  list<int>l3(10);
  generate_n(l3.begin(),10, Generate());
  for_each(l3.begin(), l3.end(), print<int>);cout<<" created and generated l3 with febunachi "<<endl;

  //list<int>::iterator rm =
  remove(l1.begin(), l1.end(), 16);
  for_each(l1.begin(), l1.end(), print<int>);cout<<" removed 16 from l1 "<<endl;
  remove_if(l1.begin(), l1.end(), Even());
  for_each(l1.begin(), l1.end(), print<int>);cout<<" removed even numbers from l1 "<<endl;

  list<int>::iterator newEnd = unique(l1.begin(), l1.end(), Equal());
  cout<<"Displaying only valid elements:\n";
  cout<<"l1: "; for_each(l1.begin(), newEnd, print<int>); cout<<endl<<endl;

  vector<int>::iterator newEnd2 = unique_copy(l2.begin(), l2.end(), v2.begin(), Equal());
  cout<<"Collection after removal - size did not change!:\n";
  cout<<"l2: "; for_each(l2.begin(), l2.end(), print<int>); cout<<endl;
  cout<<"v2: "; for_each(v2.begin(), v2.end(), print<int>); cout<<endl;
  cout<<"Displaying only valid elements:\n";
  cout<<"v2: "; for_each(v2.begin(), newEnd2, print<int>); cout<<endl<<endl;

  reverse_copy(l1.begin(), l1.end(), v1.begin());
  cout<<"Collections after reversal\n";
  cout<<"l1: "; for_each(l1.begin(), l1.end(), print<int>); cout<<endl;
  cout<<"v1: "; for_each(v1.begin(), v1.end(), print<int>); cout<<endl<<endl;

  cout<<"Reversing order:\n";
  reverse(l1.begin(), l1.end());
  cout<<"Collection after reversal:\n";
  cout<<"l1: "; for_each(l1.begin(), l1.end(), print<int>); cout<<endl;

  list<int>::iterator itl1 = l1.begin();
  advance(itl1,2);
  rotate(l1.begin(), itl1, l1.end());
  cout<<"Collection after rotate and put the 3rd element first\n";
  cout<<"l1: "; for_each(l1.begin(), l1.end(), print<int>); cout<<endl<<endl;

  random_shuffle(v1.begin(), v1.end());
  cout<<"Shuffled v1: "; for_each(v1.begin(), v1.end(), print<int>); cout<<endl<<endl;

  cout<<"Source collection:\n";
    cout<<"v1: "; for_each(v1.begin(), v1.end(), print<int>); cout<<endl<<endl;

    cout<<"Normal partitl1ioning:\n";
    vector<int>::iterator itv1 = partition(v1.begin(), v1.end(), Pred(5));
    cout<<"Partitioning into two groups: < 5 and > 5:\n";
    cout<<"v1: "; for_each(v1.begin(), v1.end(), print<int>); cout<<endl;
    cout<<"The first group: "; for_each(v1.begin(), itv1, print<int>); cout<<endl;
    cout<<"The second group: "; for_each(itv1, v1.end(), print<int>); cout<<endl<<endl;

    cout<<"Stable partitioning:\n";
    copy(t,t+10, v1.begin()); //reinitializing collection;
    itv1 = stable_partition(v1.begin(), v1.end(), Pred(5));
    cout<<"Partitioning into two groups: < 5 and > 5:\n";
    cout<<"v1: "; for_each(v1.begin(), v1.end(), print<int>); cout<<endl;
    cout<<"The first group: "; for_each(v1.begin(), itv1, print<int>); cout<<endl;
    cout<<"The second group: "; for_each(itv1, v1.end(), print<int>); cout<<endl;





  return 0;
}
