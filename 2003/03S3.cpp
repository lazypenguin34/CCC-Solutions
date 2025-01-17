#include <bits/stdc++.h>
using namespace std;

int main() {
    int flooring, r, c;
    cin >> flooring >> r >> c;

    vector<vector<char>> floorPlan(r, vector<char>(c));
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            cin >> floorPlan[i][j];
        }
    }

    queue<pair<int, int>> q; // queue of (row, column or i, j)
    set<pair<int, int>> visited; // (row, column)
    vector<pair<int, int>> directions = {
         {-1, 0}, 
        {0, -1},           {0, 1},
         {1, 0},  
    };
    vector<int> roomSizes;

    // Perform BFS to find the size of each room
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            if (floorPlan[i][j] == 'I' || visited.find({i, j}) != visited.end()) {
                continue; // Skip walls and already visited cells
            }

            int roomSize = 0;
            q.push({i, j});
            visited.insert({i, j}); // Mark the starting point as visited

            while (!q.empty()) {
                pair<int, int> current = q.front();
                q.pop();
                roomSize++;

                // Check all 8 possible directions
                for (int k = 0; k < 4; k++) {
                    int ni = current.first + directions[k].first;
                    int nj = current.second + directions[k].second;

                    // Skip out of bounds and already visited cells
                    if (ni < 0 || ni >= r || nj < 0 || nj >= c || visited.find({ni, nj}) != visited.end()) {
                        continue;
                    }

                    // If the cell is not a wall, add it to the queue
                    if (floorPlan[ni][nj] != 'I') {
                        visited.insert({ni, nj});
                        q.push({ni, nj});
                    }
                }
            }
            roomSizes.push_back(roomSize);
        }
    }

    // Sort room sizes in descending order
    sort(roomSizes.rbegin(), roomSizes.rend());

    int roomsInstalled = 0;
    for (int size : roomSizes) {
        if (flooring >= size) {
            flooring -= size;
            roomsInstalled++;
        } else {
            break; // Stop if we don't have enough flooring
        }
    }

    if (roomsInstalled == 1) {
        cout << roomsInstalled << " room, " << flooring << " square metre(s) left over" << endl;
    } else {
        cout << roomsInstalled << " rooms, " << flooring << " square metre(s) left over" << endl;
    }
}

