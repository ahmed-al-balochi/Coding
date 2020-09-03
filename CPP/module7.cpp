#include <iostream>
#include <list>
#include <algorithm>
#include <iterator>
#include <functional>

using namespace std;


template <class T> void print(T start, T end) {
        for ( ;start != end; ++start) {
                std::cout << *start << " ";
        }
    }

int main(){

  int t1[]={1, 2, 3, 4, 5};
  list<int>l1(t1, t1+5);
  list<int>l2(l1.begin(), l1.end());
  list<int>l3(l1.size());

  less <int> l;
	less_equal <int> le;
	greater <int> g;
	greater_equal <int> ge;
    equal_to <int> e;
	not_equal_to <int> ne;

  cout<<"l1: "; print(l1.begin(), l1.end()); cout<<endl;
  cout<<"l2: "; print(l2.begin(), l2.end()); cout<<endl<<endl;

  transform(l1.begin(), l1.end(), l2.begin(), l3.begin(), plus<int>());
  cout<<"l1 + l2 = l3: "; print(l3.begin(), l3.end()); cout<<endl<<endl;

  transform(l1.begin(), l1.end(), l2.begin(), l3.begin(), minus<int>());
  cout<<"l1 - l2 = l3: "; print(l3.begin(), l3.end()); cout<<endl<<endl;

  transform(l1.begin(), l1.end(), l2.begin(), l3.begin(), multiplies<int>());
  cout<<"l1 x l2 = l3: "; print(l3.begin(), l3.end()); cout<<endl<<endl;

  transform(l1.begin(), l1.end(), l2.begin(), l3.begin(), divides<int>());
  cout<<"l1 / l2 = l3: "; print(l3.begin(), l3.end()); cout<<endl<<endl;

  transform(l3.begin(), l3.end(), l3.begin(), negate<int>());             // return the elements stored in the list but in negitive form
  cout<<"!l3: "; print(l3.begin(), l3.end()); cout<<endl;

  transform(l1.begin(), l1.end(), l2.begin(), l3.begin(), modulus<int>());    // divides and returns the reminder
  cout<<"l1 % l2: "; print(l3.begin(), l3.end()); cout<<endl;

  int a=5, b=5;
  cout<<"A=5, B=5:\n";
  cout<<"less(A,B)=            "<<l(a,b)<<endl;
  cout<<"less_equal(A,B)=      "<<le(a,b)<<endl;
  cout<<"greater(A,B)=         "<<g(a,b)<<endl;
  cout<<"greater_equal(A,B)=   "<<ge(a,b)<<endl;
  cout<<"equal(A,B)=           "<<e(a,b)<<endl;
  cout<<"not_equal(A,B)=       "<<ne(a,b)<<endl<<endl;

  cout<<"bind1st\n";

  transform(l1.begin(), l1.end(), l2.begin(),  bind1st(plus<double>(), 10) );
  cout<<"10+l1: "; print(l2.begin(), l2.end()); cout<<endl;

  transform(l1.begin(), l1.end(), l2.begin(),  bind1st(minus<double>(), 10) );
  cout<<"10-l1: "; print(l2.begin(), l2.end()); cout<<endl;

  transform(l1.begin(), l1.end(), l2.begin(),  bind1st(multiplies<double>(), 10) );
  cout<<"10*l1: "; print(l2.begin(), l2.end()); cout<<endl;

  transform(l1.begin(), l1.end(), l2.begin(),  bind1st(divides<double>(), 10) );
  cout<<"10/l1: "; print(l2.begin(), l2.end()); cout<<endl;

  cout<<"bind2nd\n";

  transform(l1.begin(), l1.end(), l2.begin(),  bind2nd(plus<double>(), 10) );
  cout<<"l1+10: "; print(l2.begin(), l2.end()); cout<<endl;

  transform(l1.begin(), l1.end(), l2.begin(),  bind2nd(minus<double>(), 10) );
  cout<<"l1-10: "; print(l2.begin(), l2.end()); cout<<endl;

  transform(l1.begin(), l1.end(), l2.begin(),  bind2nd(multiplies<double>(), 10) );
  cout<<"l1*10: "; print(l2.begin(), l2.end()); cout<<endl;

  transform(l1.begin(), l1.end(), l2.begin(),  bind2nd(divides<double>(), 10) );
  cout<<"l1/10: "; print(l2.begin(), l2.end()); cout<<endl;


  cout<<"Source collection:\n";
  cout<<"l1: "; print(l1.begin(), l1.end()); cout<<endl;

  cout<<"simple bind1st\n";

  transform(l1.begin(), l1.end(), l2.begin(),  bind1st(not_equal_to<int>(), 3) );
  cout<<"Places of collection elements not equals 3: " << endl;
  cout<<"l2: "; print(l2.begin(), l2.end()); cout<<endl;

  int counterL1 = count_if (l1.begin(), l1.end(), bind1st(not_equal_to<int>(),3) );
  cout << "There are " << counterL1 << " elements that are not equal to 3 (based on l1 collection).\n";
  int counterL2 = count_if (l2.begin(), l2.end(), bind1st(equal_to<int>(),1) );
  cout << "There are " << counterL2 << " elements that are equal to 1 (based on l2 collection true/false test).\n";



  return 0;
}
