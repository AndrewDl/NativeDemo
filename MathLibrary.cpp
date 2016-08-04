// MathLibrary.cpp : Defines the exported functions for the DLL application.
//

#include "stdafx.h"
#include <iostream>
#include "MathLibrary.h"

JNIEXPORT void JNICALL Java_megaclass_printOne(JNIEnv *, jclass) {
	std::cout << "One" << std::endl;
}

JNIEXPORT void JNICALL Java_megaclass_printTwo(JNIEnv *, jclass) {
	std::cout << "Two" << std::endl;
}

JNIEXPORT jint JNICALL Java_megaclass_Addition(JNIEnv *, jclass, jint a, jint b) {
	jint result = a+b;
	return result;
}

JNIEXPORT jint JNICALL Java_megaclass_Multiplication(JNIEnv *, jclass, jint a, jint b) {
	jint result = a * b;
	return result;
}

