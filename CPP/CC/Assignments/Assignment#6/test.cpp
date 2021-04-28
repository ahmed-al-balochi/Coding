#include<iostream>
#include<cstring>
#include<string>  
#include<fstream>
using namespace std;
  
int main()
{
    FILE *fp;
    char ch,line[500],bb[1000] = ""; // initialize bb
    int i=0,ret;
    fp=fopen("MyLang.AAA","r");
    if(fp==NULL) printf("File not opened");
    else
    {
        cout<<"File opened successfully"<<"\n";
        while(ret = fscanf(fp," %s ", line))   // use of fscanf
        {
            if(ret == EOF)
            {
                break;
            }

            strcat(bb,line);
            strcat(bb,"\n");
        }

        char *tok=strtok(bb,"\t");
        while(tok!=NULL)
        {
            cout<<tok;
            tok=strtok(NULL,"\n ,+=");   // NULL instead of pointer
        }
    }
}
