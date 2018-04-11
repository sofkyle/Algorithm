#pragma once
#include "solutions.hpp"

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

bool temp(vector<vector<char>>& board) {
	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 9; j++) {
			for (int k = 0; k < 9; k++) {

			}
		}
	}

	return true;
}