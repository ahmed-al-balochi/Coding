#include <iostream>
#include <set>
#include <list>
#include <algorithm>

using namespace std;

void print(int & value) //change argument to const int & value for set
{
    cout<<value<<" ";
}

struct Print
{
    void operator()(int & value) //change argument to const int & value for set
    {
        cout<<value<<" ";
    }
};

bool odd(const int & value)
{
    return value % 2 != 0;
}

struct Even
{
    bool operator()(const int & value)
    {
        return value % 2 == 0;
    }
};

bool compare(const char &f, const char &s)
{
    return tolower(f)==tolower(s);
}


int main(){

    int t[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    list <int> l1(t, t+10);
    cout<<"Print all elements of the container - using function\n";
    for_each(l1.begin(), l1.end(), print); cout<<endl<<endl;

    cout<<"Print all elements of the container - using function object\n";
    for_each(l1.begin(), l1.end(), Print()); cout<<endl<<endl;
    list<int>::iterator found = find(l1.begin(), l1.end(), 10);
    if (found!=l1.end())
    {
        cout<<"Value 10 found at position : "<<distance(found, l1.begin()) <<endl;
        cout<<endl;
        cout<<"Founding all remaining elements of value 10\n";
        ++found; // skip element already found if any;
        while ( (found = find(found, l1.end(), 10)) != l1.end())
        {
            cout<<"Next value 10 found at position : "<<distance(l1.begin(), found ) <<endl;
            ++found;
        }
    }
    else
    {
        cout<<"Value 10 not found\n";
    }

    cout<<"Look for the first odd element in the container:\n";
    list<int>::iterator found1 = find_if(l1.begin(), l1.end(), odd);
    if (found1!=l1.end())
    {
        cout<<"Found1 odd element: "<<*found<<endl;
    }
    else
    {
        cout<<"Odd element not found1\n";
    }
    cout<<endl;
    int ts[]={2,3};
    list<int>::iterator found2 = search(l1.begin(), l1.end(), ts, ts+2);
    if (found2 != l1.end())
    {
        cout<<"Sequence 2, 3 has been found2 at position: " <<distance(l1.begin(), found)<<endl;
    }
    else
    {
        cout<<"Sequence 2, 3 could not  be found2\n";
    }
    list<int>::iterator found3 = search(l1.begin(), l1.end(), ts, ts+2, compare);
    if (found3 != l1.end())
    {
        cout<<"Sequence 2, 3 has been found3 at position: " <<distance(l1.begin(), found)<<endl;
    }
    else
    {
        cout<<"Sequence 2, 3 could not  be found3\n";
    }
    cout<<endl;

    list<int>::iterator found4 = find_first_of(l1.begin(), l1.end(), ts, ts+2);
    if (found4!=l1.end())
    {
        cout<<"Found4 value: "<<*found<<" at position : "<<distance(l1.begin(), found) <<endl;
        cout<<"Looking for any other element with value 2 or 3\n";
        ++found4; // skip element already found if any;
        while ( (found4 = find_first_of(found, l1.end(), ts, ts+2)) != l1.end())
        {
            cout<<"Found4 value: "<<*found<<" at position : "<<distance(l1.begin(), found) <<endl;
            ++found4;
        }
    }
    else
    {
        cout<<"No elements with value 2 or 3!\n";
    }
    cout<<endl;

    int number = count(l1.begin(), l1.end(), 10);
    cout<<"Number of items (10) found5: "<< number<<endl;
    cout<<endl;

    int number2 = count(l1.begin(), l1.end(), 10);
    cout<<"Number of items (10) found5: "<< number2<<endl;
    cout<<endl;
    list<int>::iterator found5 = search_n(l1.begin(), l1.end(), 3, 7);
    if (found5 != l1.end())
    {
        cout<<"Sequence: 7 7 7 "<<*found5<<" has been found at position: " <<distance(l1.begin(), found)<<endl;
    }
    else
    {
        cout<<"Sequence 7 7 7 could not  be found5\n";
    }
    cout<<endl;

    /*
    set <int>s1(t, t+10);

    cout<<"Print all elements of the set - using function\n";
    for_each(s1.begin(), s1.end(), print); cout<<endl<<endl;

    cout<<"Print all elements of the set - using function object\n";
    for_each(s1.begin(), s1.end(), Print() ); cout<<endl<<endl;
    */


  return 0;
}
