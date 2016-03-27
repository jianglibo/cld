package com.mymock.ucenter.utils;

import java.util.Objects;

public class OneTwo<T, S> {
	
	private T one;
	
	private S two;
	
	public OneTwo(T one, S two) {
		this.one = one;
		this.two = two;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(one, two);
	};

	public T getOne() {
		return one;
	}

	public void setOne(T one) {
		this.one = one;
	}

	public S getTwo() {
		return two;
	}

	public void setTwo(S two) {
		this.two = two;
	}

}

