#pragma once
#include<stdio.h>
#include<iostream>
#include<string>
#include<vector>

using namespace std;

class Solutions {
public:
	// solution no.28
	int strStr(string, string);
	// solution no.36
	bool isValidSudoku(vector<vector<char>>&);
	// solution no.67
	string addBinary(string a, string b);

private:
	int* getNext(string, int);
};