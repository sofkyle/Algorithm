#pragma once
#include<stdio.h>
#include<iostream>
#include<string.h>

using namespace std;

class Solutions {
public:
	int strStr(string haystack, string needle) {
		if (haystack == "" || needle == "") return 0;

		bool match = false;
		int hlen = haystack.length();
		int nlen = needle.length();
		if (hlen < nlen) return -1;
		int* next = getNext(needle, nlen);
		int result = -1;

		int i = 0, j = 0;

		while (i < hlen) {
			if (j == nlen) {
				match = true;
				break;
			}

			if (j < 0 || haystack[i] == needle[j]) {
				i++;
				j++;
			}
			else {
				j = *(next + j);
			}
		}

		if (match) {
			result = i - j;
		}

		return result;
	}

private:
	int* getNext(string a, int length) {
		int i = 1, j = 2;
		int* next = new int;
		*next = -1;
		*(next + 1) = 0;

		while (j < length) {
			if (i < 0 || a[i] != a[j]) {
				*(next + j++) = i++;
			}
			else {
				if (a[*(next + i)] != a[i]) {
					*(next + j++) = *(next + i++);
				}
				else {
					i = *(next + i);
				}
			}
		}
		return next;
	}
};