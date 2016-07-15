#pragma once
#include<stdio.h>
#include<iostream>
#include<string.h>

using namespace std;

class Solutions {
public:
	int strStr(string haystack, string needle) {
		if (needle == "") return 0;
		else if (haystack == "") return -1;

		int hlen = haystack.length();
		int nlen = needle.length();
		if (hlen < nlen) return -1;

		int* next = getNext(needle, nlen);
		bool match = false;
		int result = -1;

		int i = 0, j = 0;

		while (i < hlen && j < nlen) {
			if (haystack[i] == needle[j]) {
				i++;
				j++;
			}
			else {
				if (j == 0) {
					i++;
				}
				else {
					j = next[j-1] + 1;
				}
			}
		}

		return (j == nlen) ? (i - j): -1;
	}

	int* getNext(string a, int length) {
		int i,j;
		int* next = new int[length] {-1};

		for (i = 1; i < length; i++) {
			j = next[i - 1];
			while (a[i] != a[j+1] && j >= 0) {
				j = next[j];
			}
			if(a[i] == a[j+1]) {
				next[i] = j + 1;
			}
			else {
				next[i] = j;
			}
		}

		return next;
	}
};