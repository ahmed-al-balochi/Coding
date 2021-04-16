#include<iostream>
#include<string>
#include<fstream>
#include<sstream>
#include<cstring>
using namespace std;

int main()
{

char ch;

ifstream file;
file.open("CPPFile.cpp");
file>>ch;
char tokens[80];
char *ptr;
while(!file.eof())
{

int i=0;


tokens[i]=ch;
ptr=strtok(tokens," \n");
cout<<ptr<<"\t";
i++;

file>>ch;

}



}
