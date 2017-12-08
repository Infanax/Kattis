#include<iostream>
#include<cstdio>
#include<vector>
#include<cmath>
#include<cstring>

using namespace std;

string B;

int main(){
    cin >> B;
    int digit[10];
    memset(digit,0,sizeof(digit));
    for(int i = 0; i < B.size(); i++){
        int x = (((int) B[i] - '0')-1)%10;
        if(x==-1)x=9;
        digits[x]++;
    }
    int mn, an;
    mn = 1002;
    an = 0;
    for(int i = 0; i < 10; i++){
        if(digit[i] < mn)mn=digit[i],an=i;
    }
    if(an==9){
        cout << 1;
        for(int i = 0; i < digit[an]+1; i++){
            cout << 0;
        }
        cout << endl;
    } else {
        for(int i = 0; i < digit[an]+1; i++){
            cout << an+1;
        }
        cout << endl;
    }
    return 0;
}
