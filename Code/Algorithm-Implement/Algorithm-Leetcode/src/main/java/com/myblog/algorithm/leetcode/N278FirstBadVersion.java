package com.myblog.algorithm.leetcode;

/**
 * 278. 第一个错误的版本
 * https://leetcode.cn/problems/first-bad-version/
 * @author David Wang <https://github.com/superTerrorist>
 */
public class N278FirstBadVersion {
    private int minBadVersion = 4;

    private boolean isBadVersion(int version){
        return version >= minBadVersion;
    }

    public int firstBadVersion(int n){
        int startVersion = 1;
        int endVersion = n;
        int firstBadVersion = -1;
        if(!isBadVersion(n)) return -1;
        while (startVersion <= endVersion ){
            int mid = startVersion + (endVersion - startVersion) >> 1;
            if(isBadVersion(mid)){
                firstBadVersion = mid;
                endVersion = mid - 1;
            }else{
                startVersion = mid + 1;
            }
        }
        return firstBadVersion;
    }

    public static void main(String[] args) {
        N278FirstBadVersion n278FirstBadVersion = new N278FirstBadVersion();
        n278FirstBadVersion.firstBadVersion(5);
    }
}
