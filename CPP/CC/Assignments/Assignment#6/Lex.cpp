#include<iostream>
#include <regex>
#include <sstream>
#include <fstream>
#include <vector>
#include<string>
using namespace std;

//Write a code of Lexical analyzer that take Source code as an input and give list of Tokens as an output.

int main(){
    string str,tokenHolder;
    int inc = 0,lastStr = 0;
    string fillTokens[100],finalTokens[20];
    ifstream getCfile;
    ofstream C_to_CPPfile;
    getCfile.open ("Cfile.c", std::fstream::in | std::fstream::out | std::fstream::app);

    if(getCfile.is_open()){
        for(int i=0; i<5; i++){
            getCfile>>str;
            //cout<<str<<endl;
        for(int i = 0; i < str.length(); i++) {
               //cout << str.at(i) << endl; //get character at position i
               tokenHolder = tokenHolder + str.at(i);
               //cout<<tokenHolder;
               if(tokenHolder =="void"){
                   fillTokens[inc]="void";
                   tokenHolder.clear();
                   inc++;
               }
              else if(tokenHolder =="main"){
                   fillTokens[inc]="main";
                   tokenHolder.clear();
                   inc++;
               }
              else if(tokenHolder =="("){
                   cout<<"in ("<<i;
                   fillTokens[inc]="(";
                   tokenHolder.clear();
                   inc++;
               }
              else if(tokenHolder ==")"){
                   fillTokens[inc]=")";
                   tokenHolder.clear();
                   inc++;
               }
              else if(tokenHolder =="{"){
                   fillTokens[inc]="{";
                   tokenHolder.clear();
                   inc++;
               }
              else if(tokenHolder =="}"){
                   fillTokens[inc]="}";
                   tokenHolder.clear();
                   inc++;
               }
              else if(tokenHolder == "printf"){
                   fillTokens[inc]="printf";
                   tokenHolder.clear();
                   inc++;
               }
              else if(tokenHolder ==";"){
                   fillTokens[inc]=";";
                   tokenHolder.clear();
                   inc++;
               }
              else if(tokenHolder.find_last_of("\"")){
                   string a;
                   size_t found = tokenHolder.find_last_of("\"");
                   a= tokenHolder.substr(0,found+1);
                   fillTokens[inc]=a;
                   inc++;
                   tokenHolder.erase(0,found+1);
               }
              else{
                   continue;
              }
       }
    }
 }
    int len = sizeof(fillTokens)/sizeof(fillTokens[0]);
    for(int i = 0,j = 0;i<len;i++){
        if(fillTokens[i]==""){
            continue;
        }
        else{
        finalTokens[j]=fillTokens[i];j++;
        lastStr++;
        }
    }
    cout<<"\nNumber Of Tokens = "<<lastStr<<endl;
    for(int i = 0;i<lastStr;i++){
        cout<<finalTokens[i];
    }

    C_to_CPPfile.open("C_to_CPPfile.cpp");/*
    for(int i=0; i<lastStr; i++)
        if(finalTokens[i] =="")
            continue;
    else
    C_to_CPPfile<<finalTokens[i];
*/
    getCfile.close();
    C_to_CPPfile.close();
}
