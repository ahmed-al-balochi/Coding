// template function repalces the old functoins like
// int add(int a, int b){
// return a+b;
// }  and if you want to add double funtions then you need to overload this funtion which is really not that effictive
/* struct Point // when you want to use template functions on objects you need to create something like the one below
{
    int x,y;
    Point operator+(const Point & p)
    {
        Point res;
        res.x = x + p.x;
        res.y = y + p.y;
        return res;
    }
};*/
#include <iostream>

using namespace std;

template<class T>
T add(T a, T b){
  cout<<" type of the argument: "<<typeid(a).name()<<endl;
  return a+b;
}


int main(){
  int a = 9, b = 8;
  cout<<add(a,b)<<endl;
  double c = 9.5, d = 8.4;
  cout<<add(c,d)<<endl;




  return 0;
}
