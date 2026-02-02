package com.ktdsuniversit.edu.generics;

public interface Reducer<INPUT, OUTPUT> {

	OUTPUT reduce(INPUT input, OUTPUT output);
}
