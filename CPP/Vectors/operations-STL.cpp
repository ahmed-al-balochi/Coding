#include<iostream>
#include<list>
#include<deque>
#include<vector>
using namespace std;

template<class I>
void print (const I & start, const I & end)
{
    I it;
    for(it = start; it != end; ++it)
    {
        cout<< *it << " ";
    }
    cout<<endl;
}

bool deleteEven(int value)      //for remove_if
{
    if (value % 2 == 0 )
    {
        return true;
    }
    return false;
}

int main(){

    int a1[]={1,2,3,4,5,6,7,8,9,10};
    vector<int> v1(a1, a1+10); ;

    deque<int> d1(5,0);
    list<float> l1;
    int i=1;

    deque<int>::iterator itD = d1.begin();

    for( itD = d1.begin() ; itD != d1.end() ; ++itD ,++i){
        *itD = i;
    }
    for(itD = d1.begin() ; itD != d1.end() ; ++itD){
        cout<<*itD<<" ";
    }
    cout<<endl;
    //size() and max_size()
    cout<<"Size of d1 = "<<d1.size()<<endl;     //displays the element in  d1
    cout<<"Max_Size of d1 = "<<d1.max_size()<<endl; //displays the physical size of d1

    //empty() and resize()
    if(l1.empty()){
        l1.resize(5,0.0);
    }
    list<float>::iterator itL = l1.begin();
    for(itL = l1.begin() ; itL != l1.end() ; ++itL, i++){
        *itL = i*2.8;
    }
    cout<<" empty() and resize() "<<endl;
    for(itL = l1.begin() ; itL != l1.end() ; ++itL){
        cout<<*itL<<" ";
    }cout<<endl;

    //capacity() – vector only
    cout<<" capacity() – vector only "<<endl;
    for(int j =0;j< v1.size() ; j++){
        cout<<v1[j];
    }cout<<endl;
    cout<<"capacity = "<<v1.capacity()<<endl;

    //back() and front()
    cout<<"d1 Front Value = "<<d1.front()<<" d1 Back value = "<<d1.back()<<endl;
    d1.front() = 12;
    d1.back() = 98;
    print(d1.begin(), d1.end());

    // at()
    v1.at(3) = 55;
    cout<<"at()"<<endl;
    print(v1.begin() , v1.end());

    //assign()           deletes a the previous data and assigns new data
    d1.assign(a1,a1+5);
    cout<<"assign()\n";
    print(d1.begin(), d1.end());

    //insert()
    v1.insert(v1.end(),3,100);
    cout<<"insert()\n";
    print(v1.begin(), v1.end());

    //erase()
    d1.erase(d1.begin()+3);
    cout<<"erase()\n";
    print(d1.begin(), d1.end());

    //swap()
    vector<int> v2(a1+5,a1+10);
    v1.swap(v2);
    cout<<"swap()\n";
    print(v1.begin(), v1.end());

    //clear() + push_back() + pop_back()
    cout<<"clear() + push_back() + pop_back()\n";
    print(v2.begin(), v2.end());
    v2.clear();
    print(v2.begin(), v2.end());
    cout<<"after clearing"<<endl;
    v2.push_back(21);
    v2.push_back(78);
    print(v2.begin(), v2.end());
    v2.pop_back();
    print(v2.begin(), v2.end());

    //push_front() + pop_front()
    cout<<"push_front() + pop_front()"<<endl;
    print(l1.begin(), l1.end());
    l1.push_front(998);
    cout<<"after adding 998"<<endl;
    print(l1.begin(), l1.end());
    l1.pop_front();
    cout<<"after delete 998"<<endl;
    print(l1.begin(), l1.end());

    //splice()      transfers elements from one list to another //also you can specify where you want to add the new data like here
    cout<<"splice()\tbefore transfering l1 to l2"<<endl;
    list <float> l2(a1, a1+5);
    print(l2.begin(), l2.end());
    l2.splice(l2.end(),l1);
    cout<<"splice()\tafter transfering l1 to l2"<<endl;
    print(l2.begin(), l2.end());

    //remove() and remove_if() – list only
    cout<<"remove() and remove_if() – list only\tremove 28"<<endl;
    print(l2.begin(), l2.end());
    l2.remove(28);
    print(l2.begin(), l2.end());
    cout<<"remove_if(deleteEven) removes all even numbers"<<endl;
    l2.remove_if(deleteEven);       //calles the bool deleteEven ftn
    print(l2.begin(), l2.end());

    //unique() – list only  removes duplicates from the list.
    cout<<"unique() – list only"<<endl;
    l2.push_back(28);
    l2.push_back(28);
    print(l2.begin(), l2.end());
    l2.unique();
    print(l2.begin(), l2.end());

    //merge() – list only       performs a merge of two sorted list. the source list is emptied into the other list
    cout<<"merge() – list only"<<endl;
    list <int> l3(l1.rbegin(), l1.rend());
    list <int> l4(l2.rbegin(), l2.rend());
    l1.merge(l2);
    print(l1.begin(), l1.end());

    //sort() – list only

    cout<<"sort() – list only"<<endl;
    l1.push_front(92);
    l1.push_front(45.33);
    l1.push_back(45.9);
    print(l1.begin(), l1.end());
    l1.sort();
    print(l1.begin(), l1.end());

    // reverse() – list only

    cout<<"reverse() – list only"<<endl;
    l1.reverse();
    print(l1.begin(), l1.end());


}