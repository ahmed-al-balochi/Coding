//    Write a Compiler in C++ that can take your own defined HLL as an input and convert its tokens
//    Draw the automata of tokens identification for your language as well
//    Two files are attached for hint, but you have to write your own code

#include <iostream>
#include<fstream>
#include<string>
#include <bits/stdc++.h>
#include <ctype.h>
using namespace std;

bool Digit(char tokenHolder ){
    bool digit=false;
        if(tokenHolder =='1'||tokenHolder =='2'||tokenHolder =='3'||tokenHolder=='4'||tokenHolder =='5'
                ||tokenHolder =='6'||tokenHolder =='7'||tokenHolder =='8'||tokenHolder =='9'||tokenHolder =='0'){
            digit = true;
        }
        else {
            digit = false;
        }
        return digit;
}
bool Alpha(char tokenHolder){
    bool alpha=false;
        if(tokenHolder>= 'a' || tokenHolder <='z' || tokenHolder >= 'A' || tokenHolder <= 'Z'){
            alpha = true;
            }
        else {
            alpha = false;
        }
        return alpha;
}
bool Q(char tokenHolder){
    bool q=false;
        if(tokenHolder<= '\''){
            q= true;
            }
        else {
            q= false;
        }
        return q;
}


void Lex(char in[],int num){
    string Token[num];
    int prev=0,next=prev+1,inc = 0;
    for(int i = 0; i <num; prev++,next++,i++) {
        if(isspace(in[next])){
           Token[inc] += in[prev];
            prev = next;
            next = prev + 1;
            inc++;
        }
        else if(Alpha(in[prev])==true){
           Token[inc] += in[prev];
        }
        else if(Digit(in[prev])==true){
           Token[inc] += in[prev];
        }
        else if (in[prev] =='=') {
           Token[inc] = in[prev];
        }
        if (in[prev] ==';') {
           inc++;
           Token[inc] = in[prev];
           cout<<"\nin ;\n";
        }
    }
    cout<<"Number Of Tokens = "<<num<<endl;
    for(int i = 0; i <num; i++){
        cout<<Token[i]<<"/";
    }
    //cout<<"\nConverted To AAA Language: "<<inc<<endl;
    //for(int i = 0;i<num;i++){
     //   cout<<Token[i];
    //}
}

int main(){
    int numToken=0;
    string in;
    char tk[500];
    ifstream getCfile;
    ofstream C_to_CPPfile;
    getCfile.open ("CPPFile.cpp", std::fstream::in | std::fstream::out | std::fstream::app);
    C_to_CPPfile.open("CPP_to_MyLang.AAA");
    if(getCfile.is_open()){
        while (getline(getCfile, in, '\0')){
            for(char ch: in){
                tk[numToken] = ch;
                cout<<tk[numToken];
                numToken++;
            }
        }
    Lex(tk,numToken);
        }
    else{
        cout<<"File is not Open"<<endl;
    }
    getCfile.close();
    C_to_CPPfile.close();
}
