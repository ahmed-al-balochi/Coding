#include <iostream>
#include <bits/stdc++.h> 
using namespace std;

void swap(int *a, int *b){
    int s = *a;
    *a=*b;
    *b=s;
}

int parted(int arr[], int left, int right){
    int pivot = arr[right]; 
    int i = left - 1;
    for(int j = left; j<= right - 1;j++){
        if (arr[j] < pivot){
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i+1], &arr[right]);
    return (i + 1);
}

void QuickSort(int arr[], int left, int right){
    if (left < right){
        int p = parted(arr, left, right);
        QuickSort(arr, left , p -1);
        QuickSort(arr, p+1,right);
    }
}

void display(int arr[], int size){
    for (int i=0; i< size; i++)
    cout<< arr[i]<<endl;
}

int main(){
    int arr[10];
    cout<<"Enter Values into Array"<<endl;
    for(int i=0;i<10;i++){
        cin>>arr[i];
    }
    int s = sizeof(arr) / sizeof(arr[0]);
    QuickSort(arr, 0, s - 1);
    cout<<"Sorted Array:"<<endl;
    display(arr, s);
    return 0;
}