#include <bits/stdc++.h>
using namespace std;

bool bfsHasPathWithoutRoad(const char &x, const char &y, unordered_map<char, set<char>> roads) {
    // Delete the specified road
    roads[x].erase(y);

    set<char> visited;
    queue<char> q;
    q.push('A');

    while (!q.empty()) {
        // Get the current node
        char current = q.front();
        visited.insert(current);
        q.pop();

        if (current == 'B') {
            return true;
        }

        // Add the children to the queue
        for (const char& child : roads[current]) {
            if (visited.find(child) == visited.end()) {
                q.push(child);
            }
        }
    }

    return false;
}

unordered_map<char, set<char>> roads;
int main() {
    string line;
    while(true) {
        getline(cin, line);
        char a = line[0];

        if (a == '*') {
            break;
        }

        char b = line[1];

        roads[a].insert(b);
        roads[b].insert(a);
    }

    int count = 0;
    for (const auto& [a, bSet] : roads) {
        for (const auto& b : bSet) {
            if (!bfsHasPathWithoutRoad(a, b, roads)) {
                cout << a << b << endl;
                count++;
            }
        }
    }

    cout << "There are " << count << " disconnecting roads." << endl;
    return 0;
}
