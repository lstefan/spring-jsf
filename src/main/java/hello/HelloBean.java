package hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloBean {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
