package test;

public class Order {
	private String name;
	private Integer lcdCount;
	private Integer ramCount;
	private Integer mouseCount;
	private Integer sum;
	private Boolean member;
	static Integer lcdprice = 4999;
	static Integer ramprice = 1280;
	static Integer mouseprice = 799;
	static int discountprice = 20000;

	public Order(String name, Integer lcdCount, Integer ramCount, Integer mouseCount, Boolean member) {
		super();
		this.name = name;
		this.lcdCount = lcdCount;
		this.ramCount = ramCount;
		this.mouseCount = mouseCount;
		this.member = member;
		sum = lcdCount * lcdprice + ramCount * ramprice + mouseCount * mouseprice;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLcdCount() {
		return lcdCount;
	}

	public void setLcdCount(Integer lcdCount) {
		this.lcdCount = lcdCount;
	}

	public Integer getRamCount() {
		return ramCount;
	}

	public void setRamCount(Integer ramCount) {
		this.ramCount = ramCount;
	}

	public Integer getMouseCount() {
		return mouseCount;
	}

	public void setMouseCount(Integer mouseCount) {
		this.mouseCount = mouseCount;
	}

	public Boolean getMember() {
		return member;
	}

	public void setMember(Boolean member) {
		this.member = member;
	}

	public Integer getSum() {
		return sum;
	}

	public static Integer getLcdprice() {
		return lcdprice;
	}

	public static void setLcdprice(Integer lcdprice) {
		Order.lcdprice = lcdprice;
	}

	public static Integer getRamprice() {
		return ramprice;
	}

	public static void setRamprice(Integer ramprice) {
		Order.ramprice = ramprice;
	}

	public static Integer getMouseprice() {
		return mouseprice;
	}

	public static void setMouseprice(Integer mouseprice) {
		Order.mouseprice = mouseprice;
	}

	public static int getDiscountPrice() {
		return discountprice;
	}

	public static void setDiscountPrice(int discountPrice) {
		Order.discountprice = discountPrice;
	}

	String checkData(int lcd, int ram, int mouse) {
		String result = "";
		if (lcd < 0)
			result += "Lcd计秖Τ粇叫穝絋粄";
		if (ram < 0)
			result += "\nRam计秖Τ粇叫穝絋粄";
		if (mouse < 0)
			result += "\nMouse计秖Τ粇叫穝絋粄";
		if ((lcd < 0) || (ram < 0) || (mouse < 0))
			return result;
		else
			return show();

	}

	int discount(int sum, boolean member) {
		if (sum >= discountprice) {
			sum *= 0.95;
		}
		if (member) {
			sum *= 0.95;
		}
		return sum;
	}

	String show() {
		return "﹎:" + "\t" + getName() +
				"\nLcd计秖:" + "\t" + getLcdCount() +
				"\nRam计秖:" + "\t" + getRamCount()
				+ "\nMouse计秖:" + "\t" + getMouseCount() +
				"\n穦:" + "\t" + getMember() +
				"\n羆肂:" + "\t" + sum
				+ "\nゴч肂:" + "\t" + discount(this.sum, member);
	}

}
