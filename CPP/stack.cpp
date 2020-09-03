
#include <iostream>
using namespace std;
#include <string.h> 

struct stack{
    string data;
    stack *next;
};

class reverse {
private:
stack *Mystack,*tail;
int top=-1;
public:
reverse(){
Mystack =NULL;
tail = NULL;
}

void push(){
stack *tmp = new stack;
char str[10],rev;
int i,j;
cout<<" Enter Characters to Reverse them: ";
cin>>str;
    j = strlen(str) - 1;
    for (i = 0; i < j; i++,j--)
    {
    rev = str[i];
    str[i] = str[j];
    str[j] = rev;
    }
tmp->data = str;
tmp->next = NULL;
if (Mystack ==NULL)
{
    Mystack = tmp;
    tail = tmp;
    top++;
}
else{
    tail->next = tmp;
    tail = tail->next;
    //cout<<"tail is "<<tail->data<<endl;
        }
 }

void pop(){
 stack *tmp,*pre;
 int a=0;
        if(Mystack == NULL){
		cout<<" Stack Empty Nothing To Delete"<<endl;
        return;
        }
            else{
                tmp=tail;
                delete tail, tail->next;
                //tail = tmp;
                /*while (tmp != NULL && a != top){
                pre= tmp;
                tmp = tmp->next;
                a++;
                }
                pre->next = tmp->next;
                delete tmp;*/
                //cout<<" tail is "<<tail->data<<endl;
            }
    }

void display(){
stack *tmp;
cout<<" Stack Data:"<<endl;
    if(Mystack ==NULL){
        cout<<"Stack Empty"<<endl;
        return;
    }
    else{
    tmp =Mystack;
    while(tmp != NULL){
    cout<<" "<<tmp->data<<endl;
    tmp = tmp->next;
}
    cout<<"..............................................."<<endl;
    }
}

};

int main(){
reverse a1;
a1.push();
a1.push();
a1.display();
a1.pop();
}