#include<iostream>
#include<vector>

//using namespace std;

int main (){

	std::vector <int> v1(5);

	std::cout<<"Enter Data into vector class"<<std::endl;
	for(int i =0;i < v1.size(); i++){
		std::cin>>v1[i];
	}

	std::cout<<"displaying Data: "<<std::endl;
	for(int j=0;j<v1.size();j++){
		std::cout<<v1[j]<<" ";
	}

}