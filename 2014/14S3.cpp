#include <bits/stdc++.h>
using namespace std;

int main() {
    int t, n, car;
    int lastInLake = 0;
    cin >> t;

    // first in, last out
    stack<int> mountainTop, branch;

    for (int i=0;i<t;i++) {
        cin >> n;

        for (int i=0;i<n;i++) {
            cin >> car;
            mountainTop.push(car);
        }

        while (!mountainTop.empty() || !branch.empty()) {
            // if the top car on either the mountain top or branch is next, send it
            if (!mountainTop.empty()) {
                if (mountainTop.top() == lastInLake + 1) {
                    lastInLake = mountainTop.top();
                    mountainTop.pop();
                    continue;
                }
            }
            if (!branch.empty()) {
                if (branch.top() == lastInLake + 1) {
                    lastInLake = branch.top();
                    branch.pop();
                    continue;
                }
            }

            // this point is only reached if a car can't immediately be sent to the lake
            // move a car from the mountain top to the branch
            if (!mountainTop.empty()) {
                branch.push(mountainTop.top());
                mountainTop.pop();
            }

            // if the mountain top is empty, and nothing can be sent to the lake, the test is done
            if (mountainTop.empty()) {
                break;
            }
        }

        if (mountainTop.empty() && branch.empty()) {
            cout << "Y\n";
        } else {
            cout << "N\n";
        }

        mountainTop = stack<int>();
        branch = stack<int>();
        lastInLake = 0;
    }
}
