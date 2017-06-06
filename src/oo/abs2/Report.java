package oo.abs2;

public abstract class Report {
	public void test() {
	}

	public abstract void print();
	// 把body{}去掉，加上;，讓繼承他的人都要複寫(override)這個方法
}
