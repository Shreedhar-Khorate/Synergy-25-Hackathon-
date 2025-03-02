#include<iostream>
using namespace std;
class Account{
public:
string name;
int acc_no, balance;
public:
void getData()
{
cout<<"Enter name:";
cin>>name;
cout<<"Enter account number:";
cin>>acc_no;
cout<<"Enter balance:";
cin>>balance;
}
void putData(){
cout<<"Name:"<<name;
cout<<"Account number:"<<acc_no;
cout<<"Balance:"<<balance;
}
};

int main(){
Account a[8];
for(int i=0;i<8;i++){
a[i].getData();
}
for(int i=0;i<8;i++){
if(a[i].balance<10000){
a[i].putData();
}
}
return 0;
}
