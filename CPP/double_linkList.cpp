#include<iostream>
#include<ctime> 
#include<string>
using namespace std;

struct node{
    string publicPost;
    string friendsPost;
    string privatePost;
    string date;

    int PripostNum =0, PubpostNum = 0, FripostNum = 0;

    node *pre;
    node *next;
};


class doublyLinkList{
    private:
    node *head;
    time_t tt;
    string userName;
    int pubinc, friiinc, priinc;

    public:
    doublyLinkList(){
        head = NULL;
        pubinc = 0;
        friiinc = 0;
        priinc = 0;
    }

    void User(){
        cout<<"Enter your User Name:"<<endl;
        getline(cin, userName);
    }

    string getUsername(){
        return userName;
    }
    
    string pdate(){
    struct tm * ti; 
    string d ;
    time (&tt); 
    ti = localtime(&tt); 
    d= (asctime(ti));
    return d;
    //out<< asctime(ti); 
    }
    
    void post(){
    node *tmp = new node;
    int sw1;

    cout<<"Before Writing you Post Do you want it for Public enter 1 Or for Friends 2 Or Private Enter 3 "<<endl;
    cin>>sw1;

    switch(sw1){
            case 1:{
            cout<<"Write Your Post Here: "<<endl;
            cin.ignore();
            getline(cin, tmp->publicPost);

            pubinc++;
            //cout<<tmp->PubpostNum<<"bef"<<endl;
            tmp->PubpostNum = pubinc;
            //cout<<tmp->PubpostNum<<"af"<<endl;
            
            //cout<<"Char "<<pdate()<<endl;
            tmp->date = pdate();
            tmp->pre = NULL;
            tmp->next = head;

            if(head == NULL){
              head = tmp;
            }
            else{
                head->pre = tmp;
               head = tmp;
            }
        return;
        }
            case 2:{
            cout<<"Write Your Post Here: "<<endl;
            cin.ignore();
            getline(cin, tmp->friendsPost);

            friiinc++;
            tmp->FripostNum = friiinc;
            tmp->date = pdate();

            tmp->pre = NULL;
            tmp->next = head;

            if(head == NULL){
              head = tmp;
            }
            else{
                head->pre = tmp;
               head = tmp;
            }  
        return; 
        }
            case 3:{
            cout<<"Write Your Post Here: "<<endl;
            cin.ignore();
            getline(cin, tmp->privatePost);
            tmp->date = pdate();

            priinc++;
            tmp->PripostNum = priinc;
            tmp->pre = NULL;
            tmp->next = head;

            if(head == NULL){
              head = tmp;
            }
            else{
                head->pre = tmp;
               head = tmp;
            }
        return;
        }
            default:{
                cout<<"Wrong Input Please Try Again!!!"<<endl;
                return;
        }
    }

    }

    void Publicdisplay(){
        node *tmp = new node;

        if (head == NULL || pubinc == 0){
            cout<<"Public UnderFlow"<<endl;
            return;
        }
        else{ 
            tmp = head;
        cout<<"Public Posts: "<<endl;
            while(tmp !=NULL){
            if(tmp->PubpostNum == 0){
                tmp = tmp->next;
            }
            else{
            cout<<"Post Number: "<<tmp->PubpostNum<<" Posted At: "<<tmp->date<<endl<<tmp->publicPost<<endl;
            tmp = tmp->next;
                }
            }
        cout<<".........................................................................................."<<endl;
        }
    }

    void Friendsdisplay(){
        node *tmp = new node;
        tmp = head;

        if (head == NULL || friiinc ==0){
            cout<<"Friends UnderFlow"<<endl;
            return;
        }
        else{ 
        cout<<"Friends Posts: "<<endl;
            while(tmp !=NULL){
            if(tmp->FripostNum == 0){
                tmp = tmp->next;
            }
            else{
            cout<<"Post Number: "<<tmp->FripostNum<<" Posted At: "<<tmp->date<<endl<<tmp->friendsPost<<endl;
            tmp = tmp->next;
                }
            }
        cout<<".........................................................................................."<<endl;
        }
        }
    
    void Privatedisplay(){
        node *tmp = new node;

        if (head == NULL || priinc == 0){
            cout<<"Private UnderFlow"<<endl;
            return;
        }
        else{ 
            tmp = head;
        cout<<"Private Posts: "<<endl;
            while(tmp !=NULL){
            if(tmp->PripostNum == 0){
                tmp = tmp->next;
            }
            else{
            cout<<"Post Number: "<<tmp->PripostNum<<" Posted At: "<<tmp->date<<endl<<tmp->privatePost<<endl;
            tmp = tmp->next;
                }
            }
        cout<<".........................................................................................."<<endl;
        }
        }
    
    void DisplayAll(){
    Publicdisplay();
    Friendsdisplay();
    Privatedisplay();
    }
    

    void delete_post(){
    node *tmp;
    node *previous;
    int num, sw;

    cout<<"To Delete Public Post Enter 1"<<endl;
    cout<<"To Delete Friends Post Enter 2"<<endl;
    cout<<"To Delete Private Post Enter 3"<<endl;
    cin>>sw;

    switch(sw){
        case 1:{
        cout<<"Enter the Post Number that you want to Delete"<<endl;
    cin>>num;

        if(head == NULL){
        cout<<"UnderFlow"<<endl;
        return;
        }
        if(head->PubpostNum ==num){
            tmp = head->next;
            delete head;
            head = tmp;
        }
        else{
        tmp = head;
        
        while (tmp != NULL && tmp->PubpostNum != num){
            previous= tmp;
            tmp = tmp->next;
            }
            previous->next = tmp->next;
            delete tmp;
        }
        break;
        }
        case 2:{
            cout<<"Enter the Post Number that you want to Delete"<<endl;
    cin>>num;

        if(head == NULL){
        cout<<"UnderFlow"<<endl;
        return;
        }
        if(head->FripostNum ==num){
            tmp = head->next;
            delete head;
            head = tmp;
        }
        else{
        tmp = head;
        
        while (tmp != NULL && tmp->FripostNum != num){
            previous= tmp;
            tmp = tmp->next;
            }
            previous->next = tmp->next;
            delete tmp;
        }
        break;
        }
        case 3:{
            cout<<"Enter the Post Number that you want to Delete"<<endl;
    cin>>num;

        if(head == NULL){
        cout<<"UnderFlow"<<endl;
        return;
        }
        if(head->PubpostNum ==num){
            tmp = head->next;
            delete head;
            head = tmp;
        }
        else{
        tmp = head;
        
        while (tmp != NULL && tmp->PubpostNum != num){
            previous= tmp;
            tmp = tmp->next;
            }
            previous->next = tmp->next;
            delete tmp;
        }
        break;
        }
        default:{
            cout<<"Wrong Input"<<endl;
            break;
        }
    }
}


};

int main(){
    int sw;
    doublyLinkList d1;

    for(int i=0;sw != 0;i++){
    cout<<"\tTo Exit Enter 0"<<endl;
    cout<<"\tFor Posting Enter 1"<<endl;
    cout<<"\tFor Displaying Public Posts Enter 2"<<endl;
    cout<<"\tFor Displaying Friends Posts Enter 3"<<endl;
    cout<<"\tFor Displaying Private Posts Enter 4"<<endl;
    cout<<"\tFor Delete Posts Enter 5"<<endl;
    cout<<"\tTo Display All Posts Enter 6"<<endl;
    

    cin>>sw;
    switch(sw){

    case 1:{
    d1.post();
    break;
    }
    case 2:{
    d1.Publicdisplay();
    break;
    }
    case 3:{
    d1.Friendsdisplay();
    break;
    }
    case 4:{
    d1.Privatedisplay();
    break;
    }
    case 5:{
    d1.delete_post();
    break;
    }
    case 6:{
    d1.DisplayAll();
    break;
    }
    default:{
    cout<<"Wrong Input Try Again"<<endl;
    break;
    }
    }
}
}
