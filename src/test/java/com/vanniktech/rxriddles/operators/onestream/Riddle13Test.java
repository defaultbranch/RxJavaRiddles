package com.vanniktech.rxriddles.operators.onestream;

import io.reactivex.rxjava3.core.Observable;
import org.junit.Test;

import static org.junit.Assert.*;

public class Riddle13Test {

	@Test
	public void test() {
		Riddle13.solve(Observable.just(1, 2, 1, 1, 4, 4, 4, 5, 4))
				.test()
				.assertResult(1, 2, 1, 4, 5, 4);
	}

}