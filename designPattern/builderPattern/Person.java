/**
 * Created by fq on 2018/1/19.
 * 建造者模式之我的理解,当一个类的构造函数里面的参数过多的时候，或者根据参数不同，有很多个构造函数，
 * 当有新的参数需要增加的时候，就非常不方便，如果有Builder模式，就是解决这个问题的，虽然性能上略微有点影响，但是可扩展性更好，
 * 那么为什么不用get set方法新增参数呢，因为那样的话就会存在不一致性，有可能类初始化时，新增的参数并没有初始化
 * android 中OKhttp和AlertDailog中有用到这个模式
 */

public class Person {
	private String name;
	private int age;
	private String sex;
	private String profession;
	private String idNumber;

	public Person(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.sex = builder.sex;
		this.profession = builder.profession;
		this.idNumber = builder.idNumber;
	}

	@Override
	public String toString() {
		return "姓名" + this.name + "年龄" + this.age + "性别" + this.sex + "职业" + this.profession + "身份证" + this.idNumber;
	}

	static class Builder {
		private String name;
		private int age;
		private String sex;
		private String profession;
		private String idNumber;

		public Builder() {

		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setSex(String sex) {
			this.sex = sex;
			return this;
		}

		public Builder setProfession(String profession) {
			this.profession = profession;
			return this;
		}

		public Builder setIdNumber(String idNumber) {
			this.idNumber = idNumber;
			return this;
		}

		public Person Builder() {
			return new Person(this);
		}
	}

	public static void main(String[] args[]) {
		System.out.println(new Person.Builder().setName("fq").setAge(30).setSex("男").setProfession("程序员").setIdNumber("123").Builder());
	}
}
