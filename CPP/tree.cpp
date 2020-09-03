#include<iostream>
#include<string>

using namespace std;

struct TreeNodes{
    int per_reg, per_age;
    string per_name;

    TreeNodes *left;            //Small entry
    TreeNodes *right;          //big entry
};

class Person{
    private:
    TreeNodes *root;
    int inc;

    public:
    Person(){
        root = NULL;
        inc = 0;
    }

    void insert(string n, int r,int a){
    TreeNodes *p=new TreeNodes;
    TreeNodes *parent;
    
    
    p->per_name = n;
    p->per_reg = r;
    p->per_age = a;

    p->left=NULL;
    p->right=NULL;
    parent=NULL;
    if(root ==NULL)
        root=p;
    else{
        TreeNodes *ptr;
        ptr=root;   
        while(ptr!=NULL){
            parent=ptr;  
            if(r>ptr->per_reg)      
                ptr=ptr->right;     //if the entry is > data go to next right
            else
                ptr=ptr->left;       //if the entry is < data go to next left
        }   
        if(r<parent->per_reg)   
            parent->left=p;         //if the entry is < data go to store it into left
        else
            parent->right=p;        //if the entry is < data go to store it into left
    }
}

void displayBinTree_Post(){
    printPostorder(root);
}

void displayBinTree_Pre(){
    printPreorder(root);
}

void displayBinTree_Inorder(){
    printInorder(root);
}

void Search(int _r){
    Travers(root, _r);
}
   
    void printBinTree(TreeNodes *ptr){
    if(ptr!=NULL){
        printBinTree(ptr->left);
        cout<<"Person Name: "<<ptr->per_name<<" Person Reg Number: "<<ptr->per_reg<<" Person Age: "<<ptr->per_age<<endl;
        printBinTree(ptr->right);
    }
}

void printPostorder(struct TreeNodes* node) // goes through left then right then root
{ 
    if (node == NULL) 
        return; 
  
    printPostorder(node->left); 
  
    printPostorder(node->right); 
  
    cout<<"Person Name: "<<node->per_name<<" Person Reg Number: "<<node->per_reg<<" Person Age: "<<node->per_age<<endl;
} 
  
  void Travers(struct TreeNodes* node,int st_r) // goes through left then right then root
{ 
    if (node == NULL) 
        return; 
    
    if (node->per_reg == st_r){
cout<<"Person Name: "<<node->per_name<<" Person Reg Number: "<<node->per_reg<<" Person Age: "<<node->per_age<<endl;    } 
  
    Travers(node->left,st_r); 
  
    Travers(node->right, st_r);   
}

void printInorder(struct TreeNodes* node) // goes through left then root then right
{ 
    if (node == NULL) 
        return; 
  
    printInorder(node->left); 
  
cout<<"Person Name: "<<node->per_name<<" Person Reg Number: "<<node->per_reg<<" Person Age: "<<node->per_age<<endl;    
printInorder(node->right); 
} 
  
void printPreorder(struct TreeNodes* node) // goes through root then left then right
{ 
    if (node == NULL) 
        return; 
  
cout<<"Person Name: "<<node->per_name<<" Person Reg Number: "<<node->per_reg<<" Person Age: "<<node->per_age<<endl;
    printPreorder(node->left);  
  
    printPreorder(node->right); 
}  

};


int main(){

    Person t1;

    t1.insert("Ahmed", 5, 40); 
    t1.insert("Mouhammad", 89, 39); 
    t1.insert("Badar", 34, 26); 


    t1.Search(89);

    //t1.displayBinTree();
    cout<<"\nInorder"<<endl;
    t1.displayBinTree_Inorder(); //in
    cout<<"\nPost"<<endl;
    t1.displayBinTree_Post();
    cout<<"\npre"<<endl;
    t1.displayBinTree_Pre();

}