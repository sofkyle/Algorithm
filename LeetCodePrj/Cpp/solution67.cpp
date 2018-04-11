#pragma once
#include "solutions.hpp"

string Solutions::addBinary(string a, string b) {
	string res = "";
	
	int i = 0, j = 0;
	bool cflag = false; // Carry Flag

	for (; i < a.length() && j < b.length(); i++, j++) {
		// list the carry case
		if (cflag == true) {
			if (a[a.length() - 1 - i] == '0' &&  b[b.length() - 1 - j] == '0') {
				cflag = false;
				res = '1' + res;
			}
			if ((a[a.length() - 1 - i] == '0' &&  b[b.length() - 1 - j] == '1') || (a[a.length() - 1 - i] == '1' &&  b[b.length() - 1 - j] == '0')) {
				cflag = true;
				res = '0' + res;
			}
			if (a[a.length() - 1 - i] == '1' &&  b[b.length() - 1 - j] == '1') {
				cflag = true;
				res = '1' + res;
			}
		} else {
			if (a[a.length() - 1 - i] == '0' &&  b[b.length() - 1 - j] == '0') {
				cflag = false;
				res = '0' + res;
			}
			if ((a[a.length() - 1 - i] == '0' &&  b[b.length() - 1 - j] == '1') || (a[a.length() - 1 - i] == '1' &&  b[b.length() - 1 - j] == '0')) {
				cflag = false;
				res = '1' + res;
			}
			if (a[a.length() - 1 - i] == '1' &&  b[b.length() - 1 - j] == '1') {
				cflag = true;
				res = '0' + res;
			}
		}
	}

	// deal with the extra binary char in b
	if (i == a.length()) {
		while (j < b.length()) {
			if (cflag == true) {
				if (b[b.length() - 1 - j] == '1') {
					cflag = true;
					res = '0' + res;
				} else {
					cflag = false;
					res = '1' + res;
				}
			} else {
				res = b[b.length() - 1 - j] + res;
			}
			j++;
		}
	}

	// deal with the extra binary char in a
	if (j == b.length()) {
		while (i < a.length()) {
			if (cflag == true) {
				if (a[a.length() - 1 - i] == '1') {
					cflag = true;
					res = '0' + res;
				} else {
					cflag = false;
					res = '1' + res;
				}
			} else {
				res = a[a.length() - 1 - i] + res;
			}
			i++;
		}
	}

	if (cflag == true) {
		res = '1' + res;
	}

	return res;
}