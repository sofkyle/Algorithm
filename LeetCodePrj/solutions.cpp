#pragma once
#include "solutions.hpp"

// solution no.28
int Solutions::strStr(string haystack, string needle) {
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

// solution no.36
bool Solutions::isValidSudoku(vector<vector<char>>& board) {
	size_t size = board.size();
	vector<int> row_counters(size, 0);
	vector<int> col_counters(size, 0);
	vector<int> box_counters(size, 0);

	for (int r = 0; r < size; ++r)
	{
		for (int c = 0; c < size; ++c)
		{
			char digit_c = board[r][c];
			if (digit_c != '.')
			{
				int digit = digit_c - '0';
				int mask = 1 << digit;
				size_t box_num = 3 * (r / 3) + c / 3;
				if ((row_counters[r] & mask) || (col_counters[c] & mask) || (box_counters[box_num] & mask))
					return false;
	
				row_counters[r] |= mask;
				col_counters[c] |= mask;
				box_counters[box_num] |= mask;
			}
		}
	}

	return true;
}


int* Solutions::getNext(string a, int length) {
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