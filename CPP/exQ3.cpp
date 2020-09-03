#include<iostream>
#include <fstream>
#include<stack>

using namespace std;
bool isBalanced(string expr) {
   stack<char> s;
   char ch;
   for (int i=0; i<expr.length(); i++) {   
      if (expr[i]=='('||expr[i]=='['||expr[i]=='{') {  
         s.push(expr[i]);
         continue;
      }
      if (s.empty())   
         return false;
         switch (expr[i]) {
            case ')':   
               ch = s.top();
               s.pop();
               if (ch=='{' || ch=='[')
                  return false;
                  break;
            case '}': 
               ch = s.top();
               s.pop();
               if (ch=='(' || ch=='[')
                  return false;
                  break;
            case ']': 
               ch = s.top();
               s.pop();
               if (ch =='(' || ch == '{')
                  return false;
                  break;
         }
      }
      return (s.empty()); 
}
int main() {
   string expr;
   cout<<" Enter a Math expression with brackets like this (a+s)"<<endl; //you have to at least enter once then you can uncomment this until the next comment
   cin>>expr;       

    ofstream myfile1 ("ExQ3.txt");
  if (myfile1.is_open())
  {
    myfile1 << expr;
    myfile1.close();
  }
  else cout << "Unable to open file";
    
  // uncomment from the previous comment to this comment to check the code of reading the file
  string line;
  ifstream myfile ("ExQ3.txt");
  if (myfile.is_open())
  {
    while ( getline (myfile,line) )
    {
      cout << line << '\n';
    }
    myfile.close();
  }
  else cout << "Unable to open file";

   if (isBalanced(expr))
      cout << "Valid";
   else
      cout << "Not Valid";
}