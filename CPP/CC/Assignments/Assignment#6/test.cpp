#include <iostream>
#include<fstream>
#include <vector>
#include <sstream>
using namespace std;

int main() {
   ifstream getCfile;
   getCfile.open ("CPPFile.cpp", std::fstream::in | std::fstream::out | std::fstream::app);
   string in,out;
if(getCfile.is_open()){
        for(int i=0; i<37; i++){
            getCfile>>in;
            out = out +in;
            //cout<<in;
    }
}
   stringstream ss(out); //convert my_string into string stream
   vector<string> tokens;
   string temp_str;

   while(getline(ss, temp_str, ' ')){ //use comma as delim for cutting string
      tokens.push_back(temp_str);
   }
   for(int i = 0; i < tokens.size(); i++) {
      cout << tokens[i] << i << " " << endl;
   }
}
