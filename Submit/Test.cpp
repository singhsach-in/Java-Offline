#include <bits/stdc++.h>
using namespace std;
#define ll long long int
// ll ans;
// ll chk [7][7];
// string s;
// void solve(ll idx, ll n, ll i, ll j) {
//   if(idx >= n){
//     if(i == 6 && j == 0){
//       ans++; cout<<"running"<<'\n';
//     }
//     return;
//   }
//   chk[i][j] = 1;
//   if(s[idx] == '?' || s[idx] == 'U') {
//     if(i -1 >= 0 && chk[i-1][j] != 1) {
//       solve(idx+1, n, i-1, j);
//     }
//   }
//   else if(s[idx] == '?' || s[idx] == 'D') {
//     if(i+1 < 7 && chk[i+1][j] != 1) {
//       solve(idx+1, n, i+1, j);
//     }
//   }
//   else if(s[idx] == '?' || s[idx] == 'L') {
//     if(j-1 >= 0 && chk[i][j-1] != 1) {
//       solve(idx+1, n, i, j-1);
//     }
//   }
//   else if(s[idx] == '?' || s[idx] == 'R') {
//     if(j+1 < 7 && chk[i][j+1] != 1) {
//       solve(idx+1, n, i, j+1);
//     }
//   }
//   chk[i][j] = 0;
//   return;
// }
// int main()
// {
//   s= "??????R??????U??????????????????????????LD????D?";
//   ll n = 48;
//   solve(0, n, 0, 0);
//   cout<<ans;
// }
string s;
int n, ans;
bool vis[7][7];

void f(int idx, int x, int y)
{
    if (idx >= n)
    {
        if (x == 6 && y == 0)
        {
            ans++;
        }
        return;
    }
    vis[x][y] = 1;
    if (s[idx] == '?' || s[idx] == 'U')
    {
        if (x - 1 >= 0 && !vis[x - 1][y])
        {
            f(idx + 1, x - 1, y);
        }
    }
    if (s[idx] == '?' || s[idx] == 'D')
    {
        if (x + 1 < 7 && !vis[x + 1][y])
        {
            f(idx + 1, x + 1, y);
        }
    }
    if (s[idx] == '?' || s[idx] == 'L')
    {
        if (y - 1 >= 0 && !vis[x][y - 1])
        {
            f(idx + 1, x, y - 1);
        }
    }
    if (s[idx] == '?' || s[idx] == 'R')
    {
        if (y + 1 < 7 && !vis[x][y + 1])
        {
            f(idx + 1, x, y + 1);
        }
    }
    vis[x][y] = 0;
}

void solve(int testcase)
{
    s = "??????R??????U??????????????????????????LD????D?";
    n = 48;
    ans = 0;
    f(0, 0, 0);
    cout<<ans<< endl;
}