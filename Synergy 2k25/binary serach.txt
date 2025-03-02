#include<iostream>
using namespace std;
#define MAX 10
int main(){
    int beg=0,end=MAX,arr[MAX],temp,mid,elem,flag=0;
    cout<<"Enter the elements of array:";
    for(int i=0;i<MAX;i++){
        cin>>arr[i];
    }
    cout<<"Before sorting:";
    for(int i=0;i<MAX;i++){
        cout<<arr[i];
    }
    cout<<"After sorting:";
    for(int i=0;i<MAX;i++){
        for(int j=i+1;j<MAX;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i=0;i<MAX;i++){
        cout<<arr[i];
    }
    cout<<"Enter the element to be searched:";
    cin>>elem;
    while(beg<=end){
        mid=(beg+end)/2;
        if (arr[mid] == elem) {  
            flag = 1;
            cout << "Element found at index: " << mid << endl;
            break;
        } else if (arr[mid] < elem) {  
            beg = mid + 1;
        } else {  
            end = mid - 1;
        }
    }
    if(flag==1){
        cout<<"Element found:";
    }else{
        cout<<"Element not found:";
    }

    return 0;
}