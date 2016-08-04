#pragma once
#include<stdio.h>
#include<iostream>
#include<string.h>
#include<vector>

using namespace std;

class Solutions {
public:
	// solution no.28
	int strStr(string, string);
	// solution no.36
	bool isValidSudoku(vector<vector<char>>&);

private:
	int* getNext(string, int);
};