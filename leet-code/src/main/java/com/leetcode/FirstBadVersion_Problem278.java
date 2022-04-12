package com.leetcode;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 * Example 2:
 * <p>
 * Input: n = 1, bad = 1
 * Output: 1
 */
public class FirstBadVersion_Problem278 {

  public int firstBadVersion(int n) {

    int low = 1, high = n, ver = 0;

    /*
     * People use this formula to avoid overflow.
     * It probably will not land where you want.
     * But few extra iterations are still better than overlfow.
     */
    int mid = low + (high - low) / 2;

    while (low <= high) {
      if (isBadVersion(mid)) {
        ver = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
      mid = low + (high - low) / 2;
    }
    return ver;

  }

  private boolean isBadVersion(int number) {
    return number == 4;
  }

}
