package sorting;

public class Bank implements Comparable<Bank>{
	private String bname;
	private String branch;
	private String addr;
	private Account acc;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	@Override
	public int compareTo(Bank o) {
		// TODO Auto-generated method stub
		//return bname.compareTo(o.getBname());
		return acc.getAccno() - o.getAcc().getAccno();
	}
	
	}
	



