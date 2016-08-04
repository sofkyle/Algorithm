#include<iostream>

using namespace std;

void main() {
	char basestr[6]; // 底数
	int exp; // 指数

	int res[150];

	cin >> basestr;
	cin >> exp;

	// 循环相乘
	for (int i = 0; i < exp; i++) {

	}
}

int* floatMultiply(int[] factor) {
	int res[12];
	int pointpos = 0;
	for (int i = 0; i < 6; i++) {
		for (int j = 0; j < 6; j++) {
			res[i + j - 1] += factor[i] * factor[j];
		}
	}
	return res;
}


// 处理进位
int* processBit(int[] intarry) {
	int len = sizeof(intarry) / sizeof(intarry[0]);
	for (int i = 0; i < len; i++) {
		if (intarry > 10)
	}
}