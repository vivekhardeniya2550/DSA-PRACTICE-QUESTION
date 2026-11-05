 class Solution {
public:
    int findTheDistanceValue(vector<int>& arr1, vector<int>& arr2, int d) {
        sort(arr1.begin(), arr1.end());
        sort(arr2.begin(), arr2.end());
        const int n1 = arr1.size(), n2 = arr2.size();
        int r = 0;
        for (int i = 0, j = 0; i < n1; ++i) {
            for (; j < n2 && arr1[i] >= arr2[j]; ++j)
            ;
            if (j >= n2) {
                r += arr1[i] - arr2.back() > d;
            } else if (j) {
                r += arr1[i] - arr2[j - 1] > d && arr2[j] - arr1[i] > d;
            } else {
                r += arr2[j] - arr1[i] > d;
            }
        }
        return r;
    }
};