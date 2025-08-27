class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {

    vector <pair<int,int>> arr;

    for(int i=0;i<nums.size();i++)
        arr.push_back({nums[i],i});

        sort(arr.begin(),arr.end());

        vector<int> ans;

        int low=0,high=arr.size()-1;

        while(low<high)
        {
            if(arr[low].first+arr[high].first== target)
            {
                ans.push_back(arr[low].second);
                ans.push_back(arr[high].second);
                break;
            }

            else if(arr[low].first+arr[high].first<target)
            low++;

            else
            high--;
        }
     return ans;
    }
};