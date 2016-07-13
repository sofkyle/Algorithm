#include<stdio.h>
#include<iostream>
#include"solutions.h"

using namespace std;

void s1() {
	bool match = false;
	char origin[8] = {'a','b','b','c','a','c','a','b'};
	char model[4] = {'b','b','c','a'};
	int olen = 8, mlen = 4;
	int* next = getNext(model, mlen);
	
	int i = 0, j = 0;
	while(i < olen) {
		if (j == mlen) {
			match = true;
			break;
		}

		if (origin[i] == model[j]) {
			i++;
			j++;
		} else {
			j = next[j];
		}
	}
	cout << "Æ¥ÅäÇé¿ö£º" << match << endl;
}

int* getNext(char* a, int length) {
	int i = 1, j = 2;
	int next[255];
	next[0] = -1;
	next[1] = 0;

	while(i<length) {
		if (i < 0 || a[i] != a[j]) {
			i++;
			j++;
		} else {
			if (a[next[i]] != a[i]) {
				next[j++] = i++;
			} else {
				i = next[i];
			}
		}
	}
	return next;
}