#include<iostream>
#include<fstream>
#include<string>
using namespace std;

int main(){
    string arr[500];
    ifstream getCfile;
    ofstream C_to_CPPfile;
    getCfile.open ("Cfile.c", std::fstream::in | std::fstream::out | std::fstream::app);
    C_to_CPPfile.open("C_to_CPPfile.cpp");
    //getCfile<<"Writing this file to a C++ File"<<endl;
    if(getCfile.is_open()){
        for(int i=0; i<10; i++){
    getCfile>>arr[i];
    cout<<arr[i]<<endl;
    if(arr[i] == "printf(\"Hello")
        arr[i] = "cout<<\"Hello";
    else if(arr[i] == "World\");")
        arr[i] = " World\";";
    }
 }
    for(int i=0; i<10; i++)
    C_to_CPPfile<<arr[i];

    getCfile.close();
    C_to_CPPfile.close();
}
