// Sets does not allow duplicate enteries

#include <iostream>
#include <functional>
#include <set>

using namespace std;

template <class T> void print (T start ,T end){
  while (start != end){
    cout<<*start<<" "; start ++;
    }
  }

int main(){

  int t[]={1, 10, 8, 4, 6, 5, 3, 9, 7, 2};
  set <int> s1(t+5,t+10);

  set <int> s2(t ,t+10); /// stored t into s2
  print(s2.rbegin(), s2.rend()); cout<<endl;
  set <int> s3(s2); //copied s2 into s3
  cout<<s3.size()<<endl;
  print(s3.begin(), s3.end()); cout<<endl;
  set <int , greater <int>> s4(t,t+10); // 
  //s1 = s4; // assignment
  //print(s4.begin(), s4.end()); cout<<endl;
  print(s1.begin(), s1.end()); cout<<endl;

  s2.insert(10); // this 10 will not be enterd because there is a 10 from t was entered
  print(s2.begin(), s2.end()); cout<<endl;
  s3.erase(4); // deletes 4 from set
  print(s3.begin(), s3.end()); cout<<" 4 is deleted "<<endl;

  s1.clear(); // clears all the element in the set
  print(s1.begin(), s1.end()); cout<<"elements cleared in s1"<<endl;

  s1.swap(s2);
  print(s1.begin(), s1.end()); cout<<" | s2 is swapped with s3"<<endl;

  multiset<int>s5(t,t+10);
  s5.insert(5);
  print(s5.begin(), s5.end());cout<<endl;
  cout<<" s5: "<<s5.count(5)<<endl;

  set<int>::iterator its5 = s5.lower_bound(4);
  set<int>::iterator its6 = s5.upper_bound(6);
  cout<<"finding the value from 4 to 6: "<<endl;
  print(its5, its6);

  return 0;
  }
