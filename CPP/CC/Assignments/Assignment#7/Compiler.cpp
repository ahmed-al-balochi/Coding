//    Write a Compiler in C++ that can take your own defined HLL as an input and convert its tokens
//    Draw the automata of tokens identification for your language as well
//    Two files are attached for hint, but you have to write your own code

#include <iostream>
#include<fstream>
#include<string>
#include <cstring>
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

bool Keyword(string tokenHolder){
    bool Kword=false;
    if(tokenHolder=="Pr" || tokenHolder == "Uin" || tokenHolder == "If" || tokenHolder == "Then"
       || tokenHolder== "Int" || tokenHolder == "Double" || tokenHolder == "Float" || tokenHolder == "Else")
    {
            Kword = true;
            }
        else {
            Kword = false;
        }
        return Kword;
}

bool Special(string tokenHolder){
    bool Sep=false;
    if(tokenHolder== "\"" || tokenHolder == ";" || tokenHolder == "$" || tokenHolder == "\'" || tokenHolder == "~")
    {
            Sep = true;
            }
        else {
            Sep = false;
        }
        return Sep;
}

bool Separator(string tokenHolder){
    bool Sep=false;
    if(tokenHolder== "->" || tokenHolder == ":" || tokenHolder == "(" || tokenHolder == ")"
       || tokenHolder== "," || tokenHolder == "[" || tokenHolder == "]" || tokenHolder == "{"
       || tokenHolder == "}"|| tokenHolder== "#")
    {
            Sep = true;
            }
        else {
            Sep = false;
        }
        return Sep;
}

bool Operator(string tokenHolder){
    bool Op=false;
    if(tokenHolder== "=" || tokenHolder == "==" || tokenHolder == ">" || tokenHolder == "+"
       || tokenHolder== "*" || tokenHolder == "%" || tokenHolder == "/" || tokenHolder == "-"
       || tokenHolder == "<" || tokenHolder == "?" || tokenHolder == "--" || tokenHolder == "++"
       || tokenHolder == "&&" || tokenHolder == "||")
    {
            Op = true;
            }
        else {
            Op = false;
        }
        return Op;
}

bool Constants(string tokenHolder){
    bool Cons=false;
        if(tokenHolder =="1"||tokenHolder =="2"||tokenHolder =="3"||tokenHolder=="4"||tokenHolder =="5"
        ||tokenHolder =="6"||tokenHolder =="7"||tokenHolder =="8"||tokenHolder =="9"||tokenHolder =="0")
    {
            Cons = true;
            }
        else {
            Cons = false;
        }
        return Cons;
}

bool Sp(char tokenHolder){
    bool sp = false;
    if(tokenHolder== '(' || tokenHolder== ')' || tokenHolder== '$'|| tokenHolder== '<'|| tokenHolder== '>'
       || tokenHolder== '['|| tokenHolder== ']'|| tokenHolder== '{'|| tokenHolder== '}'|| tokenHolder== '#'
       || tokenHolder== '&'|| tokenHolder== '|'|| tokenHolder== '+'|| tokenHolder== '-'|| tokenHolder== '='
       || tokenHolder== '%'|| tokenHolder== '^'|| tokenHolder== '*'|| tokenHolder== '?'|| tokenHolder== ':'){
            sp= true;
            }
        else {
            sp= false;
        }

    return sp;
}

bool Q(char tokenHolder){
    bool q=false;
        if(tokenHolder<= '\"' ||tokenHolder<= '\''){
            q= true;
            }
        else {
            q= false;
        }
        return q;
}

void dispQueue(queue <string> st){
    queue <string> s = st;
    ofstream Tokens_of_MyLang;
    Tokens_of_MyLang.open("Tokens_of_MyLang.txt");  //Output File
    int i=0;
    for(i=0;!s.empty();i++){
        cout<<s.front()<<"\tToken Number "<<1+i<<" "<<endl;
        Tokens_of_MyLang<<s.front()<<"\n";
        s.pop();
    }
    cout<<endl<<"Total Tokens: "<<i<<endl;
    Tokens_of_MyLang.close();
}

void Lex(char in[],int num){
    string Token[num];
    int prev=0,next=prev+1,inc = 0;
    for(int i = 0; i <num; prev++,next++,i++) {
        /*if(Q(in[prev])==true){
           Token[inc] += in[prev];
        } */                  //My Lexical Analyizer is tokenizing everything except quote and comments it considers them as seperate tokens
        if(Sp(in[prev])==true){
           inc++;
           Token[inc] += in[prev];
           if (in[prev]=='-' && in[next]=='>') {
           Token[inc] += in[next];
            prev = next;
            next = prev + 1;
           }
           inc++;
        }
        else if (in[prev] ==':'&& (in[next])==' ') {
           inc++;
           Token[inc] = in[prev];
           //cout<<"\nin ;\n";
        }
        else if(in[prev]=='\r' || in[prev]=='\n'){
            prev = next;
            next = prev + 1;
            inc++;
           Token[inc] += in[prev];
        }
        else if(in[next]==' '){
           Token[inc] += in[prev];
           prev = next;
           next = prev + 1;
           inc++;
        }
        else if(Digit(in[prev])==true){
           Token[inc] = in[prev];
        }
        else if(Alpha(in[prev])==true){
           Token[inc] += in[prev];
        }
        else if (in[prev] =='=') {
           Token[inc] = in[prev];
        }
        /*else if(in[prev]=='-'&&in[next]=='-' || in[prev]=='-' && in[next]=='#'){ Couldn't get the quote & comment logic capture right
           Token[inc] += in[prev];
        }*/
    }
    queue <string> FinalTokens;
    for(int i = 0; i <inc ; i++){
        if(Token[i]!=""){
            FinalTokens.push(Token[i]);
        }
    }
    dispQueue(FinalTokens);
    int inc1=0,inc2=0;
    string Lex[50][2];
    for(int i=0;!FinalTokens.empty();i++){
    if(Keyword(FinalTokens.front())==true){
        //cout<<"in Kword "<<FinalTokens.front()<<endl;
        Lex[inc1][inc2]=FinalTokens.front();
        FinalTokens.pop();
        inc2++;
        Lex[inc1][inc2]="Keyword";
        inc1++;inc2=0;
        continue;
    }
    else if(Operator(FinalTokens.front())==true){
        //cout<<"in Op "<<FinalTokens.front()<<endl;
        Lex[inc1][inc2]=FinalTokens.front();
        FinalTokens.pop();
        inc2++;
        Lex[inc1][inc2]="Operator";
        inc1++;inc2=0;
        continue;
    }
    else if(Special(FinalTokens.front())==true){
        Lex[inc1][inc2]=FinalTokens.front();
        FinalTokens.pop();
        inc2++;
        Lex[inc1][inc2]="Special";
        inc1++;inc2=0;
        continue;
    }
    else if(Constants(FinalTokens.front())==true){
        Lex[inc1][inc2]=FinalTokens.front();
        FinalTokens.pop();
        inc2++;
        Lex[inc1][inc2]="Constant";
        inc1++;inc2=0;
        continue;
    }
    else if(Separator(FinalTokens.front())==true){
        Lex[inc1][inc2]=FinalTokens.front();
        FinalTokens.pop();
        inc2++;
        Lex[inc1][inc2]="Separator";
        inc1++;inc2=0;
        continue;
    }
    else{
        //cout<<"in lse "<<FinalTokens.front()<<endl;
        Lex[inc1][inc2]=FinalTokens.front();
        FinalTokens.pop();
        inc2++;
        Lex[inc1][inc2]="ID";    //meaning its an identifier
        inc1++;inc2=0;
        continue;
    }
}
    cout<<endl;
    for(int i=0;i<50;i++){
        for(int j=0;j<2;j++){
           cout<<Lex[i][j]<<" ";
        }
            cout<<endl;
    }
}

int main(){
    int numToken=0;
    string in;
    char tk[500];
    ifstream getMyLang;
    getMyLang.open ("MyLang.AAA", std::fstream::in | std::fstream::out | std::fstream::app);
    if(getMyLang.is_open()){
        while (getline(getMyLang, in, '\0')){
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
    getMyLang.close();
}
